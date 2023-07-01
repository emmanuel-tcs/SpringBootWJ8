package com.example.springboot.functionalprogramming;

import java.util.stream.LongStream;

public class FunctionalParallelizing {

    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        //0, 1000000000 869
        System.out.println(LongStream.range(0,1000000000).sum());//499999999500000000

        System.out.println(System.currentTimeMillis() - time);
        //601
        System.out.println(LongStream.range(0,1000000000).parallel().sum());

        System.out.println(System.currentTimeMillis() - time);
    }

}