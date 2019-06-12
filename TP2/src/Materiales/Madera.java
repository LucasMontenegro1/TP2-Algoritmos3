package Materiales;

import Herramientas.Herramienta;
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
	
	
	@Override
	public void decimeQuienSos(Herramienta herramienta) {
		herramienta.usar(this);
		
	}

}
