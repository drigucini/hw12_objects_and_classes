public class Book {
    private String name;
    private int yearPublicated;
    Author authorName;

    public  Book(String name, Author authorName, int yearPublicated) {
        this.name = name;
        this.yearPublicated = yearPublicated;
        this.authorName = authorName;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getyearPublicated() {
        return this.yearPublicated;
    }

    public void setYearPublicated(int yearPublicated) {
        this.yearPublicated = yearPublicated;
    }
}
