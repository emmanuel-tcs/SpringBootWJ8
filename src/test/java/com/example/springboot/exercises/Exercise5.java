package com.example.springboot.exercises;


import static org.assertj.core.api.Assertions.assertThat;


import com.example.springboot.beans.Car;
import com.example.springboot.beans.Person;
import com.example.springboot.beans.PersonDTO;
import com.example.springboot.mockdata.MockData;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.junit.Test;

public class Exercise5 {

  @Test
  public void understandingFilter() throws Exception {
    ImmutableList<Car> cars = MockData.getCars();

    List<Car> carsFiltered = cars.stream()
            .filter(carPredicate)
            .collect(Collectors.toList());

    carsFiltered.forEach(System.out::println);
    System.out.println(carsFiltered.size());

  }
  final Predicate<Car> carPredicate = car -> car.getPrice() < 20000;
  @Test
  public void ourFirstMapping() throws Exception {
    // transform from one data type to another
    List<Person> people = MockData.getPeople();
    //List<PersonDTO> dtos =people.stream()
    //        .map(person -> {
    //          PersonDTO dto = new PersonDTO(person.getId(), person.getFirstName(), person.getAge());
    //          return dto;
    //        })
    //        .collect(Collectors.toList());

    // List<PersonDTO> dtos =people.stream()
    //        .map(PersonDTO::map)
    //        .collect(Collectors.toList());

    Function<Person, PersonDTO> personDTOFunction = person -> new PersonDTO(person.getId(), person.getFirstName(), person.getAge());

    List<PersonDTO> dtos =people.stream()
            .map(personDTOFunction)
            .collect(Collectors.toList());

    dtos.forEach(System.out::println);

    assertThat(dtos).hasSize(1000);
    System.out.println(dtos.size());
  }



  @Test
  public void averageCarPrice() throws Exception {
    // calculate average of car prices
    double avegare = MockData.getCars()
            .stream()
            //.mapToDouble(car -> car.getPrice())
            .mapToDouble(Car::getPrice)
            .average()
            .orElse(0);
    System.out.println(avegare);
  }

  @Test
  public void test() throws Exception {
    MockData.getCars().forEach(System.out::println);
  }
}



