
public class Hacha extends Herramienta {
	

	Hacha(Madera madera){
<<<<<<< HEAD
		this.estado=new HachaDeMadera();
=======
		this.durabilidad = 100;
		this.fuerza = 2;
>>>>>>> 2f7a4d78b1a0ecc2362681e4eafc4aea94a673fd
		
	}
	
	 Hacha(Piedra piedra) {
		 this.durabilidad = 200;
		 this.fuerza = 5;
	}

	 Hacha(Metal metal) {
<<<<<<< HEAD
		this.estado=new HachaDeMetal();
	}
	 
	 public void usar(Madera madera){
		 estado.usar();
	 }
	
	
	
=======
		 this.durabilidad = 400;
		 this.fuerza = 10;
	}
	 

>>>>>>> 2f7a4d78b1a0ecc2362681e4eafc4aea94a673fd
}
