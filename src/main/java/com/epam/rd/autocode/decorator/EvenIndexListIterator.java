package com.epam.rd.autocode.decorator;

import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

class EvenIndexListIterator implements ListIterator<String> {


    private int currentIndex;
    private final List<String> list;

    EvenIndexListIterator(List<String> list, int index) {
        this.list = list;
        currentIndex = index;
    }

    @Override
    public boolean hasNext() {
        return currentIndex <  list.size();
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String element = list.get(currentIndex);
        currentIndex+=2;
        return element;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public String previous() {
        return null;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(String s) {

    }

    @Override
    public void add(String s) {

    }

    // Implement the rest of the ListIterator interface methods
}