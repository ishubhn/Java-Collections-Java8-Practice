package java8.quest.chatgpt.optional;

import java.util.List;
import java.util.Optional;

public class GetMax {
    public static Optional<Integer> getMaxValue(List<Integer> list) {
        return list.stream().max(Integer::compare);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,1545,645,7,85);
        System.out.println(GetMax.getMaxValue(list).get());
    }
}
