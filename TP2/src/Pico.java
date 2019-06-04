
public class Pico extends Herramienta {
	 Pico(Madera madera){
		
		 estado=new PicoDeMadera();
		 
		 this.durabilidad = 100;
		 this.fuerza = 2;

	 }
	 
	 Pico(Piedra piedra) {
		 
		 estado= new PicoDePiedra();
		 
		 this.durabilidad = 200;
		 this.fuerza = 4;
		 
	}

	 Pico(Metal metal) {

		estado=new PicoDeMetal();
		
		 this.durabilidad = 400;
		 this.fuerza = 12;

	}
	 

}
