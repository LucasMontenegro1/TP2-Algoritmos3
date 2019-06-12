package Jugador;

import Herramientas.*;
import Materiales.*;


public class Paquete {

	private static int capacidadStack = 64;
	
	int cantidadMaximaElementos = capacidadStack;
	int cantidadActualElementos = 0;

	Desgastable elementoGuardado[] = new Desgastable[64];
	

	public boolean lugarLibre() {
		return elementoGuardado[0] == null;
	}
	
	public boolean esMismoTipo(Madera madera) {
		return elementoGuardado[0].getClass() == madera.getClass()
				 && cantidadActualElementos < capacidadStack - 1;
	}
	
	public boolean esMismoTipo(Piedra piedra) {
		return elementoGuardado[0].getClass() == piedra.getClass()
				 && cantidadActualElementos < capacidadStack - 1;
	}
	
	public boolean esMismoTipo(Metal metal) {
		return elementoGuardado[0].getClass() == metal.getClass()
				 && cantidadActualElementos < capacidadStack - 1;
	}
	
	public boolean esMismoTipo(Diamante diamante) {
		return elementoGuardado[0].getClass() == diamante.getClass()
				 && cantidadActualElementos < capacidadStack - 1;
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
	
}