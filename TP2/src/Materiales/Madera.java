package Materiales;

import Herramientas.Herramienta;

public class Madera extends Material {
	
	public Madera(){
		durabilidad=10;
	}
	
	
	@Override
	public void DecimeQuienSos(Herramienta herramienta) {
		herramienta.usar(this);
		
	}

}
