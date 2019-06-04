
public class HachaDePiedra extends Desgastable {

	HachaDePiedra(){
		durabilidad = 200;
		fuerza = 5;
	}
	
	@Override
	public void reducirDurabilidad() {
		durabilidad -= fuerza;		
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
		return (durabilidad - fuerza);
	}*/

	
}
