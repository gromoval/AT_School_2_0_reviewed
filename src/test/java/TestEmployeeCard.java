import HW3.EmployeeCard;

public class TestEmployeeCard extends EmployeeCard {
    public TestEmployeeCard(String name, int age, double effective, double salary, boolean isWoman){
        super(name+","+age+","+effective+","+salary+","+isWoman);
    }

    public static void testEmployeeCard() {
        System.out.println("\n\nТестирование карточки работника");
        System.out.println("_____________________________________________");

//        EmployeeCard newemployee = new EmployeeCard("Антон", 28, 10.0,15.5, false);
        TestEmployeeCard newemployee = new TestEmployeeCard("Антон", 28, 10.0,15.5, false);
        System.out.println(newemployee.toString());
    }
}
