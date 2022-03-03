/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ALEX
 */
public class VentanaCronometro extends JFrame implements ActionListener {

    private JLabel label;
    private JButton btnIniciar;
    private JButton btnDetener;

    static int hora = 0, minuto = 0, segundo = 0;
    static boolean iniciaHilo = true;
    boolean corriendo = false;

    public VentanaCronometro() {
        initialize();
        setSize(248, 140);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
        
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("00:00:00");
        label.setFont(new Font("Traditional Arabic", Font.PLAIN, 30));
        label.setBounds(65, 11, 137, 45);
        getContentPane().add(label);

        btnIniciar = new JButton("Inicia");
        btnIniciar.setBounds(130, 62, 89, 23);
        btnIniciar.addActionListener(this);
        getContentPane().add(btnIniciar);

        btnDetener = new JButton("Para");
        btnDetener.setBounds(17, 62, 89, 23);
        btnDetener.addActionListener(this);
        getContentPane().add(btnDetener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnIniciar) {
            if (corriendo == false) {

                iniciaHilo = true;
                corriendo = true;
                iniciarHiloCronometro();

            }
        }

        if (e.getSource() == btnDetener) {
            if (corriendo == true) {
                iniciaHilo = false;
                corriendo = false;
                System.out.println("Detenido");
                

            }
        }
    }

    public void iniciarHiloCronometro() {
        if (iniciaHilo == true) {
            
            System.out.println("Inicia el hilo");
            Cronometro cronometro=new Cronometro(label);
            
            cronometro.start();
            
        }
    }

}
