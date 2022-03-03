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
public class CuentaBancaria {
    
    private int saldoActual=50;
    
    public int getSaldoActual(){
        return saldoActual;
    }
    
    public void retiroDeCuenta(int valorRetiro){
        this.saldoActual-=valorRetiro;
    }
    
    
    
}
