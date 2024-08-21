package Genericos;

/*El parámetro de tipo debe especificarse dentro del operador de diamante ( <>) después del classnombre.*/
public class Box <T>{
    /*El parámetro de tipo, T, es similar a un parámetro de método
      pero en cambio recibe un tipo class o interface como argumento en lugar de una referencia
       o un tipo primitivo.*/
    private T data;

    /*El constructor acepta un T parámetro de tipo para inicializar data*/
    public Box(T data) {
        this.data = data;
    }

    //El método getter devuelve el parámetro de tipo T cuando devuelve data.
    public T getData() {
        return this.data;
    }

}
