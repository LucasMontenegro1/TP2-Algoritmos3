package Jugador;

import Herramientas.*;
import Materiales.*;


public class Inventario {

    private static int cantidadDePaquetes = 28;
    private Paquete elementosGuardados[] = new Paquete[cantidadDePaquetes];
    private Herramienta herramientaSeleccionada;
    private int posicionHerramientaSeleccionada = 0;


    public Inventario(){
        for(int i = 0; i < cantidadDePaquetes; i++) {
        	elementosGuardados[i] = new Paquete();
        }
    	elementosGuardados[0].setElementoGuardado(new HachaDeMadera());
        herramientaSeleccionada = (Herramienta)elementosGuardados[0].getElementoGuardado();
    }
    
    public void agregarMaterial(Madera madera) {
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].lugarLibre() || elementosGuardados[i].esMismoTipo(madera)) {
    			elementosGuardados[i].setElementoGuardado(madera);
    			break;
    		}
    	}
    }
    
    public void agregarMaterial(Piedra piedra) {
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].lugarLibre() || elementosGuardados[i].esMismoTipo(piedra)) {
    			elementosGuardados[i].setElementoGuardado(piedra);
    			break;
    		}
    	}
    }
    
    public void agregarMaterial(Metal metal) {
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].lugarLibre() || elementosGuardados[i].esMismoTipo(metal)) {
    			elementosGuardados[i].setElementoGuardado(metal);
    			break;
    		}
    	}
    }
    
    public void agregarMaterial(Diamante diamante) {
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].lugarLibre() || elementosGuardados[i].esMismoTipo(diamante)) {
    			elementosGuardados[i].setElementoGuardado(diamante);
    			break;
    		}
    	}
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
    		if(i == cantidadDePaquetes - 1) {
    			i = -1;
    			j = posicionHerramientaSeleccionada;
    		}
    	}
    }


}