package com.epam.rd.autocode.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntArrayFiveTimesIterator implements Iterator<Integer> {
    private final int[] array;
    private int currentPosition;
    private int times;
    public IntArrayFiveTimesIterator(int[] array) {

        this.array = array;
        currentPosition = 0;
        times = setTimes();
    }

    private int setTimes(){
        return 5;
    }
    @Override
    public boolean hasNext() {
        return currentPosition < array.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Integer element = array[currentPosition];
        if(times != 1 ){
            times--;
            return element;
        }
        currentPosition++;
        times = setTimes();
        return element;
    }

    @Override
    public void remove() {
        currentPosition = 0;
    }
}
