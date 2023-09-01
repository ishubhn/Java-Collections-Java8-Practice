package java8.quest.chatgpt.methodref;

import java.util.Arrays;
import java.util.List;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        //  Use a method reference to sort a list of strings in alphabetical order

        List<String> names = Arrays.asList("Ram", "Krishna", "Hari");
//        Given a list of strings, sort them using the String class's compareToIgnore
//        Case method with method references.
        names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);
    }
}
