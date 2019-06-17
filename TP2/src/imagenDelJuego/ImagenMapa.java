package imagenDelJuego;

import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;
import junit.framework.Test;
import mapa.Mapa;

import Jugador.Jugador;
import Materiales.*;


    public class ImagenMapa extends Application {  
    	
    	private Stage stage;
    	Mapa mapa = new Mapa();
    	MediaPlayer mp;

        @Override
        public void start(Stage primaryStage) {
        	
        	this.stage = primaryStage;
        	
        	
        	VBox botonesRomper = new GolpearButtonContainers(mapa, this);
        	
            Stage stageRomper = new Stage();
            Scene romper = new Scene(botonesRomper);
            stageRomper.setX(1400);
            stageRomper.setY(200);
            stageRomper.setScene(romper);
            stageRomper.show();
            
        	
            Stage secondaryStage = new Stage();
            
            
            VBox botonesMover = new MoverButtonContainers(mapa,this);
            
            Scene scene = new Scene(botonesMover);
            secondaryStage.setX(1400);
            secondaryStage.setY(400);
            secondaryStage.setScene(scene);
            secondaryStage.show(); 
    
            
            ponerMusica();
            
            imprimirMapa();
        }

        public static void main(String[] args) {    
            launch(args);
        }    
        
        public void imprimirMapa() {
            int length = 9;
            int width = 13;
            
            
            GridPane root = new GridPane();  
            
            
            for(int y = 0; y < length; y++){
                for(int x = 0; x < width; x++){
                	
                    Image img = new Image("pasto.png");
                	
                	if(mapa.getOcupante(y, x).getClass() == Madera.class) {
                        img = new Image("madera.png");
                	} else if(mapa.getOcupante(y, x).getClass() == Piedra.class) {
                        img = new Image("piedra.png");
                	} else if(mapa.getOcupante(y, x).getClass() == Metal.class) {
                        img = new Image("metal.png");
                	} else if(mapa.getOcupante(y, x).getClass() == Diamante.class) {
                        img = new Image("DiamanteBloque.png");
                	} else if(mapa.getOcupante(y, x).getClass() == Jugador.class) {
                        img = new Image("Steve.png");
                	}
                        
                        
                    ImageView imagen = new ImageView(img);
                    
                    imagen.setPreserveRatio(true);
                    
                    imagen.setFitHeight(50);
                    imagen.setFitWidth(50);
                    

                    GridPane.setRowIndex(imagen,y);
                    GridPane.setColumnIndex(imagen,x);   
                    root.getChildren().add(imagen);   
                }
            }
            
            
            Scene scene = new Scene(root, 650, 450); 
            stage.setTitle("Maincraf");
            stage.setScene(scene);
            stage.show();
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