

public class Herramienta implements Equipable{
	protected int durabilidad; //vida de la herramienta
	protected int fuerza; //si le pega a algo, cuanto le desgasta
	protected Desgastable estado;
	
	
	public int getDurabilidad() {
		return this.durabilidad;
	}
	
	public int getFuerza() {
		return this.fuerza;
	}
	
	public void usar(Material unMaterial) {
		durabilidad=estado.reducirDurabilidad(durabilidad, fuerza);
	}
}
