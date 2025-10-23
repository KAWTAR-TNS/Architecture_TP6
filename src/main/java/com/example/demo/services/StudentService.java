package com.example.demo.services;


import com.example.demo.entities.Student;
import com.example.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public long countStudents() {
        return studentRepository.count();
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }
    public boolean delete(Long id) {
        studentRepository.deleteById(Math.toIntExact(id));
        return false;
    }


    public Collection<Object[]> countByYear() {
        return studentRepository.findNbrStudentByYear();
    }

    public Collection<?> findNbrStudentByYear() {
        return studentRepository.findNbrStudentByYear();}
}