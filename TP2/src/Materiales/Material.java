package Materiales;

import Herramientas.Desgastable;
import Herramientas.Herramienta;
import mapa.*;

public abstract class Material implements Desgastable, Alocable  {
	protected int durabilidad;
	
	public void recibirDanio(int fuerza) {
		this.durabilidad-=fuerza;
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

	public abstract void DecimeQuienSos(Herramienta herramienta); 
	
	
}
