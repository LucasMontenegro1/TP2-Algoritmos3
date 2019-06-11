package Herramientas;


public class HachaDeMadera extends Hacha {
	
	public HachaDeMadera(){
		durabilidad=100;
		fuerza=2;
	}

	@Override
	public void desgastar() {
		durabilidad-=fuerza;
	}

	
	@Override
	public Herramienta clonar() {
		return new HachaDeMadera();
	}
	
}
