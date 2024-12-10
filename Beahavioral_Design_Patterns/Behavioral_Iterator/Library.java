package Behavioral_Iterator;

import java.util.List;

public class Library implements Aggregate<Book>{
    private List<Book> bookList;
    public Library(List<Book> bookList){
        this.bookList=bookList;
    }
    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(this.bookList);
    }
}
