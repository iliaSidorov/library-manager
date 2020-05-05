package com.ilyasidorov.libmanager.service;

import com.ilyasidorov.libmanager.dao.StudentDao;
import com.ilyasidorov.libmanager.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    private StudentDao studentDao;

    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAllStudents() {

        return studentDao.findAllStudents();
    }

    @Override
    public void addStudent(Student student) {

        studentDao.addStudent(student);
    }

    @Override
    public void updateStudent(Student student) {

        studentDao.updateStudent(student);
    }

    @Override
    public Student getStudentById(int id) {

        return studentDao.getStudentById(id);
    }

    @Override
    public void deleteStudent(int id) {

        studentDao.deleteStudent(id);
    }
}
