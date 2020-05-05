package com.ilyasidorov.libmanager.controller;

import com.ilyasidorov.libmanager.model.Student;
import com.ilyasidorov.libmanager.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public String getAllStudents(Model model) {
        List<Student> allStudents = studentService.findAllStudents();

        model.addAttribute("students", allStudents);

        return "studentList";
    }

    //show form for adding new book
    @GetMapping("/addStudent")
    public String createStudent() {
        return "createStudent";
    }

    //add new book
    @PostMapping("/addStudent")
    public String addStudent(@ModelAttribute("student") Student student) {
        studentService.addStudent(student);

        return "redirect:/students";
    }

    //show edit form
    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable("id") int id, Model model) {
        Student theStudent = studentService.getStudentById(id);
        model.addAttribute("student", theStudent);

        return "editStudent";
    }

    //edit book
    @PostMapping("/editStudent")
    public String editStudent(@ModelAttribute("student") Student student) {
        studentService.updateStudent(student);

        return "redirect:/students";
    }

    //delete student
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        studentService.deleteStudent(id);

        return "redirect:/students";
    }







}
