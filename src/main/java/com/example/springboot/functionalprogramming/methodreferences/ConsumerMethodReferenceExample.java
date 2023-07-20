package com.example.springboot.functionalprogramming.methodreferences;

import com.example.springboot.functionalprogramming.data.Student;
import com.example.springboot.functionalprogramming.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    /**
     * Class::instancemethod
     */
    static Consumer<Student>  c1= System.out::println;


    /**
     * instance::instancemethod
     */
    static Consumer<Student> c2 = (student -> student.printListOfActivities());
    static Consumer<Student> c3 = (Student::printListOfActivities);

    public static void main(String[] args) {
        System.out.println("C1");
        StudentDataBase.getAllStudents().forEach(c1);
        System.out.println("C2");
        StudentDataBase.getAllStudents().forEach(c2);
        System.out.println("C3");
        StudentDataBase.getAllStudents().forEach(c3);
    }

}
