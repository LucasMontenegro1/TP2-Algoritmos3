package Herramientas;

import Jugador.Inventario;

import Modelo.Materiales.Diamante;
import Modelo.Materiales.Madera;
import Modelo.Materiales.Metal;
import Modelo.Materiales.Pasto;
import Modelo.Materiales.Piedra;

public abstract class Pico extends Herramienta {
	
	@Override
	public abstract void desgastar();

	@Override
	public void usar(Madera madera, Inventario inventario) {
		this.desgastar();
		if(this.getDurabilidad() <= 0) {
			inventario.eliminarHerramienta(this);
		}
	}

	@Override
	public void usar(Piedra piedra, Inventario inventario) {
		this.desgastar();
		piedra.recibirDanio(fuerza, inventario);
		if(this.getDurabilidad() <= 0) {
			inventario.eliminarHerramienta(this);
		}
	}
	
	@Override
	public abstract void usar(Metal metal, Inventario inventario);
	
	
	@Override
	public  void usar(Diamante diamante, Inventario inventario) {
		this.desgastar();
		if(this.getDurabilidad() <= 0) {
			inventario.eliminarHerramienta(this);
		}
	}
	
	@Override
	public void usar(Pasto pasto, Inventario inventario) {
		
	}
}
