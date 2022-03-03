/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploshilos;

public class Cajera extends Thread{

    String nombre;
    Cliente cliente;
    long timeStamp;
    
    public Cajera(String nombre,Cliente cliente,long initialTime){
        this.nombre=nombre;
        this.cliente=cliente;
        this.timeStamp=initialTime;
    }

//    public void procesarCompra(Cliente cliente, long timeStamp) {
//        System.out.println("La cajera " + this.nombre + " comienza a procesar la compra del cliente " + cliente.getNombre() + " en el tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
//        for (int i = 0; i < cliente.getCarroCompra().length; i++) {
//            this.esperarXsegundos(cliente.getCarroCompra()[i]);
//            System.out.println("Procesado el producto " + (i + 1) + " ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
//        }
//
//        
//        System.out.println("La cajera "+this.nombre+" ha terminado de procesar al "+cliente.getNombre()+" en el tiempo: "+(System.currentTimeMillis()-timeStamp)/1000+"seg");
//    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void run() {
       System.out.println("La cajera " + this.nombre + " comienza a procesar la compra del cliente " + cliente.getNombre() + " en el tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
        for (int i = 0; i < cliente.getCarroCompra().length; i++) {
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Cajera "+this.nombre+" Procesado el producto " + (i + 1) + " ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
        }

        
        System.out.println("La cajera "+this.nombre+" ha terminado de procesar al "+cliente.getNombre()+" en el tiempo: "+(System.currentTimeMillis()-timeStamp)/1000+"seg");
    }
    
    
    

}
