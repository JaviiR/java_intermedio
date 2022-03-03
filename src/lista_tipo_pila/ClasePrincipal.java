/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_tipo_pila;

import javax.swing.JOptionPane;

public class ClasePrincipal {

    public static void main(String[] args) {
        int opcion = 0;
        Pila pila = new Pila();
        JOptionPane pane=new JOptionPane();
        try {
            while (opcion != 8) {
                try {
                    opcion = Integer.parseInt(pane.showInputDialog(null,
                        "1. Insertar un Nodo.\n"
                        + "2. Eliminar un nodo.\n"
                        + "3. ¿La pila esta vacia?\n"
                        + "4. ¿Cual es el ultimo valor ingresado en la pila?\n"
                        + "5. ¿Cuantos nodos tiene la pila?\n"
                        + "6. Vaciar pila.\n"
                        + "7. Mostrar contenido de la pila.\n"
                        + "8. Salir.\n\n"));
                
                    
                switch (opcion) {
                    case 1:
                        try {
                            int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el valor a guardar en el nodo:"));
                            pila.InsertarNodo(valor);
                            JOptionPane.showMessageDialog(null, "Nodo ingresado correctamente.");
                        } catch (NumberFormatException e) {
                        }

                        break;
                    case 2:
                        if (!pila.PilaVacia()) {

                            JOptionPane.showMessageDialog(null, "Nodo con el valor " + pila.EliminarNodo() + " Eliminado.");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;
                    case 3:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila no esta vacia.");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;
                    case 4:

                        if (!pila.PilaVacia()) {
                            int valor = pila.MostrarUltValorIngresado();
                            JOptionPane.showMessageDialog(null, "El ultimo valor ingresado en la pila es: " + valor);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }

                        break;
                    case 5:
                        if (!pila.PilaVacia()) {
                            int valor = pila.TamanoPila();
                            if (valor > 1) {
                                JOptionPane.showMessageDialog(null, "La pila posee " + valor + " nodos.");
                            } else {
                                JOptionPane.showMessageDialog(null, "La pila posee " + valor + " nodo.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }

                        break;
                    case 6:
                        if (!pila.PilaVacia()) {
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "La pila se vaceo correctamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;
                    case 7:
                        if (!pila.PilaVacia()) {
                            pila.MostrarContenidoDeLaPila();
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "Programa finalizado bye bye.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida.");
                        break;
                }
                } catch (Exception e) {
                    String ms=e.toString();
                    if(ms.equals("java.lang.NumberFormatException: null")){
                        System.exit(0);
                    }
                    else{
                        
                        JOptionPane .showMessageDialog(null, "Opcion no validaa. "+e); 
                    }
                    
                    
                }

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Programa finalizado bye bye.");
            System.out.println("---------------------------ERROR DETECTADO---------------------------");
        }

    }

}
