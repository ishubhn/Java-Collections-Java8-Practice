package java8.quest.chatgpt.methodref;

import java.util.Arrays;
import java.util.List;

public class UpperCase {
    public static void main(String[] args) {
        //  Write a method reference to the toUpperCase() method of the String class.
        List<String> names = Arrays.asList("Ram", "Krishna", "Hari");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
