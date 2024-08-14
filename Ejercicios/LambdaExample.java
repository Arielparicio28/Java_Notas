package Ejercicios;
import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Using lambda expression to iterate through the list
        names.forEach(name -> System.out.println(name));
    }
}
