package Controlador;

import Imagen.ContenedorPrincipal;
import Modelo.Jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CrafteadorRecetaHandler implements EventHandler<ActionEvent> {

	Jugador jugador;
	ContenedorPrincipal contenedor;
	
	public CrafteadorRecetaHandler(Jugador jugador, ContenedorPrincipal contenedor) {
		this.jugador = jugador;
		this.contenedor = contenedor;
	}
	
	@Override
	public void handle(ActionEvent event) {
		jugador.craftearHachaDeMadera();
		contenedor.setInventario();
		contenedor.setMesaCrafteo();
	}
	
}
