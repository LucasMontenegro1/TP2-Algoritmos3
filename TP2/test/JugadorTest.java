import org.junit.Test;

import Modelo.Herramientas.HachaDeMadera;
import Modelo.Jugador.Inventario;
import Modelo.Jugador.Jugador;
import Modelo.Mapa.Juego;
import Modelo.Mapa.Mapa;
import Modelo.Materiales.Madera;
import Modelo.Materiales.Material;
import Modelo.Materiales.Pasto;

public class JugadorTest {
	
		

	@Test
	public void testJugadorSeMueveHaciaAdelanteYElCasilleroEstaLibre() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		Juego juego = new Juego(jugador, mapa);
		
		juego.moverJugador(1,0);
		
		//jugador.moverArriba();
		
		assert mapa.getOcupante(7, 7).getClass() == (new Pasto()).getClass();
		assert mapa.getOcupante(6, 7) == jugador;
		
	}

	
	@Test
	public void testJugadorSeMueveHaciaAbajoYElCasilleroEstaLibre() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		Juego juego = new Juego(jugador, mapa);
		
		juego.moverJugador(-1,0);
		
		//jugador.moverAbajo();
		
		assert mapa.getOcupante(7, 7).getClass() == (new Pasto()).getClass();
		assert mapa.getOcupante(8, 7) == jugador;
		
	}
	
	
	@Test
	public void testJugadorSeMueveHaciaLaDerechaYElCasilleroEstaLibre() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		Juego juego = new Juego(jugador, mapa);
		
		juego.moverJugador(0,1);
		
		//jugador.moverDerecha();
		
		assert mapa.getOcupante(7, 7).getClass() == (new Pasto()).getClass();
		assert mapa.getOcupante(7, 8) == jugador;
	}
	
	
	@Test
	public void testJugadorSeMueveHaciaIzquierdaYElCasilleroEstaLibre() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		Juego juego = new Juego(jugador, mapa);
		
		juego.moverJugador(0,-1);
		
		//jugador.moverIzquierda();
		
		assert mapa.getOcupante(7, 7).getClass() == (new Pasto()).getClass();
		assert mapa.getOcupante(7, 6) == jugador;
		
	}
	
	
	@Test
	public void testJugadorSeMueveAPosicionOcupadaPorUnMaterial() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		Juego juego = new Juego(jugador, mapa);
		
		juego.moverJugador(0,-1);
		
		//jugador.moverIzquierda();
		
		assert mapa.getOcupante(7, 6) == jugador;
		juego.moverJugador(0,-1);
		//jugador.moverIzquierda();
		assert mapa.getOcupante(7, 6) == jugador;
		assert mapa.getOcupante(7, 5) != jugador;
	
	}
	
	@Test
	public void testJugadorSeMueveAUnaPosicionFueraDelMapa() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		Juego juego = new Juego(jugador, mapa);
		
		juego.moverJugador(-1,0);
		
		
		//jugador.moverAbajo();
		assert mapa.getOcupante(8, 7) == jugador;
		juego.moverJugador(-1,0);
		//jugador.moverAbajo();
		assert mapa.getOcupante(9, 7) == jugador;
		juego.moverJugador(-1,0);
		assert mapa.getOcupante(9, 7) == jugador;

		
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
		
		juego.moverJugador(-1,0);
		
		juego.moverJugador(0,-1);
		
		juego.moverJugador(0,-1);
		
		//jugador.golpearArriba();
		assert madera.getDurabilidad() == durabilidadMaterial;
		juego.golpearPosicion(1,0);
 		
		//jugador.golpearArriba();
		assert madera.getDurabilidad() == (durabilidadMaterial - fuerzaHerramienta);
		juego.golpearPosicion(1,0); 		
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
		juego.moverJugador(0,-1);
		//jugador.golpearIzquierda();
		juego.golpearPosicion(0,-1);
		
		assert mapa.getOcupante(7, 5).getClass() == Madera.class;
		/*jugador.golpearIzquierda();
		jugador.golpearIzquierda();
		jugador.golpearIzquierda();*/
		juego.golpearPosicion(0,-1);
		juego.golpearPosicion(0,-1);
		juego.golpearPosicion(0,-1);
		assert mapa.getOcupante(7, 5).getClass() == Madera.class;
		//jugador.golpearIzquierda();
		juego.golpearPosicion(0,-1);
		assert mapa.getOcupante(7, 5).getClass() == Pasto.class;
	}
	
	@Test
	public void testJugadorRompeUnaMaderaYSeAgregaASuInventario() {
		Mapa mapa = new Mapa();
		Jugador jugador = (Jugador)mapa.getOcupante(7, 7);
		Inventario inventario = jugador.getInventario();
		Juego juego = new Juego(jugador, mapa);
		
		//jugador.moverIzquierda();
		juego.moverJugador(0,-1);
		//jugador.golpearIzquierda();
		juego.golpearPosicion(0,-1);
		
		assert mapa.getOcupante(7, 5).getClass() == Madera.class;
		/*jugador.golpearIzquierda();
		jugador.golpearIzquierda();
		jugador.golpearIzquierda();*/
		juego.golpearPosicion(0,-1);
		juego.golpearPosicion(0,-1);
		juego.golpearPosicion(0,-1);
		assert inventario.getElementosGuardados()[7].getElementoGuardado() == null;
		//jugador.golpearIzquierda();
		juego.golpearPosicion(0,-1);
		assert inventario.getElementosGuardados()[7].getElementoGuardado().getClass() == Madera.class;
		
	}
	
	
	
}
