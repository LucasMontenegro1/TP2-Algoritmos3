
public class Pico extends Herramienta {
	 Pico(Madera madera){
		 estado=new PicoDeMadera();
	 }

	 Pico(Metal metal) {
		estado=new PicoDeMetal();
	}
}
