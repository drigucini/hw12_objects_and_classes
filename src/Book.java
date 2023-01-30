public class Book {
    private String name;
    private String author;
    private int yearPublicated;

    public Book(String name, String author, int yearPublicated) {
        this.name = name;
        this.author = author;
        this.yearPublicated = yearPublicated;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getyearPublicated() {
        return this.yearPublicated;
    }

    public void setYearPublicated(int yearPublicated) {
        this.yearPublicated = yearPublicated;
    }
}
