public class Main {
    public static void main(String[] args) {
    // task 1 Расчет и печать высокосного года
        int year = 1957;
        calculationAndPrintLeapYear(year);
    // task 2 Выбор программного обеспечения
        int yearPhone = 2020;
        int clientOS = 1;
        selectionSoftware(yearPhone,clientOS);
    // task 3 Расчет дней доставки
        int deliveryDistance = 95;
        int deliveryTime = calculationDeliveryTime(deliveryDistance);
        System.out.println(deliveryTime);
    }
    // метод расчета и вывода на печать в.г.
    public static void calculationAndPrintLeapYear(int leapYear) {
        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
            System.out.println(leapYear + " является высокосным!");
        } else {
            System.out.println(leapYear + " не является высокосным!");
        }
    }
    // метод расчета и вывода на печать рекомендации
    public static void selectionSoftware(int yearPhone, int clientOS) {
        while (clientOS == 0) {
            if (yearPhone < 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            else
                System.out.println("Установите версию приложения для iOS по ссылке.");
            return;
        }
        while (clientOS == 1) {
            if (yearPhone < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            else
                System.out.println("Установите версию приложения для Android по ссылке.");
            return;
        }
    }
    // метод расчета времени доставки
    public static int calculationDeliveryTime(int km) {
        if (km < 20) {
            return 1;
        } else if (km >= 20 && km < 60) {
            return 2;
        } else if (km >= 60 && km < 100) {
            return 3;
        } else {
            return 0;
        }
    }
}