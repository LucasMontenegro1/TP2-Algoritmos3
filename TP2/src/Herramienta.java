
public class Herramienta {
	
	protected Desgastable estado;
	
	
	public int getDurabilidad() {
		return this.estado.getDurabilidad();
	}
	
	public int getFuerza() {
		return this.estado.getFuerza();
	}
}
