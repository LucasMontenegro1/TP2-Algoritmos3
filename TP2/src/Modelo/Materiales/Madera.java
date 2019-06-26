package Modelo.Materiales;

import Modelo.Herramientas.Herramienta;
import Modelo.Jugador.Inventario;
import Modelo.Mapa.Mapa;
import Modelo.Mapa.Posicion;

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
