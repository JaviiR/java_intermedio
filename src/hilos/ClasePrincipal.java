/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author ALEX
 */
public class ClasePrincipal {
    private static Runnable tg;
    public static void main(String[] args) {
        
//        ProcesoUno proceso1=new ProcesoUno(5);
//        ProcesoUno proceso3=new ProcesoUno(10);

//        Thread proceso4= new Thread(new ProcesoDos("hilo 2"));

ProcesoUno proceso1=new ProcesoUno(" hilo 1");
ProcesoUno proceso2=new ProcesoUno(" hilo 2");
ProcesoUno proceso3=new ProcesoUno(" hilo 3");
        
        proceso1.ValorDCondicion(5);
        proceso2.ValorDCondicion(10);
        proceso3.ValorDCondicion(5);

        
        proceso1.start();
        proceso2.start();
       proceso3.start();
//        proceso4.start();
//        
        
    }
    
}
