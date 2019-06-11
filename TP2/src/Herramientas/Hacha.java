package Herramientas;

import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;

public class Hacha extends Herramienta {

	public Hacha(Madera madera) {
		this.estado = new HachaDeMadera();
	}

	public Hacha(Piedra piedra) {
		this.estado = new HachaDePiedra();
	}

	public Hacha(Metal metal) {
		this.estado = new HachaDeMetal();		
	}


}
