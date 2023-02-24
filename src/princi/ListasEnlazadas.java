
package princi;

import modelos.Lista;

public class ListasEnlazadas {

    public static void main(String[] args) {
        Lista nuevalista = new Lista();
        nuevalista.InsertarNodo(10);
        nuevalista.InsertarNodo(9);
        nuevalista.InsertarNodo(8);
        nuevalista.InsertarNodo(7);
        nuevalista.ListarNodos();
    }
    
}
