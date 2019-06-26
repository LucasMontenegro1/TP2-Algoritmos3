package Modelo.Materiales;

import Modelo.Herramientas.Herramienta;
import Modelo.Jugador.Inventario;

public class Pasto extends Material{
	
	@Override
	public void decimeQuienSos(Herramienta herramienta, Inventario inventario) {
		herramienta.usar(this, inventario);
		
	}
	
	public void verificarEstado(Inventario inventario) {

	}
	
	
	@Override
	public void guardarEnInventario(Inventario inventario) {
		
	}
	
}
