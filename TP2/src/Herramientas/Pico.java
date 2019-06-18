package Herramientas;

import Jugador.Inventario;
import Materiales.*;

public abstract class Pico extends Herramienta {
	
	@Override
	public abstract void desgastar();

	@Override
	public void usar(Madera madera, Inventario inventario) {
		this.desgastar();
		if(this.getDurabilidad() <= 0) {
			inventario.eliminarElemento(this);
		}
	}

	@Override
	public void usar(Piedra piedra, Inventario inventario) {
		this.desgastar();
		piedra.recibirDanio(fuerza, inventario);
		if(this.getDurabilidad() <= 0) {
			inventario.eliminarElemento(this);
		}
	}
	
	@Override
	public abstract void usar(Metal metal, Inventario inventario);
	
	
	@Override
	public  void usar(Diamante diamante, Inventario inventario) {
		this.desgastar();
		if(this.getDurabilidad() <= 0) {
			inventario.eliminarElemento(this);
		}
	}
	
	@Override
	public void usar(Pasto pasto, Inventario inventario) {
		
	}
}
