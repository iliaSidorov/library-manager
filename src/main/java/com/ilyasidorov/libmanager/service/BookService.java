package com.ilyasidorov.libmanager.service;

import com.ilyasidorov.libmanager.model.Book;

import java.util.List;

public interface BookService {

    List<Book> findAllBooks();
    Book getBookById(int id);
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(int id);
}
