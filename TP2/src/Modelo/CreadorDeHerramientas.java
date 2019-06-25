package Modelo;

import Herramientas.HachaDeMadera;
import Herramientas.HachaDeMetal;
import Herramientas.HachaDePiedra;
import Herramientas.PicoDeMadera;
import Herramientas.PicoDeMetal;
import Herramientas.PicoDePiedra;
import Herramientas.PicoFino;


public class CreadorDeHerramientas {

	
	public HachaDeMadera crearHachaDeMadera() {
		return new HachaDeMadera();
	}
	
	public HachaDePiedra crearHachaDePiedra() {
		return new HachaDePiedra();
	}
	
	public HachaDeMetal crearHachaDeMetal() {
		return new HachaDeMetal();
	}
	
	public PicoDeMadera crearPicoDeMadera() {
		return new PicoDeMadera();
	}
	
	public PicoDePiedra crearPicoDePiedra() {
		return new PicoDePiedra();
	}
	
	public PicoDeMetal crearPicoDeMetal() {
		return new PicoDeMetal();
	}
	
	public PicoFino crearPicoFino() {
		return new PicoFino();
	}
}
