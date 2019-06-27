package Controlador;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class MesaCrafteoHandler implements EventHandler<ActionEvent> {
	
	Scene listaMateriales;
	ListView<String> materiales;
	
	public MesaCrafteoHandler(Scene listaMateriales, ListView<String> materiales) {
		this.listaMateriales = listaMateriales;
		this.materiales = materiales;
	}

	@Override
	public void handle(ActionEvent event) {
		Stage stage = new Stage();
		stage.setScene(listaMateriales);
		stage.setHeight(135);
		stage.show();
	}
	
}