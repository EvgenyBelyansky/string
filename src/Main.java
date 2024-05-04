public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа строки 1 часть");
        System.out.println("Задача № 1");
        String firstName = "Ivan";
        String middName = "Ivanovich";
        String lastName = "Ivanov";
//        String fullName = lastName + " " + firstName + " " + middName;
        String fullName = String.join(" ", lastName, firstName, middName);
        System.out.println(fullName);

        System.out.println("\nЗадача № 2");
        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета — %s%n",
                fullName.toUpperCase());

        System.out.println("\nЗадача № 3");
        fullName = "Иванов Семён Семёнович";
        String fullName1 = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName1);
    }
}