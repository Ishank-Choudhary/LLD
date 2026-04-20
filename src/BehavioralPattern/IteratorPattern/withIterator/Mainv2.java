package BehavioralPattern.IteratorPattern.withIterator;

import java.util.Iterator;

public class Mainv2 {
    public static void main(String[] args) {
        BookCollectionv2 bookCollection = new BookCollectionv2();
        // Inside bookCollection we added all the books objects
        bookCollection.addBook(new Book("Java Multithreading",33));
        bookCollection.addBook(new Book("Java Lambdas",44));
        bookCollection.addBook(new Book("Java Streams",56));
        bookCollection.addBook(new Book("Java OOps",56));
        bookCollection.addBook(new Book("Java methods",77));

        Iterator<Book> iterator = bookCollection.iterator();

        // iterating in the iterator
        while (iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
