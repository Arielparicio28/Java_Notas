 package Clases;
 public class Car { 
   /* 
 declare fields inside the class 
 by specifying the type and name 
 */ 

 public String color; 
 public int year; 
 public String modelName; 
 public String make; 
 public boolean isRunning; 
 public int velocity; 

    // Constructor
    public Car() { 
   
      // instructions for creating a Car instance 
     /*  Car ferrari = new Car(); 
      ferrari.color = "red";
      System.out.println(ferrari.color); */
    }   
    //Metodo
    public void startEngine() {
      System.out.println("Starting the car!");
      System.out.println("Vroom!");
    }
  
   } 
