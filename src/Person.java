public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void increaseAge(int increment) {
        if (increment < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age + increment;
    }

    public String toString() {
        return "Name " + this.name + " Age " + this.age;
    }
}
