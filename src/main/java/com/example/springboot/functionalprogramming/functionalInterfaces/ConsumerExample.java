package com.example.springboot.functionalprogramming.functionalInterfaces;


import java.util.List;
import java.util.function.Consumer;
import com.example.springboot.functionalprogramming.data.Student;
import com.example.springboot.functionalprogramming.data.StudentDataBase;

public class ConsumerExample {

    static Consumer<Student>  c1= student -> System.out.println(student);

    static Consumer<Student>  c2= p -> System.out.print(p.getName().toUpperCase());

    static Consumer<Student>  c3= p -> System.out.println(p.getActivities());


    public static void printName(){
        System.out.println("printStudents : ");
        List<Student> personList = StudentDataBase.getAllStudents();

        personList.forEach(c1);

    }

    public static void printNameAndActivities(){
        System.out.println("printNameAndActivities : ");
        List<Student> personList = StudentDataBase.getAllStudents();
        personList.forEach(c2.andThen(c3)); //consumer chaining
    }

    public static void printNameAndActivitiesUsingCondition(){
        System.out.println("printNameAndActivitiesUsingCondition : ");
        List<Student> personList = StudentDataBase.getAllStudents();
        personList.forEach((student) -> {
            if( student.getGradeLevel()>=3 && student.getGpa()>3.9){
                c2.andThen(c3).accept(student);
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("Main : ");
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

        c1.accept("java8");

        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();





    }
}
