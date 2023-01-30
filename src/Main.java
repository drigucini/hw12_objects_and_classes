public class Main {

    public static void main(String[] args) {
        task0();
        task1();
    }

    public static void task0() {
        System.out.println("\nLecture notes");
        Person Sarah = new Person("Sarah", 30);
        System.out.println("Sarah.name = " + Sarah.getName());
        System.out.println("Sarah.age = " + Sarah.getAge());
        Sarah.setAge(31);
        System.out.println("Sarah.getAge() = " + Sarah.getAge());
        Person john = new Person("John", 23);
        System.out.println("John.name = " + john.getName());
        System.out.println("John.age = " + john.getAge());
    }

    public static void task1() {
        System.out.println("\nTask 1");
        Book warAndPeace = new Book ("War and Peace", "Leo Tolstoy", 1969 );
        warAndPeace.setYearPublicated(1869);
        System.out.println("Book 1: " + warAndPeace.getName() + ", published in " + warAndPeace.getyearPublicated() + " by " + warAndPeace.getAuthor());
        Book crimeAndPunishment = new Book ("Crime and Punishment", "Fyodor Dostoevsky", 1866 );

        Author agathaChristie = new Author("Agatha", "Christie");
        Author arthurConanDoyle = new Author("Arthur", "Conan Doyle");

    }
}