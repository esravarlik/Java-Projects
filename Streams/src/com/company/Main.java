package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        List<Person> females1 = new ArrayList<>();
        for(Person person: people){
            if(person.getGender().equals(Gender.FAMALE)){
                females1.add(person);
            }
        }
        females1.forEach(System.out::println);

        //Filter;
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FAMALE))
                .collect(Collectors.toList());

        females.forEach(System.out::println); // method referance

        System.out.println("-----------------------------");

        //Sort;
        //Sort sorted(Comparator.comparing(Person::getAge).reversed())
        List<Person> sortedPerson = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                        .collect(Collectors.toList());

        sortedPerson.forEach(System.out::println);

        System.out.println("-----------------------------");

        //All match;
        boolean allMatchPerson = people.stream()
                .allMatch(person -> person.getAge() > 23);

        System.out.println(allMatchPerson);

        System.out.println("-----------------------------");

        //Any match;
        boolean anyMatchPerson = people.stream()
                .anyMatch(person -> person.getAge() > 30);

        System.out.println(anyMatchPerson);

        System.out.println("-----------------------------");

        //None match;
        boolean noneMatchPerson = people.stream()
                .noneMatch(person -> person.getName().equals("Antonio"));

        System.out.println(noneMatchPerson);

        System.out.println("-----------------------------");

        //Max;
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        System.out.println("-----------------------------");

        //Min;
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        System.out.println("-----------------------------");

        //Group;
        Map<Gender, List<Person>> getPeople = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        getPeople.forEach((gender, people1) ->{
            System.out.println(gender);
            people1.forEach(System.out::println);
        });

        System.out.println("-----------------------------");

        //Map;
         List<Person> mapPersonList = people.stream().
                 map(person -> new Person(person.getName() + "!",person.getAge(),person.getGender()))
                 .collect(Collectors.toList());

        System.out.println(mapPersonList);

    }

    private static List<Person> getPeople(){
        return List.of(
                new Person("Esra Varlik", 23, Gender.FAMALE),
                new Person("Daiki Aomine", 23, Gender.MALE),
                new Person("Tetsuya Kuroko",17, Gender.MALE),
                new Person("Kiyotaka Ayanokouji", 18, Gender.MALE)

        );
    }
}
