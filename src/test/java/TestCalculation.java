import HW3.Calculation;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.Scanner;

public class TestCalculation extends Calculation {

    private static void testDiscount(double salary, int discount) {
        Assert.assertEquals(discount(salary), discount);
    }

    private static void testCountTicketPrice(int ticketprice, int discount, double actual_res) {
        Assert.assertEquals(countTicketPrice(ticketprice, discount), actual_res);
    }

//   скорее всего из-за бесконечного цикла висит, не могу пока переписать или понять, как его обработать
    @Test
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

        testDiscount(1.0, 30);
        testDiscount(4.9, 30);
        testDiscount(5.0, 20);
        testDiscount(11.9, 20);
        testDiscount(12.0, 15);
        testDiscount(14.9, 15);
        testDiscount(15.0, 0);

        int discount = discount(salary);

        testCountTicketPrice(2, 30, 1.4);
        testCountTicketPrice(2, 20, 1.6);
        testCountTicketPrice(2, 15, 1.7);
        testCountTicketPrice(2, 0, 2.0);
//        testCountTicketPrice(1.87, 19, 1.52); //тут по хорошему должно быть 1.5147, но у нас цена билета int

        System.out.println("Стоимость билета c учетом скидки: " + countTicketPrice(2, discount)); // 2 рубля билет, например
    }

}