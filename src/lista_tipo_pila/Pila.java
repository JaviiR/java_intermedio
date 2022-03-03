package lista_tipo_pila;

import javax.swing.JOptionPane;

public class Pila {

    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String lista = "";

    public Pila() {
        UltimoValorIngresado = null;

        tamano = 0;
    }

    //Metodo para saber cuando la pila esta vacia
    public boolean PilaVacia() {
        return UltimoValorIngresado == null;
    }

    //Metodo para ingresar un nodo a la pila
    public void InsertarNodo(int nodo) {

        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
        tamano++;

//        System.out.println("informacion despues: "+nuevo_nodo.informacion);
//        System.out.println("nuevo_nodo: "+nuevo_nodo);
//        System.out.println("siguiente despues: "+nuevo_nodo.siguiente);
        System.out.println("========================================================");
    }

    //Metodo para eliminar un nodo de la pila
    public int EliminarNodo() {
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamano--;
        return auxiliar;
    }

    //Metodo para conocer cual es el ultimo valor ingresado
    public int MostrarUltValorIngresado() {
        return UltimoValorIngresado.informacion;
    }

    //Metodo para conocer el tamaño de la pila
    public int TamanoPila() {
        return tamano;
    }

    //metodo para vaciar la pila
    public void VaciarPila() {
        
        while (!PilaVacia()) {

            EliminarNodo();

        }
        
        
    }

    //Metodo para mostrar el contenido de la pila
    public void MostrarContenidoDeLaPila() {
        Nodo ultimovaloraux = UltimoValorIngresado;

        int tamanoaux = TamanoPila();

        for (int i = tamanoaux; i > 0; i--) {

            lista+=ultimovaloraux.informacion+"\n";
            
            ultimovaloraux = ultimovaloraux.siguiente;
            tamanoaux--;

        }
        JOptionPane.showMessageDialog(null, lista);
        lista="";

    }
}
