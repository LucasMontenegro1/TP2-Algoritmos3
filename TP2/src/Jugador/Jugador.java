package Jugador;

import mapa.*;


public class Jugador implements Alocable{
	int posicionX=7;
	int posicionY=7;
	
	
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
	
	public boolean moverAdelante(){
		if(mapa.cambiarPosicion(posicionX,posicionY,posicionX,posicionY+1)){
			this.posicionY+=1;
			return true;
		}
		return false;
	}
	
	public boolean moverAtras(){
		if(mapa.cambiarPosicion(posicionX,posicionY,posicionX,posicionY-1)){
			this.posicionY-=1;
			return true;
		}
		return false;
	}
	
	public boolean moverDerecha(){
		if(mapa.cambiarPosicion(posicionX,posicionY,posicionX+1,posicionY)){
			this.posicionX+=1;
			return true;
		}
		return false;
	}
	
	public boolean moverIzquierda(){
		if(mapa.cambiarPosicion(posicionX,posicionY,posicionX-1,posicionY+1)){
			this.posicionX-=1;
			return true;
		}
		return false;
	}
	
	
	
	public Inventario getInventario(){
		return this.inventario;
	}
	
}
