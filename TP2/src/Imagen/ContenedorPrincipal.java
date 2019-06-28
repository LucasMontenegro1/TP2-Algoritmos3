package Imagen;

import java.util.List;
import java.util.ArrayList;

import Controlador.CrafteadorRecetaHandler;
import Controlador.ListaHerramientasHandler;
import Controlador.MesaCrafteoHandler;
import Modelo.Crafteo.CodigoDeCrafteo;
import Modelo.Herramientas.HachaDeMadera;
import Modelo.Herramientas.HachaDeMetal;
import Modelo.Herramientas.HachaDePiedra;
import Modelo.Herramientas.Herramienta;
import Modelo.Herramientas.PicoDeMadera;
import Modelo.Herramientas.PicoDeMetal;
import Modelo.Herramientas.PicoDePiedra;
import Modelo.Herramientas.PicoFino;
import Modelo.Jugador.Inventario;
import Modelo.Jugador.Jugador;
import Modelo.Mapa.Mapa;
import Modelo.Mapa.Posicion;
import Modelo.Materiales.Diamante;
import Modelo.Materiales.Madera;
import Modelo.Materiales.Metal;
import Modelo.Materiales.Piedra;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ContenedorPrincipal extends BorderPane {
	Mapa mapa;
	Inventario inventario;
	Jugador jugador;
	GridPane mesaDeCrafteo;
	GridPane panelMapa;
	
	public ContenedorPrincipal(Mapa mapa) {
		this.mapa= mapa;
		this.inventario= ((Jugador) mapa.getOcupante(7, 7)).getInventario();
		jugador = (Jugador) mapa.getOcupante(7, 7);
		this.setMapa();
		this.setInventario();
		this.setCambiarHerramienta();
		this.setMesaCrafteo();
	
	}
	
	public void actualizarMapa() {
		Posicion actual=jugador.getPosicion();
		int length=actual.getFila();
		int width= actual.getColumna();
		
		for(int y = length-2; y < length+2; y++){
            for(int x = width-2; x < width+2; x++){
            	if(x>=0 &&  x<13 && y>=0 && y<10) {
            		
            	ImageView imagen = (ImageView)getNodo(y,x,panelMapa);	
            		
                Image img = new Image("/ArchivosDelJuego/pasto.png");
            	
            	if(mapa.getOcupante(y, x).getClass() == Madera.class) {
                    img = new Image("/ArchivosDelJuego/maderaBloque.png");
            	} else if(mapa.getOcupante(y, x).getClass() == Piedra.class) {
                    img = new Image("/ArchivosDelJuego/piedraBloque.png");
            	} else if(mapa.getOcupante(y, x).getClass() == Metal.class) {
                    img = new Image("/ArchivosDelJuego/metalBloque.png");
            	} else if(mapa.getOcupante(y, x).getClass() == Diamante.class) {
                    img = new Image("/ArchivosDelJuego/DiamanteBloque.png");
            	} else if(mapa.getOcupante(y, x).getClass() == Jugador.class) {
                    img = new Image("/ArchivosDelJuego/Steve.png");
            	}
                    
            	imagen.setImage(img); 
                
            	}
            }
        }
	}
	
	public void setCambiarHerramienta() {
		
		int durabilidad = 0;
		int fuerza = 0;
		ImageView imagen = new ImageView();
		Text textoDurabilidad = new Text();
        textoDurabilidad.setFont(Font.font("Verdana"));
		textoDurabilidad.setFill(Color.WHITE);
		Image herramientaEquipadaImage = new Image("/ArchivosDelJuego/HerramientaEquipada.png");
		ImageView herramientaEquipada = new ImageView(herramientaEquipadaImage);
		VBox imagenCentrada = new VBox(herramientaEquipada, imagen);
		imagenCentrada.setAlignment(Pos.CENTER);
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
		VBox herramientaSeleccionada = new VBox(imagenCentrada, utilidadTexto, textoDurabilidad, textoFuerza, desgaste, usosTexto);
		herramientaSeleccionada.setPrefWidth(290);

		if(inventario.getHerramientaSeleccionada() != null) {
			
			if(inventario.getHerramientaSeleccionada().getClass()==HachaDeMadera.class) {
				
				imagen.setImage(new Image("/ArchivosDelJuego/Hacha.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: durabilidad - fuerza");
				utilidadTexto.setText("\n\nÚtil contra: madera");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==HachaDeMetal.class) {
				
				imagen.setImage(new Image("/ArchivosDelJuego/HachaDeMetal.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: durabilidad - fuerza/2");
				utilidadTexto.setText("\n\nÚtil contra: madera");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==HachaDePiedra.class) {
				
				imagen.setImage(new Image("/ArchivosDelJuego/HachaDePiedra.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: durabilidad - fuerza");
				utilidadTexto.setText("\n\nÚtil contra: madera");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==PicoDeMadera.class) {
				
				imagen.setImage(new Image("/ArchivosDelJuego/PicoDeMadera.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: durabilidad - fuerza");
				utilidadTexto.setText("\n\nÚtil contra: piedra");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==PicoDeMetal.class) {
				
				imagen.setImage(new Image("/ArchivosDelJuego/PicoDeMetal.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				int usos = ((PicoDeMetal)inventario.getHerramientaSeleccionada()).getUsos();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: se rompe al décimo uso");
				usosTexto.setText("\nUsos: " + Integer.toString(usos));
				utilidadTexto.setText("\n\nÚtil contra: piedra, metal");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==PicoDePiedra.class) {
				
				imagen.setImage(new Image("/ArchivosDelJuego/PicoDePiedra.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: durabilidad - fuerza/1.5");
				utilidadTexto.setText("\n\nÚtil contra: piedra, metal");
				
			}else if(inventario.getHerramientaSeleccionada().getClass()==PicoFino.class) {
				
				imagen.setImage(new Image("/ArchivosDelJuego/PicoFino.png"));
				durabilidad = inventario.getHerramientaSeleccionada().getDurabilidad();
				fuerza = inventario.getHerramientaSeleccionada().getFuerza();
				desgaste.setText("\nDesgaste: se disminuye un 10% su durabilidad");
				utilidadTexto.setText("\n\nÚtil contra: diamante");
				
			}

		} else {
			imagen.setImage(new Image("/ArchivosDelJuego/defaultInventario.png"));
		}
		
		textoDurabilidad.setText("\nDurabilidad: " + Integer.toString(durabilidad));
		textoFuerza.setText("\nFuerza: " + Integer.toString(fuerza));
        herramientaSeleccionada.setBackground(new Background(new BackgroundImage(new Image("/ArchivosDelJuego/fondo.jpg"), null, null, null, null)));
		this.setRight(herramientaSeleccionada);
	}
	


	public void setInventario() {
        int length = 4;
        int width = 7;
        
        
        GridPane panelInventario = new GridPane(); 
        Image tituloInventario = new Image("/ArchivosDelJuego/Inventario.png");
       
        
        Image instrucciones = new Image("/ArchivosDelJuego/Instrucciones.png");
        
        VBox panelIzquierdo = new VBox(new ImageView(tituloInventario), panelInventario,new ImageView(instrucciones));
        panelIzquierdo.setBackground(new Background(new BackgroundImage(new Image("/ArchivosDelJuego/fondo.jpg"), null, null, null, null)));
        Herramienta herramienta = null;
        int contador=0;

        int z = 0;
        

        for(int y = 0; y < length; y++){
            for(int x = 0; x < width; x++){
            	Integer cantidad= new Integer(0);
                Image img = new Image("/ArchivosDelJuego/defaultInventario.png");
                
                if((inventario.getElementosGuardados()[z]).getElementoGuardado() != null) {
                	
                	if ((Herramienta.class).isAssignableFrom(inventario.getElementosGuardados()[z].getElementoGuardado().getClass())) {
                		herramienta = (Herramienta)inventario.getElementosGuardados()[z].getElementoGuardado();      
                		contador=0;
                	}
                	
                	if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == HachaDeMadera.class) {
                		img = new Image("/ArchivosDelJuego/Hacha.png");
                	} else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == HachaDeMetal.class) {
                		img = new Image("/ArchivosDelJuego/HachaDeMetal.png");
                	} else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == HachaDePiedra.class) {
                		img = new Image("/ArchivosDelJuego/HachaDePiedra.png");
                	}else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == Piedra.class) {
            			img = new Image("/ArchivosDelJuego/piedra.png");
                	}else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == Madera.class) {
                		img = new Image("/ArchivosDelJuego/madera.png");
                	} else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == Diamante.class){
                		img = new Image("/ArchivosDelJuego/diamante.png");
                	}else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == Metal.class){
                		img = new Image("/ArchivosDelJuego/Metal.png");
                	}else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == PicoDePiedra.class){
                		img = new Image("/ArchivosDelJuego/PicoDePiedra.png");
                	}else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == PicoDeMetal.class){
                		img = new Image("/ArchivosDelJuego/PicoDeMetal.png");
                	}else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == PicoDeMadera.class){
                		img = new Image("/ArchivosDelJuego/PicoDeMadera.png");
                	}else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == PicoFino.class){
                		img = new Image("/ArchivosDelJuego/PicoFino.png");
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
	     int length = 10;
         int width = 13;
         
         
         panelMapa = new GridPane();  
         

         for(int y = 0; y < length; y++){
             for(int x = 0; x < width; x++){
             	
                 Image img = new Image("/ArchivosDelJuego/pasto.png");
             	
             	if(mapa.getOcupante(y, x).getClass() == Madera.class) {
                     img = new Image("/ArchivosDelJuego/maderaBloque.png");
             	} else if(mapa.getOcupante(y, x).getClass() == Piedra.class) {
                     img = new Image("/ArchivosDelJuego/piedraBloque.png");
             	} else if(mapa.getOcupante(y, x).getClass() == Metal.class) {
                     img = new Image("/ArchivosDelJuego/metalBloque.png");
             	} else if(mapa.getOcupante(y, x).getClass() == Diamante.class) {
                     img = new Image("/ArchivosDelJuego/DiamanteBloque.png");
             	} else if(mapa.getOcupante(y, x).getClass() == Jugador.class) {
                     img = new Image("/ArchivosDelJuego/Steve.png");
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
         
         panelMapa.setBackground(new Background(new BackgroundImage(new Image("/ArchivosDelJuego/fondo.jpg"), null, null, null, null)));

         this.setCenter(panelMapa);
	}
	
	public ObservableList<String> getListaMaterialesDisponibles() {
        List<String> materiales = new ArrayList<>();
        
        for (int z = 0; z < 28; z++) {
        	
        	if((inventario.getElementosGuardados()[z]).getElementoGuardado() != null) {
             	
             	if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == Madera.class) {
             		materiales.add("Madera");
             	} else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == Piedra.class) {
             		materiales.add("Piedra");
             	} else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == Metal.class) {
             		materiales.add("Metal");
             	}else if((inventario.getElementosGuardados()[z]).getElementoGuardado().getClass() == Diamante.class) {
             		materiales.add("Diamante");
             	}
        	} 
            
        }
        
		ObservableList<String> listaMateriales = FXCollections.observableList(materiales);
		
		return listaMateriales;
	}
	
	public void actualizarListaMaterialesDisponibles() {
 		ObservableList<String> listaMateriales = getListaMaterialesDisponibles();
 		
         for(int y = 0; y < 3; y++){
             for(int x = 0; x < 3; x++){
                Button boton = (Button)getNodo(y,x,mesaDeCrafteo);
                ((MesaCrafteoHandler)boton.getOnAction()).actualizarListaMateriales(listaMateriales);
             }
         }
	}
	
	public Node getNodo (final int fila, final int columna, GridPane gridPane) {
	    Node resultado = null;
	    ObservableList<Node> childrens = gridPane.getChildren();

	    for (Node node : childrens) {
	        if(GridPane.getRowIndex(node) == fila && GridPane.getColumnIndex(node) == columna) {
	            resultado = node;
	            break;
	        }
	    }

	    return resultado;
	}
	
	public void setMesaCrafteo() {
         
        GridPane mesa = new GridPane();  
        this.mesaDeCrafteo = mesa;
        mesa.setAlignment(Pos.CENTER);
        Button botonCraftear = new Button();
        botonCraftear.setText("CRAFTEAR");
        Button listaHerramientas = new Button();
        listaHerramientas.setText("Elija Herramienta");
        listaHerramientas.setOnAction(new ListaHerramientasHandler(listaHerramientas));
        VBox mesaDeCrafteo = new VBox(mesa, botonCraftear, listaHerramientas);
        botonCraftear.setOnAction(new CrafteadorRecetaHandler(jugador, this, listaHerramientas));
         
 		ObservableList<String> listaMateriales = getListaMaterialesDisponibles();
         
 		int contadorPosicionMesa = 1;
 		
         for(int y = 0; y < 3; y++){
             for(int x = 0; x < 3; x++){
             	
                Button agregarMaterial = new Button();
                agregarMaterial.setText("Material");
                agregarMaterial.setPrefSize(80,50);
                agregarMaterial.setOnAction(new MesaCrafteoHandler(listaMateriales, agregarMaterial, contadorPosicionMesa, jugador, this));
                
                contadorPosicionMesa++;
                 

                GridPane.setRowIndex(agregarMaterial,y);
                GridPane.setColumnIndex(agregarMaterial,x);   
                mesa.getChildren().add(agregarMaterial);   
             }
         }
         
         mesaDeCrafteo.setBackground(new Background(new BackgroundImage(new Image("/ArchivosDelJuego/fondo.jpg"), null, null, null, null)));

         this.setBottom(mesaDeCrafteo);
	
	}
	

	
	
	
}
