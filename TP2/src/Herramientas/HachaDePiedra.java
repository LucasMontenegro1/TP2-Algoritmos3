package Herramientas;

import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;

public class HachaDePiedra extends Desgastable {

	HachaDePiedra(){
		durabilidad = 200;
		fuerza = 5;
	}
	
	@Override
	public void reducirDurabilidad() {
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
	
	
	
	
	
	/*public int reducirDurabilidad(int durabilidad,int fuerza){
		return (durabilidad - fuerza);
	}*/

	
}
