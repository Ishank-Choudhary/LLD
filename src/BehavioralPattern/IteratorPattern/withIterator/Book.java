package BehavioralPattern.IteratorPattern.withIterator;

public class Book implements Comparable<Book>{

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

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
}
