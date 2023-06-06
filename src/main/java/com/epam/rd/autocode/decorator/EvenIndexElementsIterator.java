package com.epam.rd.autocode.decorator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class EvenIndexElementsIterator implements Iterator<String> {
    private final List<String> list;

    private int currentIndex = 0;

    public EvenIndexElementsIterator(List<String> list){
        this.list = list;


    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw  new NoSuchElementException();
        }
        String element = list.get(currentIndex);
       currentIndex += 2;
        return element;
    }
}
