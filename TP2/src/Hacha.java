
public class Hacha extends Herramienta {

	Hacha(Madera madera) {
		this.estado = new HachaDeMadera();
		this.durabilidad = 100;
		this.fuerza = 2;
	}

	Hacha(Piedra piedra) {
		this.estado = new HachaDePiedra();
		this.durabilidad = 200;
		this.fuerza = 5;
	}

	Hacha(Metal metal) {
		this.estado = new HachaDeMetal();
		this.durabilidad = 400;
		this.fuerza = 10;		
	}


}
