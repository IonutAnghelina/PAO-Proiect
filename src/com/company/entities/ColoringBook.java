package com.company.entities;

import java.util.Objects;

public class ColoringBook extends Book{

    private int ageLimit;

    private String theme;

    public ColoringBook(int ageLimit, String theme) {
        this.ageLimit = ageLimit;
        this.theme = theme;
    }

    public ColoringBook(int noPages, String publishingHouse, float price, int ageLimit, String theme) {
        super(noPages, publishingHouse, price);
        this.ageLimit = ageLimit;
        this.theme = theme;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "ColoringBook{" +
                "ageLimit=" + ageLimit +
                ", theme='" + theme + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ColoringBook that = (ColoringBook) o;
        return ageLimit == that.ageLimit && Objects.equals(theme, that.theme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ageLimit, theme);
    }
}
