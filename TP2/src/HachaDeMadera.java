
public class HachaDeMadera extends Desgastable {
	
	HachaDeMadera(){
		durabilidad = 100;
		fuerza = 2;
	}
	
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

}
