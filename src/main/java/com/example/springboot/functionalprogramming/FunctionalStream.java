package com.example.springboot.functionalprogramming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalStream {

    public static void main(String... args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        List<Integer> squaredNumbers = squareList(numbers);

        System.out.println(squaredNumbers);

        List<Integer> evenNumbersOnly = numbers.stream()
                                                .filter(x -> x % 2 == 0)
                                                .collect(Collectors.toList());

        System.out.println(evenNumbersOnly);

        int sum = addListFunctional(numbers);

        System.out.println(sum);

        System.out.println("Only distinct numbers in List sortered");
        numbers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        int sumSquares = numbers.stream()
                        .reduce(0, (x,y) -> x * x + y * y);
        System.out.println("Sum of all numbers squared in List: " + sumSquares);

        int greatest = numbers.stream()
                .reduce(Integer.MIN_VALUE, (x,y) -> x>y ? x:y);
        System.out.println("The Greatest number in numbers List: " + greatest);

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "Maven", "Java8", "Docker", "Kubernetes");

        List<String> coursesSortedByLengthOfCourseTitle = courses.stream()
                .sorted(Comparator.comparing(str -> str.length()))
                .collect(Collectors.toList());

        System.out.println("All Courses Sorted By Length Of Course Title in courses List: ");
        coursesSortedByLengthOfCourseTitle.stream()
                .forEach(System.out::println);

    }

    private static List<Integer> squareList(List<Integer> numbers){
        return numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }

    private static int addListFunctional(List<Integer> numbers){
        return numbers.stream()
                .parallel()
                //.reduce(0, (x,y) -> x + y);
                .reduce(0, Integer::sum);
    }
}
