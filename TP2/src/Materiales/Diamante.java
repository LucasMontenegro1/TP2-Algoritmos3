package Materiales;

import Herramientas.*;
import mapa.*;

public class Diamante extends Material {
	
	public Diamante(){
		this.durabilidad=100;
	}
	
	public Diamante(Mapa mapa, Posicion posicion){
		this.durabilidad=100;
		this.mapa = mapa;
		posicionMaterial = posicion;
	}

	@Override
	public void decimeQuienSos(Herramienta herramienta) {
		herramienta.usar(this);
		
	}
	
	
}
