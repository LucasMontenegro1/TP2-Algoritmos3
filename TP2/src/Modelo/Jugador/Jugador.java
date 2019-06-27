package Modelo.Jugador;

import java.util.List;

import Modelo.Crafteo.CodigoDeCrafteo;
import Modelo.Crafteo.CodigoDeCrafteoIncorrectoException;
import Modelo.Crafteo.MesaDeCrafteo;
import Modelo.Herramientas.HachaDeMadera;
import Modelo.Herramientas.HachaDeMetal;
import Modelo.Herramientas.HachaDePiedra;
import Modelo.Herramientas.Herramienta;
import Modelo.Herramientas.PicoDeMadera;
import Modelo.Herramientas.PicoDeMetal;
import Modelo.Herramientas.PicoFino;
import Modelo.Mapa.Alocable;
import Modelo.Mapa.Posicion;
import Modelo.Materiales.Material;


public class Jugador implements Alocable{
	
	private Inventario inventario = new Inventario();
	//private Mapa mapa;
	private Posicion posicionJugador;
	
	
	private CodigoDeCrafteo sectorDeCrafteo = new CodigoDeCrafteo();
	private MesaDeCrafteo mesaDeCrafteo = new MesaDeCrafteo();
	
	
	/*
	public void agregarMaterialASectorDeCrafteo(int indiceInventario, int posicionEnCodigo) {
		
		sectorDeCrafteo.agregarMaterial(posicionEnCodigo, (Material)inventario.eliminarElemento(indiceInventario));

	}
	*/
	
	public void agregarMaterialASectorDeCrafteo(int posicionEnCodigo, Material material) {
		
		inventario.eliminarMaterial(material);
		sectorDeCrafteo.agregarMaterial(posicionEnCodigo, material);

	}
	
	
	
	public void organizarMateriales() {

		List<Material> materiales = sectorDeCrafteo.obtenerMateriales()
;		for (Material material : materiales) {
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
