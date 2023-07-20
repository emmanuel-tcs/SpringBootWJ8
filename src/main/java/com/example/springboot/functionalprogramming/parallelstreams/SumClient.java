package com.example.springboot.functionalprogramming.parallelstreams;

import java.util.stream.IntStream;

public class SumClient {

    public static void main(String[] args) {

        Sum sum=new Sum();

        IntStream.rangeClosed(1,1000)
                .parallel()
                .forEach(sum::performSum); //result is : 500500
        //494733

        System.out.println(sum.getTotal());
    }
}
