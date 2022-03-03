
package hilos;

public class ProcesoUno extends Thread{
    int num_int;
//     public ProcesoUno(int num){
//            this.num_int=num;
// 
//        }
     public ProcesoUno(String nameHilo){
         super(nameHilo);
     }
     
     

    @Override
    public void run() {
        for (int i = 0; i <= num_int; i++) {
            System.out.println(i+"    "+this.getName());
            
            
        }
        System.out.println("");
    }
       
    
    public void ValorDCondicion(int num_int){
        this.num_int=num_int;
    }

    
    
}
