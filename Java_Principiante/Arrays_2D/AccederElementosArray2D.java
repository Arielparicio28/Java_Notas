package Arrays_2D;

public class AccederElementosArray2D {
    public static void main(String[]args) {
        int[][] data = {{2, 4, 6}, {8, 10, 12}, {14, 16, 18}};

        // El primer parametro q toma es el array al cual voy a acceder (fila) y
        // el segundo es  a la posicion de dicho array (columna) este ejemplo da 6 como resultado.
        int stored = data[0][2];
        System.out.println(stored);
        int stored1 = data[1][1];
        System.out.println(stored1);

        int[][] intMatrix = {
                {1, 1, 1, 1, 1},
                {2, 4, 6, 8, 0},
                {9, 8, 7, 6, 5}
        };
        int retrievedInt = intMatrix[0][3];
        System.out.println(retrievedInt);
        int centerValue = intMatrix[1][2] * 3;
        System.out.println(centerValue);
    }


}
