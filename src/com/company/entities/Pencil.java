package com.company.entities;

import java.util.Objects;

public class Pencil implements Item {

    private int price;

    private String color;

    @Override
    public float getPrice() {
        return price;
    }


    public Pencil(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pencil pencil = (Pencil) o;
        return price == pencil.price && Objects.equals(color, pencil.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color);
    }
}
