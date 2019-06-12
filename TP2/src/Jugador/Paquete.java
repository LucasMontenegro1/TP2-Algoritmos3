package Jugador;

import Herramientas.*;


public class Paquete {

	private static int capacidadStack = 64;
	
	int cantidadMaximaElementos = capacidadStack;
	int cantidadActualElementos = 0;

	Desgastable elementoGuardado;
	
	public void agregarElementos(int cantidad){
		
		
	}
	
	public void quitarElementos(int cantidad) {
		
	}

	
	public Desgastable getElementoGuardado() {
		return this.elementoGuardado;
	}
	
	public boolean esUnaHerramienta() {
		return elementoGuardado != null && (Herramienta.class).isAssignableFrom(elementoGuardado.getClass());
	}
	
	
	public void setElementoGuardado(Desgastable elemento) {
		this.elementoGuardado = elemento;
	}
	
}