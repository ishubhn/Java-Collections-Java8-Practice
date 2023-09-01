package java8.quest.chatgpt.lambda;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
//      Q.  Use a lambda expression to sort a list of integers in ascending order.
        List<Integer> list = Arrays.asList(184,246,39,7,25,956,175,742);
        list.stream().sorted().forEach(System.out::println);
    }
}
