package Herramientas;

import Jugador.Inventario;
import Materiales.Metal;

public class PicoDeMetal extends Pico {
	int usos;
	
	public PicoDeMetal(){
		durabilidad = 400;
		fuerza = 12;
		usos = 0;
	}

	@Override
	public void desgastar() {
		usos++;
		if(usos == 10) {
			durabilidad = 0;
		}
	}

	@Override
	public void usar(Metal metal, Inventario inventario) {
		this.desgastar();
		metal.recibirDanio(fuerza, inventario);
	}

	
	@Override
	public Herramienta clonar() {
		return new PicoDeMetal();
	}

}
