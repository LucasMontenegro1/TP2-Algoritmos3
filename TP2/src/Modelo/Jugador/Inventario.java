package Modelo.Jugador;

import Modelo.Herramientas.Desgastable;
import Modelo.Herramientas.HachaDeMadera;
import Modelo.Herramientas.Herramienta;
import Modelo.Materiales.Diamante;
import Modelo.Materiales.Madera;
import Modelo.Materiales.Material;
import Modelo.Materiales.Metal;
import Modelo.Materiales.Piedra;


public class Inventario {

    private static int cantidadDePaquetes = 28;
    private Paquete elementosGuardados[] = new Paquete[cantidadDePaquetes];
    private Herramienta herramientaSeleccionada;
    private int posicionHerramientaSeleccionada = 0;


    public void agregarHerramienta(Herramienta herramienta) {
    	for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].lugarLibre()) {
    			elementosGuardados[i].setElementoGuardado(herramienta);  
    			break;
    		}
    	}
    	if(herramientaSeleccionada==null)herramientaSeleccionada=herramienta;
    	
    }
    
    public Inventario(){
        for(int i = 0; i < cantidadDePaquetes; i++) {
        	elementosGuardados[i] = new Paquete();
        }
        agregarHerramienta(new HachaDeMadera());
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

	public void eliminarHerramienta(Desgastable elemento) { 
		for(int i = 0; i < cantidadDePaquetes; i++) {
    		if(elementosGuardados[i].getElementoGuardado() == elemento) {
    			elementosGuardados[i].eliminarElemento();
    		}
    	}
		
		herramientaSeleccionada = null;
		cambiarHerramientaSeleccionada();
	}

	
	public void eliminarMaterial(Material material) {
		for (int i = 0; i < 28; i++) {
			if (elementosGuardados[i].getElementoGuardado() != null) {
				if (elementosGuardados[i].getElementoGuardado().getClass() == material.getClass()) {
					elementosGuardados[i].eliminarElemento();
					break;
				}
			}

		}
	}
	
	

}