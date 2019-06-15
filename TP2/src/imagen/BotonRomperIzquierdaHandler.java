package imagen;

import Jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonRomperIzquierdaHandler implements EventHandler<ActionEvent>{
	private Jugador jugador;
	private ImagenMapa imagen;

	public BotonRomperIzquierdaHandler(Jugador jugador, ImagenMapa imagen) {
		this.jugador = jugador;
		this.imagen = imagen;
	}
	
	@Override
	public void handle(ActionEvent arg0) {
		jugador.golpearIzquierda();
		imagen.imprimirMapa();
	}

}
