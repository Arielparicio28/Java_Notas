package Interfaces_Referencias_Genericas;

public class Main {
    public static void main(String[] args) {
        int myNumber = 24;
        String bookName = "Hello Book!";

        //Este uso es para clase generica
        Retriever<Integer> containerRetriever = new Container<>(myNumber);
        //Este otro uso es para clase no generica
        Retriever<String> bookRetriever = new Book(bookName);

        System.out.println("Container retrieved data: "+ containerRetriever.retrieveData());
        System.out.println("Book retrieved data: " + bookRetriever.retrieveData());
    }
}
