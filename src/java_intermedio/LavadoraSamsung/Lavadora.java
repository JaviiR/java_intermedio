package java_intermedio.LavadoraSamsung;

public class Lavadora {

    private int Kilos = 0, LlenadoCompleto = 0, TipoDeRopa = 0, LavadoCompleto = 0, SecadoCompleto = 0;

    public Lavadora(int Kilos, int TipoDeCarga) {
        this.Kilos = Kilos;
        this.TipoDeRopa = TipoDeCarga;
    }

    private void Llenado() {//este metodo sirve para verificar el llenado
        if (Kilos <= 12) {
            LlenadoCompleto = 1;
            System.out.println("Llenando...");
            System.out.println("Llenado completo.");
        } else {
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
        }
    }

    private void Lavado() {//Este metodo sirve para verificar el lavado
        Llenado();
        if (LlenadoCompleto == 1) {
            if (TipoDeRopa==1) {
                   System.out.println("Ropa Blanca / Lavado Suave");
                   System.out.println("Lavando...");
                   LavadoCompleto=1;
            }else if(TipoDeRopa==2){
                System.out.println("Ropa de Color / Lavado Intenso");
                System.out.println("Lavando...");
                LavadoCompleto=1;
            }else{
                System.out.println("Este tipo de ropa no esta dentro de las especificaciones");
                System.out.println("Se lavara como ropa de color / Lavado Intenso");
                LavadoCompleto=1;
            }
        }
    }
    
    
    
    private void Secado(){
        Lavado();
        if(LavadoCompleto==1){
            System.out.println("Secando...");
            SecadoCompleto=1;
        }
    }
    
    
    
    public void CicloFinalizado(){
        Secado();
        if(SecadoCompleto==1){
            System.out.println("Tu ropa esta lista!");
        }
    }
    
    

    /* private double kilos;
    private String tipo;
    private String llenando,lavando,secando;
    public Lavadora(double kilos, String tipo) {
        this.kilos = kilos;
        this.tipo = tipo;
    }
    
    
    
    
    
    private boolean Llenado(){
        if(kilos>0){
            llenando="Estoy llenandome de agua y otras cosas";
            return true;
        }else{
            llenando="primero llename de ropa";
            return false;
        
        }
            
    }
    
    
    private void Lavado(){
        lavando="Estoy lavando tu ropa agggg";
        
    }
    
    private void Secado(){
        secando="Estoy secando tu ropa";
        
    }
    
    
    
    public void CicloFinalizado(){
        Llenado();
        if(Llenado()!=false){
            Lavado();
            Secado();
            System.out.println(""+llenando+":::::"+lavando+":::::"+secando+"::::::"+"Ciclo finalizado");
        }else
        System.out.println("Falta agua");
        
    }
     */
    
}
