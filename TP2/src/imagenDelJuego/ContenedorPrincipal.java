package imagenDelJuego;

import Herramientas.*;
import Jugador.Inventario;
import Jugador.Jugador;
import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
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
        textoDurabilidad.setFont(Font.font("Verdana"));
		textoDurabilidad.setFill(Color.WHITE);
		Image herramientaEquipadaImage = new Image("HerramientaEquipada.png");
		Text textoFuerza = new Text();
        textoFuerza.setFont(Font.font("Verdana"));
		textoFuerza.setFill(Color.WHITE);
		Text desgaste = new Text();
        desgaste.setFont(Font.font("Verdana"));
		desgaste.setFill(Color.WHITE);
		Text utilidadTexto = new Text();
        utilidadTexto.setFont(Font.font("Verdana"));
		utilidadTexto.setFill(Color.WHITE);
		Text usosTexto = new Text (); // solo lo usamos para el pico de metal
        usosTexto.setFont(Font.font("Verdana"));
		usosTexto.setFill(Color.WHITE);
		VBox herramientaSeleccionada = new VBox(new ImageView(herramientaEquipadaImage), imagen, utilidadTexto, textoDurabilidad, textoFuerza, desgaste, usosTexto);
		herramientaSeleccionada.setPrefWidth(250);

		if(inventario.getHerramientaSeleccionada() != null) {
			
			if(inventario.getHerramientaSeleccionada().getClass()==HachaDeMadera.class) {
				
				imagen.setImage(new Image("Hacha.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: durabilidad - fuerza");
				utilidadTexto.setText("\n\nÚtil contra: madera");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==HachaDeMetal.class) {
				
				imagen.setImage(new Image("HachaDeMetal.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: durabilidad - fuerza/2");
				utilidadTexto.setText("\n\nÚtil contra: madera");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==HachaDePiedra.class) {
				
				imagen.setImage(new Image("HachaDePiedra.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: durabilidad - fuerza");
				utilidadTexto.setText("\n\nÚtil contra: madera");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==PicoDeMadera.class) {
				
				imagen.setImage(new Image("PicoDeMadera.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: durabilidad - fuerza");
				utilidadTexto.setText("\n\nÚtil contra: piedra");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==PicoDeMetal.class) {
				
				imagen.setImage(new Image("PicoDeMetal.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				int usos = ((PicoDeMetal)inventario.getHerramientaSeleccionada()).getUsos();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: se rompe al décimo uso");
				usosTexto.setText("\nUsos: " + Integer.toString(usos));
				utilidadTexto.setText("\n\nÚtil contra: piedra, metal");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==PicoDePiedra.class) {
				
				imagen.setImage(new Image("PicoDePiedra.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: durabilidad - fuerza/1.5");
				utilidadTexto.setText("\n\nÚtil contra: piedra, metal");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==PicoFino.class) {
				
				imagen.setImage(new Image("PicoFino.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: se disminuye un 10% su durabilidad");
				utilidadTexto.setText("\n\nÚtil contra: diamante");
				
			}

		} else {
			imagen.setImage(new Image("defaultInventario.png"));
		}
		
		textoDurabilidad.setText("\nDurabilidad: " + Integer.toString(durabilidad));
		textoFuerza.setText("\nFuerza: " + Integer.toString(fuerza));
        herramientaSeleccionada.setBackground(new Background(new BackgroundImage(new Image("fondo.jpg"), null, null, null, null)));
		this.setRight(herramientaSeleccionada);
	}
	


	public void setInventario() {
        int length = 4;
        int width = 7;
        
        
        GridPane panelInventario = new GridPane(); 
        Image tituloInventario = new Image("Inventario.png");
       
        /*
        Text movimiento = new Text();
        movimiento.setFont(Font.font("Verdana"));
        movimiento.setFill(Color.WHITE);
        Text golpear = new Text();
        golpear.setFont(Font.font("Verdana"));
        golpear.setFill(Color.WHITE);
        Text cambiarHerramienta = new Text();
        cambiarHerramienta.setFont(Font.font("Verdana"));
        cambiarHerramienta.setFill(Color.WHITE);
        cambiarHerramienta.setText("\nCambiar Herramienta:   P");
        movimiento.setText("Movimiento:                  ↑\n "
        		+ "                                  W\n"
        		+ "			    ← A  S  D  →\n"
        		+ "                                    ↓");
        golpear.setText("\nGopear:            ↑\n "
        		+ "                       I\n"
        		+ "                 ← J  K  L  →\n"
        		+ "                        ↓");
        
        */
        
        Image instrucciones = new Image("Instrucciones.png");
        
        VBox panelIzquierdo = new VBox(new ImageView(tituloInventario), panelInventario,new ImageView(instrucciones));
        panelIzquierdo.setBackground(new Background(new BackgroundImage(new Image("fondo.jpg"), null, null, null, null)));
        Herramienta herramienta = null;
        int contador=0;

        int z = 0;
        

        for(int y = 0; y < length; y++){
            for(int x = 0; x < width; x++){
            	Integer cantidad= new Integer(0);
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
                	
                    cantidad=(inventario.getElementosGuardados()[z]).getCantidadElementos();
                } 
                 
                ImageView imagen = new ImageView(img);
                HBox caja = new HBox(imagen);
                Text textoInventario=new Text(cantidad.toString());
                textoInventario.setFill(Color.WHITE);
                //Label cantidadEnInventario= new Label(cantidad.toString());
                //cantidadEnInventario.setFont(Font.font("Verdana"));
                
                
                caja.getChildren().add(textoInventario);
                
                
                
                if (contador==0 && herramienta == inventario.getHerramientaSeleccionada()) {
                	BackgroundFill background_fill = new BackgroundFill(Color.DARKGRAY,CornerRadii.EMPTY, Insets.EMPTY);
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
         
         
         GridPane panelMapa = new GridPane();  
         

         for(int y = 0; y < length; y++){
             for(int x = 0; x < width; x++){
             	
                 Image img = new Image("pasto.png");
             	
             	if(mapa.getOcupante(y, x).getClass() == Madera.class) {
                     img = new Image("maderaBloque.png");
             	} else if(mapa.getOcupante(y, x).getClass() == Piedra.class) {
                     img = new Image("piedraBloque.png");
             	} else if(mapa.getOcupante(y, x).getClass() == Metal.class) {
                     img = new Image("metalBloque.png");
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
                 panelMapa.getChildren().add(imagen);   
             }
         }
         
         panelMapa.setBackground(new Background(new BackgroundImage(new Image("fondo.jpg"), null, null, null, null)));

         this.setCenter(panelMapa);
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
