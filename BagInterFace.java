package com.company;

public interface BagInterFace<T> {

    public int getCurrentSize();

    public  boolean isEmpty();

    public  boolean add(T newEntry);

    public boolean remove(T anEntry);


    public T[] clear();

    public boolean contains(T anEntry);

    public T[] toArray();

}
