package com.company.entities;

import java.util.Objects;

public abstract class Book implements Item{

    private int noPages;

    private String publishingHouse;

    private float price;

    @Override
    public float getPrice() {
        return price;
    }


    public Book() {
    }

    public Book(int noPages, String publishingHouse, float price) {
        this.noPages = noPages;
        this.publishingHouse = publishingHouse;
        this.price = price;
    }

    public int getNoPages() {
        return noPages;
    }

    public void setNoPages(int noPages) {
        this.noPages = noPages;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "noPages=" + noPages +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return noPages == book.noPages && Float.compare(book.price, price) == 0 && Objects.equals(publishingHouse, book.publishingHouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noPages, publishingHouse, price);
    }
}
