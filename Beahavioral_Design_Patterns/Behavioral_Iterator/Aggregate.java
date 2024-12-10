package Behavioral_Iterator;

public interface Aggregate<T>{
    Iterator<T> createIterator();
}
