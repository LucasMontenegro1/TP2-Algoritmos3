package Herramientas;

import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;

public class Pico extends Herramienta {
	 
	public Pico(Madera madera){		
		 estado = new PicoDeMadera();
	 }
	 
	public Pico(Piedra piedra) {		 
		 estado = new PicoDePiedra();	 
	}

	public Pico(Metal metal) {
		estado = new PicoDeMetal();
	}
	 
	public Pico(Piedra piedra, Metal metal) {
		estado = new PicoAfinado();
	}

}
