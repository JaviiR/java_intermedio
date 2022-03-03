/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_intermedio;

import java.io.Console;

/**
 *
 * @author ALEX
 */
public class ProbandoHilosPrincipal implements Runnable{
    
    public ProbandoHilosPrincipal(){
        Thread t=new Thread(this);
        Thread t2=new Thread(this);
         t.start();
         try {
         Thread.sleep(1000);   
        } catch (Exception e) {
        }
         
         t2.start();
    }
     public static void main(String[] args) {
        
       new ProbandoHilosPrincipal();
         
    }

    @Override
    public void run() {
      for(int i=0;i<=10;i++){
        System.out.println("hola "+i+"--"+Thread.currentThread().getName());  
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
     
    }
     
  
}
