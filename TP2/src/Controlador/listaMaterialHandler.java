package Controlador;


import javafx.event.EventHandler;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class listaMaterialHandler implements EventHandler<MouseEvent> {
	
	ListView<String> materiales;
	
	listaMaterialHandler(ListView<String> materiales) {
		this.materiales = materiales;
	}
	
	@Override
	public void handle(MouseEvent click) {
		if (click.getClickCount() == 2) {
			String material = materiales.getSelectionModel().getSelectedItem();
			if (material == "Madera") {
				System.out.print("hola");
			}
		}
	}
	
}