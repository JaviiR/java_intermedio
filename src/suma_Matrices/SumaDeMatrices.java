/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_Matrices;

import java.util.Random;

/**
 *
 * @author ALEX
 */
public class SumaDeMatrices {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int matriz_resultante[][] = new int[3][3];

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                Random azar = new Random();
                int numero1 = azar.nextInt(5);
                int numero2 = azar.nextInt(5);
                matriz[i][j] = numero1;
                matriz2[i][j] = numero2;
                matriz_resultante[i][j] = matriz[i][j] + matriz2[i][j];
                

            }

        }
        
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(" ["+matriz[i][j]+"] ");
            }
            
            for (int j = 0; j <= 2; j++) {
                if(i==1 & j==0)
                System.out.print("+ ["+matriz2[i][j]+"]"); 
                else if(j==2)
                    System.out.print("  ["+matriz2[i][j]+"] ");
                 else
                System.out.print("  ["+matriz2[i][j]+"]");
                 
            }
             for (int j = 0; j <= 2; j++) {
                if(i==1 & j==0)
                System.out.print("= ["+matriz_resultante[i][j]+"]");    
                 else
                System.out.print("  ["+matriz_resultante[i][j]+"]");
                 
            }
            System.out.println("");
            
        }
        
        


    }

}
