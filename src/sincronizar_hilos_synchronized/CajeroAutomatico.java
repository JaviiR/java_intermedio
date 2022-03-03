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
public class CajeroAutomatico implements Runnable{

    CuentaBancaria miCuentaBancaria=new CuentaBancaria();
    
    
    
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
            retirarDineroCuenta(10);
            if(miCuentaBancaria.getSaldoActual()<0){
                System.out.println("Su cuenta posee saldo negativo!!!");
            }
//            if(miCuentaBancaria.getSaldoActual()==0){
//                i=4;
//            }
                Thread.sleep(500);
            } catch (Exception e) {
            }
            
            
        }
    }

    private synchronized void retirarDineroCuenta(int valorRetiro) {
        if(miCuentaBancaria.getSaldoActual()>=valorRetiro){
            System.out.println("Saldo Actual es: "+miCuentaBancaria.getSaldoActual());
            System.out.println("El Usuario: "+Thread.currentThread().getName()+" esta realizando un retiro de "+valorRetiro+" Soles");
            miCuentaBancaria.retiroDeCuenta(valorRetiro);
            System.out.println("El retiro se realizó exitosamente!!!, el nuevo saldo es: "+miCuentaBancaria.getSaldoActual()+" Soles");
        }else{
            System.out.println("Señor "+Thread.currentThread().getName()+", No hay saldo suficiente para realizar la transacción");
        }
        
    }
    
}
