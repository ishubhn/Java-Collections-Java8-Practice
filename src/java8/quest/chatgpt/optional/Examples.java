package java8.quest.chatgpt.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Examples {
    public static void main(String[] args) {
        // Q - Use Optional to handle the scenario where a value may or may not be present.
        String name = "My Name is XYZ";
        String name1 = null;

        Optional<String> optional = Optional.ofNullable(name);
        Optional<String> optional1 = Optional.ofNullable(name1);

        if (optional.isPresent()) {
            System.out.println("name is Present");
        }

        if (optional1.isEmpty()) {
            System.out.println("name is absent");
        }
        System.out.println("\n");

    }
}
