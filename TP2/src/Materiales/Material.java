package Materiales;

import Herramientas.Desgastable;

public abstract class Material implements Desgastable {
	int durabilidad;
	
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
	
	
}
