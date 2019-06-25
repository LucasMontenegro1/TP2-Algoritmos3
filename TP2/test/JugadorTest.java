import org.junit.Test;

import Jugador.*;
import mapa.Juego;
import mapa.Mapa;
import mapa.Posicion;
import Materiales.*;
import Herramientas.*;

public class JugadorTest {
	
		

	@Test
	public void testJugadorSeMueveHaciaAdelanteYElCasilleroEstaLibre() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		Juego juego = new Juego(jugador, mapa);
		
		Posicion nuevaPosicion = juego.obtenerPosicionArriba(jugador.getPosicion());
		juego.moverJugadorA(nuevaPosicion);
		
		//jugador.moverArriba();
		
		assert mapa.getOcupante(7, 7).getClass() == (new Pasto()).getClass();
		assert mapa.getOcupante(6, 7) == jugador;
		
	}

	
	@Test
	public void testJugadorSeMueveHaciaAtrasYElCasilleroEstaLibre() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		Juego juego = new Juego(jugador, mapa);
		
		Posicion nuevaPosicion = juego.obtenerPosicionAbajo(jugador.getPosicion());
		juego.moverJugadorA(nuevaPosicion);
		
		//jugador.moverAbajo();
		
		assert mapa.getOcupante(7, 7).getClass() == (new Pasto()).getClass();
		assert mapa.getOcupante(8, 7) == jugador;
		
	}
	
	
	@Test
	public void testJugadorSeMueveHaciaLaDerechaYElCasilleroEstaLibre() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		Juego juego = new Juego(jugador, mapa);
		
		Posicion nuevaPosicion = juego.obtenerPosicionDerecha(jugador.getPosicion());
		juego.moverJugadorA(nuevaPosicion);
		
		//jugador.moverDerecha();
		
		assert mapa.getOcupante(7, 7).getClass() == (new Pasto()).getClass();
		assert mapa.getOcupante(7, 8) == jugador;
	}
	
	
	@Test
	public void testJugadorSeMueveHaciaIzquierdaYElCasilleroEstaLibre() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		Juego juego = new Juego(jugador, mapa);
		
		Posicion nuevaPosicion = juego.obtenerPosicionIzquierda(jugador.getPosicion());
		juego.moverJugadorA(nuevaPosicion);
		
		//jugador.moverIzquierda();
		
		assert mapa.getOcupante(7, 7).getClass() == (new Pasto()).getClass();
		assert mapa.getOcupante(7, 6) == jugador;
		
	}
	
	
	@Test
	public void testJugadorSeMueveAPosicionOcupadaPorUnMaterial() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		Juego juego = new Juego(jugador, mapa);
		
		Posicion nuevaPosicion = juego.obtenerPosicionIzquierda(jugador.getPosicion());
		juego.moverJugadorA(nuevaPosicion);
		
		//jugador.moverIzquierda();
		
		assert mapa.getOcupante(7, 6) == jugador;
		nuevaPosicion = juego.obtenerPosicionIzquierda(jugador.getPosicion());
		juego.moverJugadorA(nuevaPosicion);
		//jugador.moverIzquierda();
		assert mapa.getOcupante(7, 6) == jugador;
		assert mapa.getOcupante(7, 5) != jugador;
	
	}
	
	@Test
	public void testJugadorSeMueveAUnaPosicionFueraDelMapa() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		Juego juego = new Juego(jugador, mapa);
		
		Posicion nuevaPosicion = juego.obtenerPosicionAbajo(jugador.getPosicion());
		juego.moverJugadorA(nuevaPosicion);
		
		
		//jugador.moverAbajo();
		assert mapa.getOcupante(8, 7) == jugador;
		nuevaPosicion = juego.obtenerPosicionAbajo(jugador.getPosicion());
		juego.moverJugadorA(nuevaPosicion);
		//jugador.moverAbajo();
		assert mapa.getOcupante(8, 7) == jugador;
		
	}
	
	@Test
	public void testJugadorGolpeaMaterialDelCasilleroSuperiorYEsMadera() {
		Mapa mapa = new Mapa();
		Jugador jugador = (Jugador) mapa.getOcupante(7, 7);
		Material madera = (Material) mapa.getOcupante(7, 5);
		HachaDeMadera hacha = new HachaDeMadera();
		int durabilidadMaterial = madera.getDurabilidad();
		int fuerzaHerramienta = hacha.getFuerza();
		Juego juego = new Juego(jugador, mapa);
		
		/*jugador.moverAbajo();
		jugador.moverIzquierda();
		jugador.moverIzquierda();*/
		
		Posicion nuevaPosicion = juego.obtenerPosicionAbajo(jugador.getPosicion());
		juego.moverJugadorA(nuevaPosicion);
		
		nuevaPosicion = juego.obtenerPosicionIzquierda(jugador.getPosicion());
		juego.moverJugadorA(nuevaPosicion);
		
		nuevaPosicion = juego.obtenerPosicionIzquierda(jugador.getPosicion());
		juego.moverJugadorA(nuevaPosicion);
		
		//jugador.golpearArriba();
		assert madera.getDurabilidad() == durabilidadMaterial;
		Posicion posicionAGolpear = juego.obtenerPosicionArriba(jugador.getPosicion());
		juego.golpearPosicion(posicionAGolpear);
 		
		//jugador.golpearArriba();
		assert madera.getDurabilidad() == (durabilidadMaterial - fuerzaHerramienta);
		juego.golpearPosicion(posicionAGolpear); 		
		assert madera.getDurabilidad() == (durabilidadMaterial - 2*fuerzaHerramienta);

	}
	
	@Test
	public void testJugadorCambiaSuHerramientaSeleccionada() {
		//Jugador jugador = new Jugador(new Mapa());
		Jugador jugador = new Jugador();
		jugador.seleccionarSiguienteHerramienta();
	}
	
	@Test
	public void testJugadorRompeUnaMaderaConUnHachaDeMaderaYLaMaderaSeEliminaDelMapa() {
		Mapa mapa = new Mapa();
		Jugador jugador = (Jugador)mapa.getOcupante(7, 7);
		Juego juego = new Juego(jugador, mapa);
		
		//jugador.moverIzquierda();
		Posicion nuevaPosicion = juego.obtenerPosicionIzquierda(jugador.getPosicion());
		juego.moverJugadorA(nuevaPosicion);
		//jugador.golpearIzquierda();
		Posicion posicionAGolpear = juego.obtenerPosicionIzquierda(jugador.getPosicion());
		juego.golpearPosicion(posicionAGolpear);
		
		assert mapa.getOcupante(7, 5).getClass() == Madera.class;
		/*jugador.golpearIzquierda();
		jugador.golpearIzquierda();
		jugador.golpearIzquierda();*/
		juego.golpearPosicion(posicionAGolpear);
		juego.golpearPosicion(posicionAGolpear);
		juego.golpearPosicion(posicionAGolpear);
		assert mapa.getOcupante(7, 5).getClass() == Madera.class;
		//jugador.golpearIzquierda();
		juego.golpearPosicion(posicionAGolpear);
		assert mapa.getOcupante(7, 5).getClass() == Pasto.class;
	}
	
	@Test
	public void testJugadorRompeUnaMaderaYSeAgregaASuInventario() {
		Mapa mapa = new Mapa();
		Jugador jugador = (Jugador)mapa.getOcupante(7, 7);
		Inventario inventario = jugador.getInventario();
		Juego juego = new Juego(jugador, mapa);
		
		//jugador.moverIzquierda();
		Posicion nuevaPosicion = juego.obtenerPosicionIzquierda(jugador.getPosicion());
		juego.moverJugadorA(nuevaPosicion);
		//jugador.golpearIzquierda();
		Posicion posicionAGolpear = juego.obtenerPosicionIzquierda(jugador.getPosicion());
		juego.golpearPosicion(posicionAGolpear);
		
		assert mapa.getOcupante(7, 5).getClass() == Madera.class;
		/*jugador.golpearIzquierda();
		jugador.golpearIzquierda();
		jugador.golpearIzquierda();*/
		juego.golpearPosicion(posicionAGolpear);
		juego.golpearPosicion(posicionAGolpear);
		juego.golpearPosicion(posicionAGolpear);
		assert inventario.getElementosGuardados()[7].getElementoGuardado() == null;
		//jugador.golpearIzquierda();
		juego.golpearPosicion(posicionAGolpear);
		assert inventario.getElementosGuardados()[7].getElementoGuardado().getClass() == Madera.class;
		
	}
	
	
	
}
