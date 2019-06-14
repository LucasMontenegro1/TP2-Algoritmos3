package imagen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;    


    public class ImagenMapa extends Application {    

        @Override
        public void start(Stage primaryStage) {

            int length = 9;
            int width = 13;

            GridPane root = new GridPane();   

            for(int y = 0; y < length; y++){
                for(int x = 0; x < width; x++){
                	
                    Image img = new Image("pasto.jpg");
                	
                	if(y == 3 && x == 5) {
                        img = new Image("diamante.jpg");
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