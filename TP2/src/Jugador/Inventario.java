package Jugador;

import Herramientas.Desgastable;

import Herramientas.HachaDeMadera;


public class Inventario {

    private static int cantidadDePaquetes = 28;
    private Paquete elementosGuardados[] = new Paquete[cantidadDePaquetes];
    private Desgastable elementoSeleccionado;


    Inventario(){
        for(int i = 0; i < cantidadDePaquetes; i++) {
        	elementosGuardados[i] = new Paquete();
        }
    	elementosGuardados[0].setElementoGuardado(new HachaDeMadera());
        elementoSeleccionado = elementosGuardados[0].getElementoGuardado();
    }

    public void usarElementoSeleccionado() {
        
    }

    public Paquete[] getElementosGuardados() {
        return elementosGuardados;
    }


}