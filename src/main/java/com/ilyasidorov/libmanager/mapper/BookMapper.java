package com.ilyasidorov.libmanager.mapper;

import com.ilyasidorov.libmanager.model.Book;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet resultSet, int i) throws SQLException {
        Book book = new Book();
        book.setId(resultSet.getInt("id"));
        book.setTitle(resultSet.getString("title"));
        book.setAuthor(resultSet.getString("author"));
        book.setType(resultSet.getString("type"));
        book.setStudent_id(resultSet.getInt("student_id"));

        return book;
    }
}
