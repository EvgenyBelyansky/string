public class Main {
    public static void printSeparator() {
        System.out.println("++++++++++++++++++++");
        System.out.println("--------------------");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static void printGreetings(String name) {
        System.out.println("Привет, " + name);
    }

    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void printSeason(int monthNumber) {
        if (monthNumber <= 0 || monthNumber > 12) {
            System.out.println("Некорректное значение месяца");
            return;
        }
    }

    public static void main(String[] args) {
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);

        int num1 = 5;
        int num2 = 6;
        int[] arr = {1, 2, 3};
        int sumOfAAndB = calculateSum(num1, num2);
        int sumOfArrayElements = calculateSum(arr);
        printGreetings("Иван");

        System.out.println(sumOfAAndB);
        System.out.println(sumOfArrayElements);

        String osName = "Android";
        int clientOS = getClientOS(osName);
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        int monthNumber = 16;
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
        }

    }
}