/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_intermedio;

import java.util.Scanner;

/**
 *
 * @author ALEX
 */
public class Java_Intermedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         Scanner letra= new Scanner(System.in);
//        int cadena;
//        System.out.println("Ingresar texto aqui debajo:");
//        String texto=letra.next();
//        System.out.println("TEXTO: "+texto);
        
        
//        for(int i=1;i<=texto.length();i++){
//        try {
//
//
//        System.out.println(""+cadena);
//        } catch (Exception e) {
//            System.out.println("Error");
//        }
//        }

    Scanner letra= new Scanner(System.in);  
        
 String texto=letra.nextLine();
 String invertido="";
int contador=texto.length();


 while(contador>=1){
     contador-=1;
     invertido+=texto.substring(contador,contador+1);
     
//     contador-=1;
//        System.out.print(""+texto.substring(contador,contador+1));
        
 }
 String invertido2=invertido;
   System.out.print(""+invertido2);
 
//for(int i=(texto.length()-1);i>=0;i--){
 //       invertido=""+texto.charAt(i);
//System.out.print(invertido);

//}


    }

}
