package imagenDelJuego;


import Herramientas.*;
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

		actualizarImagenHerramienta();
	
	}
	
	public void actualizarImagenHerramienta() {
		
		Inventario inventario = jugador.getInventario();
		
		if(inventario.getHerramientaSeleccionada() != null) {
			
			if(inventario.getHerramientaSeleccionada().getClass()==HachaDeMadera.class) {
				imagen.setImage(new Image("Hacha.png"));
			}else if(inventario.getHerramientaSeleccionada().getClass()==HachaDeMetal.class) {
				imagen.setImage(new Image("HachaDeMetal.png"));
			}else if(inventario.getHerramientaSeleccionada().getClass()==HachaDePiedra.class) {
				imagen.setImage(new Image("HachaDePiedra.png"));
			}else if(inventario.getHerramientaSeleccionada().getClass()==PicoDeMadera.class) {
				imagen.setImage(new Image("PicoDeMadera.png"));
			}else if(inventario.getHerramientaSeleccionada().getClass()==PicoDeMetal.class) {
				imagen.setImage(new Image("PicoDeMetal.png"));
			}else if(inventario.getHerramientaSeleccionada().getClass()==PicoDePiedra.class) {
				imagen.setImage(new Image("PicoDePiedra.png"));
			}else if(inventario.getHerramientaSeleccionada().getClass()==PicoFino.class) {
				imagen.setImage(new Image("PicoFino.png"));
			}

		} else {
			imagen.setImage(new Image("defaultInventario.png"));
		}
	}
	
}
