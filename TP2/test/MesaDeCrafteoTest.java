
import org.junit.Test;

import Herramientas.HachaDeMadera;
import Herramientas.Herramienta;
import Jugador.Inventario;
import Materiales.Diamante;
import Materiales.Madera;
import Materiales.Metal;
import Materiales.Piedra;
import Modelo.CodigoDeCrafteo;
import Modelo.MesaDeCrafteo;
import mapa.Mapa;
import mapa.Posicion;


public class MesaDeCrafteoTest {

	@Test
	public void testSeCrafteaUnHachaDeMadera() {
		MesaDeCrafteo mesa = new MesaDeCrafteo();
		CodigoDeCrafteo codigoHachaDeMadera = new CodigoDeCrafteo();
		Madera madera = new Madera();

		int durabilidadInicial = madera.getDurabilidad();
		
		codigoHachaDeMadera.agregarMaterial(1, madera);
		codigoHachaDeMadera.agregarMaterial(2, madera);
		codigoHachaDeMadera.agregarMaterial(4, madera);
		codigoHachaDeMadera.agregarMaterial(5, madera);
		codigoHachaDeMadera.agregarMaterial(8, madera);
		
		Herramienta herramienta= mesa.craftear(codigoHachaDeMadera);
		
		herramienta.usar(madera, new Inventario());
		
		assert madera.getDurabilidad() == durabilidadInicial - herramienta.getFuerza();	
		
	}
	
	
	@Test
	public void testSeCrafteaUnHachaDeMaderaPoniendoElCodigoEnOtroOrden() {
		MesaDeCrafteo mesa = new MesaDeCrafteo();
		CodigoDeCrafteo codigoHachaDeMadera = new CodigoDeCrafteo();
		Madera madera = new Madera();

		int durabilidadInicial = madera.getDurabilidad();
		
		codigoHachaDeMadera.agregarMaterial(8, madera);
		codigoHachaDeMadera.agregarMaterial(5, madera);
		codigoHachaDeMadera.agregarMaterial(2, madera);
		codigoHachaDeMadera.agregarMaterial(1, madera);
		codigoHachaDeMadera.agregarMaterial(4, madera);
		
		Herramienta herramienta= mesa.craftear(codigoHachaDeMadera);
		
		herramienta.usar(madera, new Inventario());
		
		assert madera.getDurabilidad() == durabilidadInicial - herramienta.getFuerza();	
		
	}
	
	
	
	
	@Test
	public void testSeCrafteaUnHachaDePiedra() {
		MesaDeCrafteo mesa = new MesaDeCrafteo();
		CodigoDeCrafteo codigoHachaDePiedra = new CodigoDeCrafteo();
		Madera madera = new Madera();
		Piedra piedra = new Piedra();

		int durabilidadInicial = madera.getDurabilidad();
		
		codigoHachaDePiedra.agregarMaterial(1, piedra);
		codigoHachaDePiedra.agregarMaterial(2, piedra);
		codigoHachaDePiedra.agregarMaterial(4, piedra);
		codigoHachaDePiedra.agregarMaterial(5, madera);
		codigoHachaDePiedra.agregarMaterial(8, madera);
		
		Herramienta herramienta= mesa.craftear(codigoHachaDePiedra);
		
		herramienta.usar(madera, new Inventario());
		
		assert madera.getDurabilidad() == durabilidadInicial - herramienta.getFuerza();	
		
	}
	
	
	@Test
	public void testSeCrafteaUnHachaDePiedraPoniendoElCodigoEnOtroOrden() {
		MesaDeCrafteo mesa = new MesaDeCrafteo();
		CodigoDeCrafteo codigoHachaDePiedra = new CodigoDeCrafteo();
		Madera madera = new Madera();
		Piedra piedra = new Piedra();

		int durabilidadInicial = madera.getDurabilidad();

		codigoHachaDePiedra.agregarMaterial(5, madera);
		codigoHachaDePiedra.agregarMaterial(1, piedra);
		codigoHachaDePiedra.agregarMaterial(8, madera);
		codigoHachaDePiedra.agregarMaterial(4, piedra);
		codigoHachaDePiedra.agregarMaterial(2, piedra);
		
		Herramienta herramienta= mesa.craftear(codigoHachaDePiedra);
		
		herramienta.usar(madera, new Inventario());
		
		assert madera.getDurabilidad() == durabilidadInicial - herramienta.getFuerza();	
		
	}
	
	
	@Test
	public void testSeCrafteaUnHachaDeMetal() {
		MesaDeCrafteo mesa = new MesaDeCrafteo();
		CodigoDeCrafteo codigoHachaDeMetal = new CodigoDeCrafteo();
		Madera madera = new Madera(new Mapa(), new Posicion(0,0));
		Metal metal = new Metal();

		int durabilidadInicialMadera = madera.getDurabilidad();
		
		codigoHachaDeMetal.agregarMaterial(1, metal);
		codigoHachaDeMetal.agregarMaterial(2, metal);
		codigoHachaDeMetal.agregarMaterial(4, metal);
		codigoHachaDeMetal.agregarMaterial(5, madera);
		codigoHachaDeMetal.agregarMaterial(8, madera);
		
		Herramienta herramienta= mesa.craftear(codigoHachaDeMetal);
		//int durabilidadInicialHacha = herramienta.getDurabilidad();
		
		herramienta.usar(madera, new Inventario());
		
		assert madera.getDurabilidad() == durabilidadInicialMadera - herramienta.getFuerza();
		
		//VER SI ESTE ASSERT ES UNA BUENA PRUEBA ¿PRUEBA IMPLEMENTACION?
		//assert herramienta.getDurabilidad() == durabilidadInicialHacha - (int)herramienta.getFuerza()/2;
		
	}
	
	
	@Test
	public void testSeCrafteaUnHachaDeMetalPoniendoElCodigoEnOtroOrden() {
		MesaDeCrafteo mesa = new MesaDeCrafteo();
		CodigoDeCrafteo codigoHachaDeMetal = new CodigoDeCrafteo();
		Madera madera = new Madera(new Mapa(), new Posicion(0,0));
		Metal metal = new Metal();

		int durabilidadInicialMadera = madera.getDurabilidad();
		
		codigoHachaDeMetal.agregarMaterial(4, metal);
		codigoHachaDeMetal.agregarMaterial(2, metal);
		codigoHachaDeMetal.agregarMaterial(1, metal);
		codigoHachaDeMetal.agregarMaterial(8, madera);
		codigoHachaDeMetal.agregarMaterial(5, madera);
		
		Herramienta herramienta= mesa.craftear(codigoHachaDeMetal);
		//int durabilidadInicialHacha = herramienta.getDurabilidad();
		
		herramienta.usar(madera, new Inventario());
		
		assert madera.getDurabilidad() == durabilidadInicialMadera - herramienta.getFuerza();
		
		//VER SI ESTE ASSERT ES UNA BUENA PRUEBA ¿PRUEBA IMPLEMENTACION?
		//assert herramienta.getDurabilidad() == durabilidadInicialHacha - (int)herramienta.getFuerza()/2;
		
	}
	
	
	
