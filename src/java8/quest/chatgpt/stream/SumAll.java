package java8.quest.chatgpt.stream;

import java.util.Arrays;
import java.util.List;

public class SumAll {
    //    Given a list of integers, use a stream
    //    to find the sum of all the even numbers

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

//        int result = list.stream().reduce(0, (a,b) -> a + b);
        int result = list.stream()
                        .filter( num -> num % 2 == 0)
                        .mapToInt(Integer::intValue)
                        .sum();
        System.out.println(result);
    }
}
