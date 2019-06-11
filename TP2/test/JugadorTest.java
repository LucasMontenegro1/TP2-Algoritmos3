import org.junit.Test;

import Jugador.Jugador;
import mapa.Mapa;

public class JugadorTest {
	
	
	
	@Test 
	public void jugadorSeCompruebaQueSeMueve() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.MoverAdelante(mapa);
		
		assert mapa.getOcupante(7, 7)==null;
		
	}
	
	

	@Test
	public void jugadorSeMueveAHaciaAdelante() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		assert jugador.MoverAdelante(mapa)==true;
		
		
	}

	
	@Test
	public void jugadorSeMueveAHaciaAtras() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		assert jugador.MoverAtras(mapa)==true;
		
		
	}
	
	
	@Test
	public void jugadorSeMueveAHaciaLaDerecha() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		assert jugador.MoverDerecha(mapa)==true;
		
	}
	
	
	@Test
	public void jugadorSeMueveAHaciaIzquierda() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		assert jugador.MoverIzquierda(mapa)==true;
		
		
	}
	
	
	@Test
	public void jugadorSeMueveAPosicionInvalida() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.MoverIzquierda(mapa);
		jugador.MoverIzquierda(mapa);
		jugador.MoverIzquierda(mapa);
		jugador.MoverIzquierda(mapa);
		jugador.MoverIzquierda(mapa);
		jugador.MoverIzquierda(mapa);
		jugador.MoverIzquierda(mapa);
		
		assert jugador.MoverIzquierda(mapa)==false;
		
		
		
	}
	
	
	
	
	
}
