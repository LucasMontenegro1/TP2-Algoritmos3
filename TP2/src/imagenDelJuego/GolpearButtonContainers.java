package imagenDelJuego;

import Jugador.Jugador;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import mapa.Mapa;

public class GolpearButtonContainers extends VBox {
	
	public GolpearButtonContainers(Mapa mapa,ImagenMapa imagen, BotonCambiarHerramientaHandler herramientaHandler) {
		
		Button botonRomperIzquierda = new Button();
    	botonRomperIzquierda.setText("Romper Izquierda");
    	Button botonRomperDerecha = new Button();
    	botonRomperDerecha.setText("Romper Derecha");
    	Button botonRomperArriba = new Button();
    	botonRomperArriba.setText("Romper Arriba");
    	Button botonRomperAbajo = new Button();
    	botonRomperAbajo.setText("Romper Abajo");
		
		BotonRomperIzquierdaHandler botonRomperIzquierdaHandler = new BotonRomperIzquierdaHandler((Jugador)mapa.getOcupante(7, 7), imagen, herramientaHandler);
    	BotonRomperDerechaHandler botonRomperDerechaHandler = new BotonRomperDerechaHandler((Jugador)mapa.getOcupante(7, 7),imagen, herramientaHandler);
    	BotonRomperArribaHandler botonRomperArribaHandler = new BotonRomperArribaHandler((Jugador)mapa.getOcupante(7, 7), imagen, herramientaHandler);
    	BotonRomperAbajoHandler botonRomperAbajoHandler = new BotonRomperAbajoHandler((Jugador)mapa.getOcupante(7, 7), imagen, herramientaHandler);
    	
    	botonRomperIzquierda.setOnAction(botonRomperIzquierdaHandler);
    	botonRomperDerecha.setOnAction(botonRomperDerechaHandler);
    	botonRomperAbajo.setOnAction(botonRomperAbajoHandler);
    	botonRomperArriba.setOnAction(botonRomperArribaHandler);
    	
    	this.getChildren().add(botonRomperAbajo);
    	this.getChildren().add(botonRomperArriba);
    	this.getChildren().add(botonRomperIzquierda);
    	this.getChildren().add(botonRomperDerecha);
	}
}
