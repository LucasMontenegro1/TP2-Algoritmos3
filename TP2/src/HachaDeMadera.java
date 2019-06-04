
public class HachaDeMadera extends Desgastable {
	
	
	HachaDeMadera(){
		this.durabilidad=100;
		this.fuerza=2;
	}
	
	@Override
	public void usar() {
		durabilidad-= fuerza;
		
	}

}
