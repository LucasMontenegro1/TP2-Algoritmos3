package Modelo;


import java.util.ArrayList;
import java.util.List;

import Herramientas.HachaDeMadera;
import Herramientas.HachaDeMetal;
import Herramientas.HachaDePiedra;
import Herramientas.PicoDeMadera;
import Herramientas.PicoDeMetal;
import Herramientas.PicoDePiedra;
import Herramientas.PicoFino;
import Materiales.Madera;
import Materiales.Material;
import Materiales.Metal;
import Materiales.Piedra;


public class MesaDeCrafteo {
	
	private List<Receta> crafteos = new ArrayList<Receta>();
	

	private void agregarMaterialesFormatoPico(Receta recetaPico, Material materialSuperior) {
		
		for (int i = 1; i < 4; i++) {
			recetaPico.agregarMaterial(i, materialSuperior);
		}
		
		for (int i = 5; i < 9; i+=3) {
			recetaPico.agregarMaterial(i, new Madera());
		}
		
		
	}
	
	
	private void agregarMaterialesFormatoHacha(Receta recetaHacha, Material materialSuperior) {
		
		recetaHacha.agregarMaterial(1, materialSuperior);
		recetaHacha.agregarMaterial(2, materialSuperior);
		recetaHacha.agregarMaterial(4, materialSuperior);
		
		for (int i = 5; i < 9; i+=3) {
			recetaHacha.agregarMaterial(i, new Madera());
		}
		
	}
	
	
	
	private void agregarPicoDeMadera() {
		
		Receta recetaPicoDeMadera = new Receta(new PicoDeMadera());
		agregarMaterialesFormatoPico(recetaPicoDeMadera, new Madera());
		agregarReceta(recetaPicoDeMadera);
		
	}
	
	private void agregarPicoDePiedra() {
		
		Receta recetaPicoDePiedra = new Receta(new PicoDePiedra());
		agregarMaterialesFormatoPico(recetaPicoDePiedra, new Piedra());
		agregarReceta(recetaPicoDePiedra);
		
	}	
	
	private void agregarPicoDeMetal() {
		
		Receta recetaPicoDeMetal= new Receta(new PicoDeMetal());
		agregarMaterialesFormatoPico(recetaPicoDeMetal, new Metal());
		agregarReceta(recetaPicoDeMetal);
		
	}
	
	private void agregarPicoFino() {
		
		Receta recetaPicoFino= new Receta(new PicoFino());
		agregarMaterialesFormatoPico(recetaPicoFino, new Metal());
		recetaPicoFino.agregarMaterial(4, new Piedra());
		agregarReceta(recetaPicoFino);
		
	}	
	
	private void agregarHachaDeMadera() {
		
		Receta recetaHachaDeMadera= new Receta(new HachaDeMadera());
		agregarMaterialesFormatoHacha(recetaHachaDeMadera, new Madera());
		agregarReceta(recetaHachaDeMadera);
		
	}	

	private void agregarHachaDePiedra() {
		
		Receta recetaHachaDePiedra= new Receta(new HachaDePiedra());
		agregarMaterialesFormatoHacha(recetaHachaDePiedra, new Piedra());
		agregarReceta(recetaHachaDePiedra);
		
	}
	
	private void agregarHachaDeMetal() {
		
		Receta recetaHachaDeMetal= new Receta(new HachaDeMetal());
		agregarMaterialesFormatoHacha(recetaHachaDeMetal, new Metal());
		agregarReceta(recetaHachaDeMetal);
		
	}	
	
	
	public MesaDeCrafteo() {
		
		agregarHachaDeMadera();
		agregarHachaDePiedra();
		agregarHachaDeMetal();
		agregarPicoDeMadera();
		agregarPicoDePiedra();
		agregarPicoDeMetal();
		agregarPicoFino();
		
	}
	
	
	public void agregarReceta(Receta receta) {
		crafteos.add(receta);
	}
	
	
	
}
