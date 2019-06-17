package imagen;

import Jugador.Jugador;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import mapa.Mapa;
import Materiales.*;

public class MoveButtonContainers extends VBox {
	
	public MoveButtonContainers(Mapa mapa,ImagenMapa imagen) {
		
    	Button botonMoverArriba = new Button();
    	Button botonMoverAbajo = new Button();
    	Button botonMoverDerecha = new Button();
    	Button botonMoverIzquierda = new Button();
    	botonMoverArriba.setText("Mover Arriba");
    	botonMoverAbajo.setText("Mover Abajo");
    	botonMoverDerecha.setText("Mover Derecha");
    	botonMoverIzquierda.setText("Mover Izquierda");
    	
        BotonMoverArribaHandler botonMoverArribaHandler = new BotonMoverArribaHandler((Jugador)mapa.getOcupante(7, 7), imagen);
        BotonMoverAbajoHandler botonMoverAbajoHandler = new BotonMoverAbajoHandler((Jugador)mapa.getOcupante(7, 7), imagen);
        BotonMoverDerechaHandler botonMoverDerechaHandler = new BotonMoverDerechaHandler((Jugador)mapa.getOcupante(7, 7), imagen);
        BotonMoverIzquierdaHandler botonMoverIzquierdaHandler = new BotonMoverIzquierdaHandler((Jugador)mapa.getOcupante(7, 7), imagen);
        botonMoverArriba.setOnAction(botonMoverArribaHandler);
        botonMoverAbajo.setOnAction(botonMoverAbajoHandler);
        botonMoverDerecha.setOnAction(botonMoverDerechaHandler);
        botonMoverIzquierda.setOnAction(botonMoverIzquierdaHandler);
        
    	
    	this.getChildren().add(botonMoverAbajo);
    	this.getChildren().add(botonMoverArriba);
    	this.getChildren().add(botonMoverIzquierda);
    	this.getChildren().add(botonMoverDerecha);
	}
}
