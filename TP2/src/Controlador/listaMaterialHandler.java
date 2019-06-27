package Controlador;


import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class listaMaterialHandler implements EventHandler<MouseEvent> {
	
	ListView<String> materiales;
	Button botonAgregarMaterial;
	
	listaMaterialHandler(ListView<String> materiales, Button botonAgregarMaterial) {
		this.materiales = materiales;
		this.botonAgregarMaterial = botonAgregarMaterial;
	}
	
	@Override
	public void handle(MouseEvent click) {
		if (click.getClickCount() == 2) {
			String material = materiales.getSelectionModel().getSelectedItem();
			if (material == "Madera") {
				ImageView imagen = new ImageView(new Image("/ArchivosDelJuego/madera.png"));
				imagen.setFitHeight(30);
				imagen.setFitWidth(30);
				botonAgregarMaterial.setText(null);
				botonAgregarMaterial.setGraphic(imagen);
			}
		}
	}
	
}