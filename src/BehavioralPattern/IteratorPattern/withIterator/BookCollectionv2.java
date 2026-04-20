package BehavioralPattern.IteratorPattern.withIterator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BookCollectionv2 implements Iterable{

    private Set<Book> bookSet = new TreeSet<>();

    public void addBook(Book book){
        bookSet.add(book);
    }
    @Override
    public Iterator iterator() {
        return bookSet.iterator();
    }
}
