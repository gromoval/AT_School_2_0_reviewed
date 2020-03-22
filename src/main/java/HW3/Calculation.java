package HW3;

public class Calculation {
    /**
     * Метод рассчета скидки, взависимости от зарпалты в час.
     * Чем больше зарплата - тем меньше скидка
     *
     * @param salary - зарплата
     */
    public static int discount(double salary) {
        // поправил циклы
        int discount = 0;
        if (salary < 15.0 && salary>=12.0) {
            System.out.println("Скидка составляет - 15%");
            discount = 15;
        } else if (salary < 12.0 && salary>=5) {
            System.out.println("Скидка составляет - 20%");
            discount = 20;
        } else if (salary < 5.0) {
            System.out.println("Скидка составляет - 30%");
            discount = 30;
        } else {
            System.out.println("Скидки не будет!");
        }
        return discount;
        // Посчитайте скидку с разными параметрами. Выведите корректную скидку на экран.
    }

    /**
     * Метод рассчета стоимости билета со скидкой.
     * Для рассчета скидки, используйте метод discount
     *
     * @param ticketPrice - стоимость билета
     * @param discount - скидка
     * @return стоимость билета со скидкой
     */
    public static double countTicketPrice(int ticketPrice, double discount) {
//        return ticketPrice - discount;
// Возьмем для примера зарплату в 15 и цену билета в 15. получается бесплатный билет
// А если взять зарплату 12, то вам еще и заплатят за билет
        double total = ticketPrice * (100 - discount);
// т.к. зарплаты для расчета не больше 100, то расчет скидок неизбежно приведет к результатам, которые меньше копеек (центов, евроцентов, не важно)
// и чтобы не "уехать" по статье при сдаче налоговой отчетности (продажа билетов все таки), округляем до копеек в большую сторону (2й знак после запятой)
        int totalround = (int) Math.ceil(total);   //это если вдруг билет 1.87 единиц (дробное) и скидка не "круглая" типа 11% или подобная
        double prom = totalround;  // чтобы в следующем шаге int на int не дало int без запятой
        double result = prom /100;
        return result;

    }
    // Метод должен корректно считать окончательную стоимость билета
}
