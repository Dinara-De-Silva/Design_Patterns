package Behavioral_Iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String Arg[]){
        List<Book> bookList=new ArrayList<>();
        bookList.add(new Book("abc",665));
        bookList.add(new Book("ali baba",550));
        bookList.add(new Book("babyyy",6969));
        bookList.add(new Book("design pattern",5000));
        bookList.add(new Book("pc",990));

        Library library=new Library(bookList);
        Iterator<Book> iterator = library.createIterator();

        while (iterator.hasNext()){
            //Book book = iterator.getNext();
            System.out.println(iterator.getNext().getName());
        }

    }

}
