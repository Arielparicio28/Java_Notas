package Clases;

public class Store {
      // instance fields
  public String productType;
  public int inventoryCount;
  public double inventoryPrice;
  
  // constructor method
  public Store(String product,double price) {
    productType = product;
    inventoryPrice = price;
  }

    // increase price method
    public void increasePrice(double priceToAdd){
      double newPrice = inventoryPrice + priceToAdd;
      inventoryPrice = newPrice;
  }
    
}
