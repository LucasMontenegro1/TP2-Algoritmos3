
public class PicoDePiedra extends Desgastable {

	
	@Override
	public int reducirDurabilidad(int durabilidad,int fuerza) {
		
		return (int) (durabilidad-fuerza/1.5);
		
	}
	
}
