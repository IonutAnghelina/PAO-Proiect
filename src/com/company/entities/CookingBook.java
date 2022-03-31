package com.company.entities;

import java.util.Objects;

public class CookingBook extends Book{

    private int noRecipes;

    private String author;

    private String title;

    public CookingBook(int noRecipes, String author, String title) {
        this.noRecipes = noRecipes;
        this.author = author;
        this.title = title;
    }

    public CookingBook(int noPages, String publishingHouse, float price, int noRecipes, String author, String title) {
        super(noPages, publishingHouse, price);
        this.noRecipes = noRecipes;
        this.author = author;
        this.title = title;
    }

    public int getNoRecipes() {
        return noRecipes;
    }

    public void setNoRecipes(int noRecipes) {
        this.noRecipes = noRecipes;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "CookingBook{" +
                "noRecipes=" + noRecipes +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CookingBook that = (CookingBook) o;
        return noRecipes == that.noRecipes && Objects.equals(author, that.author) && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), noRecipes, author, title);
    }
}
