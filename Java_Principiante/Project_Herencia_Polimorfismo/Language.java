package Project_Herencia_Polimorfismo;

public class Language {
    //Variables
    protected String name;
    protected Integer numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

//Constructor
 Language(String name, Integer numSpeakers, String regionsSpoken,String wordOrder){
     this.name = name;
     this.numSpeakers = numSpeakers;
     this.regionsSpoken = regionsSpoken;
     this.wordOrder = wordOrder;
 }

 // Metodo getInfo().

    public void getInfo(){
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the words orders: " + wordOrder);
    }

//main metodo.
    public  static  void main(String[]args){
 Language spanish = new Language("Spanish",500000,"half of earth","Subject-Adjective-verb");
   spanish.getInfo();

   Mayan maya = new Mayan("Hula",900);
   maya.getInfo();

   SinoTibetan sino = new SinoTibetan(" Mandarin Chinese",49098);
   sino.getInfo();

        SinoTibetan sino1 = new SinoTibetan("Japan",4908);
        sino1.getInfo();
    }
}
