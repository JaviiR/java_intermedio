/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesGraficas;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author ALEX
 */
public class Botones extends JFrame  {

    JButton boton1,boton2,boton3;
    JLabel label1;
    

    public Botones() {

        initComponents();
    }

    public static void main(String[] args) {


        new Botones();

    }

//    public void initComponents() {
//        setResizable(false);
//        setBounds(0, 0, 450, 350);
//        setLocationRelativeTo(null);
//        setVisible(true);
//        setLayout(null);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);

//        boton1 = new JButton("CERRAR");
//        boton1.setBounds(300, 250, 100, 30);
//        add(boton1);
//        boton1.addActionListener(this);
//    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == boton1) {
//            System.exit(0);
//        }
//    }

    private void initComponents() {
        
        setResizable(false);
        setBounds(0, 0, 450, 350);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        boton1=new JButton("BOTON1");
        boton1.setBounds(30, 250, 100, 30);
        add(boton1);
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        boton2=new JButton("BOTON2");
        boton2.setBounds(170, 250, 100, 30);
        add(boton2);
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        boton3=new JButton("BOTON3");
        boton3.setBounds(310, 250, 100, 30);
        add(boton3);
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
         label1=new JLabel("......");
        label1.setBounds(200, 0, 300, 200);
        label1.setVisible(true);
        
        
        add(label1);
        
        //todo lo de aqui es como el add que agrega sus dimenciones,modelo etc
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addGap(80, 80, 80)
//                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
//                
//                .addGap(73, 73, 73))
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addGap(56, 56, 56)
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    )
//                .addContainerGap(72, Short.MAX_VALUE))
//        );
//
//        pack();
    }
    
    
    private void btn1ActionPerformed(ActionEvent evt){
       
           label1.setText("boton1.");
           setTitle("1");
           
           
      

    }
    private void btn2ActionPerformed(ActionEvent evt){
       
           label1.setText("boton2..");
      setTitle("2");

    }
    private void btn3ActionPerformed(ActionEvent evt){
       
           label1.setText("boton3...");
      setTitle("3");

    }
}
