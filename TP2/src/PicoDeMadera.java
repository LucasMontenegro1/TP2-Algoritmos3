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
		reducirDurabilidad();
	}
	
	public void usarContra(Metal metal) {
		reducirDurabilidad();
	}
	
	public void usarContra(Piedra piedra) {
		reducirDurabilidad();
		piedra.recibirDanio(fuerza);
	}
	
	public void usarContra(Diamante diamante) {
		reducirDurabilidad();
	}
	
	
	/*@Override
	public int reducirDurabilidad(int durabilidad, int fuerza) {
		durabilidad -= fuerza;
		return durabilidad;
	}*/


}
