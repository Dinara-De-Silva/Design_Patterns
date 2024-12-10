package Behavioral_Iterator;

import java.util.List;

public class BookIterator implements Iterator{
    private List<Book> bookList;
    private int index=0;

    public BookIterator(List<Book> bookList){
        this.bookList=bookList;
    }

    @Override
    public boolean hasNext() {
        if(index< bookList.size())
            return true;
        else
            return false;
    }

    @Override
    public Book getNext() {
        if (this.hasNext())
            return this.bookList.get(index++);
        else
            return null;
    }
}
