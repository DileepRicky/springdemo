package com.javacrud.springdemo1.exception;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String msg){
        super(msg);
    }
}
