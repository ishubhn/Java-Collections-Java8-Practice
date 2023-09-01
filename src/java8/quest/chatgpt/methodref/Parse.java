package java8.quest.chatgpt.methodref;

import java.util.ArrayList;
import java.util.List;

public class Parse {
    public static void main(String[] args) {
        //  Implement a method reference to the parseInt() method of the Integer class.
        //  and
        //  Convert the following lambda expression into a method reference:
        //  list.forEach(item -> System.out.println(item));
        List<String> list = List.of("1234","112","21","34","54");
        list.stream().map(Integer::parseInt).sorted().forEach(System.out::println);
    }
}
