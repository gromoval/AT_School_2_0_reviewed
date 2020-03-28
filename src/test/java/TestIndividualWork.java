import HW3.IndividualWork;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TestIndividualWork extends IndividualWork {
    private final Map<Double, String> timeRouteData = new HashMap<>();

    @BeforeClass
    private void setUp() {
        timeRouteData.put(0.0, "Автобус отправляется на маршрут!");
        timeRouteData.put(0.1, "Едем по ул. Комсомольской");
        timeRouteData.put(7.9, "Едем по ул. Комсомольской");
        timeRouteData.put(8.0 , "Едем по ул. Ленина");
        timeRouteData.put(10.9, "Едем по ул. Ленина");
        timeRouteData.put(11.0, "Едем по ул. Тимирязевской");
        timeRouteData.put(16.9 , "Едем по ул. Тимирязевской");
        timeRouteData.put(17.0 , "Едем по ул. Ленина");
        timeRouteData.put(19.9 , "Едем по ул. Ленина");
        timeRouteData.put(20.0 , "Едем по ул. Комсомольской");
        timeRouteData.put(27.9 , "Едем по ул. Комсомольской");
        timeRouteData.put(28.0 , "В этом часу маршрут завершен, ожидайте следующего!");
        timeRouteData.put(-10.0 , "Введите корректное значение в пределах одного часа (в минутах)");
    }

    @AfterTest
    void clearHashMap() {
        timeRouteData.clear();
    }

    @Test
    public void testIndividualWork() {
        System.out.println("\n\nИндивидуальное задание");
        System.out.println("_____________________________________________");
        IndividualWork iwork = new IndividualWork();
        iwork.table();

        for (Map.Entry<Double, String> entry : timeRouteData.entrySet()) {
            double key = entry.getKey();
            String value = entry.getValue();
            Assert.assertEquals(iwork.bus(key), value);
        }

        System.out.println("\nТест маршрута автобуса: " + iwork.bus(19.7)); // время с плавающей точкой
    }
}