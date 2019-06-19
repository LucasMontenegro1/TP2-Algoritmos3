package imagenDelJuego;

import javafx.application.Application; 
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;
import junit.framework.Test;
import mapa.Mapa;
import javafx.scene.control.Label;

import Jugador.*;
import Materiales.*;


import Herramientas.*;


    public class ImagenMapa extends Application {  
    	
    	private Stage stage;
    	Mapa mapa = new Mapa();
    	Inventario inventario = ((Jugador)mapa.getOcupante(7, 7)).getInventario();
    	MediaPlayer mp;
    	public static double width;
    	public static double heigth;
    	ContenedorPrincipal contenedor;

        @Override
        public void start(Stage primaryStage) {
        
        	
        	width = Screen.getPrimary().getVisualBounds().getWidth() * 0.8;
        	heigth = Screen.getPrimary().getVisualBounds().getHeight() * 0.8;
        	
        	
        	this.stage = primaryStage;
        	
                  	
            Stage stageMover = new Stage();
            
            
            VBox botonesMover = new MoverButtonContainers(mapa,this);
            
            Scene scene = new Scene(botonesMover);
            stageMover.setX(1400);
            stageMover.setY(400);
            stageMover.setScene(scene);
            stageMover.show(); 
            
            Stage intercambiable = new Stage();
      		Button cambiarHerramientaBoton= new Button();
        	cambiarHerramientaBoton.setText("Cambiar Herramienta");
        	Image herramientaInicial = new Image("Hacha.png");
        	ImageView vistaHerramienta = new ImageView(herramientaInicial);
        	BotonCambiarHerramientaHandler cambiarHerramientaHandler = new BotonCambiarHerramientaHandler((Jugador)mapa.getOcupante(7, 7),vistaHerramienta);
        	cambiarHerramientaBoton.setOnAction(cambiarHerramientaHandler);
        	
            HBox cambioDeHerramientas = new HBox(cambiarHerramientaBoton);
           
            cambioDeHerramientas.getChildren().add(vistaHerramienta);
            
            Scene escenaCambio = new Scene(cambioDeHerramientas);
            intercambiable.setX(320);
            intercambiable.setY(400);
            intercambiable.setScene(escenaCambio);
            intercambiable.show(); 
            
            
        	VBox botonesRomper = new GolpearButtonContainers(mapa, this, cambiarHerramientaHandler);
        	
        	/*
            Stage stageRomper = new Stage();
            Scene romper = new Scene(botonesRomper);
            stageRomper.setX(1400);
            stageRomper.setY(200);
            stageRomper.setScene(romper);
            stageRomper.show();
            */
            
            
            contenedor = new ContenedorPrincipal(mapa);
            MoverPersonajeOnKeyPressHandler posicionamiento= new MoverPersonajeOnKeyPressHandler(contenedor,(Jugador)mapa.getOcupante(7, 7));
            contenedor.setBotonesRomper(botonesRomper);
            
            Scene principal = new Scene(contenedor);
            
            principal.setOnKeyPressed(posicionamiento);
            primaryStage.setScene(principal);
        
            primaryStage.show();
           
       
            
            ponerMusica();
          
            
         
        }

        public static void main(String[] args) {    
            launch(args);
        }    
        
        public void imprimirMapa() {
        	contenedor.setMapa();
        }
        
        public void imprimirInventario() {
          contenedor.setInventario();
        }
        
        
        
        public void ponerMusica() {
         	String path =Test.class.getResource("/minecraftSong.mp3").toString();
        	Media cancion = new Media(path);
        	mp= new MediaPlayer(cancion);
        	mp.setStartTime(Duration.seconds(0));
        	mp.setStopTime(Duration.seconds(1800));
        	
        	mp.setOnEndOfMedia(new Runnable() {
                @Override
                public void run() {
                    mp.seek(Duration.ZERO);
                }
            }); 
        	mp.play();
        	
        	
        }
    }