import static org.junit.Assert.*;

import org.junit.Test;

import Materiales.*;
import mapa.Mapa;
import Jugador.*;

public class MapaTest {
	
	//las pruebas de mapa estan basadas en que se debe poder crear todas las
	//herramientas, por lo tanto hay un minimo de cantidad para cada material
	// POR AHORA SOLO CUMPLE LA MADERA

	@Test
	public void testSeCreaMapaYSeVerificaQueHayanAlMenos20Maderas() { 
		Mapa mapa = new Mapa();
		Madera madera = new Madera();
		int cantidadMaderas = 0;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 13; j++) {
				if(mapa.getOcupante(i, j) != null && mapa.getOcupante(i, j).getClass() == madera.getClass()) {
					cantidadMaderas++;
				}				
			}
		}
		assert cantidadMaderas >= 20;
	}
	
	@Test
	public void testSeCreaMapaYSeVerificaQueHayanAlMenos4Metales() { 
		Mapa mapa = new Mapa();
		Metal metal = new Metal();
		int cantidadMetales = 0;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 13; j++) {
				if(mapa.getOcupante(i, j) != null && mapa.getOcupante(i, j).getClass() == metal.getClass()) {
					cantidadMetales++;
				}				
			}
		}
		assert cantidadMetales >= 4;
	}
	
	@Test
	public void testSeCreaMapaYSeVerificaQueHayanAlMenos4Diamantes() { 
		Mapa mapa = new Mapa();
		Diamante diamante = new Diamante();
		int cantidadDiamantes = 0;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 13; j++) {
				if(mapa.getOcupante(i, j) != null && mapa.getOcupante(i, j).getClass() == diamante.getClass()) {
					cantidadDiamantes++;
				}				
			}
		}
		assert cantidadDiamantes >= 4;
	}
	
	@Test
	public void testSeCreaMapaYSeVerificaQueHayanAlMenos12Piedra() { 
		Mapa mapa = new Mapa();
		Piedra piedra = new Piedra();
		int cantidadPiedra = 0;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 13; j++) {
				if(mapa.getOcupante(i, j) != null && mapa.getOcupante(i, j).getClass() == piedra.getClass()) {
					cantidadPiedra++;
				}				
			}
		}
		assert cantidadPiedra >= 12;
	}
	
	@Test
	public void testSeCreaMapaYSeVerificaQueExistaExactamenteUnJugador() { 
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador();
		int cantidadJugadores = 0;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 13; j++) {
				if(mapa.getOcupante(i, j) != null && mapa.getOcupante(i, j).getClass() == jugador.getClass()) {
					cantidadJugadores++;
				}				
			}
		}
		assert cantidadJugadores == 1;
	}


}
