package Factorial;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        int opcion=0;
        while(opcion!=4){
            try {
                int numero=Integer.parseInt(JOptionPane.showInputDialog(null,"De que numero desea obtener su factorial?"));
                Factorial f=new Factorial(numero);
                if(numero>0){
                    JOptionPane.showMessageDialog(null,"の階乗 "+numero+" は： "+f.Resultado());
                    }else{
                        JOptionPane.showMessageDialog(null,"El numero indicado no tiene factorial!!");
                    }
            } catch (NumberFormatException e) {
              System.out.println("Error"+e);
              System.exit(0);
            }
        
        //Scanner entrada=new Scanner(System.in);
        //System.out.print("De que numero desea obtener su factorial: ");
        
        //numero=entrada.nextInt();
        
        
        }
    }
    
    
}
