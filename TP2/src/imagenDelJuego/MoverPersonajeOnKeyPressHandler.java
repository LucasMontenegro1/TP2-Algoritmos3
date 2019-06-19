package imagenDelJuego;

import Jugador.Jugador;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import mapa.Mapa;

public class MoverPersonajeOnKeyPressHandler implements EventHandler<KeyEvent> {
	
	Jugador jugador;
	ContenedorPrincipal contenedor;
	
	public MoverPersonajeOnKeyPressHandler(ContenedorPrincipal contenedor,Jugador jugador) {
		this.jugador= jugador;
		this.contenedor=contenedor;
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
		contenedor.setMapa();
		event.consume();
		
	}
	
}