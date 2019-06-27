package Controlador;

import Imagen.ImagenJuego;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class MesaCrafteoHandler implements EventHandler<KeyEvent> {
	
	ImagenJuego imagen;
	
	public MesaCrafteoHandler(ImagenJuego imagen) {
		this.imagen = imagen;
	}

	@Override
	public void handle(KeyEvent event) {
		if (event.getCode() == KeyCode.ENTER) {
			imagen.comenzarJuego();
		}
	}
	
}