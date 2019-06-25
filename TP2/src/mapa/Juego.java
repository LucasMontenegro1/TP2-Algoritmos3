package mapa;

import Jugador.Jugador;

public class Juego {
	private Jugador jugador;
	private Mapa mapa;
	
	public Juego(Jugador jugador, Mapa mapa) {
		this.jugador = jugador;
		this.mapa = mapa;
	}

	
	
	public void moverJugadorA(Posicion nuevaPosicion){
		Casillero origen = mapa.getCasillero(jugador.getPosicion());
		Casillero destino = mapa.getCasillero(nuevaPosicion);
		
		
		if(mapa.existeCasillero(nuevaPosicion) & destino.estaLibre()) {
			destino = new Casillero(jugador, nuevaPosicion);
			origen = new Casillero();	
		}
		
	} 
}


