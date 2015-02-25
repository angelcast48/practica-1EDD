/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd;

import java.io.*;

public class Lista implements Serializable {

    public Nodo primerNodo;
    public Nodo ultimoNodo;

    public void agregarAlFinal(Object datos) {
        if (listaVacia()) {
            primerNodo = ultimoNodo = new Nodo(datos);
        } else {
            ultimoNodo = ultimoNodo.siguienteNodo = new Nodo(datos);
        }
    }

    public void agregarAlFrente(Object datos) {
        if (listaVacia()) {
            primerNodo = ultimoNodo = new Nodo(datos);
        } else {
            primerNodo = new Nodo(datos, primerNodo);
        }
    }

    public int ContadorLista() {
        Nodo nodo = primerNodo;
        int tamanioLista = 0;
        while (nodo != null) {
            tamanioLista++;
            nodo = nodo.siguienteNodo;
        }
        return tamanioLista;
    }
public void eliminarPlanta(String nombre){
Nodo nodo=primerNodo;
planta planta=(planta)nodo.datos;
if(!listaVacia()){
if(nombre.equalsIgnoreCase(planta.getNombre())){
    primerNodo=primerNodo.getSiguienteNodo();
}
    else{
                Nodo anterior = primerNodo; 
                Nodo auxiliar;
                auxiliar = primerNodo.getSiguienteNodo();
                if(auxiliar!=ultimoNodo){
                while (auxiliar != null) {
                    planta aux=(planta)auxiliar.datos;
                    if (nombre.equalsIgnoreCase(aux.getNombre())) {
                        if(auxiliar!=null){
                            anterior.setSiguienteNodo(auxiliar.getSiguienteNodo());
                            auxiliar = null;
                            break;
                        }
                        else{
                            anterior.setSiguienteNodo(auxiliar.getSiguienteNodo());
                            ultimoNodo=anterior;
                            auxiliar = null;
                            break;
                        }
                        
                    }
                    anterior = auxiliar;
                    auxiliar = auxiliar.getSiguienteNodo();
                }
                }
                else{
                    while (auxiliar != null) {
                    planta aux=(planta)auxiliar.datos;
                    if (nombre.equalsIgnoreCase(aux.getNombre())) {
                        primerNodo.setSiguienteNodo(auxiliar.getSiguienteNodo());
                        auxiliar = null;
                        ultimoNodo=primerNodo;
                        break;
                    }
                    anterior = auxiliar;
                    auxiliar = auxiliar.getSiguienteNodo();
                }

                }
}
}
}
public void eliminarZombie(String nombre){
Nodo nodo=primerNodo;
zombie zombie=(zombie)nodo.datos;
if(!listaVacia()){
if(nombre.equalsIgnoreCase(zombie.getNombre())){
    primerNodo=primerNodo.getSiguienteNodo();
}
    else{
                Nodo anterior = primerNodo; 
                Nodo auxiliar;
                auxiliar = primerNodo.getSiguienteNodo();
                if(auxiliar!=ultimoNodo){
                while (auxiliar != null) {
                    zombie aux=(zombie)auxiliar.datos;
                    if (nombre.equalsIgnoreCase(aux.getNombre())) {
                        if(auxiliar!=null){
                            anterior.setSiguienteNodo(auxiliar.getSiguienteNodo());
                            auxiliar = null;
                            break;
                        }
                        else{
                            anterior.setSiguienteNodo(auxiliar.getSiguienteNodo());
                            ultimoNodo=anterior;
                            auxiliar = null;
                            break;
                        }
                        
                    }
                    anterior = auxiliar;
                    auxiliar = auxiliar.getSiguienteNodo();
                }
                }
                else{
                    while (auxiliar != null) {
                    zombie aux=(zombie)auxiliar.datos;
                    if (nombre.equalsIgnoreCase(aux.getNombre())) {
                        primerNodo.setSiguienteNodo(auxiliar.getSiguienteNodo());
                        auxiliar = null;
                        ultimoNodo=primerNodo;
                        break;
                    }
                    anterior = auxiliar;
                    auxiliar = auxiliar.getSiguienteNodo();
                }

                }
}
}
}

    public planta buscarPlanta(String nombre) {
        Nodo nodo = primerNodo;
        planta PlantaBuscada = null;
        planta planta;
        while (nodo != null) {
            planta = (planta) nodo.datos;
            if (planta.getNombre().equals(nombre)) {
                 PlantaBuscada= planta;
                break;
            }
            nodo = nodo.siguienteNodo;
        }

        return PlantaBuscada;
    }
    public zombie buscarZombie(String nombre) {
        Nodo nodo = primerNodo;
        zombie ZombieBuscada = null;
        zombie zombie;
        while (nodo != null) {
            zombie = (zombie) nodo.datos;
            if (zombie.getNombre().equals(nombre)) {
                 ZombieBuscada= zombie;
                break;
            }
            nodo = nodo.siguienteNodo;
        }

        return ZombieBuscada;
    }
    public Jugador buscarJugador(String tipo) {
        Nodo nodo = primerNodo;
        Jugador JugadorBuscado = null;
        Jugador jugador;
        while (nodo != null) {
            jugador = (Jugador) nodo.datos;
            if (jugador.getTipo().equals(tipo)) {
                 JugadorBuscado= jugador;
                break;
            }
            nodo = nodo.siguienteNodo;
        }

        return JugadorBuscado;
    }    
    boolean listaVacia() {
        return primerNodo == null;
    }
    public Nodo GetNodo(int i){
        Nodo nodo=null;
        int contador=0;
        if(i==0){
            nodo= primerNodo;
        }
        else if(i<ContadorLista()){
            nodo=primerNodo;
            while(contador!=i){
                nodo=nodo.getSiguienteNodo();
                contador++;
            }
        }
    return nodo ;   
    }
}

