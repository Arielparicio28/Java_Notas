package Shadowing_Concept_And_Example;

/* Shadowing(sombreado) permite que existan variables y metodos con el mismo nombre y tipo
 tanto en una clase anidada como en la clase que la encierra simultáneamente.
 El valor de la variable dependerá del objeto que usemos para llamarla.*/


class Book {
    String type = "Nonfiction";
    // Nested inner class
    class Biography {
        String type = "Biography";

        public void print(){
            System.out.println(type);
            System.out.println(Book.this.type);
        }
    }
}

public class Books {
    public static void main(String[] args) {
        Book book = new Book();
        Book.Biography bio = book.new Biography();
        bio.print();
    }
}
