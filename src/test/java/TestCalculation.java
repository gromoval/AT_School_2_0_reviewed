import HW3.Calculation;
import java.util.Scanner;

public class TestCalculation extends Calculation {
    public static void testCalculation() {
        System.out.println("Тестирование продажи билетов со скидкой");
        System.out.println("_____________________________________________");
// раз мы ввели обработчик скидок в зависимости от зарплаты, введем и проверку на валидность
// минималку введем самостоятельно с учетом того, что зарплаты в 0 не бывает
        final double _MINSALARY = 1.0;
        boolean loop=true;
        int salary = 0;

        while (loop) {
            try {
                System.out.print("Введите ваш доход (your salary): ");
                Scanner scan = new Scanner(System.in);
                String a = scan.nextLine();
                if (Integer.parseInt (a)< _MINSALARY) {
                    System.out.println("Зарплата не может быть меньше минималки " + _MINSALARY);
                } else {
                    salary = Integer.parseInt(a);
                    loop = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Должно быть введено ЦЕЛОЕ число!");
            }
        }

        int discount = discount(salary);
        System.out.println("Стоимость билета c учетом скидки: " + countTicketPrice(2, discount)); // 2 рубля билет, например
    }
}