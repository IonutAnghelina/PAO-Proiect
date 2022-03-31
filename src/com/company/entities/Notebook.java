package com.company.entities;

import java.util.Objects;

public abstract class Notebook implements Item{

    private int price;

    private int noPages;

    @Override
    public float getPrice() {
        return price;
    }

    public Notebook(int price, int noPages) {
        this.price = price;
        this.noPages = noPages;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public int getNoPages() {
        return noPages;
    }

    public void setNoPages(int noPages) {
        this.noPages = noPages;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", noPages=" + noPages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return price == notebook.price && noPages == notebook.noPages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, noPages);
    }
}
