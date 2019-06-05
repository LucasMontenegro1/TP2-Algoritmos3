public class HachaDeMadera extends Desgastable {
	
	HachaDeMadera(){
		durabilidad = 100;
		fuerza = 2;
	}
	
	protected void reducirDurabilidad() {
		durabilidad -= fuerza;		
	}

	public void usarContra(Madera madera) {
		reducirDurabilidad();
		madera.recibirDanio(fuerza);
	}
	
	public void usarContra(Metal metal) {
		reducirDurabilidad();
	}
	
	public void usarContra(Piedra piedra) {
		reducirDurabilidad();
	}

	public void usarContra(Diamante diamante) {
		reducirDurabilidad();
	}

}
