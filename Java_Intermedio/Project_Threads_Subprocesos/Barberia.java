package Project_Threads_Subprocesos;
import java.util.LinkedList;
import java.util.Queue;

public class Barberia {

    //Declaro variables estaticas
    private static final int num_barberos = 3;
    private static final int num_clientes = 10;

    private Queue<Cliente> filaClientes = new LinkedList<>();
    Object lock = new Object();
    private Thread[] barberos;

    public Barberia(){
        barberos = new Thread[num_barberos];
        for(int i = 0; i < num_barberos;i++){
            barberos[i] = new Thread(new Barbero(this," Barbero "+ (i+1)));

        }
    }

    public void iniciar(){
        for(Thread barbero:barberos){
            barbero.start();
        }

        for(int i = 1; i <= num_clientes;i++){
            Cliente cliente = new Cliente(" Cliente " + i);
            addClientes(cliente);
        }
    }

    //Metodo addclientes
    public void addClientes(Cliente cliente){
        // synchronized hace que se acceda un hilo a la vez
       synchronized (lock) {
           filaClientes.offer(cliente);
           lock.notify();
       }
    }

    //Metodo getClientes
    public Cliente getClientes() throws InterruptedException{
        synchronized (lock) {
            while(filaClientes.isEmpty()) {
                lock.wait();
            }
            return filaClientes.poll();
        }
    }

}
