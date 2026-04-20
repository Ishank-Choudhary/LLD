package BehavioralPattern.IteratorPattern.withIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection {

    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book){
        bookList.add(book);
    }

    public List<Book> getBookList() {
        return bookList;
    }
    public Iterator<Book> createIterator(){
        return new BookIterator(this.bookList);
    }

    // Custom Iterator
    private class BookIterator implements Iterator<Book>{
        private List<Book> books;
        private int position = 0;

        public BookIterator(List<Book> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return position < books.size();
        }

        @Override
        public Book next() {
            return books.get(position++);
        }
    }

}
