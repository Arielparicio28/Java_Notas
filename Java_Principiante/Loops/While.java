package Loops;
// Importing the Random library
import java.util.Random;
public class While {
  public static void main(String[] args) {
    
    // Creating a random number generator
    Random randomGenerator = new Random();
    
    // Generate a number between 1 and 6
    int dieRoll = randomGenerator.nextInt(6) + 1;

    // Repeat while roll isn't 5
    while (dieRoll != 5) {
      System.out.println(dieRoll);
			dieRoll = randomGenerator.nextInt(6) + 1;

    }
     // initialize cupsOfCoffee
     int cupsOfCoffee = 1;
    
     // add while loop with counter
     while (cupsOfCoffee <= 100) {
       
       System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
       cupsOfCoffee++;
       
     }
    
  }
  
}