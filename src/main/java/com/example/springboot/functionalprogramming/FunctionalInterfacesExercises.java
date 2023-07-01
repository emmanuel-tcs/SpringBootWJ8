package com.example.springboot.functionalprogramming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterfacesExercises {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        System.out.println("Even Numbers");
        filterAndPrint(numbers, x -> x%2==0);
        System.out.println("Odd Numbers");
        filterAndPrint(numbers, x -> x%2!=0);
        System.out.println("Module 3 Numbers");
        filterAndPrint(numbers, x -> x%3==0);

        Function<Integer, Integer> mappingFunction = x -> x*x;

        List<Integer> squaredNumbers =  mapAndCreateNewList(numbers, mappingFunction);
        System.out.println("Squared Numbers");
        System.out.println(squaredNumbers);

        List<Integer> cubedNumbers =  mapAndCreateNewList(numbers, x -> x*x*x);
        System.out.println("Cubed Numbers");
        System.out.println(cubedNumbers);

        List<Integer> doubledNumbers =  mapAndCreateNewList(numbers, x -> x + x);
        System.out.println("Double Numbers");
        System.out.println(doubledNumbers);
    }

    private static List<Integer> mapAndCreateNewList(List<Integer> numbers,
                                                     Function<Integer, Integer> mappingFunction) {
        return numbers.stream()
                .map(mappingFunction)
                .collect(Collectors.toList());
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
