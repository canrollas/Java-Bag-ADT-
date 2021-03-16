package com.company;
// Burada final kullanılmasının teml sebebi inhertence olayını yok etmektir
public class ArrayBag<T> implements BagInterFace<T>{

    private T[] bag;
    private int numberOfEntries;
    private static int capacity=25;

    public ArrayBag() {
        T[] tempBag = (T[]) new Object[capacity];
        bag = tempBag;
        numberOfEntries = 0;

    }

    @Override
    public int getCurrentSize() {
        return capacity-numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        if(numberOfEntries>0){
            return false;
        }else {
            return true;
        }

    }

    @Override
    public boolean add(T newEntry) {
        if(numberOfEntries<capacity) {
            bag[numberOfEntries] =newEntry;
            numberOfEntries=numberOfEntries+1;
            return true;
        }else {
            return false;
        }

    }
    @Override
    public T[] clear() {
        bag=null;
        return bag;

    }

    @Override
    public boolean remove(T anEntry) {
        if(contains(anEntry)==true) {
            int index=-1;
            for (int i = 0; i < numberOfEntries; i++) {
                if (anEntry.equals(bag[i])) {
                    index = i;
                    break;
                }
            }
            if(index!=-1){
                int last = numberOfEntries - 1;
                bag[index] = bag[last];
                bag[last] = null;
                numberOfEntries=numberOfEntries-1;
                return true;
            }
            return false;
        }
        else {
            return false;
        }

    }





    @Override
    public boolean contains(T anEntry) {
        int index=-1;
        for (int i = 0; i < numberOfEntries; i++) {
            if (anEntry.equals(bag[i])) {
                index = i;
                break;
            }
        }
        if (index==-1){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public T[] toArray() {
        T[] array = (T[]) new Object[numberOfEntries];
        for (int i = 0; i < numberOfEntries; i++) {
            array[i] = bag[i];
        }
        return array;
    }




}
