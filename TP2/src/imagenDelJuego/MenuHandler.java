package imagenDelJuego;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

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