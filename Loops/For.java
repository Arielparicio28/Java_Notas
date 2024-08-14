package Loops;

import java.util.ArrayList;

public class For {
    public static void main(String[] args) {
      
        //Bucle 1
      for (int cupsOfCoffee = 1; cupsOfCoffee <= 100; cupsOfCoffee++) {
        
        System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
        
      }

//Bucle 2
      ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);
        
    double mostExpensive = 0;
    double total = 0;
    
    // Iterate over expenses
    for (int i = 0; i < expenses.size(); i++) {
      
      // total += expenses.get(i);
      total = total + expenses.get(i);
      
    }
    System.out.println(total);
    for (double expense : expenses){
        if(expense > mostExpensive){
          mostExpensive = expense;
        }
          }
          
          System.out.println(mostExpensive);
    
    //Bucle 3
    for (int i = 0; i < 100; i++) {
        // Add your code below
      if(i % 5 != 0){
        continue;
      }
      System.out.println(i);
        
      }
  }
  
      
    }
    
  