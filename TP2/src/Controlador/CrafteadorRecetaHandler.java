package Controlador;

import Imagen.ContenedorPrincipal;
import Modelo.Jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class CrafteadorRecetaHandler implements EventHandler<ActionEvent> {

	Jugador jugador;
	ContenedorPrincipal contenedor;
	Button botonHerramientaACraftear;
	
	public CrafteadorRecetaHandler(Jugador jugador, ContenedorPrincipal contenedor, Button botonHerramientaACraftear) {
		this.jugador = jugador;
		this.contenedor = contenedor;
		this.botonHerramientaACraftear = botonHerramientaACraftear;
	}
	
	@Override
	public void handle(ActionEvent event) {
		String herramienta = botonHerramientaACraftear.getText();
		if (herramienta == "Hacha de Madera") {
			jugador.craftearHachaDeMadera();
		} else if (herramienta == "Hacha de Piedra") {
			jugador.craftearHachaDePiedra();
		}  else if (herramienta == "Hacha de Metal") {
			jugador.craftearHachaDeMetal();
		}  else if (herramienta == "Pico de Madera") {
			jugador.craftearHachaDePiedra();
		}  else if (herramienta == "Pico de Piedra") {
			jugador.craftearPicoDePiedra();
		}  else if (herramienta == "Pico de Metal") {
			jugador.craftearPicoDeMetal();
		}  else if (herramienta == "Pico Fino") {
			jugador.craftearPicoFino();
		}

		contenedor.setInventario();
		contenedor.setMesaCrafteo();
	}
	
}
