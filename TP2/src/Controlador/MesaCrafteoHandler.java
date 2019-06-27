package Controlador;

import java.util.List;

import Modelo.Jugador.Inventario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class MesaCrafteoHandler implements EventHandler<ActionEvent> {
	
	Inventario inventario;
	ListView<String> materiales = new ListView<String>();
	
	public MesaCrafteoHandler(Inventario inventario, List<String> materiales) {
		this.inventario = inventario;
		ObservableList<String> listaMateriales = FXCollections.observableList(materiales);
		this.materiales.setItems(listaMateriales);
	}

	@Override
	public void handle(ActionEvent event) {
		Scene scene = new Scene(materiales);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}
	
}