public abstract class Herramienta implements Equipable{
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
		estado.usarContra(unMaterial);
	}
	
	public void usar(Metal unMaterial) {
		estado.usarContra(unMaterial);
	}
	
	public void usar(Piedra unMaterial) {
		estado.usarContra(unMaterial);
	}
	
	public void usar(Diamante unMaterial) {
		estado.usarContra(unMaterial);
	}
	
	//FIJARSE QUE HACER CON ESTE METODO, SE AGREGO 
		//PARA VER SI ANDA TRAVIS
	public void usar(){

	}
	
	
}
