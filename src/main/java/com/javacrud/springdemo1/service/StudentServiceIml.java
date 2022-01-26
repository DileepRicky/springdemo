package com.javacrud.springdemo1.service;

import com.javacrud.springdemo1.entity.Student;
import com.javacrud.springdemo1.exception.StudentNotFoundException;
import com.javacrud.springdemo1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceIml implements StudentService{
    @Autowired
    private StudentRepository repository;
    @Override
    public Integer saveStudent(Student student) {

        return repository.save(student).getSno();
    }

    @Override
    public List<Student> getAllStudents() {

        return (List<Student>) repository.findAll();
    }

    @Override
    public Student getStudentById(Integer sno) {

         Optional<Student> optionalStudent = repository.findById(sno);
         Student student = optionalStudent.orElseThrow(()-> new StudentNotFoundException("student with" +sno+ "doesn't exists"));
         return student;
    }

    @Override
    public void deleteStudent(Integer sno) {

        repository.deleteById(sno);
    }
}
