package Modelo;

import java.util.TreeMap;

import Materiales.Material;

public class CodigoDeCrafteo {

	private TreeMap<Integer, Material> codigo = new TreeMap<>();

	
	public void agregarMaterial(int posicion, Material material) {
		codigo.put(posicion, material);
	}
	
	
	@Override
	public boolean equals(Object obj) { 
	          	
		if(this == obj) {
			return true;
		}
		 	    
	    if(obj == null || obj.getClass() != this.getClass()) {
	    	return false;
	    }
	    	  
	    CodigoDeCrafteo codigoDeCrafteo = (CodigoDeCrafteo) obj;
	    
	    return (codigoDeCrafteo.codigo.equals(this.codigo)); 

	}
	
}
