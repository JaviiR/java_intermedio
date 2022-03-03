/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadorProtected;

/**
 *
 * @author ALEX
 */
public class PruebaDos extends Atributos_Metodos{
    @Override
    public void Operacion(){
//        PedirDatos();
        if(numero1>numero2){
        resultado=numero1-numero2;
        }else
        {
            resultado=numero2-numero1;
        }
    }
    
    @Override
      public void MostrarResultado(){
          System.out.println("El resultado de la resta es: "+resultado);
      }

//    @Override
//    protected void MostrarResultado() {
//        System.out.println("resultado de la resta: "+resultado); //To change body of generated methods, choose Tools | Templates.
//    }
//    
}
