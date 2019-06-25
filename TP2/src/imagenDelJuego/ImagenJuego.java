package imagenDelJuego;

import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;
import junit.framework.Test;
import mapa.Mapa;

import Jugador.*;


    public class ImagenJuego extends Application {  
    	
    	Mapa mapa = new Mapa();
    	MediaPlayer mp;
    	ContenedorPrincipal contenedor;
    	Stage stage;

        @Override
        public void start(Stage primaryStage) {

            stage = primaryStage;

            ImageView menu = new ImageView();
            ponerMusica();
            menu.setImage(new Image("AlgocraftLogo.jpg"));
            VBox presentacion = new VBox(menu);
            Scene principal = new Scene(presentacion);
            principal.setOnKeyPressed(new MenuHandler(this));
            stage.setScene(principal);
        
            stage.show();
          
        }
        
        public void comenzarJuego() {
            contenedor = new ContenedorPrincipal(mapa);
            AccionesJugadorHandler moverHandler = new AccionesJugadorHandler(contenedor, (Jugador)mapa.getOcupante(7, 7));
            Scene principal = new Scene(contenedor);
            
            
            principal.setOnKeyPressed(moverHandler);
            stage.setScene(principal);
        
            stage.show();
            stage.setTitle("The Minecraft Project");
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

        public static void main(String[] args) {    
            launch(args);
        }    
        

    }