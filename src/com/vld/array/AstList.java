package com.vld.array;

import java.util.Collection;
import java.util.Comparator;

public interface AstList<E> {

    boolean add(E element);
    boolean add(int index, E element);

    boolean addAll(Collection<? extends E> c);

    boolean clear();

    E get(int index);

    boolean isEmpty();

    boolean remove(int index);

    boolean remove(Object o);

    void sort(Comparator<? super E> c);
}