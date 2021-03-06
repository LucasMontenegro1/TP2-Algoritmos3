package Modelo.Materiales;

import Modelo.Herramientas.Desgastable;
import Modelo.Herramientas.Herramienta;
import Modelo.Jugador.Inventario;
import Modelo.Mapa.Alocable;
import Modelo.Mapa.Mapa;
import Modelo.Mapa.Posicion;

public abstract class Material implements Desgastable, Alocable  {
	protected int durabilidad;
	protected Mapa mapa;
	protected Posicion posicionMaterial;
	
	
	public void recibirDanio(int fuerza, Inventario inventario) {
		this.durabilidad-=fuerza;
		verificarEstado(inventario);
	}
	
	
	public abstract void verificarEstado(Inventario inventario);
	
	
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

	public abstract void decimeQuienSos(Herramienta herramienta, Inventario inventario); 

	public abstract void guardarEnInventario(Inventario inventario);
	
}
