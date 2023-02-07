import java.util.Objects;

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

    @Override
    public String toString() {
        return name + " published in " + yearPublicated + " by " + authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublicated == book.yearPublicated && name.equals(book.name) && authorName.equals(book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearPublicated, authorName);
    }
}
