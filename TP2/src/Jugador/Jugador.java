package Jugador;

import mapa.*;


public class Jugador implements Alocable{

	
	
	//private Posicion posicion = new Posicion();
	private Inventario inventario = new Inventario();
	private Mapa mapa;
	
	public Jugador(Mapa mapa) {
		this.mapa = mapa;
	}
	
	
	//Hay que ver como van a usarse las herramientas
	//en el juego para pensar si hace falta o no pasar
	//el material sobre el q se usa el elemento seleccionado
	public void usarElementoSeleccionado() {
		inventario.usarElementoSeleccionado();
	}
	
	
	public Inventario getInventario(){
		return this.inventario;
	}
	
}
