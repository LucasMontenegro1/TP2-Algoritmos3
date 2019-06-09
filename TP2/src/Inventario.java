
public class Inventario {

	private static int cantidadDeStacks = 28;
	public Paquete elementosGuardados[] = new Paquete[cantidadDeStacks];
	private Equipable elementoSeleccionado;

	
	Inventario(){
		Madera madera = new Madera();
		elementosGuardados[0].setGlementoGuadrado(new Hacha(madera));
		elementoSeleccionado=elementosGuardados[0].getGlementoGuadrado();
	}
	
	public void usarElementoSeleccionado() {
		elementoSeleccionado.usar();
	}
	 
	 
}
