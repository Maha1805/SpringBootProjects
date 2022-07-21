package com.maven.MavenJsp.service;


import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import com.maven.MavenJsp.exception.DuplicateBookException;
import org.springframework.stereotype.Service;

import com.maven.MavenJsp.dto.Book;
import com.maven.MavenJsp.repository.BookRepository;
import com.maven.MavenJsp.repository.BookData;
import com.maven.MavenJsp.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Collection<Book> getBooks() {
        return bookRepository.findAll()
                .stream()
                .map(BookServiceImpl::convertBookData)
                .collect(Collectors.toList());
    }

    @Override
    public Book addBook(Book book) {
        final Optional<BookData> existingBook = bookRepository.findById(book.getIsbn());
        if (existingBook.isPresent()) {
            throw new DuplicateBookException(book);
        }

        final BookData savedBook = bookRepository.add(convertBook(book));
        return convertBookData(savedBook);
    }

    private static Book convertBookData(BookData bookData) {
        return new Book(bookData.getIsbn(), bookData.getName(), bookData.getAuthor());
    }

    private static BookData convertBook(Book book) {
        return new BookData(book.getIsbn(), book.getName(), book.getAuthor());
    }
}