package Controlador;


import Imagen.ContenedorPrincipal;
import Modelo.Jugador.Jugador;
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
	Jugador jugador;
	ContenedorPrincipal contenedor;
	Boolean yaGuardaMaterial = false;
	
	listaMaterialHandler(ListView<String> materiales, Stage stageLista, Button botonAgregarMaterial, int posicion, Jugador jugador, ContenedorPrincipal contenedor) {
		this.materiales = materiales;
		this.botonAgregarMaterial = botonAgregarMaterial;
		this.stageLista = stageLista;
		this.posicion = posicion;
		this.jugador = jugador;
		this.contenedor = contenedor;
	}
	
	@Override
	public void handle(MouseEvent click) {
		if (click.getClickCount() == 2) {
			String material = materiales.getSelectionModel().getSelectedItem();
			ImageView imagen = new ImageView();
			imagen.setFitHeight(30);
			imagen.setFitWidth(30);
			botonAgregarMaterial.setText(null);
			
			if(yaGuardaMaterial) {
				jugador.organizarMateriales();
				contenedor.setInventario();
				contenedor.setMesaCrafteo();
				
			} else if (material == "Madera") {
				imagen.setImage(new Image("/ArchivosDelJuego/madera.png"));
				botonAgregarMaterial.setGraphic(imagen);
				jugador.agregarMaterialASectorDeCrafteo(posicion, new Madera());
				yaGuardaMaterial = true;
			} else if (material == "Piedra") {
				imagen.setImage(new Image("/ArchivosDelJuego/piedra.png"));
				botonAgregarMaterial.setGraphic(imagen);
				jugador.agregarMaterialASectorDeCrafteo(posicion, new Piedra());
				yaGuardaMaterial = true;
			} else if (material == "Metal") {
				imagen.setImage(new Image("/ArchivosDelJuego/metal.png"));
				botonAgregarMaterial.setGraphic(imagen);
				jugador.agregarMaterialASectorDeCrafteo(posicion, new Metal());
				yaGuardaMaterial = true;
			} else if (material == "Diamante") {
				imagen.setImage(new Image("/ArchivosDelJuego/diamante.png"));
				botonAgregarMaterial.setGraphic(imagen);
				jugador.agregarMaterialASectorDeCrafteo(posicion, new Diamante());
				yaGuardaMaterial = true;
			}
			stageLista.close();
			contenedor.setInventario();
		}
	}
	
}