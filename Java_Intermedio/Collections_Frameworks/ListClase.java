package Collections_Frameworks;
import java.util.List;
import java.util.ArrayList;

public class ListClase {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");
 //Itero en cada elemento de mi lista.
        for(String element: stringList){
            System.out.println(element);
        }
    }
}

/* A List es una colección donde los elementos están ordenados en una secuencia.
 Lists nos permite tener elementos duplicados y un control detallado sobre dónde
  se insertan los elementos en la secuencia.*/