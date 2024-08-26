package Final_Project;
import java.util.HashMap;
import java.util.Map;

public class ShoppingBag <T extends PricedItem<Integer>>{
   private Map<T,Integer> shoppingBag;

    public ShoppingBag() {
    shoppingBag =  new HashMap<>();
    }

    public void addItem(T item){
    if(shoppingBag.containsKey(item)){
        Integer value = shoppingBag.get(item);
        shoppingBag.put(item,value + 1 );

    }else{
  shoppingBag.put(item,1);
    }
    }

    public int getTotalPrice(){
        int totalPrice = 0;
        for(Map.Entry<T,Integer> entry:shoppingBag.entrySet()){
            T item = entry.getKey();
            int quantity = entry.getValue();
            int itemTotalprice = item.getPrice() * quantity;
            totalPrice += itemTotalprice;

        }
        return totalPrice;
    }


}
