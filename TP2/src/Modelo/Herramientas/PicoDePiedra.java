package Modelo.Herramientas;

import Modelo.Jugador.Inventario;
import Modelo.Materiales.Metal;

public class PicoDePiedra extends Pico {
	
	public PicoDePiedra(){
		durabilidad = 200;
		fuerza = 4;
	}
	

	@Override
	public void desgastar() {
		durabilidad -= (fuerza/1.5);
	}

	@Override
	public void usar(Metal metal, Inventario inventario) {
		this.desgastar();
		metal.recibirDanio(fuerza, inventario);
		if(this.getDurabilidad() <= 0) {
			inventario.eliminarHerramienta(this);
		}
	}

}
