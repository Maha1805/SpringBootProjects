package com.maven.MavenJsp.exception;

import com.maven.MavenJsp.dto.Book;
import lombok.Getter;

@Getter
public class DuplicateBookException extends RuntimeException {
    private final Book book;

    public DuplicateBookException(Book book) {
        this.book = book;
    }
}