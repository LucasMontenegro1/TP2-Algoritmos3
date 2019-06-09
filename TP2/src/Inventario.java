
public class Inventario {

	private static int cantidadDePaquetes = 28;
	private Paquete elementosGuardados[] = new Paquete[cantidadDePaquetes];
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
