package mapa;

import Materiales.*;
import Jugador.*;

public class Casillero {

	protected Alocable ocupante;
	
	public Casillero(Madera madera) {
		ocupante = madera;
	}

	public Casillero(Piedra piedra) {
		ocupante = piedra;
	}
	
	public Casillero(Metal metal) {
		ocupante = metal;
	}
	
	public Casillero(Diamante diamante) {
		ocupante = diamante;
	}
	
	public Casillero(Jugador jugador, Posicion posicionJugador) {
		jugador.setPosicion(posicionJugador);
		ocupante = jugador;
	}
	
	public Casillero() {
		ocupante = null;
	}
	
	
	
	public boolean estaLibre() {
		return ocupante == null;
	}
	
	public Alocable getOcupante() {
		return ocupante;
	}
	
}
