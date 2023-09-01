package java8.quest.chatgpt.functionI;

@FunctionalInterface
interface ICalculator {
    int sum(int a, int b);
}

public class Calculator {
    //    Create a functional interface called "Calculator" with a method
    //    that takes two integers and returns their sum.
    //    Implement the interface using a lambda expression.
    public static void main(String[] args) {
        ICalculator iCalculator = (a,b) -> a + b;

        System.out.println(iCalculator.sum(123,234));

    }
}