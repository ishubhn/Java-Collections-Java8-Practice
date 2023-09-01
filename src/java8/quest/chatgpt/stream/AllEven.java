package java8.quest.chatgpt.stream;

import java.util.Arrays;
import java.util.List;

public class AllEven {
    //    Given a list of objects, filter the objects based on a specific condition using a stream.
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,8,10);
        list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}
