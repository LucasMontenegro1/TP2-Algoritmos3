
public class PicoDePiedra extends Desgastable {

	PicoDePiedra(){
		durabilidad = 200;
		fuerza = 4;
	}
	
	@Override
	public void reducirDurabilidad() {
		durabilidad -= (fuerza/1.5);		
	}

	public void usarContra(Madera madera) {
	}
	
	public void usarContra(Metal metal) {
		metal.recibirDanio(fuerza);
	}
	
	public void usarContra(Piedra piedra) {
		piedra.recibirDanio(fuerza);
	}
	
	public void usarContra(Diamante diamante) {
	}
	/*@Override
	public int reducirDurabilidad(int durabilidad,int fuerza) {
		
		return (int) (durabilidad-fuerza/1.5);
		
	}*/


	
}
