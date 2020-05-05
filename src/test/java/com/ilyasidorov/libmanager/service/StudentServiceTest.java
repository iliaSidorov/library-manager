package com.ilyasidorov.libmanager.service;

import com.ilyasidorov.libmanager.dao.StudentDao;
import com.ilyasidorov.libmanager.model.Student;
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
public class StudentServiceTest {

    @Mock
    StudentDao studentDao;

    @InjectMocks
    StudentService studentService = new StudentServiceImpl(studentDao);

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldFindAllStudents() {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(1, "Marx, Fred", "Biology", 2);
        Student student2 = new Student(2, "Jones, Ed", "Programming", 3);
        Student students3 = new Student(3, "Redo, Alfred", "History", 5);

        students.add(student1);
        students.add(student2);
        students.add(students3);

        when(studentDao.findAllStudents()).thenReturn(students);

        List<Student> expected = studentService.findAllStudents();

        assertEquals(expected, students);
    }

    @Test
    public void shouldGetStudentById() {
        final int id = 1;
        final Student student = new Student(1, "Marx, Fred", "Biology", 2);

        when(studentDao.getStudentById(id)).thenReturn(student);

        Student expected = studentService.getStudentById(id);

        assertEquals(1, student.getId());
        assertEquals("Marx, Fred", student.getName());
        assertEquals("Biology", student.getFaculty());
        assertEquals(2, student.getYear());
    }

    @Test
    public void shouldAddStudent() {
        Student student = new Student(3, "Redo, Alfred", "History", 5);

        studentService.addStudent(student);

        verify(studentDao, times(1)).addStudent(student);
    }
//
    @Test
    public void shouldUpdateStudentk() {
        final Student student = new Student(3, "Redo, Alfred", "History", 5);

        studentService.updateStudent(student);

        verify(studentDao).updateStudent(student);
    }

    @Test
    public void shouldDeleteStudent() {
        final int id = 3;

        studentService.deleteStudent(id);

        verify(studentDao, times(1)).deleteStudent(id);
    }
}
