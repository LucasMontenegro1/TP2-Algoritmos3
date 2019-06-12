package Materiales;

import Herramientas.*;
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
	
	@Override
	public void decimeQuienSos(Herramienta herramienta) {
		herramienta.usar(this);
		
	}
}
