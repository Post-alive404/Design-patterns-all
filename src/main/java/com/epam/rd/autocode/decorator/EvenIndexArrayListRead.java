package com.epam.rd.autocode.decorator;

import java.util.*;

public class EvenIndexArrayListRead extends EvenIndexElementsSubListDecorator{

    List<String> sourceList ;
    public EvenIndexArrayListRead(List<String> listRead) {
        super(listRead);
        this.sourceList = listRead;

    }

    @Override
    public String get(int index) {
        if (index >= 0 && index < size()) {
            return super.get(index * 2);
        }
        throw new IndexOutOfBoundsException("Invalid index: " + index);
    }

    @Override
    public int size() {
        return (int) Math.ceil((double) super.size() / 2);
    }

    @Override
    public Iterator<String> iterator() {
       return new EvenIndexElementsIterator(sourceList);
    }

    @Override
    public ListIterator<String> listIterator() {
        return listIterator(0);
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return new EvenIndexListIterator(sourceList, index);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvenIndexArrayListRead other = (EvenIndexArrayListRead) obj;
        return Objects.equals(sourceList, other.sourceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceList);
    }

    @Override
    public String toString() {
        return sourceList.toString();
    }
}

