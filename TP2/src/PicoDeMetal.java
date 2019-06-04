
public class PicoDeMetal extends Desgastable {
	
	
	@Override
	public int reducirDurabilidad(int durabilidad,int fuerza) {
		durabilidad -= fuerza/1.5;
		return durabilidad;
	}
}
