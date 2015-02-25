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

