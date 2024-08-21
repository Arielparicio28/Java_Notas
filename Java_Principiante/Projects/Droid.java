package Projects;

public class Droid {

   String name;
   int batteryLevel;
//Constructor
   public Droid(String droidName){
   name = droidName;
   batteryLevel = 100;
   }
//Metodo
   public String toString(){
    return "Hello I'am the Droid: " + name;
   }

   //Metodo
   public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    //batteryLevel = batteryLevel - 10;
    batteryLevel-=10;
   }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("Dancing");
    }
}
