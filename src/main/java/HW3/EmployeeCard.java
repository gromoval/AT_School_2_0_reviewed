package HW3;

public class EmployeeCard {
    /**
     * Имя работника
     */
    private String name;

    /**
     * Возраст работника
     */
    private int age;

    /**
     * Очки эффективности работника
     */
    private double effective;

    /**
     * Зарплата работника
     */
    private double salary;

    /**
     * Пол работника, true - женщина, false - мужчина
     */
    private boolean isWoman;

    public EmployeeCard(String data) {
        String[] dataArray = data.split(",");
        this.name = dataArray[0];
        this.age = Integer.parseInt(dataArray[1]);
        this.effective = Double.parseDouble(dataArray[2]);
        this.salary = Double.parseDouble(dataArray[3]);
        this.isWoman = Boolean.parseBoolean(dataArray[4]);
    }

    public EmployeeCard(String name, int age, double effective, boolean isWoman) {
        this.name = name;
        this.age = age;
        this.effective = effective;
        this.isWoman = isWoman;
    }

    public EmployeeCard(String name, int age, double effective, double salary, boolean isWoman) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.effective = effective;
        this.isWoman = isWoman;
    }

    /**
     * Метод для удобного вывода информации
     *
     * @return информация в нужном формате
     */
    @Override
    public String toString() {
        String sex;
        if (isWoman == true) {
            sex = "Женский";
        } else {
            sex = "Мужской";
        }
        return "Имя работника - " + name + ". Его возраст - " + age + " лет. Его зарплата - " + salary + " в час. Пол - " + sex;
    }
    // Вывести несколько сотрудников с разнымии параметрами.
    // Используйте метод toString для вывода информации о работнике.
    // Пример: Имя работника - Антон. Его возраст - 28 лет. Его зарплата - 15.5 в час. Пол - мужской.
}
