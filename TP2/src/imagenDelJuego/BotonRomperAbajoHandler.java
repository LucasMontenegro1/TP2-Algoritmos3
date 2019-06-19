package imagenDelJuego;

import Jugador.Jugador;
import Jugador.noHerramientaException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonRomperAbajoHandler implements EventHandler<ActionEvent>{
	private Jugador jugador;
	private ImagenMapa imagen;
	private BotonCambiarHerramientaHandler herramientaHandler;

	public BotonRomperAbajoHandler(Jugador jugador, ImagenMapa imagen, BotonCambiarHerramientaHandler herramientaHandler) {
		this.jugador = jugador;
		this.imagen = imagen;
		this.herramientaHandler = herramientaHandler;
	}
	
	@Override
	public void handle(ActionEvent arg0) {
		try {
			jugador.golpearAbajo();
		}
		catch(noHerramientaException ex) {
			System.out.println("No tenes Herramienta capooo");
		}
		imagen.imprimirMapa();
		imagen.imprimirInventario();
		herramientaHandler.actualizarImagenHerramienta();
	}

}
