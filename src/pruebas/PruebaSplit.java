package pruebas;

public class PruebaSplit {
    
    public static void main(String args[]) {
        String Str = new String("Welcome-to-Tutorialspoint.com");
           
        
       String i[]=Str.split("-");
           System.out.println(i[0]+" "+i[1]);
        
     }


}
