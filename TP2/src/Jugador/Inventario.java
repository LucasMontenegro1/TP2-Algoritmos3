package Jugador;

import Herramientas.*;


public class Inventario {

    private static int cantidadDePaquetes = 28;
    private Paquete elementosGuardados[] = new Paquete[cantidadDePaquetes];
    private Herramienta herramientaSeleccionada;


    Inventario(){
        for(int i = 0; i < cantidadDePaquetes; i++) {
        	elementosGuardados[i] = new Paquete();
        }
    	elementosGuardados[0].setElementoGuardado(new HachaDeMadera());
        herramientaSeleccionada = (Herramienta)elementosGuardados[0].getElementoGuardado();
    }

    public Herramienta getHerramientaSeleccionada() {
        return herramientaSeleccionada;
    }

    public Paquete[] getElementosGuardados() {
        return elementosGuardados;
    }


}