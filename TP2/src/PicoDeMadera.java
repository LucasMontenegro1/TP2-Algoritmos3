public class PicoDeMadera extends Desgastable {

	PicoDeMadera(){
		durabilidad = 100;
		fuerza = 2;
	}
	
	@Override
	public void reducirDurabilidad() {
		durabilidad -= fuerza;		
	}

	public void usarContra(Madera madera) {
	}
	
	public void usarContra(Metal metal) {
	}
	
	public void usarContra(Piedra piedra) {
		piedra.recibirDanio(fuerza);
	}
	
	public void usarContra(Diamante diamante) {
	}
	
	
	/*@Override
	public int reducirDurabilidad(int durabilidad, int fuerza) {
		durabilidad -= fuerza;
		return durabilidad;
	}*/


}
