package Arrays_2D;

import java.util.Arrays;

public class TicTacToe {
    public static void main(String[] args) {
        // Declare a 2d array of float values called floatTwoD
        float [][] floatTwoD;
        //Es un array de dos dimensiones de 4 filas y 10 columnas.
        floatTwoD = new float [4][10] ;
        System.out.println(Arrays.deepToString(floatTwoD));

        char [][] ticTacToe = {{'X', 'O', 'O'}, {'O', 'X', ' '}, {'X', ' ', 'X'}};
        System.out.println(Arrays.deepToString(ticTacToe));
        ticTacToe = new char[][] {{'O', 'X', 'X'}, {'X', 'O', ' '}, {'O', ' ', 'O'}};
        System.out.println(Arrays.deepToString(ticTacToe));


    }
}
