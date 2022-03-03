/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadosDeUnHilo;

/**
 *
 * @author ALEX
 */
public class Hilo_Proceso extends Thread{
    @Override
    public void run(){
        for(int i=0; i<=5;i++){
            if(i==5){
                stop();
            }else
            System.out.println(i+" "+getName());
            System.out.println("");
        try {
        sleep(1000);    
        } catch (InterruptedException e) {
            System.out.println("Error interno: "+e);
        }
            
        }
        
        
    }
    
    
    
}
