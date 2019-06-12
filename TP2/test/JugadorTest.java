import org.junit.Test;

import Jugador.*;
import mapa.Mapa;
import Materiales.*;
import Herramientas.*;

public class JugadorTest {
	
		

	@Test
	public void testJugadorSeMueveHaciaAdelanteYElCasilleroEstaLibre() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.moverArriba();
		
		assert mapa.getOcupante(7, 7).getClass() == (new Pasto()).getClass();
		assert mapa.getOcupante(6, 7) == jugador;
		
	}

	
	@Test
	public void testJugadorSeMueveHaciaAtrasYElCasilleroEstaLibre() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.moverAbajo();
		
		assert mapa.getOcupante(7, 7).getClass() == (new Pasto()).getClass();
		assert mapa.getOcupante(8, 7) == jugador;
		
	}
	
	
	@Test
	public void testJugadorSeMueveHaciaLaDerechaYElCasilleroEstaLibre() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.moverDerecha();
		
		assert mapa.getOcupante(7, 7).getClass() == (new Pasto()).getClass();
		assert mapa.getOcupante(7, 8) == jugador;
	}
	
	
	@Test
	public void testJugadorSeMueveHaciaIzquierdaYElCasilleroEstaLibre() {
		Mapa mapa= new Mapa();
		Jugador jugador=(Jugador)mapa.getOcupante(7, 7);
		
		jugador.moverIzquierda();
		
		assert mapa.getOcupante(7, 7).getClass() == (new Pasto()).getClass();
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
	
	@Test
	public void testJugadorGolpeaMaterialDelCasilleroSuperiorYEsMadera() {
		Mapa mapa = new Mapa();
		Jugador jugador = (Jugador) mapa.getOcupante(7, 7);
		Material madera = (Material) mapa.getOcupante(7, 5);
		HachaDeMadera hacha = new HachaDeMadera();
		int durabilidadMaterial = madera.getDurabilidad();
		int fuerzaHerramienta = hacha.getFuerza();
		
		jugador.moverAbajo();
		jugador.moverIzquierda();
		jugador.moverIzquierda();
		
		assert madera.getDurabilidad() == durabilidadMaterial;
 		jugador.golpearArriba();
		assert madera.getDurabilidad() == (durabilidadMaterial - fuerzaHerramienta);
 		jugador.golpearArriba();
		assert madera.getDurabilidad() == (durabilidadMaterial - 2*fuerzaHerramienta);

	}
	
	@Test
	public void testJugadorCambiaSuHerramientaSeleccionada() {
		Jugador jugador = new Jugador(new Mapa());
		jugador.seleccionarSiguienteHerramienta();
	}
	
	@Test
	public void testJugadorRompeUnaMaderaConUnHachaDeMaderaYLaMaderaSeEliminaDelMapa() {
		Mapa mapa = new Mapa();
		Jugador jugador = (Jugador)mapa.getOcupante(7, 7);
		
		jugador.moverIzquierda();
		jugador.golpearIzquierda();
		
		assert mapa.getOcupante(7, 5).getClass() == Madera.class;
		jugador.golpearIzquierda();
		jugador.golpearIzquierda();
		jugador.golpearIzquierda();
		assert mapa.getOcupante(7, 5).getClass() == Madera.class;
		jugador.golpearIzquierda();
		assert mapa.getOcupante(7, 5).getClass() == Pasto.class;
	}
	
	@Test
	public void testJugadorRompeUnaMaderaYSeAgregaASuInventario() {
		Mapa mapa = new Mapa();
		Jugador jugador = (Jugador)mapa.getOcupante(7, 7);
		Inventario inventario = jugador.getInventario();
		
		jugador.moverIzquierda();
		jugador.golpearIzquierda();

		jugador.golpearIzquierda();
		jugador.golpearIzquierda();
		jugador.golpearIzquierda();
		assert inventario.getElementosGuardados()[1].getElementoGuardado() == null;
		jugador.golpearIzquierda();
		assert inventario.getElementosGuardados()[1].getElementoGuardado().getClass() == Madera.class;
	}
	
	
	
}
