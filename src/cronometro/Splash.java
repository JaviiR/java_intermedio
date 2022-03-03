/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

import java.awt.Font;
import javax.swing.JDialog;
import javax.swing.*;


/**
 *
 * @author ALEX
 */
public class Splash extends JDialog{
    private JLabel lblSplashScreen;
    private JProgressBar barraDeProgreso;
    private JLabel porcentaje;
    private JLabel porcentaje2;
    
    
    public Splash(){
        initialize();
        setSize(300,150);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        setUndecorated(true);
        iniciarHilo();

    }

    private void initialize() {
        lblSplashScreen=new JLabel("Splash Screen");
        lblSplashScreen.setFont(new Font("Tahoma",Font.PLAIN,18));
        lblSplashScreen.setBounds(49,11,147,32);
        add(lblSplashScreen);
        
        
        barraDeProgreso=new JProgressBar();
        barraDeProgreso.setBounds(26,54,229,32);
        add(barraDeProgreso);
        
        
        porcentaje=new JLabel("0%");
        porcentaje.setFont(new Font("Tahoma",Font.PLAIN,14));
        porcentaje.setBounds(206,23,46,14);
        add(porcentaje);
        
        
        porcentaje2=new JLabel("0%");
        porcentaje2.setFont(new Font("Tahoma",Font.PLAIN,14));
        porcentaje2.setBounds(26,97,264,14);
        add(porcentaje2);
        
    }

    private void iniciarHilo() {
        Thread hilo=new Thread(new Runnable() {
            int x=0;
            String cad=".";
            @Override
            public void run() {
                try {
                    while(x<=100){
                        barraDeProgreso.setValue(x);
                        porcentaje.setText(x+"%");
                        porcentaje2.setText(cad+x+"%");
                        x+=2;
                        cad+=".";
                        Thread.sleep(500);
                        
                    }
                    dispose();
                            VentanaCronometro cronometro=new VentanaCronometro();
        cronometro.setVisible(true);
                } catch (Exception e) {
                    System.out.println("ERROR: "+e.getMessage());
                }
            }
        });
        hilo.start();
    }
    
    
    
    
}
