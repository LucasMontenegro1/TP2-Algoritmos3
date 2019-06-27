package Controlador;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ListaHerramientasHandler implements EventHandler<ActionEvent> {
	
	List<String> listaHerramientas = new ArrayList<String>();
	ListView<String> listaHerramientasView = new ListView<String>();
	Scene scene;
	Stage stage = new Stage();
	
	public ListaHerramientasHandler(Button boton) {
		listaHerramientas.add("Hacha de Madera");
		listaHerramientas.add("Hacha de Piedra");
		listaHerramientas.add("Hacha de Metal");
		listaHerramientas.add("Pico de Madera");
		listaHerramientas.add("Pico de Piedra");
		listaHerramientas.add("Pico de Metal");
		listaHerramientas.add("Pico Fino");
		ObservableList<String> observableLisaHerramientas = FXCollections.observableList(listaHerramientas);
		listaHerramientasView.setItems(observableLisaHerramientas);
		scene = new Scene(listaHerramientasView);
		listaHerramientasView.setOnMouseClicked(new HerramientasListaHandler(stage, listaHerramientasView, boton));
	}
	
	@Override
	public void handle(ActionEvent event) {
		stage.setScene(scene);
		stage.show();
	}
	
}
