
public class PicoDeMadera implements Desgastable {

	
	@Override
	public int reducirDurabilidad(int durabilidad, int fuerza) {
		durabilidad-= fuerza;
		return durabilidad;
	}


}
