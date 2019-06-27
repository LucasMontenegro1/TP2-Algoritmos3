package Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class MesaCrafteoHandler implements EventHandler<ActionEvent> {
	
	Scene listaMateriales;
	ListView<String> materiales;
	
	public MesaCrafteoHandler(Scene listaMateriales, ListView<String> materiales, Button botonAgregarMaterial) {
		this.listaMateriales = listaMateriales;
		this.materiales = materiales;
		materiales.setOnMouseClicked(new listaMaterialHandler(materiales, botonAgregarMaterial));
	}

	@Override
	public void handle(ActionEvent event) {
		Stage stage = new Stage();
		stage.setScene(listaMateriales);
		stage.setHeight(135);
		stage.show();
	}
	
}