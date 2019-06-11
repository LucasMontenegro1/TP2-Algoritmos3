package Herramientas;

import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;

public abstract class Desgastable {
	
	public int durabilidad;
	public int fuerza;

	protected abstract void reducirDurabilidad();

	public abstract void usarContra(Piedra piedra);

	public abstract void usarContra(Metal metal);

	public abstract void usarContra(Madera madera);
	
	public abstract void usarContra(Diamante diamante);


	
}
