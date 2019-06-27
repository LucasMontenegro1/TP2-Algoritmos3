package Controlador;

import Modelo.Crafteo.CodigoDeCrafteo;
import Modelo.Crafteo.MesaDeCrafteo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CrafteadorRecetaHandler implements EventHandler<ActionEvent> {

	MesaDeCrafteo mesa = new MesaDeCrafteo();
	CodigoDeCrafteo codigoCrafteo;
	
	public CrafteadorRecetaHandler(CodigoDeCrafteo codigoCrafteo) {
		this.codigoCrafteo = codigoCrafteo;
	}
	
	@Override
	public void handle(ActionEvent event) {
		mesa.craftearHachaDeMadera(codigoCrafteo);
	}
	
}
