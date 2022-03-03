package java_intermedio.suma;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SumaMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el primer valor: ");

        
        int valorUno = entrada.nextInt();
        System.out.println("Ingresar el segundo valor: ");
        int valorDos = entrada.nextInt();
        Suma Objsuma = new Suma();
        Objsuma.setValorUno(valorUno);
        Objsuma.setValorDos(valorDos);
//      int sumar=Objsuma.Sumar();
//        System.out.println("suma: "+sumar);
        Objsuma.imprimir();
        
        

    }
}
