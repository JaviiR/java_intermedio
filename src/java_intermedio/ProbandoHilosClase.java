/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_intermedio;

/**
 *
 * @author ALEX
 */
public class ProbandoHilosClase {

    
    public void HilosClase(){
    for(int i=0;i<=10;i++){
        System.out.println("hola "+i+"--"+Thread.currentThread().getName());  
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
}
    
    
   
    

    
}
