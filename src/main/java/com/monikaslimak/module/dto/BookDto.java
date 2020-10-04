package com.monikaslimak.module.dto;

public class BookDto {
    private String author;
    private String title;
    private BookDetailsDto details;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public BookDto setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookDetailsDto getDetails() {
        return details;
    }

    public BookDto setDetails(BookDetailsDto details) {
        this.details = details;
        return this;
    }
}
