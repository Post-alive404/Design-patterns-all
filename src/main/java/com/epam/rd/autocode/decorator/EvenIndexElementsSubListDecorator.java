package com.epam.rd.autocode.decorator;

import java.util.*;

public class EvenIndexElementsSubListDecorator implements List<String> {

    List<String> listRead;
    public EvenIndexElementsSubListDecorator(List<String> listRead){
        this.listRead = listRead;
    }
    @Override
    public int size() {
        return listRead.size();
    }

    @Override
    public boolean isEmpty() {
        return listRead.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return listRead.contains(o);
    }

    @Override
    public String get(int index) {
        return listRead.get(index);
    }

    @Override
    public String set(int index, String element) {
        return listRead.set(index, element);
    }

    @Override
    public void add(int index, String element) {
        listRead.add(index, element);
    }

    @Override
    public String remove(int index) {
        return listRead.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return listRead.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return listRead.lastIndexOf(o);
    }

    @Override
    public ListIterator<String> listIterator() {
        return listRead.listIterator();
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return listRead.listIterator(index);
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return listRead.subList(fromIndex, toIndex);
    }

    @Override
    public Iterator<String> iterator() {
        return listRead.iterator();
    }

    @Override
    public Object[] toArray() {
        return listRead.toArray();
    }


    @Override
    public <T> T[] toArray(T[] a) {
        return listRead.toArray(a);
    }

    @Override
    public boolean add(String s) {
        return listRead.add(s);
    }

    @Override
    public boolean remove(Object o) {
        return listRead.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return new HashSet<>(listRead).containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return listRead.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        return listRead.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return listRead.removeAll(c);
    }


    @Override
    public boolean retainAll(Collection<?> c) {
        return listRead.retainAll(c);
    }

    @Override
    public void clear() {
        listRead.clear();
    }

}

