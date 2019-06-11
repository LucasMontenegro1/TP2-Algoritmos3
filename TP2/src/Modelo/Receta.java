package Modelo;


//import java.util.SortedMap;
import java.util.TreeMap;

import Herramientas.Herramienta;
import Materiales.Material;

public class Receta {

	
	private Herramienta herramientaRepresentada;
	private TreeMap<Integer, Material> codigoDeCrafteo = new TreeMap<>();

	public bool codigoEsValido(TreeMap<Integer, Material> codigoDeCrafteo) {
		
		
		if(this.codigoDeCrafteo.size() != codigoDeCrafteo.size()) {
			return false;
		}
		
		
		
		
		
	}
	
}
