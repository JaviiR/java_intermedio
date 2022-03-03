/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

import javax.swing.JLabel;

/**
 *
 * @author ALEX
 */
public class Cronometro extends Thread {

    JLabel etiqueta;

    public Cronometro(JLabel cronometro) {

        this.etiqueta = cronometro;
    }
    
    

  
    @Override
    public void run() {
        
        try {
            
            int x = 0;
            while (VentanaCronometro.iniciaHilo) {
                
                x++;
                System.out.println(x + " - " + Thread.currentThread().getName());
                ejecutarHiloCronometro(x);

                Thread.sleep(100);

            }
        } catch (InterruptedException e) {
            System.out.println("Excepcion en el hilo: " + e.getMessage());
        }
    }

    private void ejecutarHiloCronometro(int x) {
        
        System.out.println(x + " - " + Thread.currentThread().getName());
        VentanaCronometro.segundo++;
        if (VentanaCronometro.segundo > 59) {
            VentanaCronometro.segundo = 0;
            VentanaCronometro.minuto++;
        }
        if(VentanaCronometro.minuto>59){
            VentanaCronometro.minuto = 0;
            VentanaCronometro.hora++;
        }
        String textoSegundo = "", textoMinuto = "", textoHora = "";
        if (VentanaCronometro.segundo >= 10) {
            textoSegundo =""+ VentanaCronometro.segundo;
        } else {
            textoSegundo = "0" + VentanaCronometro.segundo;
        }

        if (VentanaCronometro.minuto >= 10) {
            textoMinuto += VentanaCronometro.minuto;
        } else {
            textoMinuto += "0" + VentanaCronometro.minuto;
        }
        
        if (VentanaCronometro.hora >= 10) {
            textoHora += VentanaCronometro.hora;
        } else {
            textoHora += "0" + VentanaCronometro.hora;
        }

        String reloj = textoHora + ":" + textoMinuto + ":" + textoSegundo;
        etiqueta.setText(reloj);

    }

}
