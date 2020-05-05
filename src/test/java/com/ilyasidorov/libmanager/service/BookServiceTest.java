package com.ilyasidorov.libmanager.service;

import com.ilyasidorov.libmanager.dao.BookDao;
import com.ilyasidorov.libmanager.model.Book;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {

    @Mock
    BookDao bookDao;

    @InjectMocks
    BookService bookService = new BookServiceImpl(bookDao);

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldFindAllBooks() {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book(1, "War and Peace", "Tolstoi, Leo", "Ficction", 2);
        Book book2 = new Book(2, "Nameless Stars", "Howard, Justin", "Science Ficction", 3);
        Book book3 = new Book(3, "Algorithms", "Stevens, Rod", "Education", 5);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        when(bookDao.findAllBooks()).thenReturn(books);

        List<Book> expected = bookService.findAllBooks();

        assertEquals(expected, books);
    }

    @Test
    public void shouldGetBookById() {
        final int id = 1;
        final Book book = new Book(1, "War and Peace", "Tolstoi, Leo", "Ficction", 2);

        when(bookDao.getBookById(id)).thenReturn(book);

        Book expected = bookService.getBookById(id);

        assertEquals(1, book.getId());
        assertEquals("War and Peace", book.getTitle());
        assertEquals("Tolstoi, Leo", book.getAuthor());
        assertEquals("Ficction", book.getType());
        assertEquals(2, book.getStudent_id());
    }

    @Test
    public void shouldAddBook() {
        Book book = new Book(2, "Nameless Stars", "Howard, Justin", "Science Ficction", 3);

        bookService.addBook(book);

        verify(bookDao, times(1)).addBook(book);
    }

    @Test
    public void shouldUpdateBook() {
        final Book book = new Book(3, "Algorithms", "Stevens, Rod", "Education", 5);

        bookService.updateBook(book);

        verify(bookDao).updateBook(book);
    }

    @Test
    public void shouldDeleteBook() {
        final int id = 3;

        bookService.deleteBook(id);

        verify(bookDao, times(1)).deleteBook(id);
    }






}
