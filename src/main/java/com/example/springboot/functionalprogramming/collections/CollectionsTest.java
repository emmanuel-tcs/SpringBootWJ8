package com.example.springboot.functionalprogramming.collections;

import com.example.springboot.functionalprogramming.data.Student;
import com.example.springboot.functionalprogramming.data.StudentComparator;
import com.example.springboot.functionalprogramming.data.StudentDataBase;

import java.util.*;
import java.util.stream.Stream;
public class CollectionsTest {
    public static void main(String[] args) {

        List<Integer> cl = new ArrayList<>();
        cl.add(11); //index 0
        cl.add(22); //index 1
        cl.add(33);
        cl.add(33);
        cl.add(44);
        cl.add(55);
        cl.add(10);
        cl.add(10);
        cl.add(1);
        cl.add(2);
        cl.add(2);
        cl.add(3);
        cl.add(3);

        //we need give the index
        //cl.remove(1);
        //cl.clear();

        System.out.println("is an empty list?: " + cl.isEmpty());
        System.out.println("list size: " + cl.size());
        System.out.println("get element by index: " + cl.get(1));
        System.out.println("get index by element: " + cl.indexOf(44));
        System.out.println("biggest element in list: " + Collections.max(cl));
        System.out.println("lower element in list: " + Collections.min(cl));

        System.out.println("ArrayList before sort:");
        cl.stream()
                .forEach(System.out::println);

        Collections.sort(cl);

        System.out.println("ArrayList after sort:");
        cl.stream()
                .forEach(System.out::println);

        Collections.reverse(cl);

        System.out.println("ArrayList after reverse:");
        cl.stream()
                .forEach(System.out::println);

        List<Student> studentList = StudentDataBase.getAllStudents();
        Collections.sort(studentList, new StudentComparator());

        System.out.println("Student List after sort by Comparator:");
        studentList.stream()
                .forEach(System.out::println);

        Collections.sort(studentList);

        System.out.println("Student List after sort by Comparable:");
        studentList.stream()
                .forEach(System.out::println);

        Set<String> chs = new HashSet<>();
        chs.add("Mexico");
        chs.add("Mexico");
        chs.add("Mexico");
        chs.add("USA");
        chs.add("USA");
        chs.add("Canada");
        chs.add("Canada");
        chs.add("Peru");
        chs.add("Peru");
        System.out.println("HashSet:");
        chs.stream()
                .forEach(System.out::println);

        Set<String> cts = new TreeSet<>();
        cts.add("Java");
        cts.add("Java");
        cts.add("Java");
        cts.add("Angular");
        cts.add("Angular");
        cts.add("AWS");
        cts.add("AWS");
        cts.add("Docker");
        cts.add("Docker");
        System.out.println("TreeSet:");
        cts.stream()
                .forEach(System.out::println);

        Set<Character> cls = new LinkedHashSet<>();
        cls.add('e');
        cls.add('s');
        cls.add('s');
        cls.add('d');
        cls.add('d');
        cls.add('e');
        cls.add('a');
        cls.add('a');
        cls.add('w');
        cls.add('b');
        System.out.println("LinkedHashSet:");
        cls.stream()
                .forEach(System.out::println);

        Map<Integer,String> chm = new HashMap<>();
        chm.put(5,"Dog");
        chm.put(1,"Cat");
        chm.put(3,"Bear");
        chm.put(2,"Bird");
        chm.put(5,"Pig");
        chm.put(4,"Pig");
        System.out.println("HashMap:");
        for(Map.Entry<Integer, String> entry : chm.entrySet()){
            System.out.println("Key: " + entry.getKey() + " - value: " +entry.getValue());
        }
//        chm.stream()
//                .forEach(System.out::println);

        Map<Integer,String> ctm = new TreeMap<>();
        ctm.put(5,"Dog");
        ctm.put(2,"Cat");
        ctm.put(4,"Bear");
        ctm.put(3,"Bird");
        ctm.put(3,"Pig");
        ctm.put(1,"Pig");
        System.out.println("TreeMap:");
        for(Map.Entry<Integer, String> entry : ctm.entrySet()){
            System.out.println("Key: " + entry.getKey() + " - value: " +entry.getValue());
        }

        Map<Integer,String> clm = new LinkedHashMap<>();
        clm.put(5,"Dog");
        clm.put(2,"Cat");
        clm.put(4,"Bear");
        clm.put(3,"Bird");
        clm.put(3,"Pig");
        clm.put(1,"Pig");
        System.out.println("LinkedHashMap:");
        for(Map.Entry<Integer, String> entry : clm.entrySet()){
            System.out.println("Key: " + entry.getKey() + " - value: " +entry.getValue());
        }

    }

}
