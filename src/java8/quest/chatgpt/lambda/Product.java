package java8.quest.chatgpt.lambda;

@FunctionalInterface
interface IProduct {
    int product(int a, int b);
}

public class Product {
    public static void main(String[] args) {
        //  1.  Write a lambda expression to multiply two numbers.
        IProduct pr = (a, b) -> a * b;

        int result = pr.product(5, 10);
        System.out.println(result);
    }

}
