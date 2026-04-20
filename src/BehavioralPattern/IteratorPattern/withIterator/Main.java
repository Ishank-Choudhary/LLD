package BehavioralPattern.IteratorPattern.withIterator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        // Inside bookCollection we added all the books objects
        bookCollection.addBook(new Book("Java Multithreading"));
        bookCollection.addBook(new Book("Java Lambdas"));
        bookCollection.addBook(new Book("Java Streams"));
        bookCollection.addBook(new Book("Java OOps"));
        bookCollection.addBook(new Book("Java methods"));

        // calling the createIterator on the bookCollection now iterator has all the book objects
        Iterator<Book> iterator = bookCollection.createIterator();

        // iterating in the iterator
        while (iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
