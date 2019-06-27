package Controlador;


import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HerramientasListaHandler implements EventHandler<MouseEvent> {
	
	ListView<String> listaHerramientas;
	Button boton;
	Stage stage;
	
	
	public HerramientasListaHandler(Stage stage, ListView<String> listaHerramientas, Button boton) {
		this.listaHerramientas = listaHerramientas;
		this.boton = boton;
		this.stage = stage;
	}
	
	@Override
	public void handle(MouseEvent click) {
		if (click.getClickCount() == 2) {
			String herramienta = listaHerramientas.getSelectionModel().getSelectedItem();
			boton.setText(herramienta);
			stage.close();
		}
	}
}
	