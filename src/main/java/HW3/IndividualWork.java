package HW3;

public class IndividualWork {

    /**
     * Метод вывода таблицы умножения 10х10
     */
    public void table() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                System.out.printf("%4d", (i+1)*(k+1));
            }
            System.out.println();
        }
    }

    // Реализовать метод вывода таблицы умножения 10x10 используя циклы
    // Числа разделять пробелами.

    // Пример вывода:
    // 1 2 3 4 5 6 7 8 9 10
    // 2 4 6 8 10 12 14 16 18 20
    // И т.д.


    /**
     * HARD MODE - ON
     * Метод подсчета нахождение автобуса в определенное время
     *
     * @param time - число, означающее время, прошедшее сначала часа
     * @return string - улица, на которой едет автобус в текущее время
     */
    public String bus(double time) {
        if (time < 17.0 && time>=11.0) {
//            System.out.println("Время: "+time+". Едем по ул. Тимирязевской");
            return "Едем по ул. Тимирязевской";
        } else if ((time < 11.0 && time>=8) || (time < 20.0 && time>=17.0)) {
//            System.out.println("Время: "+time+". Едем по ул. Ленина");
            return "Едем по ул. Ленина";
        } else if ((time < 8.0 && time > 0.0) || (time < 28.0 && time >= 20.0)) {
//            System.out.println("Время: "+time+". Едем по ул. Комсомольской");
            return "Едем по ул. Комсомольской";
        } else if (time == 0) {
            return "Автобус отправляется на маршрут!";
        } else if (time >=28 && time <60) {
            return "В этом часу маршрут завершен, ожидайте следующего!";
        } else {
            return "Введите корректное значение в пределах одного часа (в минутах)";
        }
    }

//  Автобус едет по маршруту, вначале каждого часа, в течение 8 минут он проезжает улицу "Комсомольская",
//  затем в течение следующих 3-х минут проезжает улицу "Ленина",
//  а потом в течение 3-х минут проезжает улицу "Тимирязевская", далее автобус возвращается на начало маршрута.
//  метод должен принимать в себя число, означающее время, прошедшее сначала часа. Определить, на какой улице едет автобус в переданное время

// Например передали число 16.5. Ответ - Комсомольская
// Число 9 - Ленина

}