	@Test
	public void testSeCrafteaUnPicoDeMadera() {
		MesaDeCrafteo mesa = new MesaDeCrafteo();
		CodigoDeCrafteo codigoPicoDeMadera = new CodigoDeCrafteo();
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		
		int durabilidadInicialPiedra = piedra.getDurabilidad();
		int durabilidadInicialMetal = metal.getDurabilidad();
		
		
		for (int i = 1; i < 4; i++) {
			codigoPicoDeMadera.agregarMaterial(i, madera);
		}

		codigoPicoDeMadera.agregarMaterial(5, madera);
		codigoPicoDeMadera.agregarMaterial(8, madera);
		
		Herramienta herramienta= mesa.craftear(codigoPicoDeMadera);
		
		herramienta.usar(piedra, new Inventario());
		herramienta.usar(metal, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadInicialPiedra - herramienta.getFuerza();
		assert metal.getDurabilidad() == durabilidadInicialMetal;
		
	}
	
	
	@Test
	public void testSeCrafteaUnPicoDeMaderaPoniendoElCodigoEnOtroOrden() {
		MesaDeCrafteo mesa = new MesaDeCrafteo();
		CodigoDeCrafteo codigoPicoDeMadera = new CodigoDeCrafteo();
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		
		int durabilidadInicialPiedra = piedra.getDurabilidad();
		int durabilidadInicialMetal = metal.getDurabilidad();
		
		
		for (int i = 3; i > 0; i--) {
			codigoPicoDeMadera.agregarMaterial(i, madera);
		}

		codigoPicoDeMadera.agregarMaterial(8, madera);
		codigoPicoDeMadera.agregarMaterial(5, madera);
		
		
		Herramienta herramienta= mesa.craftear(codigoPicoDeMadera);
		
		herramienta.usar(piedra, new Inventario());
		herramienta.usar(metal, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadInicialPiedra - herramienta.getFuerza();
		assert metal.getDurabilidad() == durabilidadInicialMetal;
		
	}
	
	
	@Test
	public void testSeCrafteaUnPicoDePiedra() {
		MesaDeCrafteo mesa = new MesaDeCrafteo();
		CodigoDeCrafteo codigoPicoDePiedra = new CodigoDeCrafteo();
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		Diamante diamante = new Diamante();
		
		int durabilidadInicialPiedra = piedra.getDurabilidad();
		int durabilidadInicialMetal = metal.getDurabilidad();
		int durabilidadInicialDiamante = diamante.getDurabilidad();
		
		
		for (int i = 1; i < 4; i++) {
			codigoPicoDePiedra.agregarMaterial(i, piedra);
		}

		codigoPicoDePiedra.agregarMaterial(5, madera);
		codigoPicoDePiedra.agregarMaterial(8, madera);
		
		Herramienta herramienta= mesa.craftear(codigoPicoDePiedra);
		
		herramienta.usar(piedra, new Inventario());
		herramienta.usar(metal, new Inventario());
		herramienta.usar(diamante, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadInicialPiedra - herramienta.getFuerza();
		assert metal.getDurabilidad() == durabilidadInicialMetal - herramienta.getFuerza();
		assert diamante.getDurabilidad() == durabilidadInicialDiamante;
		
		//Se puede agregar la forma en la que se gasta para ver que es del tipo de piedra
		//pero da detalles de implementacion
		
	}
	
	
	@Test
	public void testSeCrafteaUnPicoDePiedraPoniendoElCodigoEnOtroOrden() {
		MesaDeCrafteo mesa = new MesaDeCrafteo();
		CodigoDeCrafteo codigoPicoDePiedra = new CodigoDeCrafteo();
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		Diamante diamante = new Diamante();
		
		int durabilidadInicialPiedra = piedra.getDurabilidad();
		int durabilidadInicialMetal = metal.getDurabilidad();
		int durabilidadInicialDiamante = diamante.getDurabilidad();
		
		
		for (int i = 3; i > 0; i--) {
			codigoPicoDePiedra.agregarMaterial(i, piedra);
		}

		codigoPicoDePiedra.agregarMaterial(8, madera);
		codigoPicoDePiedra.agregarMaterial(5, madera);
		
		
		Herramienta herramienta= mesa.craftear(codigoPicoDePiedra);
		
		herramienta.usar(piedra, new Inventario());
		herramienta.usar(metal, new Inventario());
		herramienta.usar(diamante, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadInicialPiedra - herramienta.getFuerza();
		assert metal.getDurabilidad() == durabilidadInicialMetal - herramienta.getFuerza();
		assert diamante.getDurabilidad() == durabilidadInicialDiamante;
		
		//Se puede agregar la forma en la que se gasta para ver que es del tipo de piedra
		//pero da detalles de implementacion
		
	}
	
	
	
	
	
	//¿HAY FORMA DE DIFERENCIAR PICO DE PIEDRA DE UNO DE METAL?
	//LO MISMO PARA TODAS LAS HACHAS
	@Test
	public void testSeCrafteaUnPicoDeMetal() {
		MesaDeCrafteo mesa = new MesaDeCrafteo();
		CodigoDeCrafteo codigoPicoDeMetal = new CodigoDeCrafteo();
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		Diamante diamante = new Diamante();
		
		int durabilidadInicialPiedra = piedra.getDurabilidad();
		int durabilidadInicialMetal = metal.getDurabilidad();
		int durabilidadInicialDiamante= diamante.getDurabilidad();
		
		
		for (int i = 1; i < 4; i++) {
			codigoPicoDeMetal.agregarMaterial(i, metal);
		}

		codigoPicoDeMetal.agregarMaterial(5, madera);
		codigoPicoDeMetal.agregarMaterial(8, madera);
		
		Herramienta herramienta= mesa.craftear(codigoPicoDeMetal);
		
		herramienta.usar(piedra, new Inventario());
		herramienta.usar(metal, new Inventario());
		herramienta.usar(diamante, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadInicialPiedra - herramienta.getFuerza();
		assert metal.getDurabilidad() == durabilidadInicialMetal - herramienta.getFuerza();
		assert diamante.getDurabilidad() == durabilidadInicialDiamante;
		
		//Se puede agregar la forma en la que se gasta para ver que es del tipo de piedra
		//pero da detalles de implementacion
		
	}
	
	
	
	@Test
	public void testSeCrafteaUnPicoDeMetalPoniendoElCodigoEnOtroOrden() {
		MesaDeCrafteo mesa = new MesaDeCrafteo();
		CodigoDeCrafteo codigoPicoDeMetal = new CodigoDeCrafteo();
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		Diamante diamante = new Diamante();
		
		int durabilidadInicialPiedra = piedra.getDurabilidad();
		int durabilidadInicialMetal = metal.getDurabilidad();
		int durabilidadInicialDiamante= diamante.getDurabilidad();
		
		
		for (int i = 3; i > 0; i--) {
			codigoPicoDeMetal.agregarMaterial(i, metal);
		}

		codigoPicoDeMetal.agregarMaterial(8, madera);
		codigoPicoDeMetal.agregarMaterial(5, madera);
		
		Herramienta herramienta= mesa.craftear(codigoPicoDeMetal);
		
		herramienta.usar(piedra, new Inventario());
		herramienta.usar(metal, new Inventario());
		herramienta.usar(diamante, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadInicialPiedra - herramienta.getFuerza();
		assert metal.getDurabilidad() == durabilidadInicialMetal - herramienta.getFuerza();
		assert diamante.getDurabilidad() == durabilidadInicialDiamante;
		
		//Se puede agregar la forma en la que se gasta para ver que es del tipo de piedra
		//pero da detalles de implementacion
		
	}
	
	
	@Test
	public void testSeCrafteaUnPicoFino() {
		MesaDeCrafteo mesa = new MesaDeCrafteo();
		CodigoDeCrafteo codigoPicoFino = new CodigoDeCrafteo();
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		Diamante diamante = new Diamante();
		
		int durabilidadInicialPiedra = piedra.getDurabilidad();
		int durabilidadInicialMetal = metal.getDurabilidad();
		int durabilidadInicialDiamante= diamante.getDurabilidad();
		
		
		for (int i = 1; i < 4; i++) {
			codigoPicoFino.agregarMaterial(i, metal);
		}

		codigoPicoFino.agregarMaterial(4, piedra);
		codigoPicoFino.agregarMaterial(5, madera);
		codigoPicoFino.agregarMaterial(8, madera);
		
		Herramienta herramienta= mesa.craftear(codigoPicoFino);
		
		herramienta.usar(piedra, new Inventario());
		herramienta.usar(metal, new Inventario());
		herramienta.usar(diamante, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadInicialPiedra - herramienta.getFuerza();
		assert metal.getDurabilidad() == durabilidadInicialMetal - herramienta.getFuerza();
		assert diamante.getDurabilidad() == durabilidadInicialDiamante - herramienta.getFuerza();
		
		//Se puede agregar la forma en la que se gasta para ver que es del tipo de piedra
		//pero da detalles de implementacion
		
	}
	
	
	@Test
	public void testSeCrafteaUnPicoFinoPoniendoElCodigoEnOtroOrden() {
		MesaDeCrafteo mesa = new MesaDeCrafteo();
		CodigoDeCrafteo codigoPicoFino = new CodigoDeCrafteo();
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		Diamante diamante = new Diamante();
		
		int durabilidadInicialPiedra = piedra.getDurabilidad();
		int durabilidadInicialMetal = metal.getDurabilidad();
		int durabilidadInicialDiamante= diamante.getDurabilidad();
		
		
		for (int i = 3; i > 0; i--) {
			codigoPicoFino.agregarMaterial(i, metal);
		}

		codigoPicoFino.agregarMaterial(5, madera);
		codigoPicoFino.agregarMaterial(4, piedra);
		codigoPicoFino.agregarMaterial(8, madera);
		
		Herramienta herramienta= mesa.craftear(codigoPicoFino);
		
		herramienta.usar(piedra, new Inventario());
		herramienta.usar(metal, new Inventario());
		herramienta.usar(diamante, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadInicialPiedra - herramienta.getFuerza();
		assert metal.getDurabilidad() == durabilidadInicialMetal - herramienta.getFuerza();
		assert diamante.getDurabilidad() == durabilidadInicialDiamante - herramienta.getFuerza();
		
		//Se puede agregar la forma en la que se gasta para ver que es del tipo de piedra
		//pero da detalles de implementacion
		
	}
	
}
