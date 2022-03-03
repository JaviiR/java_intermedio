/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizacionhilos_join;

/**
 *
 * @author ALEX
 */
public class HiloEjemplo implements Runnable{

    @Override
    public void run() {
        
    for(int i=0;i<=10;i++){
        System.out.println("Num: "+i+" - "+Thread.currentThread().getName());
       
        try {
        Thread.sleep(0);
           
    }
            
         catch (Exception e) {
            System.out.println("ERROR: "+e);
        }
    }
        System.out.println("Finaliza el "+Thread.currentThread().getName());
    }
    
    
    
}
