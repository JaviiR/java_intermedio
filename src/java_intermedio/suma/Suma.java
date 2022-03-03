/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_intermedio.suma;

import java.util.Date;

/**
 *
 * @author ALEX
 */
public class Suma {
     
    private int valorUno;
    private int valorDos;
    private int suma;

    
    
    
    public Suma() {
    
    }

   
   

    

    public Suma(int valorUno, int valorDos) {
        this.valorUno = valorUno;
        this.valorDos = valorDos;
        
    }
    
    

    public int getValorUno() {
        return valorUno;
    }

    public void setValorUno(int valorUno) {
        this.valorUno = valorUno;
    }

    public int getValorDos() {
        return valorDos;
    }

    public void setValorDos(int valorDos) {
        this.valorDos = valorDos;
    }

    
    
    private void Sumar(){
        suma=valorUno+valorDos;
    }
    
    
    public void imprimir(){
        this.Sumar();
        System.out.println("suma: "+suma);
    }
}
