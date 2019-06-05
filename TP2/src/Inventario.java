
public class Inventario {

	private static int cantidadDeStacks = 28;
	private Equipable elementosGuardados[] = new Equipable[cantidadDeStacks];
	private Equipable elementoSeleccionado;

	
	Inventario(){
		
		elementosGuardados[0]=new Hacha(new Madera());
		elementoSeleccionado=elementosGuardados[0];
	}
	
	public void usarElementoSeleccionado() {
		elementoSeleccionado.usar();
	}
	 
	 
}
