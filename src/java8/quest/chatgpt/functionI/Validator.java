package java8.quest.chatgpt.functionI;

@FunctionalInterface
interface IValidator {
    boolean isStringValid(String s);
}

public class Validator {
    //    Define a functional interface called "Validator" with a method
    //    that takes a string and returns a boolean indicating whether the
    //    string is valid. Implement the interface using a lambda expression
    //    that checks if the string is not empty.
    public static void main(String[] args) {
        IValidator iValidator = s -> s.isEmpty();
        System.out.println(iValidator.isStringValid("5"));
    }
}
