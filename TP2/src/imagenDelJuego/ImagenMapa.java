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

import Jugador.*;
import Materiales.*;
import Herramientas.*;


    public class ImagenMapa extends Application {  
    	
    	private Stage stage;
    	private Stage inventarioStage = new Stage();
    	Mapa mapa = new Mapa();
    	Inventario inventario = ((Jugador)mapa.getOcupante(7, 7)).getInventario();
    	MediaPlayer mp;
    	public static double width;
    	public static double heigth;

        @Override
        public void start(Stage primaryStage) {
        	
        	width = Screen.getPrimary().getVisualBounds().getWidth() * 0.8;
        	heigth = Screen.getPrimary().getVisualBounds().getHeight() * 0.8;
        	
        	
        	this.stage = primaryStage;
        	
        	
        	VBox botonesRomper = new GolpearButtonContainers(mapa, this);
        	
            Stage stageRomper = new Stage();
            Scene romper = new Scene(botonesRomper);
            stageRomper.setX(1400);
            stageRomper.setY(200);
            stageRomper.setScene(romper);
            stageRomper.show();
            
        	
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
        	cambiarHerramientaBoton.setOnAction(new BotonCambiarHerramientaHandler((Jugador)mapa.getOcupante(7, 7),vistaHerramienta));
        	
            HBox cambioDeHerramientas = new HBox(cambiarHerramientaBoton);
            
           
            cambioDeHerramientas.getChildren().add(vistaHerramienta);
            
            Scene escenaCambio = new Scene(cambioDeHerramientas);
            intercambiable.setX(320);
            intercambiable.setY(400);
            intercambiable.setScene(escenaCambio);
            intercambiable.show(); 
            
            
            
            
            ponerMusica();
            
            imprimirMapa();
            inventarioStage.setWidth(365);
            inventarioStage.setHeight(238);
            inventarioStage.setY(700);
            inventarioStage.setX(800);
            imprimirInventario();
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
        
        public void imprimirInventario() {
            int length = 4;
            int width = 7;
            
            
            GridPane root = new GridPane(); 

            int z = 0;
            

            for(int y = 0; y < length; y++){
                for(int x = 0; x < width; x++){
                	
                    Image img = new Image("pasto.png");
                    
                    if((inventario.getElementosGuardados()[z]).getElementoGuardado() == null) {
                	
                	} else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == HachaDeMadera.class) {
                        img = new Image("Hacha.png");
                	} else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == HachaDeMetal.class) {
                        img = new Image("HachaDeMetal.png");
                	} else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == Madera.class) {
                        img = new Image("madera.png");
                	}
                        
                    ImageView imagen = new ImageView(img);
                    
                    imagen.setPreserveRatio(true);
                    
                    imagen.setFitHeight(50);
                    imagen.setFitWidth(50);
               

                    GridPane.setRowIndex(imagen,y);
                    GridPane.setColumnIndex(imagen,x);   
                    root.getChildren().add(imagen);   
                    z++;
                }
            }
            
            Scene scene = new Scene(root, 650, 450); 
            inventarioStage.setTitle("Inventario");
            inventarioStage.setScene(scene);
            inventarioStage.show();
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