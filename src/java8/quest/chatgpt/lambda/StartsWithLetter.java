package java8.quest.chatgpt.lambda;

import java.util.Arrays;
import java.util.List;

public class StartsWithLetter {
    public static void main(String[] args) {
//       Q. Implement a lambda expression to filter a list of strings and return only those
//        starting with a specific letter.
        List<String> stringList = Arrays.asList("Shubham","Udit","Savitri","Janhavi","Ram","Shubhang","Shwetketu");

        stringList.stream().filter(x -> x.startsWith("S")).forEach(System.out::println);
    }
}
