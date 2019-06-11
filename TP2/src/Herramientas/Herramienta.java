package Herramientas;

import Materiales.*;

public abstract class Herramienta implements Desgastable {
	int durabilidad;
	int fuerza;
	
	public int getDurabilidad(){
		return this.durabilidad;
	}
	
	public abstract void desgastar();
	
	public abstract void usar(Madera madera);
	public abstract void usar(Metal metal);
	public abstract void usar(Piedra piedra);
	public abstract void usar(Diamante diamante);
	public abstract Herramienta clonar();
	
	
	public int getFuerza() {
		return fuerza;
	}
	
	
}
