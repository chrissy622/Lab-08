
/*
Christina Nguyen
CSC 331 - 001
Lab 8 : Intro to Java Generics
 */

import java.util.Comparator;

public interface ILinkedList <E extends Comparator<E>> {   //<E> means you can create a LL of any type
    public void add(E eObj);
    public void append(E eObj);
    public E get(int index);
    public E pop(int index);
    public boolean isIn(E eObj);
    public int size();
}
