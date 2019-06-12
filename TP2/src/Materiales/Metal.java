package Materiales;

import Herramientas.Herramienta;

public class Metal extends Material {

	public Metal(){
		this.durabilidad=50;
	}
	
	@Override
	public void decimeQuienSos(Herramienta herramienta) {
		herramienta.usar(this);
		
	}
}
