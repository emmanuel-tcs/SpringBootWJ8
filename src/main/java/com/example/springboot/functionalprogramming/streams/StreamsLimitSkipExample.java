package com.example.springboot.functionalprogramming.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integers){
        return  integers.stream()
                //6
                //7
                //8
                //9
                //10
                .limit(2)
                // in this case it took only firts 2 numbers
                .reduce((a,b)-> a+b);

    }

    public static Optional<Integer> skip(List<Integer> integers){
        return  integers.stream()
                .skip(3)
                // in this case it took only last 2 numbers
                .reduce((a,b)-> a+b);
    }
    

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(6,7,8,9,10);

        Optional<Integer> limitResult = limit(integers);
        int result = limitResult.isPresent() ? limitResult.get() : 0;
        System.out.println("The limit result is : " + result);

        Optional<Integer> skipResult = skip(integers);
        int result1 = skipResult.isPresent() ? skipResult.get() : 0;
        System.out.println("The skip result is : " + result1);

    }
}
