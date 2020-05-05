package com.ilyasidorov.libmanager.dao;

import com.ilyasidorov.libmanager.model.Student;

import java.util.List;

public interface StudentDao {

    List<Student> findAllStudents();
    Student getStudentById(int id);
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int id);

}
