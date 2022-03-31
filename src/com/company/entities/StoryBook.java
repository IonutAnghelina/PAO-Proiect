package com.company.entities;

import java.util.Objects;

public class StoryBook extends Book{

    private String author;

    private String title;

    private int noStories;

    private boolean hasPictures;


    public StoryBook(String author, String title, int noStories, boolean hasPictures) {
        this.author = author;
        this.title = title;
        this.noStories = noStories;
        this.hasPictures = hasPictures;
    }

    public StoryBook(int noPages, String publishingHouse, float price, String author, String title, int noStories, boolean hasPictures) {
        super(noPages, publishingHouse, price);
        this.author = author;
        this.title = title;
        this.noStories = noStories;
        this.hasPictures = hasPictures;
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

    public int getNoStories() {
        return noStories;
    }

    public void setNoStories(int noStories) {
        this.noStories = noStories;
    }

    public boolean isHasPictures() {
        return hasPictures;
    }

    public void setHasPictures(boolean hasPictures) {
        this.hasPictures = hasPictures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StoryBook storyBook = (StoryBook) o;
        return noStories == storyBook.noStories && hasPictures == storyBook.hasPictures && Objects.equals(author, storyBook.author) && Objects.equals(title, storyBook.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author, title, noStories, hasPictures);
    }
}
