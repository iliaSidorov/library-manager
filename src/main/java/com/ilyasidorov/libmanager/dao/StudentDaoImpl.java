package com.ilyasidorov.libmanager.dao;

import com.ilyasidorov.libmanager.mapper.StudentMapper;
import com.ilyasidorov.libmanager.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Student> findAllStudents() {
        String sql = "SELECT * FROM student";

        return jdbcTemplate.query(sql, new StudentMapper());
    }

    @Override
    public void addStudent(Student student) {
        String sql = "INSERT INTO student (name, faculty, year) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, student.getName(), student.getFaculty(), student.getYear());
    }

    @Override
    public void updateStudent(Student student) {
        String sql = "UPDATE student SET name=?, faculty=?, year=? WHERE id=?";
        jdbcTemplate.update(sql, student.getName(), student.getFaculty(), student.getYear(), student.getId());
    }

    @Override
    public Student getStudentById(int id) {
        String sql = "SELECT * FROM student WHERE id=?";

        return jdbcTemplate.queryForObject(sql, new StudentMapper(), id);
    }

    @Override
    public void deleteStudent(int id) {
        String sql = "DELETE FROM student WHERE id=?";
        jdbcTemplate.update(sql, id);
    }
}
