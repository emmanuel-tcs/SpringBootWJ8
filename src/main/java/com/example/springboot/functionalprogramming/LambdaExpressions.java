package com.example.springboot.functionalprogramming;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
public class LambdaExpressions {
    public static void main(String[] args) {

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        courses.stream().sorted().forEach((String x) -> System.out.println(x));

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        Integer sum = numbers.stream().reduce(0, (Integer x, Integer y) -> x + y);
        System.out.println("Sum of Numbers: " + sum);

        Supplier<Integer> randomSupplier = () -> {
            // create instance of Random class
            Random rand = new Random();
            return rand.nextInt(1000);
        };

        System.out.println("Random Number: " + randomSupplier.get());
    }
}