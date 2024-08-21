package Genericos;

public class Container <T>{
    private T data;

    public Container(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

    public void setData(T data){
        this.data = data;
    }
}
