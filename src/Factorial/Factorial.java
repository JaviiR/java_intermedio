package Factorial;

import javax.swing.JOptionPane;

public class Factorial {
    private int iniciar=1;
    private int finalizar=0;
    private int acumulador=1;
    public Factorial(int x){
        this.finalizar=x;
    }

    private void Factorizar(){
    if(iniciar<=finalizar && finalizar>0){
        acumulador*=iniciar;
        iniciar+=1;
        Factorizar();

    }

}
public int Resultado(){
    Factorizar();
//System.out.println("El factorial de "+finalizar+" es: "+acumulador);
return acumulador;
}
    
}
