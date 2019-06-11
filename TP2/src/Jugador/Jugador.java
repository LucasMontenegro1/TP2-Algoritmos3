package Jugador;

import mapa.*;


public class Jugador implements Alocable{
	int posicionX=7;
	int posicionY=7;
	
	
	//private Posicion posicion = new Posicion();
	private Inventario inventario = new Inventario();
	
	
	//Hay que ver como van a usarse las herramientas
	//en el juego para pensar si hace falta o no pasar
	//el material sobre el q se usa el elemento seleccionado
	public void usarElementoSeleccionado() {
		inventario.usarElementoSeleccionado();
	}
	
	public boolean MoverAdelante(Mapa Mapa){
		if(Mapa.cambiarPosicion(posicionX,posicionY,posicionX,posicionY+1)){
			this.posicionY+=1;
			return true;
		}
		return false;
	}
	
	public boolean MoverAtras(Mapa Mapa){
		if(Mapa.cambiarPosicion(posicionX,posicionY,posicionX,posicionY-1)){
			this.posicionY-=1;
			return true;
		}
		return false;
	}
	
	public boolean MoverDerecha(Mapa Mapa){
		if(Mapa.cambiarPosicion(posicionX,posicionY,posicionX+1,posicionY)){
			this.posicionX+=1;
			return true;
		}
		return false;
	}
	
	public boolean MoverIzquierda(Mapa Mapa){
		if(Mapa.cambiarPosicion(posicionX,posicionY,posicionX-1,posicionY+1)){
			this.posicionX-=1;
			return true;
		}
		return false;
	}
	
	
	
	public Inventario getInventario(){
		return this.inventario;
	}
	
}
