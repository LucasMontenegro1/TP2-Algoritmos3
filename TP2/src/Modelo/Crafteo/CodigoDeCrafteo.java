package Modelo.Crafteo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import Modelo.Materiales.Material;

import java.util.TreeMap;

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
	
	
	//Borra los materiales del codigoDeCrafteo y devuelve una lista
	//que los contiene
	public List<Material> obtenerMateriales() {
		
		List<Material> materialesGuardados= new ArrayList<Material>();
		
		for(Entry<Integer, Material> materialPosicionado : codigo.entrySet()) {
			int posicion = materialPosicionado.getKey();
			materialesGuardados.add(codigo.get(posicion));
		}
		codigo.clear();
		return materialesGuardados;

	}
	
}
