/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadorProtected;

import java.util.Scanner;

/**
 *
 * @author ALEX
 */
public abstract class Atributos_Metodos {

    protected int numero1,numero2,resultado;
    
    
    protected Scanner entrada= new Scanner(System.in);
    
    protected void PedirDatos(){//este metodo pide los valores a sumar
        System.out.println("Dame el primer valor:");
        numero1=entrada.nextInt();
        
        System.out.println("Dame el Segundo valor:");
        numero2=entrada.nextInt();
         
    }
    
    protected abstract void Operacion();
    
    protected abstract void MostrarResultado();
//    private String id;
//    private double importe;
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public double getImporte() {
//        return importe;
//    }
//
//    public void setImporte(double importe) {
//        this.importe = importe;
//    }
//
//    public abstract double calcularTotal();

}
