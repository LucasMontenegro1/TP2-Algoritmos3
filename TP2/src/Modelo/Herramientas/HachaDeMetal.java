package Modelo.Herramientas;


public class HachaDeMetal extends Hacha {
	
	
	public HachaDeMetal(){
		durabilidad = 20;
		fuerza = 10;
	}

	@Override
	public void desgastar() {
		durabilidad -= (int)(fuerza/2);
	}


	@Override
	public Herramienta clonar() {
		return new HachaDeMetal();
	}
	
}
