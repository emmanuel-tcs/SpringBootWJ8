package com.example.springboot.exercises;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.springboot.mockdata.MockData;
import com.example.springboot.beans.Person;

import org.junit.Test;

public class Exercise12 {
  @Test
  public void understandingCollect() throws Exception {
    List<String> emails = MockData.getPeople()
        .stream()
        .map(Person::getEmail)
            .collect(
                    //() -> new ArrayList<String>(),
                    //(list, element) -> list.add(element),
                    //(list1, list2) -> list1.addAll(list2)
                    ArrayList::new,
                    ArrayList::add,
                    ArrayList::addAll
            );
 //       .collect(Collectors.toList());

    emails.forEach(System.out::println);
  }
}
