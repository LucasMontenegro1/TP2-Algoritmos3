package Modelo.Herramientas;


public class HachaDePiedra extends Hacha {
	
	public HachaDePiedra(){
		durabilidad = 200;
		fuerza = 5;
	}
	
	@Override
	public void desgastar() {
			durabilidad -= fuerza;		
		}

	@Override
	public Herramienta clonar() {
		return new HachaDePiedra();
	}
	
}
