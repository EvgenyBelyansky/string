public class Person {
    private String name;
    private int age;
    private int height;

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public void increaseAge(int increment) {
        if (increment < 0) {
            throw new IllegalArgumentException("Возраст меньше текущего");
        }
        this.age = age + increment;
    }

    public String toString() {
        return "Имя " + this.name + ", Возраст " + this.age;
    }
}
