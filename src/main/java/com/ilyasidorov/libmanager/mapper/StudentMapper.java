package com.ilyasidorov.libmanager.mapper;

import com.ilyasidorov.libmanager.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getInt("id"));
        student.setName(resultSet.getString("name"));
        student.setFaculty(resultSet.getString("faculty"));
        student.setYear(resultSet.getInt("year"));

        return student;
    }
}
