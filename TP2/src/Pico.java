public class Pico extends Herramienta {
	 
	Pico(Madera madera){		
		 estado = new PicoDeMadera();
	 }
	 
	 Pico(Piedra piedra) {		 
		 estado = new PicoDePiedra();	 
	}

	 Pico(Metal metal) {
		estado = new PicoDeMetal();
	}
	 

}
