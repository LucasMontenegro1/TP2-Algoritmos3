package Jugador;

import mapa.*;


public class Jugador implements Alocable{
	
	private Inventario inventario = new Inventario();
	private Mapa mapa;
	private Posicion posicionJugador;
	
	public Jugador(Mapa mapa) {
		this.mapa = mapa;
	}
	
	public void setPosicion(Posicion posicion) {
		posicionJugador = posicion;
	}
		
	public void moverArriba() {
		mapa.desplazarJugadorArriba(posicionJugador);
	}
	
	public void moverAbajo() {
		mapa.desplazarJugadorAbajo(posicionJugador);
	}
	
	public void moverDerecha() {
		mapa.desplazarJugadorDerecha(posicionJugador);
	}
	
	public void moverIzquierda() {
		mapa.desplazarJugadorIzquierda(posicionJugador);
	}
	
	
	/*
	public void golpearArriba() {
		mapa.getOcupante(i, j)
	}
	*/
	
	
	public void usarElementoSeleccionado() {
		inventario.usarElementoSeleccionado();
	}
	
	
	
	public Inventario getInventario(){
		return this.inventario;
	}
	
}
