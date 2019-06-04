

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
	
	public void usar(Madera unMaterial) {
		durabilidad=estado.reducirDurabilidad(durabilidad, fuerza);
		//estado.usarContra(unMaterial,this.fuerza);
	}
	
	public void usar(Metal unMaterial) {
		durabilidad=estado.reducirDurabilidad(durabilidad, fuerza);
		//estado.usarContra(unMaterial,this.fuerza);
	}
	
	public void usar(Piedra unMaterial) {
		durabilidad=estado.reducirDurabilidad(durabilidad, fuerza);
		//estado.usarContra(unMaterial,this.fuerza);
	}
	
	public void usar(Diamante unMaterial) {
		durabilidad=estado.reducirDurabilidad(durabilidad, fuerza);
		//estado.usarContra(unMaterial,this.fuerza);
	}
}
