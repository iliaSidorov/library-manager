package com.ilyasidorov.libmanager.service;

import com.ilyasidorov.libmanager.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAllStudents();
    Student getStudentById(int id);
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int id);

}
