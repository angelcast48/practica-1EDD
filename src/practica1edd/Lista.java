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

    public int tamanioDeLaLista() {
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
Nodo aux=nodo.siguienteNodo;
planta buscada=null;
planta planta;
if(!listaVacia()){
while(nodo!=null){
    planta=(planta)nodo.datos;
    if(nombre.equalsIgnoreCase(planta.getNombre())){
        buscada=planta;
        break;
    }
    nodo=nodo.siguienteNodo;
}
}
}

//    public Equipo buscarEquipo(String nombre) {
//        Nodo nodo = primerNodo;
//        Equipo equipoBuscado = null;
//        Equipo equipo;
//        while (nodo != null) {
//            equipo = (Equipo) nodo.datos;
//            if (nombre.equalsIgnoreCase(equipo.getNombre())) {
//                equipoBuscado = equipo;
//                break;
//            }
//            nodo = nodo.siguienteNodo;
//        }
//
//        return equipoBuscado;
//    }
//
//    public Torneo buscarTorneo(String nombre) {
//        Nodo nodo = primerNodo;
//        Torneo torneoBuscado = null;
//        Torneo torneo;
//        while (nodo != null) {
//            torneo = (Torneo) nodo.datos;
//            if (nombre.equalsIgnoreCase(torneo.getNombre())) {
//                torneoBuscado = torneo;
//                break;
//            }
//            nodo = nodo.siguienteNodo;
//        }
//
//        return torneoBuscado;
//    }
//
//    public Torneo buscarTorneoCSV(String nombre) {
//        Nodo nodo = primerNodo;
//        Torneo torneoBuscado = null;
//        Torneo torneo;
//        while (nodo != null) {
//            torneo = (Torneo) nodo.datos;
//            if (nombre.equalsIgnoreCase(torneo.getNombre())) {
//                torneoBuscado = torneo;
//                break;
//            }
//            nodo = nodo.siguienteNodo;
//        }
//
//        return torneoBuscado;
//    }
//
//    public Estadio buscarEstadio(String nombre) {
//        Nodo nodo = primerNodo;
//        Estadio estadioBuscado = null;
//        Estadio estadio;
//        while (nodo != null) {
//            estadio = (Estadio) nodo.datos;
//            if (nombre.equalsIgnoreCase(estadio.getNombre())) {
//                estadioBuscado = estadio;
//                break;
//            }
//            nodo = nodo.siguienteNodo;
//        }
//
//        return estadioBuscado;
//    }
//
//    public Jugador buscarJugador(String nombre) {
//        Nodo nodo = primerNodo;
//        Jugador jugadorBuscado = null;
//        Jugador jugador;
//        while (nodo != null) {
//            jugador = (Jugador) nodo.datos;
//            if (nombre.equals(jugador.getNombre())) {
//                jugadorBuscado = jugador;
//                break;
//            }
//            nodo = nodo.siguienteNodo;
//        }
//
//        return jugadorBuscado;
//    }
//
//    public Jugador buscarJugador(int carnet) {
//        Nodo nodo = primerNodo;
//        Jugador jugadorBuscado = null;
//        Jugador jugador;
//        while (nodo != null) {
//            jugador = (Jugador) nodo.datos;
//            if (carnet == jugador.getNoCarnet()) {
//                jugadorBuscado = jugador;
//                break;
//            }
//            nodo = nodo.siguienteNodo;
//        }
//
//        return jugadorBuscado;
//    }

    boolean listaVacia() {
        return primerNodo == null;
    }
}

