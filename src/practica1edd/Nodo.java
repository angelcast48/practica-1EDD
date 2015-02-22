/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd;

import java.io.*;

public class Nodo implements Serializable {

    public Nodo siguienteNodo;
    public Object datos;

    Nodo(Object datos) {
        this(datos, null);

    }

    Nodo(Object datos, Nodo siguienteNodo) {

        this.datos = datos;
        this.siguienteNodo = siguienteNodo;
    }

    public Nodo getSiguienteNodo() {
        return siguienteNodo;
    }

    public Object getDatos() {
        return datos;
    }
    public void setSiguienteNodo(Nodo nodo){
        this.siguienteNodo = siguienteNodo;
    }
}
