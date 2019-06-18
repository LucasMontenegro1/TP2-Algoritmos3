package imagenDelJuego;

import Jugador.Jugador;
import Jugador.noHerramientaException;
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
		try {
			jugador.golpearArriba();
		}
		catch(noHerramientaException ex) {
			System.out.println("No tenes Herramienta capooo");
		}
		
		imagen.imprimirMapa();
		imagen.imprimirInventario();
	}

}
