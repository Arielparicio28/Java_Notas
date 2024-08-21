package Serializacion;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Car implements Serializable {

    private String make;
    private int year;
    private static final long serialVersionUID = 1L;

    //Constructor
    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Nuevos objetos toyota y honda.
        Car toyota = new Car("Toyota", 2021);
        Car honda = new Car("Honda", 2020);

        /*Se inicializa un FileOutputStream objeto el que se
         creará y escribirá un flujo de bytes en un archivo llamado cars.txt*/
        /*Inicializa un ObjectOutputStream objeto que ayudará a serializar
         un objeto en un flujo de salida específico.*/
        FileOutputStream fileOutputStream = new FileOutputStream("cars.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        //Se utiliza objectOutputStream.writeObject()para serializar los objetos toyota y honda en un archivo.
        objectOutputStream.writeObject(toyota);
        objectOutputStream.writeObject(honda);
    }



















}
