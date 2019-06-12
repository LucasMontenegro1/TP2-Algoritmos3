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
				if(mapa.getOcupante(i, j).getClass() == madera.getClass()) {
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
				if(mapa.getOcupante(i, j).getClass() == metal.getClass()) {
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
				if(mapa.getOcupante(i, j).getClass() == diamante.getClass()) {
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
				if(mapa.getOcupante(i, j).getClass() == piedra.getClass()) {
					cantidadPiedra++;
				}				
			}
		}
		assert cantidadPiedra >= 12;
	}
	
	@Test
	public void testSeCreaMapaYSeVerificaQueExistaExactamenteUnJugador() { 
		Mapa mapa = new Mapa();
		Jugador jugador = new Jugador(mapa);
		int cantidadJugadores = 0;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 13; j++) {
				if(mapa.getOcupante(i, j).getClass() == jugador.getClass()) {
					cantidadJugadores++;
				}				
			}
		}
		
		assert cantidadJugadores == 1;
	}
	
	@Test
	public void testSeEliminaUnaMaderaYSeVerificaQueElEspacioQuedeVacio() {
		Mapa mapa = new Mapa();
		Madera madera = new Madera();
		int filaMadera = -1; //inicializo los valores porque sino java no me deja y no lo hago en 0 para que la prueba 
							//no pase en el caso de que no hubiese material buscado en el mapa
		int columnaMadera = -1;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 13; j++) {
				if(mapa.getOcupante(i, j).getClass() == madera.getClass()) {
					filaMadera = i;
					columnaMadera = j;
					break;
				}				
			}
		}
		
		mapa.eliminarMaterial(filaMadera, columnaMadera);
		assert mapa.getOcupante(filaMadera, columnaMadera).getClass() == (new Pasto()).getClass();
	}
	
	@Test 
	public void testSeEliminaUnaPiedraYSeVerificaQueElEspacioQuedeVacio() {
		Mapa mapa = new Mapa();
		Piedra piedra = new Piedra();
		int filaPiedra = -1; 
		int columnaPiedra = -1;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 13; j++) {
				if(mapa.getOcupante(i, j).getClass() == piedra.getClass()) {
					filaPiedra = i;
					columnaPiedra = j;
					break;
				}				
			}
		}
		
		mapa.eliminarMaterial(filaPiedra, columnaPiedra);
		assert mapa.getOcupante(filaPiedra, columnaPiedra).getClass() == (new Pasto()).getClass();
	}
	
	@Test 
	public void testSeEliminaUnMetalYSeVerificaQueElEspacioQuedeVacio() {
		Mapa mapa = new Mapa();
		Metal metal= new Metal();
		int filaMetal = -1; 
		int columnaMetal = -1;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 13; j++) {
				if(mapa.getOcupante(i, j).getClass() == metal.getClass()) {
					filaMetal = i;
					columnaMetal = j;
					break;
				}				
			}
		}
		
		mapa.eliminarMaterial(filaMetal, columnaMetal);
		assert mapa.getOcupante(filaMetal, columnaMetal).getClass() == (new Pasto()).getClass();
	}
	
	@Test 
	public void testSeEliminaUnDiamanteYSeVerificaQueElEspacioQuedeVacio() {
		Mapa mapa = new Mapa();
		Diamante diamante= new Diamante();
		int filaDiamante = -1; 
		int columnaDiamante = -1;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 13; j++) {
				if(mapa.getOcupante(i, j).getClass() == diamante.getClass()) {
					filaDiamante = i;
					columnaDiamante = j;
					break;
				}				
			}
		}
		
		mapa.eliminarMaterial(filaDiamante, columnaDiamante);
		assert mapa.getOcupante(filaDiamante, columnaDiamante).getClass() == (new Pasto()).getClass();
	}
	
	


}
