
<<<<<<< HEAD
public class Herramienta {
	
	protected Desgastable estado;
	
=======
public class Herramienta implements Equipable{
	protected int durabilidad; //vida de la herramienta
	protected int fuerza; //si le pega a algo, cuanto le desgasta
>>>>>>> 2f7a4d78b1a0ecc2362681e4eafc4aea94a673fd
	
	public int getDurabilidad() {
		return this.estado.getDurabilidad();
	}
	
	public int getFuerza() {
		return this.estado.getFuerza();
	}
}
