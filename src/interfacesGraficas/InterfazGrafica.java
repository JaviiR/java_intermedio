/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesGraficas;


import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author ALEX
 */
public class InterfazGrafica extends Jframe{
    
    
    private JTextField textField1;
    private JLabel label1;
    private JButton boton1;
    
    public InterfazGrafica(){
        initComponents();
    }
    public static void main(String[] args) {
     new InterfazGrafica();
    }

    private void initComponents() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setBounds(0, 0, 450, 350);
        label1=new JLabel("Mensaje: ");
        label1.setBounds(15,10,100,30);
        add(label1);
        textField1=new JTextField();
        textField1.setBounds(80,16,190,20);
        add(textField1);
        boton1=new JButton("Mostrar");
        boton1.setBounds(80,40,100,20);
        add(boton1);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FuncionBoton1(e);
            }
        });
    }
    
    
    
    
    private void FuncionBoton1(ActionEvent evt){
        JOptionPane.showMessageDialog(null,textField1.getText());
        
        
    }
    
    
}
