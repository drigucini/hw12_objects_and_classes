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
        Author leoTolstoy = new Author("Leo", "Tolstoy");
        Author fyodorDostoevsky = new Author("Fyodor", "Dostoyevsky");
        Book warAndPeace = new Book ("War and Peace", leoTolstoy ,  1969 );
        warAndPeace.setYearPublicated(1869);
        System.out.println("Book 1: " + warAndPeace.getName() + ", published in " + warAndPeace.getyearPublicated() + " by " + warAndPeace.getAuthorName());
        Book crimeAndPunishment = new Book ("Crime and Punishment", fyodorDostoevsky, 1866 );
    }
}