package com.ilyasidorov.libmanager.dao;

import com.ilyasidorov.libmanager.mapper.BookMapper;
import com.ilyasidorov.libmanager.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Book> findAllBooks() {

        String sql = "SELECT * FROM book";
        List<Book> bookList = jdbcTemplate.query(sql, new BookMapper());

        return bookList;
    }


    @Override
    public void addBook(Book book) {
        String sql = "INSERT INTO book (title, author, type, student_id) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, book.getTitle(), book.getAuthor(), book.getType(), book.getStudent_id());
    }

    @Override
    public Book getBookById(int id) {
        String sql = "SELECT * FROM book WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new BookMapper(), id);
    }

    @Override
    public void updateBook(Book book) {
        String sql = "UPDATE book SET title=?, author=?, type=?, student_id=? WHERE id=?";
        jdbcTemplate.update(sql, book.getTitle(), book.getAuthor(), book.getType(), book.getStudent_id(), book.getId());
    }

    @Override
    public void deleteBook(int id) {
        String sql = "DELETE FROM book WHERE id=?";
        jdbcTemplate.update(sql, id);
    }
}
