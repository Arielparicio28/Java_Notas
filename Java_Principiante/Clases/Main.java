package Clases;
import Clases.Car;
import Clases.Store;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args){ 
          // instructions for creating a Car instance 
        Car ferrari = new Car(); 
        ferrari.color = "red";
        ferrari.startEngine();
        System.out.println("That was one fast car!");
        System.out.println(ferrari.color);



        Store lemonadeStand = new Store("Lemonade", 3.75);
        System.out.println(lemonadeStand);
        lemonadeStand.increasePrice(1.50);
        System.out.println(lemonadeStand.inventoryPrice);


        SavingsAccount savings = new SavingsAccount(2000);
        
        //Check balance:
        savings.checkBalance();
            
        //Withdrawing:
        savings.withdraw(300);
            
        //Check balance:
        savings.checkBalance();
            
        //Deposit:
        savings.deposit(600);
            
        //Check balance:
        savings.checkBalance();
            
        //Deposit:
        savings.deposit(600);
            
        //Check balance:
        savings.checkBalance();
            
        System.out.println(savings);
    }
}
