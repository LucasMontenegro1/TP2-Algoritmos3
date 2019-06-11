package Modelo;

public class Posicion {

	//Ver si es mejor hacer que tenga una clase de estado
	//para el tipo de movimiento, porque los materiales pueden
	//llegar a tener posicion y no se moverian (se  puede probar
	//tambien que esta clase sea privada de jugador, pero no se
	//si esta bien)
	
	private int x = 0;
	private int y = 0;
	
	
	Posicion(){
		
	}
	
	Posicion(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void irHaciaAdelante(int desplazamiento){
		this.x += desplazamiento;
	}
	
	public void irHaciaDerecha(int desplazamiento) {
		this.y += desplazamiento;
	}
	
}
