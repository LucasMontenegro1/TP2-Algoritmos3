package imagenDelJuego;

import Herramientas.HachaDeMadera;
import Herramientas.HachaDeMetal;
import Jugador.Inventario;
import Jugador.Jugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonCambiarHerramientaHandler implements EventHandler<ActionEvent>{
	
	private Jugador jugador;
	private ImageView imagen;


	public BotonCambiarHerramientaHandler(Jugador jugador,ImageView imagen) {
		this.jugador = jugador;
		this.imagen= imagen;
	}
	
	@Override
	public void handle(ActionEvent event) {
		jugador.seleccionarSiguienteHerramienta();
		Inventario inventario = jugador.getInventario();
		if(inventario.getHerramientaSeleccionada().getClass()==HachaDeMadera.class) {
			imagen.setImage(new Image("Hacha.png"));
		}
		else if(inventario.getHerramientaSeleccionada().getClass()==HachaDeMetal.class) {
			imagen.setImage(new Image("HachaDeMetal.png"));
		}
		}

	
}
