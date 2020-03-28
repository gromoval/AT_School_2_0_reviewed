import HW3.EmployeeCard;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestEmployeeCard {
    @DataProvider
    public Object[][] employeeData(){
        return new Object[][]{
                {new String[] {"Антон","28","10.0","15.5","false"}},
                {new String[] {"Антон","28","10.0","15.5","true"}},
                {new String[] {null,"-199","0.0","0.0","true"}}
        };
    }

    @Test(dataProvider = "employeeData")
    public void testEmployeeCard(String[] value) {
        String actual_res = new EmployeeCard(value[0], Integer.parseInt(value[1]), Double.parseDouble(value[2]), Double.parseDouble(value[3]), Boolean.parseBoolean(value[4])).toString();
        String expected_res = "Имя работника - " +value[0]+". Его возраст - "+Integer.parseInt(value[1])+" лет. Его зарплата - "+Double.parseDouble(value[3])+" в час. Пол - "+((Boolean.parseBoolean(value[4]))? "Женский": "Мужской");
        Assert.assertEquals(actual_res, expected_res);
        System.out.println("Тест пройден!");
    }
}
