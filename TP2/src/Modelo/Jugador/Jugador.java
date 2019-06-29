package Modelo.Jugador;

import java.util.List;

import Modelo.Crafteo.CodigoDeCrafteo;
import Modelo.Crafteo.CodigoDeCrafteoIncorrectoException;
import Modelo.Crafteo.MesaDeCrafteo;
import Modelo.Herramientas.Herramienta;
import Modelo.Mapa.Alocable;
import Modelo.Mapa.Posicion;
import Modelo.Materiales.Material;


public class Jugador implements Alocable{
	
	private Inventario inventario = new Inventario();
	private Posicion posicionJugador;
	
	
	private CodigoDeCrafteo sectorDeCrafteo = new CodigoDeCrafteo();
	private MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
	
	public void agregarMaterialASectorDeCrafteo(int posicionEnCodigo, Material material) {
		
		inventario.eliminarMaterial(material);
		sectorDeCrafteo.agregarMaterial(posicionEnCodigo, material);

	}
	
	
	
	public void organizarMateriales() {

		List<Material> materiales = sectorDeCrafteo.obtenerMateriales(); 
		for (Material material : materiales) {
			material.guardarEnInventario(inventario);
		}
		
	}
	
	
	
	public void craftearHachaDeMadera() {
		
		try {
			inventario.agregarHerramienta(mesaDeCrafteo.craftearHachaDeMadera(sectorDeCrafteo));
			sectorDeCrafteo = new CodigoDeCrafteo();
		} catch (CodigoDeCrafteoIncorrectoException e) {

			organizarMateriales();
			throw new CodigoDeCrafteoIncorrectoException("El codigo introducido es incorrecto");
		
		}

	}
	
	
	public void craftearHachaDePiedra() {
		
		try {
			inventario.agregarHerramienta(mesaDeCrafteo.craftearHachaDePiedra(sectorDeCrafteo));
			sectorDeCrafteo = new CodigoDeCrafteo();
		} catch (CodigoDeCrafteoIncorrectoException e) {

			organizarMateriales();
			throw new CodigoDeCrafteoIncorrectoException("El codigo introducido es incorrecto");
		
		}

	}


	
	
	public void craftearHachaDeMetal() {
		
		try {
			inventario.agregarHerramienta(mesaDeCrafteo.craftearHachaDeMetal(sectorDeCrafteo));
			sectorDeCrafteo = new CodigoDeCrafteo();
		} catch (CodigoDeCrafteoIncorrectoException e) {

			organizarMateriales();
			throw new CodigoDeCrafteoIncorrectoException("El codigo introducido es incorrecto");
		
		}

	}
	

	
	public void craftearPicoDeMadera() {
		
		try {
			inventario.agregarHerramienta(mesaDeCrafteo.craftearPicoDeMadera(sectorDeCrafteo));
			sectorDeCrafteo = new CodigoDeCrafteo();
		} catch (CodigoDeCrafteoIncorrectoException e) {

			organizarMateriales();
			throw new CodigoDeCrafteoIncorrectoException("El codigo introducido es incorrecto");
		
		}

	}
	
	public void craftearPicoDePiedra() {
		
		try {
			inventario.agregarHerramienta(mesaDeCrafteo.craftearPicoDePiedra(sectorDeCrafteo));
			sectorDeCrafteo = new CodigoDeCrafteo();
		} catch (CodigoDeCrafteoIncorrectoException e) {

			organizarMateriales();
			throw new CodigoDeCrafteoIncorrectoException("El codigo introducido es incorrecto");
		
		}

	}
	

	
	public void craftearPicoDeMetal() {
		
		try {
			inventario.agregarHerramienta(mesaDeCrafteo.craftearPicoDeMetal(sectorDeCrafteo));
			sectorDeCrafteo = new CodigoDeCrafteo();
		} catch (CodigoDeCrafteoIncorrectoException e) {

			organizarMateriales();
			throw new CodigoDeCrafteoIncorrectoException("El codigo introducido es incorrecto");
		
		}

	}
	

	
	public void craftearPicoFino() {
		
		try {
			inventario.agregarHerramienta(mesaDeCrafteo.craftearPicoFino(sectorDeCrafteo));
			sectorDeCrafteo = new CodigoDeCrafteo();
		} catch (CodigoDeCrafteoIncorrectoException e) {

			organizarMateriales();
			throw new CodigoDeCrafteoIncorrectoException("El codigo introducido es incorrecto");
		
		}

	}
	
	
	public void setPosicion(Posicion posicion) {
		posicionJugador = posicion;
	}
	
	public Posicion getPosicion() {
		return posicionJugador;
	}
		
	
	public void golpearPosicion(Posicion posicionAGolpear, Material material) {
		Herramienta herramienta = inventario.getHerramientaSeleccionada();
		
		if(herramienta == null) {
			throw new NoHerramientaException("No tenes Herramientas capo");
		} else {
			herramienta.usar(material, inventario);
		}
	}
	
	
	public void seleccionarSiguienteHerramienta() {
		inventario.cambiarHerramientaSeleccionada();
	}
	
	
	
	public Inventario getInventario(){
		return this.inventario;
	}
	
}
