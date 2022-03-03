/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizacionhilos_join;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALEX
 */
public class Aplicacion {

    public static void main(String[] args) {
        
        HiloEjemplo clase = new HiloEjemplo();
        

        Thread hilo1 = new Thread(clase);
        
        Thread hilo2 = new Thread(clase);
        hilo1.start();
        
        try {
            
            hilo1.join();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        hilo2.start();
        
        
    }

}
