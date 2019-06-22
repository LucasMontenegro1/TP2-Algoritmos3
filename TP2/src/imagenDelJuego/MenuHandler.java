package imagenDelJuego;

import Jugador.Jugador;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import mapa.Mapa;

public class MenuHandler implements EventHandler<KeyEvent> {
	
	ImagenMapa imagen;
	
	public MenuHandler(ImagenMapa imagen) {
		this.imagen = imagen;
	}

	@Override
	public void handle(KeyEvent event) {
		if (event.getCode() == KeyCode.ENTER) {
			imagen.comenzarJuego();
		}
	}
	
}