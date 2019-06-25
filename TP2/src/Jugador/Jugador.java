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
	
	
	public Herramienta craftear() {
		
		try {
			
			return mesaDeCrafteo.craftear(sectorDeCrafteo);
			
		} catch (CodigoDeCrafteoInexistenteException e) {

			List<Material> materialesPosicionados = sectorDeCrafteo.obtenerMateriales();
			
			for (Material material : materialesPosicionados) {
				material.guardarEnInventario(inventario);
			}
			
			//Esta bien dejar null? o conviene tirar otra excepcion?
			return null;
			
		}
		
		
	}
	
	
	//TERMINAN COSAS QUE AGREGO AGUS
	
	
	
	/*public Jugador(Mapa mapa) {
		this.mapa = mapa;
	}*/
	
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
