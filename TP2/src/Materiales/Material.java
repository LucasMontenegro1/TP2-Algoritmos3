package Materiales;

import Herramientas.Desgastable;

public abstract class Material implements Desgastable {
	int durabilidad;
	
	public void recibirDanio(int fuerza) {
		this.durabilidad-=fuerza;
	}
	
	@Override
	public int getDurabilidad() {
		return durabilidad;
	}
}
