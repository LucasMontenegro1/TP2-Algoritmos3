package Materiales;

import Herramientas.*;
import mapa.*;

public abstract class Material implements Desgastable, Alocable  {
	protected int durabilidad;
	protected Mapa mapa;
	protected Posicion posicionMaterial;
	
	
	public void recibirDanio(int fuerza) {
		this.durabilidad-=fuerza;
		verificarEstado();
	}
	
	
	private void verificarEstado() {
		if(durabilidad <= 0) {
			mapa.eliminarMaterial(posicionMaterial.getFila(), posicionMaterial.getColumna());
		}
	}
	
	
	
	@Override
	public int getDurabilidad() {
		return durabilidad;
	}
	

	
	
	@Override
	public boolean equals(Object obj) { 
	          	
		if(this == obj) {
			return true;
		}
		 	    
	    if(obj == null || obj.getClass() != this.getClass()) {
	    	return false;
	    }
	    	  
	    Material material = (Material) obj;
	    
	    return (material.durabilidad== this.durabilidad); 

	}

	public abstract void decimeQuienSos(Herramienta herramienta); //ESTO SIRVE PARA PASAR DE ALOCABLE AL MATERIAL QUE ALOCABLE SEA, SINO NO TENGO NI PUTA IDEA COMO HACER XDDDD
	
	
}
