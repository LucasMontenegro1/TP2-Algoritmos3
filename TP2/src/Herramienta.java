

public class Herramienta implements Equipable{
	//protected int durabilidad; //vida de la herramienta
	//protected int fuerza; //si le pega a algo, cuanto le desgasta
	protected Desgastable estado;
	
	
	public int getDurabilidad() {
		return estado.durabilidad;
	}
	
	public int getFuerza() {
		return estado.fuerza;
	}
	
	public void usar(Madera unMaterial) {
		estado.reducirDurabilidad();
		estado.usarContra(unMaterial);
	}
	
	public void usar(Metal unMaterial) {
		estado.reducirDurabilidad();
		estado.usarContra(unMaterial);
	}
	
	public void usar(Piedra unMaterial) {
		estado.reducirDurabilidad();
		estado.usarContra(unMaterial);
	}
	
	public void usar(Diamante unMaterial) {
		estado.reducirDurabilidad();
		estado.usarContra(unMaterial);
	}
}
