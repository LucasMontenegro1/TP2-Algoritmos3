package Jugador;

import Herramientas.Hacha;
import Materiales.Madera;
import Modelo.Equipable;

public class Inventario {

    private static int cantidadDePaquetes = 28;
    private Paquete elementosGuardados[] = new Paquete[cantidadDePaquetes];
    private Equipable elementoSeleccionado;


    Inventario(){
        for(int i = 0; i < cantidadDePaquetes; i++) {
        	elementosGuardados[i] = new Paquete();
        }
    	elementosGuardados[0].setElementoGuardado(new Hacha(new Madera()));
        elementoSeleccionado = elementosGuardados[0].getElementoGuardado();
    }

    public void usarElementoSeleccionado() {
        elementoSeleccionado.usar();
    }

    public Paquete[] getElementosGuardados() {
        return elementosGuardados;
    }


}