package mapa;

import Materiales.*; 
import Jugador.*;

public class Mapa {

	protected Casillero casilleros[][] = new Casillero[9][13];
	private int filaInicialJugador = 7;
	private int columnaInicialJugador = 7;
	
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
		
		casilleros[filaInicialJugador][columnaInicialJugador] = new Casillero(new Jugador());// jugador
	}
	
	public Alocable getOcupante(int i, int j) {
		return casilleros[i][j].getOcupante();
	}

	public boolean cambiarPosicion(int X, int Y, int i, int j) {
		if(estaDentro(i,j) && casilleros[i][j].getOcupante()==null) {
			Alocable cambiable=casilleros[X][Y].getOcupante();
			casilleros[X][Y]=new Casillero();
			casilleros[i][j]= new Casillero((Jugador) cambiable);
			return true;
		}
		
		return false;
		
	}

	private boolean estaDentro(int i, int j) {
		if(i<0 || i> 9 || j<0 || j>13 ) {
			return false;
		}
		return true;
	}
	
}
