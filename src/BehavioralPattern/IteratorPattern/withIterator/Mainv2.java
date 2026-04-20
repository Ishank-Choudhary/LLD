package BehavioralPattern.IteratorPattern.withIterator;

import java.util.Iterator;

public class Mainv2 {
    public static void main(String[] args) {
        BookCollectionv2 bookCollection = new BookCollectionv2();
        // Inside bookCollection we added all the books objects
        bookCollection.addBook(new Book("Java Multithreading"));
        bookCollection.addBook(new Book("Java Lambdas"));
        bookCollection.addBook(new Book("Java Streams"));
        bookCollection.addBook(new Book("Java OOps"));
        bookCollection.addBook(new Book("Java methods"));

        Iterator<Book> iterator = bookCollection.iterator();

        // iterating in the iterator
        while (iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
