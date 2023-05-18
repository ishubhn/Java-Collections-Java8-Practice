package java8.functionalInterface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    // Create a functional interface
    // Create a SAM
    // get an array or list and increment each no by 10
    // store values in another list and print
    public static void main(String[] args) {
        //  Approach 1. Use stream
        List<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));

        IncrementOp op = number -> number + 10;

        List<Integer> list2 = list.stream().map(op::performAddition).collect(Collectors.toList());
        list2.stream().forEach(System.out::println);
    }

}
