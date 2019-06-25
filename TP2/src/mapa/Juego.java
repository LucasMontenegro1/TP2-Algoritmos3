package mapa;

import Jugador.Jugador;
import Materiales.Material;

public class Juego {
	private Jugador jugador;
	private Mapa mapa;
	
	public Juego(Jugador jugador, Mapa mapa) {
		this.jugador = jugador;
		this.mapa = mapa;
	}

	
	
	public void moverJugadorA(Posicion nuevaPosicion){
		
		if((mapa.existeCasillero(nuevaPosicion)) && (mapa.getCasillero(nuevaPosicion).estaLibre())) {
			Posicion origen = jugador.getPosicion();
			Casillero destino = mapa.getCasillero(nuevaPosicion);
			destino = new Casillero(jugador, nuevaPosicion);
			mapa.ocupar(destino, nuevaPosicion); //tengo que hacer esto xq sino no cambia en el mapa entonces no se imprime
			mapa.desocupar(origen);
		}		
	}
	
	public void golpearPosicion(Posicion posicionAGolpear) {
		if(mapa.existeCasillero(posicionAGolpear)){
			Material material = (Material)mapa.getCasillero(posicionAGolpear).getOcupante();		
			jugador.golpearPosicion(posicionAGolpear, material);
		}
	}



	public Posicion obtenerPosicion(Posicion posicion, int movVertical, int movHorizontal) {
		int fila = posicion.getFila();
		int columna = posicion.getColumna();
		
		Posicion nuevaPosicion = new Posicion(fila-movVertical, columna+movHorizontal);
		
		return nuevaPosicion;		
	} 
	
}


