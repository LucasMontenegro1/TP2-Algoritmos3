
public class HachaDeMadera implements Desgastable {
	
	
	@Override
	public int reducirDurabilidad(int durabilidad,int fuerza) {
		durabilidad -= fuerza;
		return durabilidad;
		
	}

	public void usarContra(Madera madera,int fuerza) {
		madera.recibirDanio(fuerza);
	}



}
