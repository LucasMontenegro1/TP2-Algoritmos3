package Modelo.Herramientas;

import Modelo.Jugador.Inventario;
import Modelo.Materiales.Diamante;
import Modelo.Materiales.Madera;
import Modelo.Materiales.Metal;
import Modelo.Materiales.Pasto;
import Modelo.Materiales.Piedra;

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
	public void usar(Madera madera, Inventario inventario) {

	}

	@Override
	public void usar(Metal metal, Inventario inventario) {

	}

	@Override
	public void usar(Piedra piedra, Inventario inventario) {

	}

	@Override
	public void usar(Diamante diamante, Inventario inventario) {
		this.desgastar();
		diamante.recibirDanio(fuerza, inventario);
		if(this.getDurabilidad() <= 0) {
			inventario.eliminarHerramienta(this);
		}
	}
	
	@Override
	public void usar(Pasto pasto, Inventario inventario) {
		
	}

	
	@Override
	public Herramienta clonar() {
		return new PicoFino();
	}
	
}
