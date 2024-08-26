package Collections_Frameworks;
import java.util.Set;
import java.util.TreeSet;
//Set es una coleccion de elementos unicos no acepta duplicados y todos sus metodos hacen que siga siendo así.

public class SetClase {
    public static void main(String[] args) {

        Set<Integer> sortedSet = new TreeSet<>();

        sortedSet.add(3);
        sortedSet.add(7);
        sortedSet.add(27);
        sortedSet.add(7);

        boolean containNumber = sortedSet.contains(7);
        System.out.println(containNumber);
//Al usar Set coleccion he iterar a traves de ella no se pude garantizar del orden de los elementos (HashSet<>()).
        for(Integer element:sortedSet){
            System.out.println(element);
        }
    }
}
