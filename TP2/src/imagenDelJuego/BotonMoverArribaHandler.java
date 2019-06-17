package imagenDelJuego;

import Jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonMoverArribaHandler implements EventHandler<ActionEvent>{
	
	private Jugador jugador;
	private ImagenMapa imagen;

	public BotonMoverArribaHandler(Jugador jugador, ImagenMapa imagen) {
		this.jugador = jugador;
		this.imagen = imagen;
	}
	
	@Override
	public void handle(ActionEvent event) {
		
		jugador.moverArriba();
		imagen.imprimirMapa();
		
	}
	
}
