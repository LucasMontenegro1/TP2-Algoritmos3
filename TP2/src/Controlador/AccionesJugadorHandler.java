package Controlador;

import Imagen.ContenedorPrincipal;
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
			
			juego.moverJugador(1,0);
		
			
			
		}
		if (event.getCode() == KeyCode.S) {
			//jugador.moverAbajo();
			juego.moverJugador(-1,0);
			
		}
		if (event.getCode() == KeyCode.D) {
			//jugador.moverDerecha();
			juego.moverJugador(0,1);
			
		}
		if (event.getCode() == KeyCode.A) {
			//jugador.moverIzquierda();
			juego.moverJugador(0,-1);
			
		}
		if (event.getCode() == KeyCode.I) {
			try {
				//jugador.golpearArriba();
				juego.golpearPosicion(1,0);
			}
			catch(noHerramientaException ex) {
				System.out.println("No tenes Herramienta capooo");
			}
			
			
			
		}
		if (event.getCode() == KeyCode.K) {
			try {
				//jugador.golpearAbajo();
				juego.golpearPosicion(-1,0);
			}
			catch(noHerramientaException ex) {
				System.out.println("No tenes Herramienta capooo");
			}
			
		}
		if (event.getCode() == KeyCode.J) {
			try {
				//jugador.golpearIzquierda();
				juego.golpearPosicion(0,-1);
			}
			catch(noHerramientaException ex) {
				System.out.println("No tenes Herramienta capooo");
			}
			
		}
		if (event.getCode() == KeyCode.L) {
			try {
				//jugador.golpearDerecha();
				juego.golpearPosicion(0,1);
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