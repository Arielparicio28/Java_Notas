package Variables;


public class Creator {
    public static void main(String[] args) {
        String name  = "James Gosling";
       final  int yearCreated = 1995;
       // yearCreated = 2000; cuando uso final es para decir q la variable no puede ser reasignada.
        System.err.println(name + " " + yearCreated);
    }
}
