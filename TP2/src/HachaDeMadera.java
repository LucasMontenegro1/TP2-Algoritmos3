
public class HachaDeMadera extends Desgastable {
	
	
	@Override
	public int reducirDurabilidad(int durabilidad,int fuerza) {
		durabilidad-= fuerza;
		return durabilidad;
		
	}

}
