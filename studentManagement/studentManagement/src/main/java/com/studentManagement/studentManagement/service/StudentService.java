package com.studentManagement.studentManagement.service;

import com.studentManagement.studentManagement.entity.Student;
import com.studentManagement.studentManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(
            StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void insertStudent(
            Student student) {
        studentRepository.save(student);

    }

    public List<Student> getStudent() {
        List<Student> results =  studentRepository.findAll();

        return results;
    }

    public Student getStudentById(int id) {
        Student result = studentRepository.findById(id).get();
        return result;
    }

    public void updateStudent(
            int id,
            Student updatestudent) {
      Student result =  studentRepository.findById(id).get();
      result.setAge(updatestudent.getAge());
      result.setAddress(updatestudent.getAddress());
      result.setName(updatestudent.getName());
      studentRepository.save(result);

    }
}
