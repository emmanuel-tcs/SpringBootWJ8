package com.example.springboot.functionalprogramming;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FunctionalPredicate {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        Predicate<Integer> isEvenPredicate = x -> x%2==0;

        //Predicate<Integer> isEvenPredicate = (Integer x) -> x % 2 == 0;

        Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x%2==0;
            }

        };

        Function<Integer, Integer> squareFunction = x -> x * x;

        Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }

        };

        Function<Integer, String> stringOutpuFunction = x -> x + " ";

        Consumer<Integer> sysoutConsumer = System.out::println;

        //Consumer<Integer> sysoutConsumer = x -> System.out.println(x);

        Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
            public void accept(Integer x) {
                System.out.println(x);
            }
        };
        System.out.println("Even Numbers in List Squared:");
        numbers.stream()
                .filter(isEvenPredicate2)
                .map(squareFunction2)
                .forEach(sysoutConsumer2);

        BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
        //BinaryOperator<Integer> sumBinaryOperator = (x,y) => x + y;


        BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                // TODO Auto-generated method stub
                return a + b;
            }

        };


        int sum = numbers.stream()
                .reduce(0, sumBinaryOperator);
        System.out.println("Sum of all Numbers in List: " + sum);

        //No input > Return Something
        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };

        System.out.println("One Random Number from Supplier: " + randomIntegerSupplier.get());

        UnaryOperator<Integer> unaryOperator = x -> 3 * x;
        System.out.println("Apply Unary Operator: " + unaryOperator.apply(10));

        BiPredicate<Integer, String> biPredicate = (number,str) -> {
            return number<10 && str.length()>5;
        };

        System.out.println("Apply Bi Predicate: " + biPredicate.test(9, "emmanuel-tcs"));

        BiFunction<Integer, String, String> biFunction = (number,str) -> {
            return number + " " + str;
        };

        System.out.println("Apply Bi Function: " + biFunction.apply(15, "emmanuel"));

        BiConsumer<Integer, String> biConsumer = (s1,s2) -> {
            System.out.println(s1);
            System.out.println(s2);
        };
        System.out.println("Apply Bi Consumer: ");
        biConsumer.accept(25, "emmanuel");


    }
}
