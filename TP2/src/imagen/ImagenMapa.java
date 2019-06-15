package imagen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import mapa.Mapa;

import Jugador.Jugador;
import Materiales.*;


    public class ImagenMapa extends Application {  
    	
    	private Stage stage;
    	Mapa mapa = new Mapa();

        @Override
        public void start(Stage primaryStage) {
        	
        	this.stage = primaryStage;
        	
        	Button botonMoverArriba = new Button();
        	Button botonMoverAbajo = new Button();
        	Button botonMoverDerecha = new Button();
        	Button botonMoverIzquierda = new Button();
        	botonMoverArriba.setText("Mover Arriba");
        	botonMoverAbajo.setText("Mover Abajo");
        	botonMoverDerecha.setText("Mover Derecha");
        	botonMoverIzquierda.setText("Mover Izquierda");
        	
        	VBox botonesMover = new VBox(botonMoverArriba, botonMoverAbajo, botonMoverDerecha, botonMoverIzquierda);

            Stage secondaryStage = new Stage();
            
            BotonMoverArribaHandler botonMoverArribaHandler = new BotonMoverArribaHandler((Jugador)mapa.getOcupante(7, 7), this);
            BotonMoverAbajoHandler botonMoverAbajoHandler = new BotonMoverAbajoHandler((Jugador)mapa.getOcupante(7, 7), this);
            BotonMoverDerechaHandler botonMoverDerechaHandler = new BotonMoverDerechaHandler((Jugador)mapa.getOcupante(7, 7), this);
            BotonMoverIzquierdaHandler botonMoverIzquierdaHandler = new BotonMoverIzquierdaHandler((Jugador)mapa.getOcupante(7, 7), this);
            botonMoverArriba.setOnAction(botonMoverArribaHandler);
            botonMoverAbajo.setOnAction(botonMoverAbajoHandler);
            botonMoverDerecha.setOnAction(botonMoverDerechaHandler);
            botonMoverIzquierda.setOnAction(botonMoverIzquierdaHandler);
            
            Scene scene = new Scene(botonesMover);
            secondaryStage.setX(1400);
            secondaryStage.setY(400);
            secondaryStage.setScene(scene);
            secondaryStage.show();
            
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
    }