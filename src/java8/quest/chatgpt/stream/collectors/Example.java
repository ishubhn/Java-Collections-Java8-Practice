package java8.quest.chatgpt.stream.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        //  Q1. Given a list of strings, use a stream to find the number of strings that have a length greater than 5
        List<String> list = Arrays.asList("shubham", "ram", "arnav", "aditya");

        System.out.println(list.stream().filter(x -> x.length() > 5).collect(Collectors.toList()));

        // Q2. Use a stream to find the average of a list of integers.
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 89);
        System.out.println(list1.stream().mapToInt(Integer::intValue).average().getAsDouble());

        // Q3. Given a list of Person objects with name and age attributes, group them by age
        // using a stream and a Collectors.groupingBy() operation.
        Person p1 = new Person("Ram",25);
        Person p2 = new Person("Krishna",48);
        Person p3 = new Person("Hari",101);
        Person p4 = new Person("Govinda",84);

        List<Person> person = Arrays.asList(p1,p2,p3,p4);

        Map<Integer, List<Person>> groupedByAge = person.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        // Print the grouped persons
        groupedByAge.forEach((age, group) -> {
            System.out.println("Age: " + age);
            group.forEach(p -> System.out.println("  " + p.getName()));
        });
    }
}

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
