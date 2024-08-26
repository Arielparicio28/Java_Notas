package Final_Project;
import java.util.ArrayList;
import java.util.List;


public class FoodMenu {
    private List<Food> menu = new ArrayList<>();

    public FoodMenu(){
        menu.add(new Food("Pescado","con salsa agridulce",12));
        menu.add(new Food("Paella","De mariscos y carnes",36));
        menu.add(new Food("Pizza","Cuatro formatos",15));
    }

    @Override
    public String toString(){
        String returnString = "";
        int count = 1;
        for(Food item:menu){
            returnString += count + ". " + item.toString() + "\n";
            count++;
        }
        return returnString;
    }

    public Food getFood(int index){

        if(index > menu.size() || index < 1){
            return null;
        }else{
            return menu.get(index-1);
        }
    }

    public Food getLowestCostFood(){
        Food cheapest = menu.get(0);

        for(Food item:menu){
            if(item.getPrice() < cheapest.getPrice()){
                cheapest = item;
            }

        }
        return cheapest;
    }

}
