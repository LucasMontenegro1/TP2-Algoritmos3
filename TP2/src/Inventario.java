
public class Inventario {

	private static int cantidadDeStacks = 28;
	private Paquete elementosGuardados[] = new Paquete[cantidadDeStacks];
	private Equipable elementoSeleccionado;

	
	Inventario(){
		Madera madera = new Madera();
		elementosGuardados[0].setElementoGuardado(new Hacha(madera));
		elementoSeleccionado=elementosGuardados[0].getElementoGuardado();
	}
	
	public void usarElementoSeleccionado() {
		elementoSeleccionado.usar();
	}
	 
	 
}
