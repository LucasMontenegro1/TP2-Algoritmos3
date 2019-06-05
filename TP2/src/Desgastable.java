public abstract class Desgastable {
	
	public int durabilidad;
	public int fuerza;

	public abstract void reducirDurabilidad();

	public abstract void usarContra(Piedra piedra);

	public abstract void usarContra(Metal metal);

	public abstract void usarContra(Madera madera);
	
	public abstract void usarContra(Diamante diamante);


	
}
