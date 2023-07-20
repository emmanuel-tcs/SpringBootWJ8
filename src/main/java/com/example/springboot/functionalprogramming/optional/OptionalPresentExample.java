package com.example.springboot.functionalprogramming.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {

        Optional<String> stringOptional = Optional.ofNullable("Hello Optional");
        //isPresent
        System.out.println(stringOptional.isPresent());
        //ifPresent
        stringOptional.ifPresent((s -> System.out.println("value is : " + s)));
    }
}
