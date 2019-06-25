package Jugador;

import Herramientas.*;
import Materiales.*;


public class Paquete {

	private static int capacidadStack = 64;
	
	int cantidadMaximaElementos = capacidadStack;
	int cantidadActualElementos = 0;

	Desgastable elementoGuardado[] = new Desgastable[64];
	
	public int getCantidadElementos() {
		return cantidadActualElementos;
		
	}

	public boolean lugarLibre() {
		return elementoGuardado[0] == null;
	}
	
	public boolean esMismoTipo(Madera madera) {
		return elementoGuardado[0] != null 
				&& elementoGuardado[0].getClass() == madera.getClass()
				 && cantidadActualElementos < capacidadStack;
	}
	
	public boolean esMismoTipo(Piedra piedra) {
		return elementoGuardado[0] != null 
				&& elementoGuardado[0].getClass() == piedra.getClass()
				 && cantidadActualElementos < capacidadStack;
	}
	
	public boolean esMismoTipo(Metal metal) {
		return elementoGuardado[0] != null 
				&& elementoGuardado[0].getClass() == metal.getClass()
				 && cantidadActualElementos < capacidadStack;
	}
	
	public boolean esMismoTipo(Diamante diamante) {
		return elementoGuardado[0] != null 
				&& elementoGuardado[0].getClass() == diamante.getClass()
				 && cantidadActualElementos < capacidadStack;
	}
	
	
	
	public Desgastable getElementoGuardado() {
		return this.elementoGuardado[0];
	}
	
	public boolean esUnaHerramienta() {
		return elementoGuardado[0] != null && (Herramienta.class).isAssignableFrom(elementoGuardado[0].getClass());
	}
	
	
	public void setElementoGuardado(Desgastable elemento) {
		this.elementoGuardado[cantidadActualElementos] = elemento;
		cantidadActualElementos++;
	}
	
	public void eliminarElemento() {
		cantidadActualElementos--;
		this.elementoGuardado[cantidadActualElementos] = null; //lo mismo que en el metodo del inventario, ver si funciona para materiales tmbn
	}
	
}