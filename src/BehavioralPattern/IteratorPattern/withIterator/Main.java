package BehavioralPattern.IteratorPattern.withIterator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        // Inside bookCollection we added all the books objects
        bookCollection.addBook(new Book("Java Multithreading",23));
        bookCollection.addBook(new Book("Java Lambdas",45));
        bookCollection.addBook(new Book("Java Streams",56));
        bookCollection.addBook(new Book("Java OOps",44));
        bookCollection.addBook(new Book("Java methods",23));

        // calling the createIterator on the bookCollection now iterator has all the book objects
        Iterator<Book> iterator = bookCollection.createIterator();

        // iterating in the iterator
        while (iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
