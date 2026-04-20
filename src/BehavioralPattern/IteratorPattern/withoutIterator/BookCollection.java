package BehavioralPattern.IteratorPattern.withoutIterator;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {

    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book){
        bookList.add(book);
    }

    public List<Book> getBookList() {
        return bookList;
    }
}
