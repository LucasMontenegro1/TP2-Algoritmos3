package Materiales;

import Modelo.Equipable;

public class Material implements Equipable  {
	protected int durabilidad;
	
	public int getDurabilidad() {
		return this.durabilidad;
	}
	
	public void recibirDanio(int danio) {
		durabilidad -= danio;
	}
	
	
	public boolean sonIguales(Material material) {
		
		return this.durabilidad==material.durabilidad;
		
	}
	
	//FIJARSE QUE HACER CON ESTE METODO, SE AGREGO 
	//PARA VER SI ANDA EL TRAVIS
	public void usar(){
		
	}
	
}
