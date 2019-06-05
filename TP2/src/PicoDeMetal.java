public class PicoDeMetal extends Desgastable {
	int usos;
	
	PicoDeMetal(){
		durabilidad = 400;
		fuerza = 12;
		usos = 0;
	}
	
	@Override
	public void reducirDurabilidad() {
		usos++;
		if(usos == 10) {
			durabilidad = 0;
		}
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
	
	
	/*
	public PicoDeMetal() {
		this.usos = 0;
	}
	
	@Override
	public int reducirDurabilidad(int durabilidad,int fuerza) {
		usos++;
		if(usos == 10) return 0;
		
		else return durabilidad;
		
	}
*/

}
