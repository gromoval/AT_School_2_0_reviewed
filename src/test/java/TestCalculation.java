import HW3.Calculation;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TestCalculation {
    private final Map<Double, Integer> salaryDiscountData = new HashMap<>();

    @BeforeClass
    private void setUp() {
        salaryDiscountData.put(0.0, 30); // заполним только "валидными" значениями, т.к. нет нигде расчета скидки от зарплаты
        salaryDiscountData.put(0.1, 30);
        salaryDiscountData.put(4.9, 30);
        salaryDiscountData.put(5.0 , 20);
        salaryDiscountData.put(11.9, 20);
        salaryDiscountData.put(12.0, 15);
        salaryDiscountData.put(14.9 , 15);
        salaryDiscountData.put(15.0 , 0);
        salaryDiscountData.put(-10.0 , 30);
    }

    @DataProvider
    public Object[][] ticketPriceData(){
        return new Object[][]{
                {new double[] {100.0,20.0,80.0}}, // сделаем только валидные. от 100 считать удобнее
                {new double[] {100.0,0.0,100.0}},
                {new double[] {100.0,30.0,70.0}},
                {new double[] {100.0,15.0,85.0}},
                {new double[] {-10.0,20.0,0.0}}
                //        {1.87, 19.0, 1.52};  тут по хорошему должно быть 1.5147, но у нас цена билета int и скидки кратны 5%
        };
    }

    @AfterTest
    void clearHashMap() {
        salaryDiscountData.clear();
    }

    @Test
    public void testCalculationDiscount() {
        for (Map.Entry<Double, Integer> entry : salaryDiscountData.entrySet()) {
            double key = entry.getKey();
            int value = entry.getValue();
            Assert.assertEquals(Calculation.discount(key), value);
        }
    }

    @Test(dataProvider = "ticketPriceData")
    public void testCalculationTicketPrice(double[] value) {
        Assert.assertEquals(Calculation.countTicketPrice((int)value[0], value[1]), value[2]);
        System.out.println("Стоимость билета c учетом скидки: " + Calculation.countTicketPrice((int)value[0], value[1]));
    }
}
