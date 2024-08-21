package Manejo_De_Errores;

import java.util.Stack;
import java.util.Arrays;

public class Book {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        System.out.println(books.isEmpty());
        books.push("Effective Java");
        books.push("Head First Java");
        books.push("Thinking in Java");
        System.out.println(books.size());
        System.out.println(books.search("Effective Java"));
        System.out.println(books.search("Java for dummies"));
        System.out.println(books.peek());
        System.out.println(books.pop());
        System.out.println(books.size());
        System.out.println(Arrays.toString(books.toArray()));
        System.out.println(books.isEmpty());
    }
}
