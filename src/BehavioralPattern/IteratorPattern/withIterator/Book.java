package BehavioralPattern.IteratorPattern.withIterator;

public class Book implements Comparable<Book>{

    private String title;
    private int price;

    public Book(String title,int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return Integer
                .compare(this.price, o.price);
    }

}
