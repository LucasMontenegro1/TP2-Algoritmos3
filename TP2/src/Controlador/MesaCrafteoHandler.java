package Controlador;

import Imagen.ContenedorPrincipal;
import Modelo.Jugador.Jugador;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class MesaCrafteoHandler implements EventHandler<ActionEvent> {
	
	Scene listaMateriales;
	ListView<String> materiales = new ListView<String>();
	Stage stage = new Stage();
	
	public MesaCrafteoHandler(ObservableList<String> materiales, Button botonAgregarMaterial, int posicion, Jugador jugador, ContenedorPrincipal contenedor) {
		this.materiales.setItems(materiales);
		this.materiales.setOnMouseClicked(new listaMaterialHandler(this.materiales, stage, botonAgregarMaterial, posicion, jugador, contenedor));
		listaMateriales = new Scene(this.materiales);
	}

	@Override
	public void handle(ActionEvent event) {
		stage.setScene(listaMateriales);
		stage.setHeight(135);
		stage.show();
	}
	
}