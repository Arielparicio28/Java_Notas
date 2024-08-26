package Final_Project;
import java.util.Scanner;


public class TakeOutSimulator {

   private Customer customer;
   private FoodMenu menu;
   private Scanner input;

    public TakeOutSimulator(Customer customer, Scanner input){

    this.customer = customer;
    this.menu = new FoodMenu();
    this.input = input;

    }

    private <T> T getOutputOnIntInput (String userInputPrompt,IntUserInputRetriever<T> intUserInputRetriever) {

        while (true){
             System.out.println(userInputPrompt);
        if(input.hasNextInt()){
                 int userInput = input.nextInt();
                 input.nextLine();
        try{
            return intUserInputRetriever.produceOutputOnIntUserInput(userInput);
        }catch(IllegalArgumentException e){
            System.out.println(userInput + " is not valid input try again.");
        }
            }else{
            System.out.println("Input to be needs an int type. ");
            input.next();
        }
            }
    }
    public boolean shouldSimulate(){
    String userPrompt = "\n Enter 1 to continue simulation or 0 to finish.";
  IntUserInputRetriever<Boolean> intUserInputRetriever = s -> {

      if(s==1 && customer.getMoney() >= menu.getLowestCostFood().getPrice()){
          return true;
      }else if(s ==0){
          System.out.println("Thank you for eating with us.");
          return false;

      }else{
          throw new IllegalArgumentException();
      }

  };
        return  this.getOutputOnIntInput(userPrompt,intUserInputRetriever);
    }

    public Food getMenuSelection(){
  System.out.println("Our menu options:\n");
  System.out.println(menu);
        String userPrompt = "Choose a menu";
        IntUserInputRetriever<Food> intUserInputRetriever = s -> {

            if(menu.getFood(s) != null){
               return menu.getFood(s) ;
            }else{
                throw new IllegalArgumentException();
            }

        };
        return  this.getOutputOnIntInput(userPrompt,intUserInputRetriever);
    }

    public boolean isStillOrderingFood(){
        String userPrompt = "\n Enter 1 Continue shopping or 0 to Checkout. ";
        IntUserInputRetriever<Boolean> intUserInputRetriever = s -> {

            if(s==1){
                return true;
            }else if(s ==0){
                return false;

            }else{
                throw new IllegalArgumentException();
            }

        };
        return  this.getOutputOnIntInput(userPrompt,intUserInputRetriever);
    }

public void checkOutCustomer(ShoppingBag<Food> shoppingBag){
        System.out.println("Process payment...");

        int remainingMoney = customer.getMoney() - shoppingBag.getTotalPrice();
        customer.setMoney(remainingMoney);

        System.out.println("Your remaining money is $" + remainingMoney);
}

public void takeOutPrompt(){
        ShoppingBag<Food> shoppingBag = new ShoppingBag<>();
        int customerMoneyLeft = customer.getMoney();

        boolean stillOrdering = true;

        while(stillOrdering){
            System.out.println("You have " + customerMoneyLeft + "$ left to spend.\n");
            Food item = this.getMenuSelection();
            if(customerMoneyLeft >= item.getPrice()){
                customerMoneyLeft-=item.getPrice();
                shoppingBag.addItem(item);
            }else{
                System.out.println("Choose another item or checkout.");
            }
           stillOrdering = this.isStillOrderingFood();
            if(stillOrdering == false){
                checkOutCustomer(shoppingBag);
            }
        }
}

public void startTakeOutSimulator(){

        boolean continueSimulating = true;

        while(continueSimulating) {
            System.out.println("\n------------------------\n Name table and Grill \n------------------\n");
            System.out.println("Welcome " + customer.getName());
            this.takeOutPrompt();
            continueSimulating = this.shouldSimulate();
        }
}








}
