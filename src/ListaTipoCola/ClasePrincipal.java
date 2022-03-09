package ListaTipoCola;

import javax.swing.JOptionPane;

public class ClasePrincipal{
public static void main(String[] args) {
    int opcion=0,nodo_informacion=0;
    Cola cola=new Cola();

    do {
        
        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de opciones\n\n"
                        + "1. Insertar un nodo.\n"
                        + "2. Extraer un nodo\n"
                        + "3. Mostrar Contenido de la Cola\n"
                        + "4. Salir.\n\n"
                        ));
                        switch(opcion){
                            case 1:
                            nodo_informacion=Integer.parseInt(JOptionPane.showInputDialog(null,"Porfavor ingresa el valor a guardar en el nodo."));
                            cola.Insertar(nodo_informacion);
                            break;
                            case 2:
                            if (!cola.ColaVacia()) {
                                JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: "+cola.Extraer());
                            } else {
                                JOptionPane.showMessageDialog(null, "La cola esta vacia");
                            }
                            break;
                            case 3:
                            cola.MostrarContenido();
                            break;
                            case 4:
                            JOptionPane.showMessageDialog(null, "どうもありがとうございます!!");
                            break;
                            default:
                            JOptionPane.showMessageDialog(null, "Opcion no valida");
                            break;
                        }
        } catch (NumberFormatException e) {
            System.out.println("Error"+e);
        }


    } while (opcion!=4);

}
}