package Herramientas;

import Materiales.*;

public class PicoFino extends Herramienta {
	
	public PicoFino(){
		durabilidad = 1000;
		fuerza = 20;
	}

	@Override
	public void desgastar() {
		durabilidad -= durabilidad * 0.1;
	}

	@Override
	public void usar(Madera madera) {
	}

	@Override
	public void usar(Metal metal) {
	}

	@Override
	public void usar(Piedra piedra) {
	}

	@Override
	public void usar(Diamante diamante) {
		this.desgastar();
		diamante.recibirDanio(fuerza);
	}

	
	@Override
	public Herramienta clonar() {
		return new PicoFino();
	}
	
}
