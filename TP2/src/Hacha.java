public class Hacha extends Herramienta {

	Hacha(Madera madera) {
		this.estado = new HachaDeMadera();
	}

	Hacha(Piedra piedra) {
		this.estado = new HachaDePiedra();
	}

	Hacha(Metal metal) {
		this.estado = new HachaDeMetal();		
	}


}
