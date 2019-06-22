package imagenDelJuego;

import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import mapa.Mapa;

import Jugador.*;


    public class ImagenMapa extends Application {  
    	
    	Mapa mapa = new Mapa();
    	MediaPlayer mp;
    	ContenedorPrincipal contenedor;
    	Stage stage;

        @Override
        public void start(Stage primaryStage) {

            stage = primaryStage;

            ImageView menu = new ImageView();
            menu.setImage(new Image("minecraftJavaEdition.jpg"));
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
        }

        public static void main(String[] args) {    
            launch(args);
        }    
        

    }