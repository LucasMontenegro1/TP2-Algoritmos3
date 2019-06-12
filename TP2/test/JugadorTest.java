import org.junit.Test;

import Jugador.Jugador;
import mapa.Mapa;

public class JugadorTest {
	
		

	@Test
	public void testJugadorSeMueveHaciaAdelanteYElCasilleroEstaLibre() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.moverArriba();
		
		assert mapa.getOcupante(7, 7) == null;
		assert mapa.getOcupante(6, 7) == jugador;
		
	}

	
	@Test
	public void testJugadorSeMueveHaciaAtrasYElCasilleroEstaLibre() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.moverAbajo();
		
		assert mapa.getOcupante(7, 7) == null;
		assert mapa.getOcupante(8, 7) == jugador;
		
	}
	
	
	@Test
	public void testJugadorSeMueveHaciaLaDerechaYElCasilleroEstaLibre() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.moverDerecha();
		
		assert mapa.getOcupante(7, 7) == null;
		assert mapa.getOcupante(7, 8) == jugador;
	}
	
	
	@Test
	public void testJugadorSeMueveHaciaIzquierdaYElCasilleroEstaLibre() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.moverIzquierda();
		
		assert mapa.getOcupante(7, 7) == null;
		assert mapa.getOcupante(7, 6) == jugador;
		
	}
	
	
	@Test
	public void testJugadorSeMueveAPosicionOcupadaPorUnMaterial() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.moverIzquierda();
		
		assert mapa.getOcupante(7, 6) == jugador;
		jugador.moverIzquierda();
		assert mapa.getOcupante(7, 6) == jugador;
		assert mapa.getOcupante(7, 5) != jugador;
	
	}
	
	@Test
	public void testJugadorSeMueveAUnaPosicionFueraDelMapa() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.moverAbajo();
		assert mapa.getOcupante(8, 7) == jugador;
		jugador.moverAbajo();
		assert mapa.getOcupante(8, 7) == jugador;
		
	}
	
	
	
	
	
}
