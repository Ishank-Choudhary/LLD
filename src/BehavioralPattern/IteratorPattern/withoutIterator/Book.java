package BehavioralPattern.IteratorPattern.withoutIterator;

public class Book {

    private String title;

    public String getTitle() {
        return title;
    }

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
