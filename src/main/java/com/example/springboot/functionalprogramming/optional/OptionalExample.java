package com.example.springboot.functionalprogramming.optional;

import com.example.springboot.functionalprogramming.data.Student;
import com.example.springboot.functionalprogramming.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName(){

       // Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if(student!=null){
            return  student.getName();
        }else{
            return  null;
        }
    }

    public static Optional<String> getStudentNameOptional(){

        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //Optional<Student> student = Optional.ofNullable(null);

        if(student.isPresent()){
            return  student.map(Student::getName); // don't get confused this with streams map method. Both are different.
        }
        return Optional.empty();
    }

    public static void main(String[] args) {

        String name = getStudentName();
        if(name != null){
            System.out.println("Length of the student Name: " + name.length());
        }else{
            System.out.println("Name not found.");
        }

        Optional<String> stringOptional = getStudentNameOptional();

        if(stringOptional.isPresent()){
            System.out.println("Length of the student Name: " +
                    stringOptional.get().length());//String wich is Student Name
        }else {
            System.out.println("Name not fount");
        }

        if(getStudentNameOptional().isPresent()){
            System.out.println(getStudentNameOptional().get());
        }else{
            System.out.println("Name is returned as empty.");
        }


    }
}
