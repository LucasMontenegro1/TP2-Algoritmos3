package Materiales;

import Herramientas.Herramienta;

public class Diamante extends Material {
	
	public Diamante(){
		this.durabilidad=100;
	}

	@Override
	public void decimeQuienSos(Herramienta herramienta) {
		herramienta.usar(this);
		
	}
	
	
}
