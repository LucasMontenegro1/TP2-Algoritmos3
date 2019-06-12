package Jugador;

import Herramientas.*;


public class Inventario {

    private static int cantidadDePaquetes = 28;
    private Paquete elementosGuardados[] = new Paquete[cantidadDePaquetes];
    private Herramienta herramientaSeleccionada;
    private int posicionHerramientaSeleccionada = 0;


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
    
    public void cambiarHerramientaSeleccionada() {
    	int j = cantidadDePaquetes;
    	for(int i = posicionHerramientaSeleccionada + 1; i < j; i++) {
    		if(elementosGuardados[i].esUnaHerramienta()) {
    			herramientaSeleccionada = (Herramienta)elementosGuardados[i].getElementoGuardado();
    			posicionHerramientaSeleccionada = i;
    			break;
    		}
    		if(i == cantidadDePaquetes) {
    			i = -1;
    			j = posicionHerramientaSeleccionada;
    		}
    	}
    }


}