package Deserialización;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* Importante tener en cuenta que la deserialización crea una copia del objeto original.
 Esto significa que el objeto deserializado comparte los mismos valores de campo que el objeto original,
  pero se encuentra en un lugar diferente de la memoria*/

public class Car implements Serializable {
    private String make;
    private int year;
    private static final long serialVersionUID = 1L;

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String toString(){
        return String.format("Car make is: %s, Car year is: %d", this.make, this.year);
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //Serialización
        Car toyota = new Car("Toyota", 2021);
        Car honda = new Car("Honda", 2020);
        FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(toyota);
        objectOutputStream.writeObject(honda);

        //Deserialización

        /* Inicializado FileInputStream y ObjectInputStream leerá un archivo y transformará
         un flujo de bytes en un objeto Java.*/
        FileInputStream fileInputStream = new FileInputStream("cars.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        /* Se creó un Car objeto llamado toyotaCopy y hondaCopy
        usando objectInputStream.readObject()para leer un objeto serializado.*/

        Car toyotaCopy = (Car) objectInputStream.readObject();
        Car hondaCopy = (Car) objectInputStream.readObject();

        boolean isSameObject = toyotaCopy == toyota;
        System.out.println("Toyota (Copy) - "+toyotaCopy);
        System.out.println("Toyota (Original) - "+toyota);
        System.out.println("Is same object: "+ isSameObject);
    }
}