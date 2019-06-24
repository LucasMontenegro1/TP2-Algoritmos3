package imagenDelJuego;

import Herramientas.*;
import Jugador.Inventario;
import Jugador.Jugador;
import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;
import javafx.geometry.Insets;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.util.Duration;
import junit.framework.Test;
import mapa.Mapa;

public class ContenedorPrincipal extends BorderPane {
	Mapa mapa;
	Inventario inventario;
	MediaPlayer mp;
	
	public ContenedorPrincipal(Mapa mapa) {
		this.mapa= mapa;
		this.inventario= ((Jugador) mapa.getOcupante(7, 7)).getInventario();
		this.setMapa();
		this.setInventario();
		this.ponerMusica();
		this.setCambiarHerramienta();
	
	}
	
	
	public void setCambiarHerramienta() {
		
		int durabilidad = 0;
		int fuerza = 0;
		ImageView imagen = new ImageView();
		Text textoDurabilidad = new Text();
		Text textoFuerza = new Text();
		Text desgaste = new Text();
		Text utilidadTexto = new Text();
		Text usosTexto = new Text (); // solo lo usamos para el pico de metal
		VBox herramientaSeleccionada = new VBox(imagen, utilidadTexto, textoDurabilidad, textoFuerza, desgaste, usosTexto);
		herramientaSeleccionada.setPrefWidth(250);

		if(inventario.getHerramientaSeleccionada() != null) {
			
			if(inventario.getHerramientaSeleccionada().getClass()==HachaDeMadera.class) {
				
				imagen.setImage(new Image("Hacha.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: durabilidad - fuerza");
				utilidadTexto.setText("\nÚtil contra: madera");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==HachaDeMetal.class) {
				
				imagen.setImage(new Image("HachaDeMetal.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: durabilidad - fuerza/2");
				utilidadTexto.setText("\nÚtil contra: madera");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==HachaDePiedra.class) {
				
				imagen.setImage(new Image("HachaDePiedra.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: durabilidad - fuerza");
				utilidadTexto.setText("\nÚtil contra: madera");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==PicoDeMadera.class) {
				
				imagen.setImage(new Image("PicoDeMadera.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: durabilidad - fuerza");
				utilidadTexto.setText("\nÚtil contra: piedra");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==PicoDeMetal.class) {
				
				imagen.setImage(new Image("PicoDeMetal.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				int usos = ((PicoDeMetal)inventario.getHerramientaSeleccionada()).getUsos();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: se rompe al décimo uso");
				usosTexto.setText("\nUsos: " + Integer.toString(usos));
				utilidadTexto.setText("\nÚtil contra: piedra, metal");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==PicoDePiedra.class) {
				
				imagen.setImage(new Image("PicoDePiedra.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: durabilidad - fuerza/1.5");
				utilidadTexto.setText("\nÚtil contra: piedra, metal");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==PicoFino.class) {
				
				imagen.setImage(new Image("PicoFino.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: se disminuye un 10% su durabilidad");
				utilidadTexto.setText("\nÚtil contra: diamante");
				
			}

		} else {
			imagen.setImage(new Image("defaultInventario.png"));
		}
		
		textoDurabilidad.setText("\nDurabilidad: " + Integer.toString(durabilidad));
		textoFuerza.setText("\nFuerza: " + Integer.toString(fuerza));
		this.setRight(herramientaSeleccionada);
	}
	


	public void setInventario() {
        int length = 4;
        int width = 7;
        
        
        GridPane panelInventario = new GridPane(); 
        Text movimiento = new Text();
        Text golpear = new Text();
        Text cambiarHerramienta = new Text();
        cambiarHerramienta.setText("\nCambiar Herramienta:   P");
        movimiento.setText("Movimiento:                 ↑\n "
        		+ "                                   W\n"
        		+ "			    ← A  S  D  →\n"
        		+ "                                     ↓");
        golpear.setText("\nGopear:            ↑\n "
        		+ "                        I\n"
        		+ "                 ← J  K  L  →\n"
        		+ "                         ↓");
        VBox panelIzquierdo = new VBox(panelInventario, movimiento, golpear, cambiarHerramienta);
        Herramienta herramienta = null;
        int contador=0;

        int z = 0;
        

        for(int y = 0; y < length; y++){
            for(int x = 0; x < width; x++){
            	
                Image img = new Image("defaultInventario.png");
                
                if((inventario.getElementosGuardados()[z]).getElementoGuardado() != null) {
                	
                	if ((Herramienta.class).isAssignableFrom(inventario.getElementosGuardados()[z].getElementoGuardado().getClass())) {
                		herramienta = (Herramienta)inventario.getElementosGuardados()[z].getElementoGuardado();      
                		contador=0;
                	}
                	
                	if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == HachaDeMadera.class) {
                		img = new Image("Hacha.png");
                	} else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == HachaDeMetal.class) {
                		img = new Image("HachaDeMetal.png");
                	} else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == HachaDePiedra.class) {
                		img = new Image("HachaDePiedra.png");
                	}else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == Piedra.class) {
            			img = new Image("piedra.png");
                	}else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == Madera.class) {
                		img = new Image("madera.png");
                	} else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == Diamante.class){
                		img = new Image("diamante.png");
                	}else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == Metal.class){
                		img = new Image("Metal.png");
                	}else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == PicoDePiedra.class){
                		img = new Image("PicoDePiedra.png");
                	}else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == PicoDeMetal.class){
                		img = new Image("PicoDeMetal.png");
                	}else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == PicoDeMadera.class){
                		img = new Image("PicoDeMadera.png");
                	}else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == PicoFino.class){
                		img = new Image("PicoFino.png");
                	}

                } 
                    
                ImageView imagen = new ImageView(img);
                HBox caja= new HBox(imagen);
                
                if (contador==0 && herramienta == inventario.getHerramientaSeleccionada()) {
                	BackgroundFill background_fill = new BackgroundFill(Color.PINK,CornerRadii.EMPTY, Insets.EMPTY);
                    Background background = new Background(background_fill); 
                    caja.setBackground(background); 
                    contador+=1;
                	 
                }
       
                
       
           
                caja.setPadding(new Insets(5));
                imagen.setPreserveRatio(true);
                
                
                imagen.setFitHeight(50);
                imagen.setFitWidth(50);
                
               
                GridPane.setRowIndex(caja,y);
                GridPane.setColumnIndex(caja,x);   
                panelInventario.getChildren().add(caja);   
                z++;
            }
        }
    	
        panelInventario.setPadding(new Insets(15));
        this.setLeft(panelIzquierdo);
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
