package Herramientas;

import Materiales.*;

public abstract class Hacha extends Herramienta{
	
	@Override
	public abstract void desgastar();

	@Override
	public void usar(Madera madera) {
		madera.recibirDanio(fuerza);
		this.desgastar();
	}
	
	@Override
	public void usar(Metal metal) {
		this.desgastar();
	}

	@Override
	public void usar(Piedra piedra) {
		this.desgastar();
		
	}
	
	@Override
	public void usar(Diamante diamante) {
		this.desgastar();
		
	}
	
	@Override
	public void usar(Pasto pasto) {
		
	}
	

}
