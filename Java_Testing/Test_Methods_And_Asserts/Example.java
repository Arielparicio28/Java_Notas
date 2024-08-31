package Test_Methods_And_Asserts;

public class Example {
    // Constructor
    public Example() {
    }

    public int factorial(int n) {

        if(n==0){
            return 1;
        }else{
            //Formula para calcular factorial.
            return n = n * factorial(n-1);
        }
    }
}