package Matrices;
import java.util.ArrayList;
public class Detective {


  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Print the size of each ArrayList below:
    System.out.println(sherlocksToDos.size());
    System.out.println(poirotsToDos.size());  
    int tareasSherlock = sherlocksToDos.size();
    int tareasPoirot = poirotsToDos.size();
    // Print the name of the detective with the larger to-do list:
    if(tareasSherlock < tareasPoirot){
      System.out.println("Poirot");
    }else {
      System.out.println("Sherlock");
    }

    System.out.println("Sherlock's third to-do:");
    // Print Sherlock's third to-do:
    System.out.println(sherlocksToDos.get(2));
    
    System.out.println("\nPoirot's second to-do:");
    // Print Poirot's second to-do:
    System.out.println(poirotsToDos.get(1));

      // Remove each to-do below:
   /*    sherlocksToDos.remove("visit the crime scene");
      poirotsToDos.remove("visit the crime scene");
      sherlocksToDos.remove("play violin"); */

      System.out.println(sherlocksToDos.indexOf("solve the case"));
  }
  
}