package Project_Herencia_Polimorfismo;

 class Mayan extends Language {

     //Constructor
     Mayan(String name, Integer numSpeakers){
  super(name,numSpeakers,"Central-America","verb-object-subject");
     }

     @Override
     public void getInfo(){
         System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken);
         System.out.println("The language follows the word order: " + wordOrder);
     }
}
