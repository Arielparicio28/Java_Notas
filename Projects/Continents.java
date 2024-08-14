package Projects;

public class Continents {

    public static void main(String[] args) {
        int continent = 4;
        switch (continent) {
            case 1:
            System.out.println("North America,Mexico City,Mexico"); 
            break;
          
            case 2:
            System.out.println("South America,Sao Paulo,Brazil");
            break;

            case 3:
            System.out.println("Europe,Paris,France");
            break;

            case 4:
            System.out.println("Asia,Tokyo,Japan");
            break;

            case 5:
            System.out.println("Africa,Cairo,Egypt");
            break;

            case 6: 
            System.out.println("Antarctica,South Pole,Antarctica");
            break;

            case 7:
            System.out.println("Oceania,Sydney,Australia");
            break;

            default:
            System.out.println("Undefined continent");
                break;
        }
    }
}
