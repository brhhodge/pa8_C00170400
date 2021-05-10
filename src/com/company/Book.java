package com.company;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public int compareTo(Book book) {
        if (this.getTitle().compareTo(book.getTitle()) < 0) {
            return -2;
        }
        if (this.getTitle().compareTo(book.getTitle()) > 0) {
            return 2;
        } else {
            if (this.getAuthor().compareTo(book.getAuthor()) < 0) {
                return -4;
            } else if (this.getAuthor().compareTo(book.getAuthor()) > 0) {
                return 4;
            } else {
                return 0;
            }
        }
    }

}
