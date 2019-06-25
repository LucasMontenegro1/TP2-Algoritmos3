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
	
	public int getUsos() {
		return usos;
	}

	@Override
	public void usar(Metal metal, Inventario inventario) {
		this.desgastar();
		metal.recibirDanio(fuerza, inventario);
		if(this.getDurabilidad() <= 0) {
			inventario.eliminarHerramienta(this);
		}
	}

	
	@Override
	public Herramienta clonar() {
		return new PicoDeMetal();
	}

}
