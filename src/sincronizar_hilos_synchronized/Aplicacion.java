/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincronizar_hilos_synchronized;

/**
 *
 * @author ALEX
 */
public class Aplicacion {
    public static void main(String[] args) {
        CajeroAutomatico cajero=new CajeroAutomatico();
    
    Thread usuario1=new Thread(cajero,"Pepito");
    Thread usuario2=new Thread(cajero,"Juanito");
    
    usuario1.start();
    usuario2.start();
    }
    
    
    
}
