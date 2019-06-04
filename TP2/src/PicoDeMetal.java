
public class PicoDeMetal extends Desgastable {
	
	PicoDeMetal(){
		durabilidad=400;
		fuerza=12;
	}
	
	@Override
	public void usar() {
		durabilidad -= fuerza/1.5;
	}
}
