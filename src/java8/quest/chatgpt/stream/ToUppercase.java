package java8.quest.chatgpt.stream;

import java.util.Arrays;
import java.util.List;

public class ToUppercase {
    //    Use a stream to convert a list of strings to uppercase.
    public static void main(String[] args) {
        List<String> list = Arrays.asList("shubham", "ram", "arnav", "aditya");

        list.stream().map(s -> s.toUpperCase()).forEach(x -> System.out.print(x + " "));

    }
}
