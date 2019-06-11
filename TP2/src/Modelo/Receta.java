package Modelo;


//import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;

import Herramientas.Herramienta;
import Materiales.Material;

public class Receta {

	
	private Herramienta herramientaRepresentada;
	
	//Representa el codigo necesario para construir la herramienta
	//clave: posicion de 1 a 9 en la region de construccion
	//dato: material de esa posicion
	private CodigoDeCrafteo codigoDeCrafteo = new CodigoDeCrafteo();

	
	public Receta(Herramienta herramienta){
		herramientaRepresentada = herramienta;
	}

	
	//VER SI HAY QUE AGREGAR CHEQUEO DE QUE LA POSICION SEA UN NUMERO
	//DE 1 A 9
	public void agregarMaterial(int posicion, Material material) {
		codigoDeCrafteo.agregarMaterial(posicion, material);
	}
	
	
	private boolean codigoEsValido(CodigoDeCrafteo codigoDeCrafteo) {
		return this.codigoDeCrafteo.equals(codigoDeCrafteo);
	}
	
	
	
	
	//VER SI HAY QUE SACAR EL RETURN NULL Y BUSCAR UNA MEJOR FORMA DE 
	
	//VER QUE NO SE CRAFTEO EL ELEMENTO
	
	//VER SI HAY Q HACER UNA CLASE CODIGO, PARA NO PASAR EL TREEMAP DIRECTAMENTE
	//Y DAR IDEA DE LA IMPLEMENTACION, EL PROBLEMA CON ESO ES QUE SE TIENE UNA 
	//CLASE QUE SOLO GUARDA DATOS
	public Herramienta obtenerHerramienta(CodigoDeCrafteo codigoDeCrafteo) {
		
		if(codigoEsValido(codigoDeCrafteo)) {
			return herramientaRepresentada;
		}
		
		return null;
		
	}
	
}
