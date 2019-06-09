
public class Inventario {

    private static int cantidadDePaquetes = 28;
    private Paquete elementosGuardados[] = new Paquete[cantidadDePaquetes];
    private Equipable elementoSeleccionado;


    Inventario(){
        Madera madera = new Madera();
        getElementosGuardados()[0].setElementoGuardado(new Hacha(madera));
        elementoSeleccionado = getElementosGuardados()[0].getElementoGuardado();
    }

    public void usarElementoSeleccionado() {
        elementoSeleccionado.usar();
    }

    public Paquete[] getElementosGuardados() {
        return elementosGuardados;
    }

    public void setElementosGuardados(Paquete elementosGuardados[]) {
        this.elementosGuardados = elementosGuardados;
    }


}