
public class HachaDeMetal extends Desgastable {
	
	HachaDeMetal(){
		durabilidad = 400;
		fuerza = 10;
	}
	
	@Override
	public void reducirDurabilidad() {
		durabilidad -= (int)(fuerza/2);		
	}

	public void usarContra(Madera madera) {
		madera.recibirDanio(fuerza);
	}
	
	public void usarContra(Metal metal) {
	}
	
	public void usarContra(Piedra piedra) {
	}
	
	public void usarContra(Diamante diamante) {
	}
	
	
	
	
	/*public int reducirDurabilidad(int durabilidad,int fuerza){
		return (durabilidad - fuerza/2);
	}*/


}
