
package lista_tipo_pila;


public class pruebas {
    static int numero=0;
    public static void main(String[] args) {
        
        
       
        while(true){
            System.out.println("estado antes: "+status());
            System.out.println("numero antes: "+numero);
            
            numero++;
            System.out.println("estado despues:"+status());
            System.out.println("numero despues: "+numero);
            
            System.out.println("=============");
        }
       
        
    }
    
    
    public static boolean status(){        
        return numero!=0;
    }
}
