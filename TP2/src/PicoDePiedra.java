public class PicoDePiedra extends Desgastable {

	PicoDePiedra(){
		durabilidad = 200;
		fuerza = 4;
	}
	
	public void reducirDurabilidad() {
		durabilidad -= (fuerza/1.5);		
	}

	public void usarContra(Madera madera) {
		reducirDurabilidad();
	}
	
	public void usarContra(Metal metal) {
		reducirDurabilidad();
		metal.recibirDanio(fuerza);
	}
	
	public void usarContra(Piedra piedra) {
		reducirDurabilidad();
		piedra.recibirDanio(fuerza);
	}
	
	public void usarContra(Diamante diamante) {
		reducirDurabilidad();
	}

	
}
