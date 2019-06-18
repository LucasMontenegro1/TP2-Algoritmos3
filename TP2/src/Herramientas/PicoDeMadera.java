package Herramientas;

import Jugador.Inventario;
import Materiales.Metal;

public class PicoDeMadera extends Pico {

	public PicoDeMadera(){
		durabilidad = 100;
		fuerza = 2;
	}
	

	@Override
	public void desgastar() {
		durabilidad -= fuerza;
	}

	@Override
	public void usar(Metal metal, Inventario inventario) {
		this.desgastar();
		if(this.getDurabilidad() <= 0) {
			inventario.eliminarElemento(this);
		}

	}

	
	@Override
	public Herramienta clonar() {
		return new PicoDeMadera();
	}

}
