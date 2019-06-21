package Materiales;

import Herramientas.Herramienta;
import Jugador.Inventario;
import mapa.*;

public class Madera extends Material {
	
	public Madera() {
		durabilidad = 10;
	}
	
	public Madera(Mapa mapa, Posicion posicion){
		durabilidad=10;
		this.mapa = mapa;
		posicionMaterial = posicion;
	}
	
	public void verificarEstado(Inventario inventario) {
		if(durabilidad <= 0) {
			inventario.agregarMaterial(this);
			mapa.eliminarMaterial(posicionMaterial.getFila(), posicionMaterial.getColumna());
		}
	}
	
	
	@Override
	public void guardarEnInventario(Inventario inventario) {
		inventario.agregarMaterial(this);
	}
	
	@Override
	public void decimeQuienSos(Herramienta herramienta, Inventario inventario) {
		herramienta.usar(this, inventario);
		
	}

}
