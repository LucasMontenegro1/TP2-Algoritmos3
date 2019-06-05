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
	
	
	
	
	/*public int reducirDurabilidad(int durabilidad,int fuerza){
		return (durabilidad - fuerza/2);
	}*/


}
