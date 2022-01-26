package com.javacrud.springdemo1.service;

import com.javacrud.springdemo1.entity.Student;

import java.util.List;

public interface StudentService {
    public Integer saveStudent(Student student);

    public List<Student> getAllStudents();
    public Student getStudentById(Integer sno);

    public void deleteStudent(Integer sno);
}
