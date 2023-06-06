package com.epam.rd.autocode.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TableIterator implements Iterator<String> {

    private final String[] columns;
    private final int[] rows;

    private int columnsCurrentPosition;
    private int rowsCurrentPosition;
    public TableIterator(String[] columns, int[] rows) {
        this.columns = columns;
        this.rows = rows;
        columnsCurrentPosition = 0;
        rowsCurrentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        return columnsCurrentPosition < columns.length && rowsCurrentPosition < rows.length;
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String element = columns[columnsCurrentPosition] + rows[rowsCurrentPosition];
        rowsCurrentPosition++;
        if(rowsCurrentPosition >= rows.length){
            rowsCurrentPosition = 0;
            columnsCurrentPosition++;
        }
        return element;
    }
}
