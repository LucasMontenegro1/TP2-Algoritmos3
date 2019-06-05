public class PicoAfinado extends Desgastable {

	
	PicoAfinado(){
		durabilidad = 1000;
		fuerza = 20;
	}
	
	@Override
	public void reducirDurabilidad() {
		durabilidad -= durabilidad * 0.1;
	}

	public void usarContra(Madera madera) {
	}
	
	public void usarContra(Metal metal) {
	}
	
	public void usarContra(Piedra piedra) {
	}
	
	public void usarContra(Diamante diamante) {
		reducirDurabilidad();
		diamante.recibirDanio(fuerza);
	}
	/*
	@Override
	public int reducirDurabilidad(int durabilidad, int fuerza) {
		durabilidad -= durabilidad * 0.1;
		return durabilidad;
	}	
	*/

}
