package imagen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import mapa.Mapa;
import Jugador.Jugador;
import Materiales.*;


    public class ImagenMapa extends Application {  
    	
    	Mapa mapa = new Mapa();

        @Override
        public void start(Stage primaryStage) {

            int length = 9;
            int width = 13;

            GridPane root = new GridPane();   

            for(int y = 0; y < length; y++){
                for(int x = 0; x < width; x++){
                	
                    Image img = new Image("pasto.jpg");
                	
                	if(mapa.getOcupante(y, x).getClass() == Madera.class) {
                        img = new Image("madera.jpg");
                	} else if(mapa.getOcupante(y, x).getClass() == Piedra.class) {
                        img = new Image("piedra.jpg");
                	} else if(mapa.getOcupante(y, x).getClass() == Metal.class) {
                        img = new Image("metal.jpg");
                	} else if(mapa.getOcupante(y, x).getClass() == Diamante.class) {
                        img = new Image("diamante.jpg");
                	} else if(mapa.getOcupante(y, x).getClass() == Jugador.class) {
                        img = new Image("steve.jpg");
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
            primaryStage.setTitle("Random Binary Matrix (JavaFX)");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public static void main(String[] args) {    
            launch(args);
        }    
    }