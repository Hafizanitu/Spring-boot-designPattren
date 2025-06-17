package com.studentManagement.studentManagement.controller;

import com.studentManagement.studentManagement.entity.Student;
import com.studentManagement.studentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

private final StudentService studentService;

    public StudentController(
            StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/get_student")
    public String getStudent() {

        return "Hello";
    }

    @GetMapping("/get_all_student")
    public List<Student> getAllStudent() {

       return studentService.getStudent();

    }
    @GetMapping("filter/{id}")

    public Student filterStudent(
            @PathVariable int id) {
       return
               studentService
                       .getStudentById(id);
    }

    @PostMapping("/insert_student")
    public void insertStudent(
            @RequestBody Student student) {

        studentService
                .insertStudent(student);
    }

    @PutMapping("/update/{id}")
    public void updateStudent(
            @PathVariable int id,
            @RequestBody Student updatestudent) {
        studentService
                .updateStudent(id,updatestudent);
    }

}
