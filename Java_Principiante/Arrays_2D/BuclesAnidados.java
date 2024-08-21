package Arrays_2D;

public class BuclesAnidados {
    public static void main(String[] args) {
        int tableSize = 10;
        for(int i = 1; i <= tableSize; i++){
            for(int j = 1; j <= tableSize; j++){
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
