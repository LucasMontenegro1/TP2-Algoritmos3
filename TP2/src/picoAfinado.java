
public class picoAfinado implements Desgastable {

	@Override
	public int reducirDurabilidad(int durabilidad, int fuerza) {
		durabilidad -= durabilidad * 0.1;
		return durabilidad;
	}	
	

}
