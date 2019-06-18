package imagenDelJuego;

import Jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonRomperArribaHandler implements EventHandler<ActionEvent>{
	private Jugador jugador;
	private ImagenMapa imagen;

	public BotonRomperArribaHandler(Jugador jugador, ImagenMapa imagen) {
		this.jugador = jugador;
		this.imagen = imagen;
	}
	
	@Override
	public void handle(ActionEvent arg0) {
		jugador.golpearArriba();
		imagen.imprimirMapa();
		imagen.imprimirInventario();
	}

}
