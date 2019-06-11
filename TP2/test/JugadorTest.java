import org.junit.Test;

import Jugador.Jugador;
import mapa.Mapa;

public class JugadorTest {
	
	
	
	@Test 
	public void jugadorSeCompruebaQueSeMueve() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.moverAdelante(mapa);
		
		assert mapa.getOcupante(7, 7)==null;
		
	}
	
	

	@Test
	public void jugadorSeMueveAHaciaAdelante() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		assert jugador.moverAdelante(mapa)==true;
		
		
	}

	
	@Test
	public void jugadorSeMueveAHaciaAtras() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		assert jugador.moverAtras(mapa)==true;
		
		
	}
	
	
	@Test
	public void jugadorSeMueveAHaciaLaDerecha() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		assert jugador.moverDerecha(mapa)==true;
		
	}
	
	
	@Test
	public void jugadorSeMueveAHaciaIzquierda() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		assert jugador.moverIzquierda(mapa)==true;
		
		
	}
	
	
	@Test
	public void jugadorSeMueveAPosicionInvalida() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.moverIzquierda(mapa);
		jugador.moverIzquierda(mapa);
		jugador.moverIzquierda(mapa);
		jugador.moverIzquierda(mapa);
		jugador.moverIzquierda(mapa);
		jugador.moverIzquierda(mapa);
		jugador.moverIzquierda(mapa);
		
		assert jugador.moverIzquierda(mapa)==false;
		
		
		
	}
	
	@Test
	public void jugadorSeMueveAPosicionInvalidaOcupada() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.moverIzquierda(mapa);
		jugador.moverIzquierda(mapa);
		jugador.moverIzquierda(mapa);
		jugador.moverIzquierda(mapa);
		jugador.moverIzquierda(mapa);
		jugador.moverAdelante(mapa);
		jugador.moverAdelante(mapa);

		
		assert jugador.moverIzquierda(mapa)==false;
		
		
		
	}
	
	
	
	
	
}
