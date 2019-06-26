package Modelo.Mapa;

import Modelo.Jugador.Jugador;
import Modelo.Materiales.Diamante;
import Modelo.Materiales.Madera;
import Modelo.Materiales.Metal;
import Modelo.Materiales.Pasto;
import Modelo.Materiales.Piedra;

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
		ocupante = new Pasto();
	}
	
	
	
	public boolean estaLibre() {
		return ocupante.getClass() == (new Pasto()).getClass();
	}
	
	public Alocable getOcupante() {
		return ocupante;
	}
	
}
