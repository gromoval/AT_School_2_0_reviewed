import HW3.EmployeeCard;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.util.HashMap;

public class TestEmployeeCard extends EmployeeCard {
// пока не могу понять, почему не работает
//    private static final HashMap<String, String> EmployeeData = new HashMap<String, String>();
//
//    @BeforeClass
//    private void setUp() {
//        TestEmployeeCard newemployee1 = new TestEmployeeCard("Антон", 28, 10.0, 15.5, false);
//        EmployeeData.put(newemployee1.toString() ,"Антон. Его возраст - 28 лет. Его зарплата - 15.5 в час. Пол - мужской");
//        TestEmployeeCard newemployee2 = new TestEmployeeCard("Антон", 28, 10.0, 15.5, true);
//        EmployeeData.put(newemployee2.toString() ,"Антон. Его возраст - 28 лет. Его зарплата - 15.5 в час. Пол - женский");
//        TestEmployeeCard newemployee3 = new TestEmployeeCard(null, -199, 0.0, 0.0, true);
//        EmployeeData.put(newemployee3.toString() ,". Его возраст - -199 лет. Его зарплата - 0.0 в час. Пол - женский");
//    }
//
//    @AfterTest
//    void tearDown(){
//        EmployeeData.clear();
//    }

//вариант номер 2. не доделал еще, может и заработает
//    @DataProvider
//    public Object[][] EmployeeData(){
//        return new Object[][]{
//                {new String[] {"Антон","28","10.0","15.5","false"}},
//                {new String[] {"Антон","28","10.0","15.5","true"}},
//                {new String[] {null,"-199","0.0","0.0","true"}},
//        };
//    }

//    @Factory(dataProvider = "EmployeeData")
//    public Object[] createTest(String table) {
//        return new Object[] { new GenericTableTest(table) };
//    }

    public TestEmployeeCard(String name, int age, double effective, double salary, boolean isWoman){
        super(name+","+age+","+effective+","+salary+","+isWoman);
    }

//    @Test(dataProvider = "EmployeeData")
    @Ignore
    @Test
    public static void testEmployeeCard() {
        System.out.println("\n\nТестирование карточки работника");
        System.out.println("_____________________________________________");

        String[] emp1 = {"Антон","28","10.0","15.5","false"};
        String[] emp2 = {"Антон","28","10.0","15.5","true"};
        String[] emp3 = {null,"-199","0.0","0.0","true"};

        TestEmployeeCard actual_res1 = new TestEmployeeCard(emp1[0], Integer.parseInt(emp1[1]), Double.parseDouble(emp1[2]), Double.parseDouble(emp1[3]), Boolean.parseBoolean(emp1[4]));
        actual_res1.toString();
        String expected_res1 = emp1[0]+". Его возраст - "+Integer.parseInt(emp1[1])+" лет. Его зарплата - "+Double.parseDouble(emp1[3])+" в час. Пол - "+Boolean.parseBoolean(emp1[4]);
        Assert.assertEquals(actual_res1, expected_res1);
        System.out.println("Тест пройден!");

        TestEmployeeCard actual_res2 = new TestEmployeeCard(emp2[0], Integer.parseInt(emp2[1]), Double.parseDouble(emp2[2]), Double.parseDouble(emp2[3]), Boolean.parseBoolean(emp2[4]));
        actual_res2.toString();
        String expected_res2 = emp2[0]+". Его возраст - "+Integer.parseInt(emp2[1])+" лет. Его зарплата - "+Double.parseDouble(emp2[3])+" в час. Пол - "+Boolean.parseBoolean(emp2[4]);
        Assert.assertEquals(actual_res2, expected_res2);
        System.out.println("Тест пройден!");

        TestEmployeeCard actual_res3 = new TestEmployeeCard(emp3[0], Integer.parseInt(emp3[1]), Double.parseDouble(emp3[2]), Double.parseDouble(emp3[3]), Boolean.parseBoolean(emp3[4]));
        actual_res3.toString();
        String expected_res3 = emp3[0]+". Его возраст - "+Integer.parseInt(emp3[1])+" лет. Его зарплата - "+Double.parseDouble(emp3[3])+" в час. Пол - "+Boolean.parseBoolean(emp3[4]);
        Assert.assertEquals(actual_res3, expected_res3);
        System.out.println("Тест пройден!");

//        for (HashMap.Entry<String, String> entry : EmployeeData.entrySet()) {
//            final String actual_res = entry.getKey();
//            final String expected_res = entry.getValue();
//            Assert.assertEquals(actual_res, expected_res);
//            System.out.println("Тест пройден!");
//        }

    }
}
