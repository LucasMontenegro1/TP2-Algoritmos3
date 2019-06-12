package mapa;

import Materiales.*; 
import Jugador.*;

public class Mapa {

	protected Casillero casilleros[][] = new Casillero[9][13];
	private int filaInicialJugador = 7;
	private int columnaInicialJugador = 7;
	private int filasMapa = 9;
	private int columnasMapa = 13;
	
	public Mapa(){
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 13; j++) {
				casilleros[i][j] = new Casillero(); // vacio
			}
		}
		
		for(int i = 1; i < 3; i++) {
			for(int j = 1; j < 3; j++) {
				casilleros[i][j] = new Casillero(new Metal());// metal
			}
		}
		
		for(int i = 4; i < 8; i++) {
			for(int j = 1; j < 6; j++) {
				casilleros[i][j] = new Casillero(new Madera());// madera
			}
		}
		
		for(int i = 1; i < 3; i++) {
			for(int j = 5; j < 7; j++) {
				casilleros[i][j] = new Casillero(new Diamante());// diamante
			}
		}
		
		for(int i = 1; i < 5; i++) {
			for(int j = 9; j < 12; j++) {
				casilleros[i][j] = new Casillero(new Piedra());// piedra
			}
		}
		
		casilleros[filaInicialJugador][columnaInicialJugador] = new Casillero(new Jugador(this), new Posicion(filaInicialJugador, columnaInicialJugador));// jugador
	}
	
	public Alocable getOcupante(int i, int j) {
		return casilleros[i][j].getOcupante();
	}

	public void eliminarMaterial(int fila, int columna) {
		casilleros[fila][columna] = new Casillero();
	}

	
	
	private boolean casilleroExiste(int x, int y) {
		if (x > -1 && x < filasMapa) {
			if (y > -1 && y < columnasMapa) {
				return true;
			}
		}
		
		return false;
	}
	
	public void desplazarJugadorArriba(Posicion posicionJugador) {
		int x = posicionJugador.getFila();
		int y = posicionJugador.getColumna();
		Jugador jugador = (Jugador)casilleros[x][y].getOcupante();
		
		if (casilleroExiste(x-1, y) && casilleros[x-1][y].estaLibre()) {
			Posicion nuevaPosicionJugador = new Posicion(x-1,y);
			casilleros[x][y] = new Casillero();
			casilleros[x-1][y] = new Casillero(jugador, nuevaPosicionJugador);
		}
	}
	
	public void desplazarJugadorAbajo(Posicion posicionJugador) {
		int x = posicionJugador.getFila();
		int y = posicionJugador.getColumna();
		Jugador jugador = (Jugador)casilleros[x][y].getOcupante();
		
		if (casilleroExiste(x+1, y) && casilleros[x+1][y].estaLibre()) {
			Posicion nuevaPosicionJugador = new Posicion(x+1,y);
			casilleros[x][y] = new Casillero();
			casilleros[x+1][y] = new Casillero(jugador, nuevaPosicionJugador);
		}
	}
	
	public void desplazarJugadorDerecha(Posicion posicionJugador) {
		int x = posicionJugador.getFila();
		int y = posicionJugador.getColumna();
		Jugador jugador = (Jugador)casilleros[x][y].getOcupante();
		
		if (casilleroExiste(x, y+1) && casilleros[x][y+1].estaLibre()) {
			Posicion nuevaPosicionJugador = new Posicion(x,y+1);
			casilleros[x][y] = new Casillero();
			casilleros[x][y+1] = new Casillero(jugador, nuevaPosicionJugador);
		}
	}
	
	public void desplazarJugadorIzquierda(Posicion posicionJugador) {
		int x = posicionJugador.getFila();
		int y = posicionJugador.getColumna();
		Jugador jugador = (Jugador)casilleros[x][y].getOcupante();
		
		if (casilleroExiste(x, y-1) && casilleros[x][y-1].estaLibre()) {
			Posicion nuevaPosicionJugador = new Posicion(x,y-1);
			casilleros[x][y] = new Casillero();
			casilleros[x][y-1] = new Casillero(jugador, nuevaPosicionJugador);
		}

	}
	
	
	
}
