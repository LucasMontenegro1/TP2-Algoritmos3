
public class Inventario {

	private static int cantidadDeStacks = 28;
	public Equipable elementosGuardados[] = new Equipable[cantidadDeStacks];
	private Equipable elementoSeleccionado;

	
	Inventario(){
		Madera madera = new Madera();
		elementosGuardados[0] = new Hacha(madera);
		elementoSeleccionado=elementosGuardados[0];
	}
	
	public void usarElementoSeleccionado() {
		elementoSeleccionado.usar();
	}
	 
	 
}
