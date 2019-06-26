
import org.junit.Test;

import Modelo.Crafteo.CodigoDeCrafteo;
import Modelo.Crafteo.CodigoDeCrafteoIncorrectoException;
import Modelo.Crafteo.MesaDeCrafteo;
import Modelo.Herramientas.HachaDeMadera;
import Modelo.Herramientas.HachaDeMetal;
import Modelo.Herramientas.HachaDePiedra;
import Modelo.Herramientas.Herramienta;
import Modelo.Herramientas.PicoDeMetal;
import Modelo.Herramientas.PicoDePiedra;
import Modelo.Jugador.Inventario;
import Modelo.Mapa.Mapa;
import Modelo.Mapa.Posicion;
import Modelo.Materiales.Diamante;
import Modelo.Materiales.Madera;
import Modelo.Materiales.Metal;
import Modelo.Materiales.Piedra;


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
		
		Herramienta herramienta= mesa.craftearHachaDeMadera(codigoHachaDeMadera);
		
		herramienta.usar(madera, new Inventario());
		
		assert madera.getDurabilidad() == durabilidadInicial - herramienta.getFuerza();
		assert herramienta instanceof HachaDeMadera;
		
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
		
		Herramienta herramienta= mesa.craftearHachaDeMadera(codigoHachaDeMadera);
		
		herramienta.usar(madera, new Inventario());
		
		assert madera.getDurabilidad() == durabilidadInicial - herramienta.getFuerza();	
		assert herramienta instanceof HachaDeMadera;
		
	}
	
	
	
	@Test
	public void testSeCrafteaUnHachaDeMaderaPoniendoCodigoErroneo() {
		MesaDeCrafteo mesa = new MesaDeCrafteo();
		CodigoDeCrafteo codigoHachaDeMadera = new CodigoDeCrafteo();
		Madera madera = new Madera();

		int durabilidadInicial = madera.getDurabilidad();
		
		codigoHachaDeMadera.agregarMaterial(1, madera);
		codigoHachaDeMadera.agregarMaterial(2, madera);
		codigoHachaDeMadera.agregarMaterial(4, madera);
		codigoHachaDeMadera.agregarMaterial(5, madera);
		codigoHachaDeMadera.agregarMaterial(8, new Piedra());

		try {
		
			Herramienta herramienta= mesa.craftearHachaDeMadera(codigoHachaDeMadera);
			
		} catch (CodigoDeCrafteoIncorrectoException e) {
			assert true;
			return;
		}
		
		
		assert false;
		
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
		
		Herramienta herramienta= mesa.craftearHachaDePiedra(codigoHachaDePiedra);
		
		herramienta.usar(madera, new Inventario());
		
		assert madera.getDurabilidad() == durabilidadInicial - herramienta.getFuerza();	
		assert herramienta instanceof HachaDePiedra;
		
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
		
		Herramienta herramienta= mesa.craftearHachaDePiedra(codigoHachaDePiedra);
		
		herramienta.usar(madera, new Inventario());
		
		assert madera.getDurabilidad() == durabilidadInicial - herramienta.getFuerza();	
		assert herramienta instanceof HachaDePiedra;
		
	}
	

	
	@Test
	public void testSeCrafteaUnHachaDePiedraPoniendoCodigoIncorrecto() {
		MesaDeCrafteo mesa = new MesaDeCrafteo();
		CodigoDeCrafteo codigoHachaDePiedra = new CodigoDeCrafteo();
		Madera madera = new Madera();
		Piedra piedra = new Piedra();

		int durabilidadInicial = madera.getDurabilidad();
		
		codigoHachaDePiedra.agregarMaterial(1, piedra);
		codigoHachaDePiedra.agregarMaterial(2, piedra);
		codigoHachaDePiedra.agregarMaterial(4, piedra);
		codigoHachaDePiedra.agregarMaterial(5, madera);
		codigoHachaDePiedra.agregarMaterial(8, piedra);
		
		try {
			
			Herramienta herramienta= mesa.craftearHachaDePiedra(codigoHachaDePiedra);
			
		} catch (CodigoDeCrafteoIncorrectoException e) {
			assert true;
			return;
		}
		
		
		assert false;
		
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
		
		Herramienta herramienta= mesa.craftearHachaDeMetal(codigoHachaDeMetal);
		
		herramienta.usar(madera, new Inventario());
		
		assert madera.getDurabilidad() == durabilidadInicialMadera - herramienta.getFuerza();
		assert herramienta instanceof HachaDeMetal;
		
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
		
		Herramienta herramienta= mesa.craftearHachaDeMetal(codigoHachaDeMetal);
		//int durabilidadInicialHacha = herramienta.getDurabilidad();
		
		herramienta.usar(madera, new Inventario());
		
		assert madera.getDurabilidad() == durabilidadInicialMadera - herramienta.getFuerza();
		assert herramienta instanceof HachaDeMetal;
		
	}
	
	
	
	
	@Test
	public void testSeCrafteaUnHachaDeMetalPoniendoCodigoIncorrecto() {
		MesaDeCrafteo mesa = new MesaDeCrafteo();
		CodigoDeCrafteo codigoHachaDeMetal = new CodigoDeCrafteo();
		Madera madera = new Madera(new Mapa(), new Posicion(0,0));
		Metal metal = new Metal();

		int durabilidadInicialMadera = madera.getDurabilidad();
		
		codigoHachaDeMetal.agregarMaterial(1, metal);
		codigoHachaDeMetal.agregarMaterial(2, metal);
		codigoHachaDeMetal.agregarMaterial(4, metal);
		codigoHachaDeMetal.agregarMaterial(5, madera);
		codigoHachaDeMetal.agregarMaterial(8, metal);
		
		try {
			
			Herramienta herramienta= mesa.craftearHachaDeMetal(codigoHachaDeMetal);
			
		} catch (CodigoDeCrafteoIncorrectoException e) {
			assert true;
			return;
		}
		
		
		assert false;
		
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
		
		Herramienta herramienta= mesa.craftearPicoDeMadera(codigoPicoDeMadera);
		
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
		
		
		Herramienta herramienta= mesa.craftearPicoDeMadera(codigoPicoDeMadera);
		
		herramienta.usar(piedra, new Inventario());
		herramienta.usar(metal, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadInicialPiedra - herramienta.getFuerza();
		assert metal.getDurabilidad() == durabilidadInicialMetal;
		
	}
	

	@Test
	public void testSeCrafteaUnPicoDeMaderaPoniendoCodigoIncorrecto() {
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
		codigoPicoDeMadera.agregarMaterial(8, piedra);
		
		try {
			
			Herramienta herramienta= mesa.craftearPicoDeMadera(codigoPicoDeMadera);
			
		} catch (CodigoDeCrafteoIncorrectoException e) {
			assert true;
			return;
		}
		
		
		assert false;
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
		
		Herramienta herramienta= mesa.craftearPicoDePiedra(codigoPicoDePiedra);
		
		herramienta.usar(piedra, new Inventario());
		herramienta.usar(metal, new Inventario());
		herramienta.usar(diamante, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadInicialPiedra - herramienta.getFuerza();
		assert metal.getDurabilidad() == durabilidadInicialMetal - herramienta.getFuerza();
		assert diamante.getDurabilidad() == durabilidadInicialDiamante;
		assert herramienta instanceof PicoDePiedra;
		
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
		
		
		Herramienta herramienta= mesa.craftearPicoDePiedra(codigoPicoDePiedra);
		
		herramienta.usar(piedra, new Inventario());
		herramienta.usar(metal, new Inventario());
		herramienta.usar(diamante, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadInicialPiedra - herramienta.getFuerza();
		assert metal.getDurabilidad() == durabilidadInicialMetal - herramienta.getFuerza();
		assert diamante.getDurabilidad() == durabilidadInicialDiamante;
		assert herramienta instanceof PicoDePiedra;
		
	}
	
	
	
	@Test
	public void testSeCrafteaUnPicoDePiedraPoniendoCodigoIncorrecto() {
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
		codigoPicoDePiedra.agregarMaterial(8, metal);
		
		try {
			
			Herramienta herramienta= mesa.craftearPicoDePiedra(codigoPicoDePiedra);
			
		} catch (CodigoDeCrafteoIncorrectoException e) {
			assert true;
			return;
		}
		
		
		assert false;
		
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
		
		Herramienta herramienta= mesa.craftearPicoDeMetal(codigoPicoDeMetal);
		
		herramienta.usar(piedra, new Inventario());
		herramienta.usar(metal, new Inventario());
		herramienta.usar(diamante, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadInicialPiedra - herramienta.getFuerza();
		assert metal.getDurabilidad() == durabilidadInicialMetal - herramienta.getFuerza();
		assert diamante.getDurabilidad() == durabilidadInicialDiamante;
		assert herramienta instanceof PicoDeMetal;
		
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
		
		Herramienta herramienta= mesa.craftearPicoDeMetal(codigoPicoDeMetal);
		
		herramienta.usar(piedra, new Inventario());
		herramienta.usar(metal, new Inventario());
		herramienta.usar(diamante, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadInicialPiedra - herramienta.getFuerza();
		assert metal.getDurabilidad() == durabilidadInicialMetal - herramienta.getFuerza();
		assert diamante.getDurabilidad() == durabilidadInicialDiamante;
		assert herramienta instanceof PicoDeMetal;
		
	}
	
	
	
	@Test
	public void testSeCrafteaUnPicoDeMetalPoniendoCodigoIncorrecto() {
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

		codigoPicoDeMetal.agregarMaterial(5, piedra);
		codigoPicoDeMetal.agregarMaterial(8, madera);
		
		try {
			
			Herramienta herramienta= mesa.craftearPicoDeMetal(codigoPicoDeMetal);
			
		} catch (CodigoDeCrafteoIncorrectoException e) {
			assert true;
			return;
		}
		
		
		assert false;
		
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
		
		Herramienta herramienta= mesa.craftearPicoFino(codigoPicoFino);
		
		herramienta.usar(piedra, new Inventario());
		herramienta.usar(metal, new Inventario());
		herramienta.usar(diamante, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadInicialPiedra;
		assert metal.getDurabilidad() == durabilidadInicialMetal;
		assert diamante.getDurabilidad() == durabilidadInicialDiamante - herramienta.getFuerza();
		
		
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
		
		Herramienta herramienta= mesa.craftearPicoFino(codigoPicoFino);
		
		herramienta.usar(piedra, new Inventario());
		herramienta.usar(metal, new Inventario());
		herramienta.usar(diamante, new Inventario());
		
		assert piedra.getDurabilidad() == durabilidadInicialPiedra;
		assert metal.getDurabilidad() == durabilidadInicialMetal;
		assert diamante.getDurabilidad() == durabilidadInicialDiamante - herramienta.getFuerza();
		
		
	}

	
	
	@Test
	public void testSeCrafteaUnPicoFinoPoniendoCodigoIncorrecto() {
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

		codigoPicoFino.agregarMaterial(4, madera);
		codigoPicoFino.agregarMaterial(5, madera);
		codigoPicoFino.agregarMaterial(8, madera);
		
		try {
			
			Herramienta herramienta= mesa.craftearPicoFino(codigoPicoFino);
			
		} catch (CodigoDeCrafteoIncorrectoException e) {
			assert true;
			return;
		}
		
		
		assert false;
		
	}
	
	
	
	
}
