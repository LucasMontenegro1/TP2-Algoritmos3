package Modelo.Crafteo;


import java.util.ArrayList;
import java.util.List;

import Modelo.Herramientas.HachaDeMadera;
import Modelo.Herramientas.HachaDeMetal;
import Modelo.Herramientas.HachaDePiedra;
import Modelo.Herramientas.Herramienta;
import Modelo.Herramientas.PicoDeMadera;
import Modelo.Herramientas.PicoDeMetal;
import Modelo.Herramientas.PicoDePiedra;
import Modelo.Herramientas.PicoFino;
import Modelo.Materiales.Madera;
import Modelo.Materiales.Material;
import Modelo.Materiales.Metal;
import Modelo.Materiales.Piedra;


public class MesaDeCrafteo {
	
	private List<CodigoDeCrafteo> crafteos = new ArrayList<CodigoDeCrafteo>();
	
	private void agregarMaterialesFormatoPico(CodigoDeCrafteo codigoPico, Material materialSuperior) {
		
		for (int i = 1; i < 4; i++) {
			codigoPico.agregarMaterial(i, materialSuperior);
		}
		
		for (int i = 5; i < 9; i+=3) {
			codigoPico.agregarMaterial(i, new Madera());
		}
		
		
	}
	
	
	private void agregarMaterialesFormatoHacha(CodigoDeCrafteo CodigoHacha, Material materialSuperior) {
		
		CodigoHacha.agregarMaterial(1, materialSuperior);
		CodigoHacha.agregarMaterial(2, materialSuperior);
		CodigoHacha.agregarMaterial(4, materialSuperior);
		
		for (int i = 5; i < 9; i+=3) {
			CodigoHacha.agregarMaterial(i, new Madera());
		}
		
	}
	
	
	
	private void agregarPicoDeMadera() {
		
		CodigoDeCrafteo codigoPicoDeMadera = new CodigoDeCrafteo();
		agregarMaterialesFormatoPico(codigoPicoDeMadera, new Madera());
		agregarCodigo(codigoPicoDeMadera);
		
	}
	
	private void agregarPicoDePiedra() {
		
		CodigoDeCrafteo codigoPicoDePiedra = new CodigoDeCrafteo();
		agregarMaterialesFormatoPico(codigoPicoDePiedra, new Piedra());
		agregarCodigo(codigoPicoDePiedra);
		
	}	
	
	private void agregarPicoDeMetal() {
		
		CodigoDeCrafteo codigoPicoDeMetal= new CodigoDeCrafteo();
		agregarMaterialesFormatoPico(codigoPicoDeMetal, new Metal());
		agregarCodigo(codigoPicoDeMetal);
		
	}
	
	private void agregarPicoFino() {
		
		CodigoDeCrafteo codigoPicoFino= new CodigoDeCrafteo();
		agregarMaterialesFormatoPico(codigoPicoFino, new Metal());
		codigoPicoFino.agregarMaterial(4, new Piedra());
		agregarCodigo(codigoPicoFino);
		
	}	
	
	private void agregarHachaDeMadera() {
		
		CodigoDeCrafteo codigoHachaDeMadera= new CodigoDeCrafteo();
		agregarMaterialesFormatoHacha(codigoHachaDeMadera, new Madera());
		agregarCodigo(codigoHachaDeMadera);
		
	}	

	private void agregarHachaDePiedra() {
		
		CodigoDeCrafteo codigoHachaDePiedra= new CodigoDeCrafteo();
		agregarMaterialesFormatoHacha(codigoHachaDePiedra, new Piedra());
		agregarCodigo(codigoHachaDePiedra);
		
	}
	
	private void agregarHachaDeMetal() {
		
		CodigoDeCrafteo codigoHachaDeMetal= new CodigoDeCrafteo();
		agregarMaterialesFormatoHacha(codigoHachaDeMetal, new Metal());
		agregarCodigo(codigoHachaDeMetal);
		
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
	
	
	public void agregarCodigo(CodigoDeCrafteo codigoDeCrafteo) {
		crafteos.add(codigoDeCrafteo);
	}
	

	
	public HachaDeMadera craftearHachaDeMadera(CodigoDeCrafteo codigoDeCrafteo) {
		
		if (crafteos.get(0).equals(codigoDeCrafteo)) {
			return new HachaDeMadera();
		}
		
		throw new CodigoDeCrafteoIncorrectoException("El codigo de crafteo insertado no se encuentra en la mesa de crafteo");
					
	}
	
	public HachaDePiedra craftearHachaDePiedra(CodigoDeCrafteo codigoDeCrafteo) {
		
		if (crafteos.get(1).equals(codigoDeCrafteo)) {
			return new HachaDePiedra();
		}
		
		throw new CodigoDeCrafteoIncorrectoException("El codigo de crafteo insertado no se encuentra en la mesa de crafteo");
				
	}
	

	public HachaDeMetal craftearHachaDeMetal(CodigoDeCrafteo codigoDeCrafteo) {
		
		if (crafteos.get(2).equals(codigoDeCrafteo)) {
			return new HachaDeMetal();
		}
		
		throw new CodigoDeCrafteoIncorrectoException("El codigo de crafteo insertado no se encuentra en la mesa de crafteo");
				
	}

	public PicoDeMadera craftearPicoDeMadera(CodigoDeCrafteo codigoDeCrafteo) {
		
		if (crafteos.get(3).equals(codigoDeCrafteo)) {
			return new PicoDeMadera();
		}
		
		throw new CodigoDeCrafteoIncorrectoException("El codigo de crafteo insertado no se encuentra en la mesa de crafteo");
				
	}

	public PicoDePiedra craftearPicoDePiedra(CodigoDeCrafteo codigoDeCrafteo) {
		
		if (crafteos.get(4).equals(codigoDeCrafteo)) {
			return new PicoDePiedra();
		}
		
		throw new CodigoDeCrafteoIncorrectoException("El codigo de crafteo insertado no se encuentra en la mesa de crafteo");
				
	}

	public PicoDeMetal craftearPicoDeMetal(CodigoDeCrafteo codigoDeCrafteo) {
		
		if (crafteos.get(5).equals(codigoDeCrafteo)) {
			return new PicoDeMetal();
		}
		
		throw new CodigoDeCrafteoIncorrectoException("El codigo de crafteo insertado no se encuentra en la mesa de crafteo");
				
	}

	public PicoFino craftearPicoFino(CodigoDeCrafteo codigoDeCrafteo) {
		
		if (crafteos.get(6).equals(codigoDeCrafteo)) {
			return new PicoFino();
		}
		
		throw new CodigoDeCrafteoIncorrectoException("El codigo de crafteo insertado no se encuentra en la mesa de crafteo");
				
	}

}
