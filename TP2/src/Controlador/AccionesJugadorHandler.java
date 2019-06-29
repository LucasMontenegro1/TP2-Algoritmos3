package Controlador;

import Imagen.ContenedorPrincipal;
import Modelo.Jugador.Jugador;
import Modelo.Jugador.noHerramientaException;
import Modelo.Mapa.Juego;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class AccionesJugadorHandler implements EventHandler<KeyEvent> {
	
	Jugador jugador;
	ContenedorPrincipal contenedor;
	Juego juego;
	
	public AccionesJugadorHandler(ContenedorPrincipal contenedor,Jugador jugador, Juego juego) {
		this.jugador = jugador;
		this.contenedor = contenedor;
		this.juego = juego;
	}

	@Override
	public void handle(KeyEvent event) {

		movimiento(event);
		golpear(event);
		cambiarHerramienta(event);
		contenedor.actualizarMapa();
		
	}
	
	private void movimiento(KeyEvent event) {
		if (event.getCode() == KeyCode.W) {		
			juego.moverJugador(1,0);	
			
		}
		if (event.getCode() == KeyCode.S) {
			juego.moverJugador(-1,0);
			
		}
		if (event.getCode() == KeyCode.D) {
			juego.moverJugador(0,1);
			
		}
		if (event.getCode() == KeyCode.A) {
			juego.moverJugador(0,-1);
			
		}
	}
	
	private void golpear(KeyEvent event) {
		if (event.getCode() == KeyCode.I) {
			try {
				juego.golpearPosicion(1,0);
			}
			catch(noHerramientaException ex) {
				noTenesHerramientaMessage();
			}
			actualizarImagen();
		}
		if (event.getCode() == KeyCode.K) {
			try {
				juego.golpearPosicion(-1,0);
			}
			catch(noHerramientaException ex) {
				noTenesHerramientaMessage();
			}
			actualizarImagen();
		}
		if (event.getCode() == KeyCode.J) {
			try {
				juego.golpearPosicion(0,-1);
			}
			catch(noHerramientaException ex) {
				noTenesHerramientaMessage();
			}
			actualizarImagen();
			
		}
		if (event.getCode() == KeyCode.L) {
			try {
				juego.golpearPosicion(0,1);
			}
			catch(noHerramientaException ex) {
				noTenesHerramientaMessage();
			}
			actualizarImagen();
			
		}
	}
	
	private void actualizarImagen() {
		contenedor.actualizarListaMaterialesDisponibles();
		contenedor.setInventario();
		contenedor.setCambiarHerramienta();
	}
	
	private void noTenesHerramientaMessage() {
		Label noTenesHerramienta = new Label("No tienes una herramienta equipada!");
		Scene scene = new Scene(noTenesHerramienta);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
	}
	
	private void cambiarHerramienta(KeyEvent event) {
		if (event.getCode() == KeyCode.P) {
			jugador.seleccionarSiguienteHerramienta();
			contenedor.setInventario();
			contenedor.setCambiarHerramienta();
			
		}
	}
	
}