
public class Inventario {

	private static int cantidadDeStacks=28;
	private Equipable elementosGuardados[]= new Equipable[cantidadDeStacks];
	private Equipable elementoSeleccionado;

	
	public void usarElementoSeleccionado() {
		elementoSeleccionado.usar();
	}
	
	
}
