package Jugador;

import Herramientas.*;
import Materiales.*;


public class Inventario {

    private static int cantidadDePaquetes = 28;
    private Paquete elementosGuardados[] = new Paquete[cantidadDePaquetes];
    private Herramienta herramientaSeleccionada;
    private int posicionHerramientaSeleccionada = 0;


    public void agregarHerramienta(Herramienta herramienta) {
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].lugarLibre()) {
    			elementosGuardados[i].setElementoGuardado(herramienta);   //Lo declaro aca arriba asi en el constructor ya tiene el hacha de madera
    			break;
    		}
    	}
    }
    
    public Inventario(){
        for(int i = 0; i < cantidadDePaquetes; i++) {
        	elementosGuardados[i] = new Paquete();
            agregarHerramienta(new HachaDeMadera());
        }
        herramientaSeleccionada = (Herramienta)elementosGuardados[0].getElementoGuardado();
    }
    
    
    
    public void agregarMaterial(Madera madera) {
    	
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].esMismoTipo(madera)) {
    			elementosGuardados[i].setElementoGuardado(madera);
    			return;
    		}
    	}
    	
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].lugarLibre()) {
    			elementosGuardados[i].setElementoGuardado(madera);
    			break;
    		}
    	}
    	/*
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].lugarLibre() || elementosGuardados[i].esMismoTipo(madera)) {
    			elementosGuardados[i].setElementoGuardado(madera);
    			break;
    		}
    	}
    	*/
    }
    
    public void agregarMaterial(Piedra piedra) {
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].esMismoTipo(piedra)) {
    			elementosGuardados[i].setElementoGuardado(piedra);
    			return;
    		}
    	}
    	
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].lugarLibre()) {
    			elementosGuardados[i].setElementoGuardado(piedra);
    			break;
    		}
    	}
    	/*
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].lugarLibre() || elementosGuardados[i].esMismoTipo(piedra)) {
    			elementosGuardados[i].setElementoGuardado(piedra);
    			break;
    		}
    	}
    	*/
    }
    
    public void agregarMaterial(Metal metal) {
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].esMismoTipo(metal)) {
    			elementosGuardados[i].setElementoGuardado(metal);
    			return;
    		}
    	}
    	
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].lugarLibre()) {
    			elementosGuardados[i].setElementoGuardado(metal);
    			break;
    		}
    	}
    	/*
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].lugarLibre() || elementosGuardados[i].esMismoTipo(metal)) {
    			elementosGuardados[i].setElementoGuardado(metal);
    			break;
    		}
    	}
    	*/
    }
    
    public void agregarMaterial(Diamante diamante) {
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].esMismoTipo(diamante)) {
    			elementosGuardados[i].setElementoGuardado(diamante);
    			return;
    		}
    	}
    	
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].lugarLibre()) {
    			elementosGuardados[i].setElementoGuardado(diamante);
    			break;
    		}
    	}
    	/*
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].lugarLibre() || elementosGuardados[i].esMismoTipo(diamante)) {
    			elementosGuardados[i].setElementoGuardado(diamante);
    			break;
    		}
    	}
    	*/
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

	public void eliminarElemento(Desgastable elemento) { //No se si aca va a reconocer a los materiales tambien
														//si no los reconoce hacer metodo a parte para material y herramienta	
		for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].getElementoGuardado() == elemento) {
    			elementosGuardados[i].eliminarElemento();
    		}
    	}	
		herramientaSeleccionada = null;
		cambiarHerramientaSeleccionada();
	}

	
	//VER SI TRABAJAR CON POSICIONES EN EL INVENTARIO ROMPE
	//EL ENCAPSULAMIENTO
	public Desgastable eliminarElemento(int posicion) {
		Desgastable elementoGuardado = elementosGuardados[posicion].getElementoGuardado();
		elementosGuardados[posicion].eliminarElemento();
		return elementoGuardado;
	}
	
	

}