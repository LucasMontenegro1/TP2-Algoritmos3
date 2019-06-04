
public class Hacha extends Herramienta {
	

	Hacha(Madera madera){
		this.estado=new HachaDeMadera();
		
	}

	 Hacha(Metal metal) {
		this.estado=new HachaDeMetal();
	}
	 
	 public void usar(Madera madera){
		 estado.usar();
	 }
	
	
	
}
