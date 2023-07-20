package com.example.springboot.functionalprogramming.data;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        //comparation by name
       // return o1.getName().compareTo(o2.getName());
        int response = 0;
        if(o1.getGradeLevel() > o2.getGradeLevel()){
            response = 1;
        } else if (o1.getGradeLevel() < o2.getGradeLevel()) {
            response = -1;
        }else{
            response = 0;
        }
        return response;
    }
}
