package Materiales;

import Herramientas.Herramienta;

public class Piedra extends Material {
	
	public Piedra(){
		this.durabilidad=30;
	}
	
	@Override
	public void DecimeQuienSos(Herramienta herramienta) {
		herramienta.usar(this);
		
	}
}
