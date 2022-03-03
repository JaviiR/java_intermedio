/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paq_modificadorProtected;

import modificadorProtected.Atributos_Metodos;

/**
 *
 * @author ALEX
 */
public class PruebaUno extends Atributos_Metodos{
        

        @Override
      public void Operacion(){
//          PedirDatos();
        resultado=numero1+numero2;
        
        
    }
      
      @Override
      public void MostrarResultado(){
          System.out.println("El resultado de la suma es: "+resultado);
      }

//    @Override
//    public void MostrarResultado() {
//        System.out.println("resultado de la suma: "+resultado); //To change body of generated methods, choose Tools | Templates.
//    }
      
     
    
    
        
    
    
    
    
    
    
}
