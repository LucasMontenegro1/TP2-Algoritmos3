package imagen;

import Jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonMoverDerechaHandler implements EventHandler<ActionEvent>{
	
	private Jugador jugador;
	private ImagenMapa imagen;

	public BotonMoverDerechaHandler(Jugador jugador, ImagenMapa imagen) {
		this.jugador = jugador;
		this.imagen = imagen;
	}
	
	@Override
	public void handle(ActionEvent event) {
		
		jugador.moverDerecha();
		imagen.imprimirMapa();
		
	}
	
}
