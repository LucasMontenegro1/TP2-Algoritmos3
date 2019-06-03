
public class Hacha extends Herramienta {

	Hacha(Madera madera){
		this.durabilidad = 100;
		this.fuerza = 2;
		
	}
	
	 Hacha(Piedra piedra) {
		 this.durabilidad = 200;
		 this.fuerza = 5;
	}

	 Hacha(Metal metal) {
		 this.durabilidad = 400;
		 this.fuerza = 10;
	}
	 

}
