import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private static List<Person> getPeople() {
        return List.of(
                new Person("Esra Varlik", 24, Gender.FEMALE),
                new Person("Daiki Aomine", 23, Gender.MALE),
                new Person("Tetsuya Kuroko", 17, Gender.MALE),
                new Person("Kiyotaka Ayanokouji", 18, Gender.MALE)

        );
    }

    public static void main(String[] args) {

        List<Person> people = getPeople();

        List<Person> females1 = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females1.add(person);
            }
        }
        females1.forEach(System.out::println);

        //Filter;
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        females.forEach(System.out::println); // method referance

        System.out.println("-----------------------------");

        people.stream().filter(person -> person.getAge() > 35).forEach(System.out::println);

        people.stream().filter(person -> person.getAge() > 35).collect(Collectors.toList());

        List<Person> filtered = people.stream().filter(p -> p.getName().startsWith("D")).collect(Collectors.toList());
        System.out.println(filtered);


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

        getPeople.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
        });

        System.out.println("-----------------------------");

        //Map;
        List<Person> mapPersonList = people.stream().
                map(person -> new Person(person.getName() + "!", person.getAge(), person.getGender()))
                .collect(Collectors.toList());

        System.out.println(mapPersonList);

        Arrays.asList("a1", "a2", "a3")
                .stream().findFirst()
                .ifPresent(System.out::println); //a1

        Stream.of("a1", "a2", "a3")
                .findFirst().ifPresent(System.out::println); //a1

        IntStream.range(1, 4)
                .forEach(System.out::println);

        //1
        //2
        //3

        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println); //3

        IntStream.range(1, 4)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);

        //a1
        //a2
        //a3

    }

}
