package imagenDelJuego;

import Jugador.Jugador;
import Jugador.noHerramientaException;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import mapa.Juego;
import mapa.Posicion;

public class AccionesJugadorHandler implements EventHandler<KeyEvent> {
	
	Jugador jugador;
	ContenedorPrincipal contenedor;
	Juego juego;
	
	public AccionesJugadorHandler(ContenedorPrincipal contenedor,Jugador jugador, Juego juego) {
		this.jugador = jugador;
		this.contenedor = contenedor;
		this.juego = juego;
	}

	@Override
	public void handle(KeyEvent event) {
		if (event.getCode() == KeyCode.W) {
			//jugador.moverArriba();
			
			Posicion nuevaPosicion = juego.obtenerPosicion(jugador.getPosicion(),1,0);
			juego.moverJugadorA(nuevaPosicion);
		
			
			
		}
		if (event.getCode() == KeyCode.S) {
			//jugador.moverAbajo();
			Posicion nuevaPosicion = juego.obtenerPosicion(jugador.getPosicion(),-1,0);
			juego.moverJugadorA(nuevaPosicion);
			
		}
		if (event.getCode() == KeyCode.D) {
			//jugador.moverDerecha();
			Posicion nuevaPosicion = juego.obtenerPosicion(jugador.getPosicion(),0,1);
			juego.moverJugadorA(nuevaPosicion);
			
		}
		if (event.getCode() == KeyCode.A) {
			//jugador.moverIzquierda();
			Posicion nuevaPosicion = juego.obtenerPosicion(jugador.getPosicion(),0,-1);
			juego.moverJugadorA(nuevaPosicion);
			
		}
		if (event.getCode() == KeyCode.I) {
			try {
				//jugador.golpearArriba();
				Posicion posicionAGolpear = juego.obtenerPosicion(jugador.getPosicion(),1,0);
				juego.golpearPosicion(posicionAGolpear);
			}
			catch(noHerramientaException ex) {
				System.out.println("No tenes Herramienta capooo");
			}
			
			
			
		}
		if (event.getCode() == KeyCode.K) {
			try {
				//jugador.golpearAbajo();
				Posicion posicionAGolpear = juego.obtenerPosicion(jugador.getPosicion(),-1,0);
				juego.golpearPosicion(posicionAGolpear);
			}
			catch(noHerramientaException ex) {
				System.out.println("No tenes Herramienta capooo");
			}
			
		}
		if (event.getCode() == KeyCode.J) {
			try {
				//jugador.golpearIzquierda();
				Posicion posicionAGolpear = juego.obtenerPosicion(jugador.getPosicion(),0,-1);
				juego.golpearPosicion(posicionAGolpear);
			}
			catch(noHerramientaException ex) {
				System.out.println("No tenes Herramienta capooo");
			}
			
		}
		if (event.getCode() == KeyCode.L) {
			try {
				//jugador.golpearDerecha();
				Posicion posicionAGolpear = juego.obtenerPosicion(jugador.getPosicion(),0,1);
				juego.golpearPosicion(posicionAGolpear);
			}
			catch(noHerramientaException ex) {
				System.out.println("No tenes Herramienta capooo");
			}
			
		}
		if (event.getCode() == KeyCode.P) {
			jugador.seleccionarSiguienteHerramienta();
			
		}
		contenedor.setMapa();
		contenedor.setInventario();
		contenedor.setCambiarHerramienta();
		event.consume();
		
	}
	
}