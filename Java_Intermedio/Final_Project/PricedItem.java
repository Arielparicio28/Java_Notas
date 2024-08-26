package Final_Project;

//al decirle que T extiende solo de Number la interfaz solo aceptara tipos de numeros.
public interface PricedItem <T extends Number>{

    T getPrice();
    void setPrice(T price);
}
