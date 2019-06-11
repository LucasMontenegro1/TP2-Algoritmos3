import org.junit.Test;

import Jugador.Jugador;
import mapa.Mapa;

public class JugadorTest {
	
	
	
	@Test 
	public void testJugadorSeCompruebaQueSeMueve() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.moverAdelante();
		
		assert mapa.getOcupante(7, 7)==null;
		
	}
	
	

	@Test
	public void testJugadorSeMueveAHaciaAdelante() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		assert jugador.moverAdelante()==true;
		
		
	}

	
	@Test
	public void testJugadorSeMueveAHaciaAtras() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		assert jugador.moverAtras()==true;
		
		
	}
	
	
	@Test
	public void testJugadorSeMueveAHaciaLaDerecha() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		assert jugador.moverDerecha()==true;
		
	}
	
	
	@Test
	public void testJugadorSeMueveAHaciaIzquierda() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		assert jugador.moverIzquierda()==true;
		
		
	}
	
	
	@Test
	public void testJugadorSeMueveAPosicionInvalida() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.moverIzquierda();
		jugador.moverIzquierda();
		jugador.moverIzquierda();
		jugador.moverIzquierda();
		jugador.moverIzquierda();
		jugador.moverIzquierda();
		jugador.moverIzquierda();
		
		assert jugador.moverIzquierda()==false;
		
		
		
	}
	
	@Test
	public void testJugadorSeMueveAPosicionInvalidaOcupada() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.moverIzquierda();
		jugador.moverIzquierda();
		jugador.moverIzquierda();
		jugador.moverIzquierda();
		jugador.moverIzquierda();
		jugador.moverAdelante();
		jugador.moverAdelante();

		
		assert jugador.moverIzquierda()==false;
		
		
		
	}
	
	
	
	
	
}
