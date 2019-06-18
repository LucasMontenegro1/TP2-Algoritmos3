package Herramientas;

import Jugador.Inventario;
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
	public void usar(Madera madera, Inventario inventario) {
		madera.recibirDanio(fuerza, inventario);
	}

	@Override
	public void usar(Metal metal, Inventario inventario) {
		metal.recibirDanio(fuerza, inventario);
	}

	@Override
	public void usar(Piedra piedra, Inventario inventario) {
		piedra.recibirDanio(fuerza, inventario);
	}

	@Override
	public void usar(Diamante diamante, Inventario inventario) {
		this.desgastar();
		diamante.recibirDanio(fuerza, inventario);
		if(this.getDurabilidad() <= 0) {
			inventario.eliminarElemento(this);
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
