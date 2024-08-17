package Arrays_2D;

public class RowSum {
    public static void main(String[] args){
        //Array de 2 dimensiones.
        double[][] data = {{0.51,0.99,0.12},
                {0.28,0.99,0.89},
                {0.05,0.94,0.05},
                {0.32,0.22,0.61},
                {1.00,0.95,0.09},
                {0.67,0.22,0.17}};

        //Total de filas.
        int rows = data.length;
        System.out.println(rows);
        //Total de columnas.
        int columns = data[0].length;
        System.out.println(columns);

        double rowSum;
        //Primera iteración at traves de las filas.
        for(int i = 0; i < rows; i++){
            rowSum = 0.0;
            //Segunda iteraccion a traves de las columnas.
            for(int j = 0; j < data[i].length;j++){
                rowSum += data[i][j];
            }
            System.out.println("Row: " + i +", Sum: " + rowSum);
        }
    }
}
