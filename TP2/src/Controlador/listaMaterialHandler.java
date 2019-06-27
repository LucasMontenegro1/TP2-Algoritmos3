package Controlador;


import Modelo.Crafteo.CodigoDeCrafteo;
import Modelo.Materiales.*;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class listaMaterialHandler implements EventHandler<MouseEvent> {
	
	ListView<String> materiales;
	Button botonAgregarMaterial;
	Stage stageLista;
	int posicion;
	CodigoDeCrafteo codigoCrafteo;
	
	listaMaterialHandler(ListView<String> materiales, Stage stageLista, Button botonAgregarMaterial, int posicion, CodigoDeCrafteo codigoCrafteo) {
		this.materiales = materiales;
		this.botonAgregarMaterial = botonAgregarMaterial;
		this.stageLista = stageLista;
		this.posicion = posicion;
		this.codigoCrafteo = codigoCrafteo;
	}
	
	@Override
	public void handle(MouseEvent click) {
		if (click.getClickCount() == 2) {
			String material = materiales.getSelectionModel().getSelectedItem();
			ImageView imagen = new ImageView();
			imagen.setFitHeight(30);
			imagen.setFitWidth(30);
			botonAgregarMaterial.setText(null);
			if (material == "Madera") {
				imagen.setImage(new Image("/ArchivosDelJuego/madera.png"));
				botonAgregarMaterial.setGraphic(imagen);
				codigoCrafteo.agregarMaterial(posicion, new Madera());
			} else if (material == "Piedra") {
				imagen.setImage(new Image("/ArchivosDelJuego/piedra.png"));
				botonAgregarMaterial.setGraphic(imagen);
				codigoCrafteo.agregarMaterial(posicion, new Piedra());
			} else if (material == "Metal") {
				imagen.setImage(new Image("/ArchivosDelJuego/metal.png"));
				botonAgregarMaterial.setGraphic(imagen);
				codigoCrafteo.agregarMaterial(posicion, new Metal());
			} else if (material == "Diamante") {
				imagen.setImage(new Image("/ArchivosDelJuego/diamante.png"));
				botonAgregarMaterial.setGraphic(imagen);
				codigoCrafteo.agregarMaterial(posicion, new Diamante());
			}
			stageLista.close();
		}
	}
	
}