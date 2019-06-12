package Materiales;

import Herramientas.*;
import mapa.*;

public class Piedra extends Material {
	
	public Piedra(){
		this.durabilidad=30;
	}
	
	public Piedra(Mapa mapa, Posicion posicion) {
		this.durabilidad=30;
		this.mapa = mapa;
		posicionMaterial = posicion;
	}
	
	@Override
	public void decimeQuienSos(Herramienta herramienta) {
		herramienta.usar(this);
		
	}
}
