package Ejercicios;
//Importación de la biblioteca Scanner:
import java.util.Scanner;

//Declaración de la clase y el método principal: (Clase calculadora,metodo main.)
public class Calculadora {
    public static void main(String[] args) {
        //Declaración de variables y creación de un objeto Scanner:
        Scanner scanner = new Scanner(System.in);  //Objeto Scanner para leer la entrada del usuario.
        // variables para los números de entrada, el resultado y el operador
        int num1, num2, resultado;
        char operacion;
        
        System.out.println("Ingrese el primer número:");
        num1 = scanner.nextInt();
        
        System.out.println("Ingrese el operador (+, -, *, /):");
        operacion = scanner.next().charAt(0);
        
        System.out.println("Ingrese el segundo número:");
        num2 = scanner.nextInt();
        
        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado es: " + resultado);
                } else {
                    System.out.println("Error: División por cero no es permitida.");
                }
                break;
            default:
                System.out.println("Error: Operador no válido.");
                break;
        }
        
        scanner.close();
    }
}
