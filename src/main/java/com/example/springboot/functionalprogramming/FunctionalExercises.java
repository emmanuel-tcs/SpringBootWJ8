package com.example.springboot.functionalprogramming;

import java.util.List;

public class FunctionalExercises {

    public static void main(String... args) {
        List<Integer> numbers = List.of(12, 11, 9, 13, 4, 6, 2, 4, 12, 15);

        printAllNumbersInList(numbers);
        printEvenNumbersInList(numbers);
        printSquaresOfEvenNumbersInList(numbers);
        printCubesOfEvenNumbersInList(numbers);
        printOddNumbersInList(numbers);
        printSquaresOfOddNumbersInList(numbers);
        printCubesOfOddNumbersInList(numbers);

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "Maven", "Java8", "Docker", "Kubernetes");

        System.out.println("All Strings In courses List with forEach");
        courses.stream()
                .forEach(System.out::println);

        System.out.println("Strings In courses List that contains Spring with forEach");
        courses.stream()
                .filter(course -> course.contains("Spring"))
                        .forEach(System.out::println);
        System.out.println("Strings In courses List with length grater or equal to 4 with forEach");
        courses.stream()
                        .filter(course -> course.length() >= 4)
                                .forEach(System.out::println);
        System.out.println("All Strings In courses List concat String plus length with forEach");
        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);
    }

    private static void printAllNumbersInList(List<Integer> numbers) {
        System.out.println("All Numbers In List with forEach");
        numbers.stream()
                .forEach(System.out::println);
        System.out.println("All Numbers In List with forEachOrdered");
        numbers.stream()
                .forEachOrdered(System.out::println);
    }

    private static void printEvenNumbersInList(List<Integer> numbers) {
        System.out.println("Even Numbers In List");
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    private static void printSquaresOfEvenNumbersInList(List<Integer> numbers) {
        System.out.println("Squares of Even Numbers In List");
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    private static void printCubesOfEvenNumbersInList(List<Integer> numbers) {
        System.out.println("Cubes of Even Numbers In List");
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

    private static void printOddNumbersInList(List<Integer> numbers) {
        System.out.println("Odd Numbers In List");
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }

    private static void printSquaresOfOddNumbersInList(List<Integer> numbers){
        System.out.println("Squares Of Odd Numbers In List");
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    private static void printCubesOfOddNumbersInList(List<Integer> numbers){
        System.out.println("Cubes Of Odd Numbers In List");
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

}
