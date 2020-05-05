package com.ilyasidorov.libmanager.controller;

import com.ilyasidorov.libmanager.model.Book;
import com.ilyasidorov.libmanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class BookController {


    @Autowired
    public BookService bookService;


    //show starting page
    @GetMapping("/")
    public String index() {
        return "index";
    }

    //show all books in the library storage
    @GetMapping("/books")
    public String getAllBooks(Model model) {
        List<Book> allBooks = bookService.findAllBooks();
        model.addAttribute("books", allBooks);

        return "bookList";
    }

    //show book info by id
    @GetMapping("/book/{id}")
    public String getBookById(@PathVariable("id") int id, Model model) {
        Book theBook = bookService.getBookById(id);
        model.addAttribute("book", theBook);

        return "showBook";
    }

    //show form for adding new book
    @GetMapping("/addBook")
    public String createBook() {
        return "createBook";
    }

    //add new book
    @PostMapping("/addBook")
    public String addBook(@ModelAttribute("book") Book book) {
        bookService.addBook(book);

        return "redirect:/books";
    }

    //show edit form
    @GetMapping("/edit/{id}")
    public String editBook(@PathVariable("id") int id, Model model) {
        Book theBook = bookService.getBookById(id);
        model.addAttribute("book", theBook);

        return "editBook";
    }

    //edit book
    @PostMapping("/editBook")
    public String editBook(@ModelAttribute("book") Book book) {
        bookService.updateBook(book);

        return "redirect:/books";
    }

    //delete book
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        bookService.deleteBook(id);

        return "redirect:/books";
    }

    //sort all books by type
    @GetMapping("/listBooksByType/{type}")
    public String getBooksByType(@PathVariable("type") String type, Model model) {
        List<Book> booksByType = bookService.findAllBooks()
                .stream()
                .filter(b -> b.getType().equals(type))
                .collect(Collectors.toList());

        model.addAttribute("books", booksByType);

        return "booksByType";
    }

    //sort all books by author
    @GetMapping("/listBooksByAuthor/{author}")
    public String getBooksByAuthor(@PathVariable("author") String author, Model model) {
        List<Book> booksByAuthor = bookService.findAllBooks()
                .stream()
                .filter(b -> b.getAuthor().equals(author))
                .collect(Collectors.toList());
        model.addAttribute("books", booksByAuthor);

        return "booksByAuthor";
    }

    //show the debts of the student by id
    @GetMapping("/studentDebts/{student_id}")
    public String getBooksByStudentId(@PathVariable("student_id") int id, Model model) {
        List<Book> booksByStudentId = bookService.findAllBooks()
                .stream()
                .filter(b -> b.getStudent_id() == id)
                .collect(Collectors.toList());
        model.addAttribute("books", booksByStudentId);

        return "studentDebts";
    }
}
