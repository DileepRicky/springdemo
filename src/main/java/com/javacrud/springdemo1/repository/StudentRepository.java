package com.javacrud.springdemo1.repository;

import com.javacrud.springdemo1.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
