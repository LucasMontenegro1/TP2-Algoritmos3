package mapa;

public class Posicion {
	
	private int fila;
	private int columna;
	
	public Posicion(int x, int y) {
		fila = x;
		columna = y;
	}
	
	public int getFila() {
		return fila;
	}
	
	public int getColumna() {
		return columna;
	}

}
