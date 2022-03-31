package com.company.entities;

import java.util.Objects;

public class MathNotebook extends Notebook{

    private int noRows;


    public MathNotebook(int price, int noPages, int noRows) {
        super(price, noPages);
        this.noRows = noRows;
    }

    public int getNoRows() {
        return noRows;
    }

    public void setNoRows(int noRows) {
        this.noRows = noRows;
    }

    @Override
    public String toString() {
        return "MathNotebook{" +
                "noRows=" + noRows +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MathNotebook that = (MathNotebook) o;
        return noRows == that.noRows;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), noRows);
    }
}
