public class Main {
    public static void main(String[] args) {
        String nameJohn = "John";
        int ageJohn = 13;

        String nameSarah = "Sarah";
        int ageSarah = 30;

        String[] names = {"John", "Sarah"};
        int[] ages = {13, 30};

        for (int i = 0; i < names.length; i++) {
            System.out.printf("Имя - %s Возраст - %s%n", names[i], ages[i]);
        }
        PersonService personService = new PersonService();
        Person sarah =  new Person("Sarah", 30, 168);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        System.out.println("sarah.height = " + sarah.getHeight());
        sarah.increaseAge(1);
        System.out.println("sarah.getAge() = " + sarah.getAge());
        if (personService.isAdult(sarah)) {
            System.out.println("Иди в бар");
        } else {
            System.out.println("Иди в школу");
        }

        Person john = new Person("John", 13, 150);
        System.out.println("john.name = " + john.getName());
        System.out.println("john.age = " + john.getAge());
        System.out.println("john.height = " + john.getHeight());

        System.out.println(sarah);
    }

}