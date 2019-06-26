package Modelo.Materiales;

import Herramientas.*;
import Jugador.Inventario;
import mapa.*;

public class Metal extends Material {

	public Metal(){
		this.durabilidad=50;
	}
	
	public Metal(Mapa mapa, Posicion posicion){
		this.durabilidad=50;
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
