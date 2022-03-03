package multiplicacion_matrices;

import java.util.Random;

public class MultiplicacionMatrices {

    public static void main(String[] args) {

        int matriz_uno[][] = new int[2][3];
        int matriz_dos[][] = new int[3][2];
        int matriz_resultante[][] = new int[2][2];

        //llenando las matrices
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                Random numero = new Random();
                matriz_uno[i][j] = numero.nextInt(5);
                matriz_dos[j][i] = numero.nextInt(5);
            }

        }
        //llenando matriz_resultante
//        for(int i=0;i<4;i++){
//            int acumulador1=0;
//            int acumulador2=0;
//            int contador=0;
//            for(int j=0;j<3;j++){
//                acumulador1+=(matriz_uno[i][j]*matriz_dos[j][i]);
//                if(j==2 & i>0){
//                for(int y=0;y<3;y++){
//                    acumulador2+=(matriz_uno[1][0]*matriz_dos[contador][0]);
//                    contador++;
//                }    
//                }
//                
//            }                
//        }
//        


for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    matriz_resultante[i][j] += matriz_uno[i][k] * matriz_dos[k][j];                    
                }
            }
        }
        
        //imprimiendo las matrices

        for (int i = 0; i < 3; i++) {
            //matriz_uno
            for (int j = 0; j < 3; j++) {
                if (i == 2) {

                    System.out.print("     ");
                } else {
                    System.out.print(" [" + matriz_uno[i][j] + "] ");
                    if (i == 1 && j == 2) {
                        System.out.print("X");
                    }
//                    System.out.print("  [" + "matriz_uno[" + i + "][" + j + "]" + "]");

                }

            }
            //matriz_dos
            for (int j = 0; j < 2; j++) {
                if (i == 1 && j == 0) {
                    System.out.print(" [" + matriz_dos[i][j] + "]");
                } else {
                    System.out.print("  [" + matriz_dos[i][j] + "]");
                    if (i == 1 && j == 1) {
                        System.out.print(" =");
                    }
                }

//                System.out.print("  [" + "matriz_dos[" + i + "][" + j + "]" + "]");
            }
            //matriz_resultante
            for (int j = 0; j < 2; j++) {
                if (i == 0 & j == 0) {
                    System.out.print("   [" + matriz_resultante[i][j] + "]");
                } else if (i < 2) {
                    System.out.print(" [" + matriz_resultante[i][j] + "]");
                }
                if (i == 2) {

                    System.out.print("     ");
                }

//                System.out.print("  [" + "matriz_dos[" + i + "][" + j + "]" + "]");
            }
            System.out.println("");
        }

    }

}
