package com.example.springboot.functionalprogramming.collections;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        //sort(array): sorts the whole array
        int[] numbers = {5, 2, 3, -1, -16, 0, 4, 1};

        System.out.println("numbers Array before sort: ");
        Arrays.stream(numbers)
                .forEach(System.out::println);

      /*  Arrays.sort(numbers);//-16, -1, 0, 1 ...

        System.out.println("numbers Array after sort: ");
        Arrays.stream(numbers)
                .forEach(System.out::println);*/

        char[] characters ={'z', 'e', 'm', 'm', 'a', 'N', 'U', 'E', 'L'};

        System.out.println("characters Array before sort: ");
        for(char character: characters){
            System.out.println(character);
        }
      /*  Arrays.stream(characters)
                .forEach(System.out::println);*/

        Arrays.sort(characters);//E, L, N, U ...

        System.out.println("characters Array after sort: ");
      /*  Arrays.stream(characters)
                .forEach(System.out::println);*/
        for(char character: characters){
            System.out.println(character);
        }

        int[] unicodes = {'z', 'e', 'm', 'm', 'a', 'N', 'U', 'E', 'L'};

        System.out.println("unicodes Array before sort: ");
        Arrays.stream(unicodes)
                .forEach(System.out::println);

        Arrays.sort(unicodes);//65, 67, 68, 90 ...

        System.out.println("unicodes Array after sort: ");
        Arrays.stream(unicodes)
                .forEach(System.out::println);

        //sort method could sort only one part of the array
        //sort(array, fromIndex, toIndex): sort from (fromIndex) to (toIndex -1)
       Arrays.sort(numbers, 3, 8);

        System.out.println("numbers Array after part of the array sorted: ");
        Arrays.stream(numbers)
                .forEach(System.out::println);

        String[] strings ={"hij", "abc", "efg"};
        System.out.println("strings Array before sort: ");
        Arrays.stream(strings)
                .forEach(System.out::println);

        Arrays.sort(strings);//abc, efg, hij

        System.out.println("strings Array after sort: ");
        Arrays.stream(strings)
                .forEach(System.out::println);

        System.out.println("numbers Array search element after sort: " + Arrays.binarySearch(numbers, -16));

        int[] arr1 = new int[5];
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);

        arr2[2] = 47;

        for(int i : arr1){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i : arr2){
            System.out.print(i + " ");
        }

    }
}
