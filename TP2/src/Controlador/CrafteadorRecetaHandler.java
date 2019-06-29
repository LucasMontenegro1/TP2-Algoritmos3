package Controlador;

import Imagen.ContenedorPrincipal;
import Modelo.Crafteo.CodigoDeCrafteoIncorrectoException;
import Modelo.Jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

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
		
		try {
			if (herramienta != "Elija Herramienta") {
				if (herramienta == "Hacha de Madera") {
					jugador.craftearHachaDeMadera();
				} else if (herramienta == "Hacha de Piedra") {
					jugador.craftearHachaDePiedra();
				}  else if (herramienta == "Hacha de Metal") {
					jugador.craftearHachaDeMetal();
				}  else if (herramienta == "Pico de Madera") {
					jugador.craftearPicoDeMadera();
				}  else if (herramienta == "Pico de Piedra") {
					jugador.craftearPicoDePiedra();
				}  else if (herramienta == "Pico de Metal") {
					jugador.craftearPicoDeMetal();
				}  else if (herramienta == "Pico Fino") {
					jugador.craftearPicoFino();
				}
			} else {
				jugador.organizarMateriales();
				Label noExisteHerramienta = new Label("Por favor, seleccione una herramienta a craftear");
				Scene scene = new Scene(noExisteHerramienta);
				Stage stage = new Stage();
				stage.setScene(scene);
				stage.show();
			}
		} catch (CodigoDeCrafteoIncorrectoException e) {
			Label noExisteHerramienta = new Label("No existe la herramienta");
			Scene scene = new Scene(noExisteHerramienta);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
		}
		contenedor.setInventario();
		contenedor.setMesaCrafteo();
		contenedor.setCambiarHerramienta();
	}
	
	
}
