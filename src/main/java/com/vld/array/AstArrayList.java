package com.vld.array;

import java.util.Collection;
import java.util.Comparator;

public class AstArrayList<E> implements AstArrayListImp<E>{

private final int limit = Integer.MAX_VALUE;

private int capacity = 10;
private Object[]array = new Object[capacity];

private Object[] newArray = new Object[capacity];
private int size;


    @Override
    public boolean add(int index, E element) {
        array[index] = element;
        if(index>capacity/0.75){
            capacity= capacity*3/2;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean clear() {
        for(int i = 0; i<size; i++){
            array[i]=null;
        }
        return true;
    }

    @Override
    public E get(int index) {
        return (E) array[index];
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = true;
for (int i = 0; i < size; i++){
    if(array[i]!=null){
        isEmpty = false;
    }
}
        return isEmpty;
    }

    @Override
    public boolean remove(int index) {
        array[index]=null;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for(int i = 0; i < size; i++){
            if(array[i]==o){
                array[i]=null;
                break;
            }
        }
        return false;
    }

    @Override
    public void sort(Comparator<? super E> c) {

    }

    public int size(){
        int n = 0;
        for(Object a : array){
            if(a!=null){
                n++;
            }
        }
        size = n;
        return size;
    }

   /* private void shift(){
        for (int i = 2; i < array.length-1; i++) {
            array[i-1] = array[i];
            array[i] = null;
        }
    }*/
}