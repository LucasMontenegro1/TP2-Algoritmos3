package Materiales;

import Herramientas.Herramienta;

public class Pasto extends Material{
	
	@Override
	public void decimeQuienSos(Herramienta herramienta) {
		herramienta.usar(this);
		
	}
	
}
