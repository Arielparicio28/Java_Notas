package Serializacion;
import java.io.Serializable;

//Al usar el implements serializable le estamos indicando a java que este objeto va a ser serializado.
//Interfaz Serializable: La clase del objeto debe implementar esta interfaz para poder ser serializada.

public class InterfazSerializable implements Serializable{
    private String make;
    private int year;

    //esto es necesario para que la serializacion sea facil de implementar
    private static final long serialVersionUID = 1L;

    //Constructor
    public InterfazSerializable(String make,int year){
        this.make = make;
        this.year = year;
    }
}

/*La serialización en Java es como convertir un objeto en un archivo que puedes guardar o enviar.
 Imagina que tienes un coche: con la serialización, lo conviertes en un archivo que puedes guardar
  en tu ordenador. Luego, cuando lo necesites, puedes volver a crear el coche a partir de ese archivo.*/