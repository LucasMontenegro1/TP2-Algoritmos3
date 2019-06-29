package Modelo.Mapa;

import Modelo.Jugador.Jugador;
import Modelo.Materiales.Material;
import Modelo.Materiales.Pasto;

public class Casillero {

	protected Alocable ocupante;
	
	public Casillero(Material material) {
		ocupante = material;
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
