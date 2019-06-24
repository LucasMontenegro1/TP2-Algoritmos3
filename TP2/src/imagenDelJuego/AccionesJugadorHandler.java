package imagenDelJuego;

import Jugador.Jugador;
import Jugador.noHerramientaException;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class AccionesJugadorHandler implements EventHandler<KeyEvent> {
	
	Jugador jugador;
	ContenedorPrincipal contenedor;
	
	public AccionesJugadorHandler(ContenedorPrincipal contenedor,Jugador jugador) {
		this.jugador = jugador;
		this.contenedor = contenedor;
	}

	@Override
	public void handle(KeyEvent event) {
		if (event.getCode() == KeyCode.W) {
			jugador.moverArriba();
			
		}
		if (event.getCode() == KeyCode.S) {
			jugador.moverAbajo();
			
		}
		if (event.getCode() == KeyCode.D) {
			jugador.moverDerecha();
			
		}
		if (event.getCode() == KeyCode.A) {
			jugador.moverIzquierda();
			
		}
		if (event.getCode() == KeyCode.I) {
			try {
				jugador.golpearArriba();
			}
			catch(noHerramientaException ex) {
				System.out.println("No tenes Herramienta capooo");
			}
			
		}
		if (event.getCode() == KeyCode.K) {
			try {
				jugador.golpearAbajo();
			}
			catch(noHerramientaException ex) {
				System.out.println("No tenes Herramienta capooo");
			}
			
		}
		if (event.getCode() == KeyCode.J) {
			try {
				jugador.golpearIzquierda();
			}
			catch(noHerramientaException ex) {
				System.out.println("No tenes Herramienta capooo");
			}
			
		}
		if (event.getCode() == KeyCode.L) {
			try {
				jugador.golpearDerecha();
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