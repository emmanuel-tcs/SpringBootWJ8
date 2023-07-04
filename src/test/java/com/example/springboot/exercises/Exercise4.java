package com.example.springboot.exercises;


import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

public class Exercise4 {

  @Test
  public void distinct() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
    List<Integer> distincNumbers = numbers.stream()
            .distinct()
            .collect(Collectors.toList());

    assertThat(distincNumbers).hasSize(9);

    System.out.println(distincNumbers);

  }

  @Test
  public void distinctWithSet() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);

    Set<Integer> distincNumbers = numbers.stream()
            .collect(Collectors.toSet());

    assertThat(distincNumbers).hasSize(9);

    System.out.println(distincNumbers);
  }
}
