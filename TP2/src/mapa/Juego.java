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

	
	
	public void moverJugador(int movVertical, int movHorizontal){ //positivo en movVertical es hacia arriba, positivo en movHorizontal es hacia la derecha
		
		Posicion nuevaPosicion = obtenerPosicion(movVertical, movHorizontal);
		
		if((mapa.existeCasillero(nuevaPosicion)) && (mapa.getCasillero(nuevaPosicion).estaLibre())) {
			Posicion origen = jugador.getPosicion();
			Casillero destino = mapa.getCasillero(nuevaPosicion);
			destino = new Casillero(jugador, nuevaPosicion);
			mapa.ocupar(destino, nuevaPosicion); //tengo que hacer esto xq sino no cambia en el mapa entonces no se imprime
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


