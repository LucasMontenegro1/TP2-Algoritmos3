package Jugador;

import mapa.*;

import java.util.List;

import Herramientas.*;
import Materiales.*;
import Modelo.*;


public class Jugador implements Alocable{
	
	private Inventario inventario = new Inventario();
	//private Mapa mapa;
	private Posicion posicionJugador;
	
	
	//COSAS QUE AGREGO AGUS
	private CodigoDeCrafteo sectorDeCrafteo = new CodigoDeCrafteo();
	private MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
	
	
	//Recibe el indice del lugar del material en el inventario
	//¿Rompe encapsulamiento por tener que saber que numero poner?
	public void agregarMaterialASectorDeCrafteo(int indiceInventario, int posicionEnCodigo) {
		
		//VER QUE PASA SI SE BORRA EN UN PAQUETE VACIO
		Desgastable elemento = inventario.eliminarElemento(indiceInventario);
		
		if (!(elemento instanceof Material)) {
			inventario.agregarHerramienta((Herramienta)elemento);
		}

		sectorDeCrafteo.agregarMaterial(posicionEnCodigo, (Material)elemento);

	}
	
	
	
	private void organizarMateriales(List<Material> materiales) {

		for (Material material : materiales) {
			material.guardarEnInventario(inventario);
		}
		
	}
	
	
	
	public HachaDeMadera craftearHachaDeMadera() {
		
		try {
			return mesaDeCrafteo.craftearHachaDeMadera(sectorDeCrafteo);
		} catch (CodigoDeCrafteoIncorrectoException e) {

			organizarMateriales(sectorDeCrafteo.obtenerMateriales());
			throw new CodigoDeCrafteoIncorrectoException("El codigo introducido es incorrecto");
		
		}

	}
	
	
	public HachaDePiedra craftearHachaDePiedra() {
		
		try {
			return mesaDeCrafteo.craftearHachaDePiedra(sectorDeCrafteo);
		} catch (CodigoDeCrafteoIncorrectoException e) {

			organizarMateriales(sectorDeCrafteo.obtenerMateriales());
			throw new CodigoDeCrafteoIncorrectoException("El codigo introducido es incorrecto");
		
		}

	}


	
	
	public HachaDeMetal craftearHachaDeMetal() {
		
		try {
			return mesaDeCrafteo.craftearHachaDeMetal(sectorDeCrafteo);
		} catch (CodigoDeCrafteoIncorrectoException e) {

			organizarMateriales(sectorDeCrafteo.obtenerMateriales());
			throw new CodigoDeCrafteoIncorrectoException("El codigo introducido es incorrecto");
		
		}

	}
	

	
	public PicoDeMadera craftearPicoDeMadera() {
		
		try {
			return mesaDeCrafteo.craftearPicoDeMadera(sectorDeCrafteo);
		} catch (CodigoDeCrafteoIncorrectoException e) {

			organizarMateriales(sectorDeCrafteo.obtenerMateriales());
			throw new CodigoDeCrafteoIncorrectoException("El codigo introducido es incorrecto");
		
		}

	}
	

	
	public PicoDeMetal craftearPicoDeMetal() {
		
		try {
			return mesaDeCrafteo.craftearPicoDeMetal(sectorDeCrafteo);
		} catch (CodigoDeCrafteoIncorrectoException e) {

			organizarMateriales(sectorDeCrafteo.obtenerMateriales());
			throw new CodigoDeCrafteoIncorrectoException("El codigo introducido es incorrecto");
		
		}

	}
	

	
	//aaaaaaaaaaaaaaaa
	
	public PicoFino craftearPicoFino() {
		
		try {
			return mesaDeCrafteo.craftearPicoFino(sectorDeCrafteo);
		} catch (CodigoDeCrafteoIncorrectoException e) {

			organizarMateriales(sectorDeCrafteo.obtenerMateriales());
			throw new CodigoDeCrafteoIncorrectoException("El codigo introducido es incorrecto");
		
		}

	}
	
	
	public void setPosicion(Posicion posicion) {
		posicionJugador = posicion;
	}
	
	public Posicion getPosicion() {
		return posicionJugador;
	}
		
	/*public void moverArriba() {
		mapa.desplazarJugadorArriba(posicionJugador);
	}
	
	public void moverAbajo() {
		mapa.desplazarJugadorAbajo(posicionJugador);
	}
	
	public void moverDerecha() {
		mapa.desplazarJugadorDerecha(posicionJugador);
	}
	
	public void moverIzquierda() {
		mapa.desplazarJugadorIzquierda(posicionJugador);
	}*/
	
	public void golpearPosicion(Posicion posicionAGolpear, Material material) {
		Herramienta herramienta = inventario.getHerramientaSeleccionada();
		
		if(herramienta == null) {
			throw new noHerramientaException("No tenes Herramientas capo");
		} else {
			herramienta.usar(material, inventario);
		}
	}
	
	
	/*public void golpearArriba() {
		int x = posicionJugador.getFila();
		int y = posicionJugador.getColumna();
		Material material = (Material) mapa.getOcupante(x-1, y);
		Herramienta herramienta = inventario.getHerramientaSeleccionada();
		
		if(herramienta == null) {
			throw new noHerramientaException("No tenes Herramientas capo");
		} else {
			herramienta.usar(material, inventario);
		}
		

		
	}
	
	public void golpearAbajo() {
		int x = posicionJugador.getFila();
		int y = posicionJugador.getColumna();
		Material material = (Material) mapa.getOcupante(x+1, y);
		Herramienta herramienta = inventario.getHerramientaSeleccionada();
		
		if(herramienta == null) {
			throw new noHerramientaException("No tenes Herramientas capo");
		} else {
			herramienta.usar(material, inventario);
		}
		
	}
	
	public void golpearDerecha() {
		int x = posicionJugador.getFila();
		int y = posicionJugador.getColumna();
		Material material = (Material) mapa.getOcupante(x, y+1);
		Herramienta herramienta = inventario.getHerramientaSeleccionada();
		
		if(herramienta == null) {
			throw new noHerramientaException("No tenes Herramientas capo");
		} else {
			herramienta.usar(material, inventario);
		}
		
	}
	
	public void golpearIzquierda() {
		int x = posicionJugador.getFila();
		int y = posicionJugador.getColumna();
		Material material = (Material) mapa.getOcupante(x, y-1);
		Herramienta herramienta = inventario.getHerramientaSeleccionada();
		
		if(herramienta == null) {
			throw new noHerramientaException("No tenes Herramientas capo");
		} else {
			herramienta.usar(material, inventario);
		}
		
	}*/
	
	public void seleccionarSiguienteHerramienta() {
		inventario.cambiarHerramientaSeleccionada();
	}
	
	
	
	public Inventario getInventario(){
		return this.inventario;
	}
	
}
