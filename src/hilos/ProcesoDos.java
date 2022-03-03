 package hilos;

public class ProcesoDos implements Runnable {

    private String nombre;
    public ProcesoDos(String name){
        this.nombre=name;
    }
    
    @Override
    public void run() {
        Thread.currentThread().setName(nombre);
        for (int i = 0; i <= 5; i++) {
            System.out.println(i+" "+Thread.currentThread().getName());
            try {
            Thread.sleep(5000);    
            } catch (Exception e) {
            }
            
        }
    }

}
