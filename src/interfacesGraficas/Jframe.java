/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesGraficas;

import javax.swing.JFrame;

/**
 *
 * @author ALEX
 */
public class Jframe extends JFrame{
    
    public Jframe(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
       setBounds(0,0,400,550);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
//        Jframe frame=new Jframe();
//        
//        frame.setBounds(0,0,400,550);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
new Jframe();
        
        
    }
    
}
