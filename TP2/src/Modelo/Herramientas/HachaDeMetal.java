package Modelo.Herramientas;


public class HachaDeMetal extends Hacha {
	
	
	public HachaDeMetal(){
		durabilidad = 400;
		fuerza = 10;
	}

	@Override
	public void desgastar() {
		durabilidad -= (int)(fuerza/2);
	}

	
}
