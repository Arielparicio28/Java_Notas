package Ejercicios;
import static java.lang.Math.*; // import Math class
//Si quito la importación uso el Math,pero si la dejo puedo usarlo de esta manera min(3, 10);
class Numbers {
  public static void main(String[] args) {
    // Call method by using method name and arguments
    int smallerNumber = Math.min(3, 10);
    System.out.println(smallerNumber); // Prints: 3

    int maximumNumber = max(smallerNumber, 8);
    System.out.println(maximumNumber); // Prints: 8

    // pow es para calcular el exponente el primer parametro es la base y el segundo el exponente.
    double x = Math.pow(5, 3);
    System.out.println(x); // Prints: 125.0

    //abs convierte el numero en positivo
    int y = Math.abs(-15) + 5;
    System.out.println(y);

    //sqrt calcula la raíz cuadrada del número.
    double z = Math.sqrt(49); 
    System.out.println(z); // Prints: 7.0
    double w = Math.sqrt(52); 
    System.out.println(w); // Prints: 7.211102550927978

    // Random double valor entre 0 y 10, no incluye el 10
    double a = Math.random() * 10;
    System.out.println(a); // Prints: random double entre 0 y 9 pero al ser doble no los imprime enteros

    // Random int value between 0 and 9
    int b = (int)(Math.random() * 10);
    System.out.println(b); // Prints: random entero entre 0 y 9 y numeros enteros.

    // Random int value between 10 and 20
    int d = (int)(Math.random() * 11 ) + 10;
    System.out.println(d); // Prints: random entero entre 10 y 20 y numeros enteros.

  }
}
