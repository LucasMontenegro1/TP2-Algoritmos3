
public interface Desgastable {

	public int reducirDurabilidad(int durabilidad, int fuerza);

	public void usarContra(Piedra unMaterial, int fuerza);

	public void usarContra(Metal unMaterial, int fuerza);

	public void usarContra(Madera unMaterial, int fuerza);


	
}
