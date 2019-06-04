
public class PicoDeMetal implements Desgastable {
	int usos;
	
	public PicoDeMetal() {
		this.usos = 0;
	}
	
	@Override
	public int reducirDurabilidad(int durabilidad,int fuerza) {
		usos++;
		if(usos == 10) return 0;
		
		else return durabilidad;
		
	}


}
