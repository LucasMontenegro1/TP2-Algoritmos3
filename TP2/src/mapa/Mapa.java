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
		for(int i = 0; i < filasMapa; i++) {
			for(int j = 0; j < columnasMapa; j++) {
				casilleros[i][j] = new Casillero(); // vacio
			}
		}
		
		for(int i = 1; i < 3; i++) {
			for(int j = 1; j < 3; j++) {
				casilleros[i][j] = new Casillero(new Metal(this, new Posicion(i,j)));// metal
			}
		}
		
		for(int i = 4; i < 8; i++) {
			for(int j = 1; j < 6; j++) {
				casilleros[i][j] = new Casillero(new Madera(this, new Posicion(i,j)));// madera
			}
		}
		
		for(int i = 1; i < 3; i++) {
			for(int j = 5; j < 7; j++) {
				casilleros[i][j] = new Casillero(new Diamante(this, new Posicion(i,j)));// diamante
			}
		}
		
		for(int i = 1; i < 5; i++) {
			for(int j = 9; j < 12; j++) {
				casilleros[i][j] = new Casillero(new Piedra(this, new Posicion(i,j)));// piedra
			}
		}
		
		Posicion posicionInicialJugador = new Posicion(filaInicialJugador, columnaInicialJugador);
		casilleros[filaInicialJugador][columnaInicialJugador] = new Casillero(new Jugador(), posicionInicialJugador);// jugador
	}
	
	public Alocable getOcupante(int i, int j) {
		return casilleros[i][j].getOcupante();
	}
	
	public Casillero getCasillero(Posicion posicion) {
		int x = posicion.getFila();
		int y = posicion.getColumna();
		return this.casilleros[x][y];
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
	
	public boolean existeCasillero(Posicion posicionCasillero) { //Hago un metodo publico xq lo tengo q usar en Juego
		int fila = posicionCasillero.getFila();
		int columna = posicionCasillero.getColumna();
		
		return casilleroExiste(fila, columna);
	}

	public void ocupar(Casillero destino, Posicion nuevaPosicion) {
		int x = nuevaPosicion.getFila();
		int y = nuevaPosicion.getColumna();
		
		casilleros[x][y] = destino;
		
	}

	public void desocupar(Posicion posicion) {
		int x = posicion.getFila();
		int y = posicion.getColumna();
		
		casilleros[x][y] = new Casillero();
		
	}
	
	
}
