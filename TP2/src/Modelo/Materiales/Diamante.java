package Modelo.Materiales;

import Modelo.Herramientas.Herramienta;
import Modelo.Jugador.Inventario;
import Modelo.Mapa.Mapa;
import Modelo.Mapa.Posicion;

public class Diamante extends Material {
	
	public Diamante(){
		this.durabilidad=100;
	}
	
	public Diamante(Mapa mapa, Posicion posicion){
		this.durabilidad=100;
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
	public void decimeQuienSos(Herramienta herramienta, Inventario inventario) {
		herramienta.usar(this, inventario);
		
	}
	
	
	@Override
	public void guardarEnInventario(Inventario inventario) {
		inventario.agregarMaterial(this);
	}
	
}
