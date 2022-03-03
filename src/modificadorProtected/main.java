/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadorProtected;

import paq_modificadorProtected.PruebaUno;

/**
 *
 * @author ALEX
 */
public class main {
    public static void main(String[] args) {
           
            Atributos_Metodos obj1=new PruebaUno();
            obj1.PedirDatos();
            obj1.Operacion();
            obj1.MostrarResultado();
            
            
            PruebaDos obj2=new PruebaDos();
            obj2.PedirDatos();
           obj2.Operacion();
           obj2.MostrarResultado();
           
        
        
        
    }

    
    
}
