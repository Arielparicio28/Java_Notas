package Arrays_2D;

import java.util.Arrays;

public class Main {
    public  static  void main(String[]args){
        String[][] stringValues;
        stringValues = new String[][] {{"working", "with"}, {"2D",
                "arrays"}, {"is", "fun"}};
        System.out.println(Arrays.deepToString(stringValues));
    }
}
