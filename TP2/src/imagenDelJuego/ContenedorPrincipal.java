package imagenDelJuego;

import Jugador.Jugador;
import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import mapa.Mapa;

public class ContenedorPrincipal extends BorderPane {
	Mapa mapa;
	
	public ContenedorPrincipal(Mapa mapa) {
		this.mapa= mapa;
		this.setMapa();
	}

	public void setMapa() {
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
         

         this.setCenter(root);
	}
	
}
