package Project_Herencia_Polimorfismo;

class SinoTibetan extends Language {
   //Constructor
    SinoTibetan(String name, Integer numSpeakers){
        super(name,numSpeakers,"Asia","subject-object-verb");
        if(name.contains("Chinese")){
     wordOrder = "subject-verb-object";
        }
    }
    @Override
    public void getInfo(){
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken);
        System.out.println("The language follows the word order: " + wordOrder);
    }
}
