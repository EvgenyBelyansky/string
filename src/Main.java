import java.util.Scanner;

public class Main {

    private static void checkYearIsLeapAndPrint(int leapYear) {
        boolean leapYearConditions = (leapYear % 400 == 0) || (leapYear % 4 == 0 && leapYear % 100 != 0);
        boolean validYear = leapYear >= 1584;
        if (validYear && leapYearConditions) {
            System.out.printf("%s год - високосный год", leapYear);
        } else {
            System.out.printf("%s год - не високосный год", leapYear);
        }
    }

    private static String validateDeviceAndYear(int deviceType, int year) {
        int currentYear = 2015;
        if (deviceType == 0 && year < currentYear) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        } else if (deviceType == 0 && year >= currentYear) {
            return "Установите версию приложения для iOS по ссылке";
        } else if (deviceType == 1 && year < currentYear) {
            return "Установите облегченную версию приложения для Android по ссылке";
        } else if (deviceType == 1 && year >= currentYear) {
            return "Установите версию приложения для Android по ссылке";
        } else {
            return "Такая система не поддерживается";
        }
    }

    private static String  calculateDeliveryDistance(int distance) {
        if (distance > 100) {
            return "Wrong distance";
        } else {
            int result = (int) Math.ceil((double) (distance - 20) / 40) + 1;
            return "Потребуется дней: " + result;
        }

    }

    public static void main(String[] args) {
        System.out.println("\n\nЗадача № 1");
        int year = 2016;
        checkYearIsLeapAndPrint(year);

        System.out.println("\n\nЗадача № 2");

        int clientOS = 1;
        int clientDeviceYear = 2024;
        System.out.println(validateDeviceAndYear(clientOS, clientDeviceYear));


        System.out.println("\n\nЗадача № 3");

        int deliveryDistance = 75;
        String string = calculateDeliveryDistance(deliveryDistance);
        System.out.println(string);

    }
}