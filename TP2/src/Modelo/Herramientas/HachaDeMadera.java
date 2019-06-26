package Modelo.Herramientas;


public class HachaDeMadera extends Hacha {
	
	public HachaDeMadera(){
		durabilidad=10;
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
