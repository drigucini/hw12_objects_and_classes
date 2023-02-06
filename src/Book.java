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
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book a2 = (Book) other;
        return name.equals(a2.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, yearPublicated);
    }

}
