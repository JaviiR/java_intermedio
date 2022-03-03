/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesGraficas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Label;
import java.awt.Rectangle;
import javax.swing.*;

/**
 *
 * @author ALEX
 */
public class Interfaz extends JFrame {
private Container label;

    public Interfaz(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Rectangle rectangulo=new Rectangle(140,-30,300,300);
//        Rectangle rectangulo2=new Rectangle();
        label=new JLabel("Soy todo un galan");
        label.setBounds(rectangulo);
        add(label);
    }
    public static void main(String[] args) {
        Rectangle coordenadas=new Rectangle(0,0,400,300);
        Interfaz interfaz=new Interfaz();
        interfaz.setBounds(coordenadas);
        interfaz.setVisible(true);
        
        interfaz.setLocationRelativeTo(null);
    }
 

}
