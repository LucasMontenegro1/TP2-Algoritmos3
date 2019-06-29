package Modelo.Mapa;

import Modelo.Jugador.Jugador;
import Modelo.Materiales.Material;

public class Juego {
	private Jugador jugador;
	private Mapa mapa;
	
	public Juego(Jugador jugador, Mapa mapa) {
		this.jugador = jugador;
		this.mapa = mapa;
	}

	
	
	public void moverJugador(int movVertical, int movHorizontal){ 
		
		Posicion nuevaPosicion = obtenerPosicion(movVertical, movHorizontal);
		
		if((mapa.existeCasillero(nuevaPosicion)) && (mapa.getCasillero(nuevaPosicion).estaLibre())) {
			Posicion origen = jugador.getPosicion();
			Casillero destino = mapa.getCasillero(nuevaPosicion);
			destino = new Casillero(jugador, nuevaPosicion);
			mapa.ocupar(destino, nuevaPosicion); 
			mapa.desocupar(origen);
		}		
	}
	
	public void golpearPosicion(int golpeVertical, int golpeHorizontal) {
		
		Posicion posicionAGolpear = obtenerPosicion(golpeVertical, golpeHorizontal);
		
		if(mapa.existeCasillero(posicionAGolpear)){
			Material material = (Material)mapa.getCasillero(posicionAGolpear).getOcupante();		
			jugador.golpearPosicion(posicionAGolpear, material);
		}
	}



	public Posicion obtenerPosicion(int vertical, int horizontal) {
		
		Posicion posicion = jugador.getPosicion();
		
		posicion = new Posicion(posicion.getFila()-vertical, posicion.getColumna()+horizontal);
		
		return posicion;		
	} 
	
}


