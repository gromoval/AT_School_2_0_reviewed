import HW3.IndividualWork;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIndividualWork extends IndividualWork {
    private static void testIndividualWorkBus(double time, String path) {
        Assert.assertEquals(bus(time), path);
    }

    @Test
    public static void testIndividualWork() {
        System.out.println("\n\nИндивидуальное задание");
        System.out.println("_____________________________________________");
        table();

        testIndividualWorkBus(0, "Автобус отправляется на маршрут!");
        testIndividualWorkBus(0.1, "Едем по ул. Комсомольской");
        testIndividualWorkBus(7.9, "Едем по ул. Комсомольской");
        testIndividualWorkBus(8.0, "Едем по ул. Ленина");
        testIndividualWorkBus(10.9, "Едем по ул. Ленина");
        testIndividualWorkBus(11.0, "Едем по ул. Тимирязевской");
        testIndividualWorkBus(16.9, "Едем по ул. Тимирязевской");
        testIndividualWorkBus(17.0, "Едем по ул. Ленина");
        testIndividualWorkBus(19.9, "Едем по ул. Ленина");
        testIndividualWorkBus(20.0, "Едем по ул. Комсомольской");
        testIndividualWorkBus(27.9, "Едем по ул. Комсомольской");
        testIndividualWorkBus(28.0, "В этом часу маршрут завершен, ожидайте следующего!");
        testIndividualWorkBus(-10.0, "Введите корректное значение в пределах одного часа (в минутах)");


        System.out.println(bus(19.7)); // время с плавающей точкой
    }
}
