package BehavioralPattern.IteratorPattern.withoutIterator;

public class Main {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("Java Multithreading"));
        bookCollection.addBook(new Book("Java Lambdas"));
        bookCollection.addBook(new Book("Java Streams"));
        bookCollection.addBook(new Book("Java OOps"));
        bookCollection.addBook(new Book("Java methods"));

       for(Book book: bookCollection.getBookList()){
           System.out.println(book);
       }
    }
}
