
public class PicoDeMadera extends Desgastable {
	
	PicoDeMadera(){
		this.durabilidad=100;
		this.fuerza=2;
	}
	
	@Override
	public void usar() {
		durabilidad-= fuerza;
		
	}
}
