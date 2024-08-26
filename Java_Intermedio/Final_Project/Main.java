package Final_Project;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name");
        String customerName = input.nextLine();

        int money = 0;
        boolean validInput = false;

        while (!validInput){
            System.out.println("What is your starting money");

            try{
                money = input.nextInt();
                if(money <=0){
                    throw  new InputMismatchException();
                }
                validInput = true;
            }catch (InputMismatchException e){
                System.out.println("Invalid input please enter a positive integer");
                input.nextLine();
            }
        }

        Customer customer = new Customer(customerName,money);
        TakeOutSimulator takeOutSimulator = new TakeOutSimulator(customer,input);
        takeOutSimulator.startTakeOutSimulator();








    }
}
