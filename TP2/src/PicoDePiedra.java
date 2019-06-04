
public class PicoDePiedra implements Desgastable {

	
	@Override
	public int reducirDurabilidad(int durabilidad,int fuerza) {
		
		return (int) (durabilidad-fuerza/1.5);
		
	}


	
}
