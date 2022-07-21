package com.maven.MavenJsp.service;


import java.util.Collection;

import com.maven.MavenJsp.dto.Book;

public interface BookService {
    Collection<Book> getBooks();

    Book addBook(Book book);
}