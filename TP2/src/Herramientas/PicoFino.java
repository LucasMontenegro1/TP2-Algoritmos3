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
		madera.recibirDanio(fuerza);
	}

	@Override
	public void usar(Metal metal) {
		metal.recibirDanio(fuerza);
	}

	@Override
	public void usar(Piedra piedra) {
		piedra.recibirDanio(fuerza);
	}

	@Override
	public void usar(Diamante diamante) {
		this.desgastar();
		diamante.recibirDanio(fuerza);
	}
	
	@Override
	public void usar(Pasto pasto) {
		
	}

	
	@Override
	public Herramienta clonar() {
		return new PicoFino();
	}
	
}
