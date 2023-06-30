package com.example.springboot.functionalprogramming;

import java.util.List;

public class FunctionalExercises {

    public static void main(String ... args){
        List<Integer> numbers = List.of(12, 11, 9, 13, 4, 6, 2, 4, 12, 15);

        printAllNumbersInList(numbers);


    }

    private static void printAllNumbersInList(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
        numbers.stream().forEachOrdered(System.out::println);
    }
}
