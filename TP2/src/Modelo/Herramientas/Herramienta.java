package Modelo.Herramientas;

import Modelo.Jugador.Inventario;
import Modelo.Materiales.Diamante;
import Modelo.Materiales.Madera;
import Modelo.Materiales.Material;
import Modelo.Materiales.Metal;
import Modelo.Materiales.Pasto;
import Modelo.Materiales.Piedra;

public abstract class Herramienta implements Desgastable {
	int durabilidad;
	int fuerza;
	
	public int getDurabilidad(){
		return this.durabilidad;
	}
	
	public abstract void desgastar();
	
	public abstract void usar(Madera madera, Inventario inventario);
	public abstract void usar(Metal metal, Inventario inventario);
	public abstract void usar(Piedra piedra, Inventario inventario);
	public abstract void usar(Diamante diamante, Inventario inventario);
	public abstract void usar(Pasto pasto, Inventario inventario);

	
	public void usar(Material material, Inventario inventario) {
		material.decimeQuienSos(this, inventario);
	}
	
	
	public int getFuerza() {
		return fuerza;
	}
	
	
}
