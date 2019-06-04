
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
	}
	
	public void usarContra(Metal metal) {
		metal.recibirDanio(fuerza);
	}
	
	public void usarContra(Piedra piedra) {
		piedra.recibirDanio(fuerza);
	}
	
	public void usarContra(Diamante diamante) {
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
