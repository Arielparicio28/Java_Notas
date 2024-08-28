package Project_Threads_Subprocesos;

import java.util.Random;

public class Barbero implements  Runnable {

    private final Barberia barberia;
    private final String name;

    public Barbero(Barberia barberia, String name) {
        this.barberia = barberia;
        this.name = name;
    }

    @Override
    public void run(){
        Random random = new Random();
        try {
            while(true){
                Cliente cliente = barberia.getClientes();
                System.out.println(name + "Comienza a atender a : " + cliente.getName());
                int tiempoDeEspera = random.nextInt(10)+1;
                Thread.sleep(tiempoDeEspera * 1000);
                System.out.println(name + "Ha terminado de atender a : "+ cliente.getName()+ " en " + tiempoDeEspera + " segundos.");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
