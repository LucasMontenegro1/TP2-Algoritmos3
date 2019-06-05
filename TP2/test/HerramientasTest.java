import org.junit.Test;

public class HerramientasTest{

	@Test
	public void testSeCreaUnHachaDeMadera() {
		Madera madera = new Madera();
		Herramienta hacha = new Hacha(madera);


		assert hacha.getDurabilidad()==100;
		assert hacha.getFuerza()==2;		
	}

	@Test
	public void testSeCreaPicoDeMadera() {
		Madera madera = new Madera();
		Herramienta pico = new Pico(madera);


		assert pico.getDurabilidad()==100;
		assert pico.getFuerza()==2;
	}

	@Test
	public void testSeCreaHachaDeMetal() {
		Metal metal= new Metal();
		Herramienta hacha=new Hacha(metal);


		assert hacha.getDurabilidad()==400;
		assert hacha.getFuerza()==10;
	}

	@Test
	public void testSeCreaPicoDeMetal() {
		Metal metal= new Metal();
		Herramienta pico=new Pico(metal);


		assert pico.getDurabilidad()==400;
		assert pico.getFuerza()==12;
	}


	@Test
	public void testSeCreaPicoFino() {
		Herramienta picoFino= new PicoFino();

		assert picoFino.getDurabilidad()==1000;
		assert picoFino.getFuerza()==20;

		
		}


	@Test
	public void testHachaDeMaderaSeUsaContraMadera() {
		Madera madera = new Madera();
		Hacha hacha = new Hacha(madera);
		int durabilidad = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(madera);

		assert hacha.getDurabilidad() == (durabilidad - fuerza);

	}

	@Test
	public void testHachaDePiedraSeUsaContraMadera() {
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Hacha hacha = new Hacha(piedra);
		int durabilidad = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(madera);

		assert hacha.getDurabilidad() == (durabilidad - fuerza);

	}

	@Test
	public void testHachaDeMetalSeUsaContraMadera() {
		Madera madera = new Madera();
		Metal metal = new Metal();
		Hacha hacha = new Hacha(metal);
		int durabilidad = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(madera);

		assert hacha.getDurabilidad() == (durabilidad - fuerza/2);

	}

	@Test
	public void testHachaDeMaderaSeUsaContraPiedra() {
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Hacha hacha = new Hacha(madera);
		int durabilidad = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(piedra);

		assert hacha.getDurabilidad() == (durabilidad - fuerza);

	}

	@Test
	public void testHachaDePiedraSeUsaContraPiedra() {
		Piedra piedra = new Piedra();
		Hacha hacha = new Hacha(piedra);
		int durabilidad = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(piedra);

		assert hacha.getDurabilidad() == (durabilidad - fuerza);

	}

	@Test
	public void testHachaDeMetalSeUsaContraPiedra() {
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		Hacha hacha = new Hacha(metal);
		int durabilidad = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(piedra);

		assert hacha.getDurabilidad() == (durabilidad - fuerza/2);

	}

	@Test
	public void testHachaDeMaderaSeUsaContraMetal() {
		Madera madera = new Madera();
		Metal metal = new Metal();
		Hacha hacha = new Hacha(madera);
		int durabilidad = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(metal);

		assert hacha.getDurabilidad() == (durabilidad - fuerza);

	}

	@Test
	public void testHachaDePiedraSeUsaContraMetal() {
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		Hacha hacha = new Hacha(piedra);
		int durabilidad = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(metal);

		assert hacha.getDurabilidad() == (durabilidad - fuerza);

	}

	@Test
	public void testHachaDeMetalSeUsaContraMetal() {
		Metal metal = new Metal();
		Hacha hacha = new Hacha(metal);
		int durabilidad = hacha.getDurabilidad();
		int fuerza = hacha.getFuerza();

		hacha.usar(metal);

		assert hacha.getDurabilidad() == (durabilidad - fuerza/2);

	}
	
	
	
	
	
	//PRUEBAS DE PICO
	
	
	

	@Test
	public void testPicoDeMaderaSeUsaContraMadera() {
		Madera madera = new Madera();
		Pico pico = new Pico(madera);
		int durabilidad = pico.getDurabilidad();
		int fuerza = pico.getFuerza();

		pico.usar(madera);

		assert pico.getDurabilidad() == (durabilidad - fuerza);

	}

	@Test
	public void testPicoDePiedraSeUsaContraMadera() {
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Pico pico = new Pico(piedra);
		int durabilidad = pico.getDurabilidad();
		int fuerza = pico.getFuerza();

		pico.usar(madera);

		assert pico.getDurabilidad() == (int)(durabilidad - fuerza/1.5);

	}

	@Test
	public void testPicoDeMetalSeUsaContraMaderaYSeRompeAlDecimoUso() {
		Madera madera = new Madera();
		Metal metal = new Metal();
		Pico pico = new Pico(metal);
		int durabilidad = pico.getDurabilidad();
	

		for (int i = 0; i < 9; i++) {
			pico.usar(madera);
		}

		assert pico.getDurabilidad() == durabilidad;
		pico.usar(madera);
		assert pico.getDurabilidad() == 0;

	}

	@Test
	public void testPicoDeMaderaSeUsaContraPiedra() {
		Madera madera = new Madera();
		Piedra piedra = new Piedra();
		Pico pico = new Pico(madera);
		int durabilidad = pico.getDurabilidad();
		int fuerza = pico.getFuerza();

		pico.usar(piedra);

		assert pico.getDurabilidad() == (durabilidad - fuerza);

	}

	@Test
	public void testPicoDePiedraSeUsaContraPiedra() {
		Piedra piedra = new Piedra();
		Pico pico = new Pico(piedra);
		int durabilidad = pico.getDurabilidad();
		int fuerza = pico.getFuerza();

		pico.usar(piedra);

		assert pico.getDurabilidad() == (int)(durabilidad - fuerza/1.5);

	}

	@Test
	public void testPicoDeMetalSeUsaContraPiedraYSeRompeAlDecimoUso() {
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		Pico pico = new Pico(metal);
		int durabilidad = pico.getDurabilidad();
		

		for (int i = 0; i < 9; i++) {
			pico.usar(piedra);
		}

		assert pico.getDurabilidad() == durabilidad;
		pico.usar(piedra);
		assert pico.getDurabilidad() == 0;

	}

	@Test
	public void testPicoDeMaderaSeUsaContraMetal() {
		Madera madera = new Madera();
		Metal metal = new Metal();
		Pico pico = new Pico(madera);
		int durabilidad = pico.getDurabilidad();
		int fuerza = pico.getFuerza()
;
		pico.usar(metal);

		assert pico.getDurabilidad() == (durabilidad - fuerza);

	}

	@Test
	public void testPicoDePiedraSeUsaContraMetal() {
		Piedra piedra = new Piedra();
		Metal metal = new Metal();
		Pico pico = new Pico(piedra);
		int durabilidad = pico.getDurabilidad();
		int fuerza = pico.getFuerza();

		pico.usar(metal);		

		assert pico.getDurabilidad() == (int)(durabilidad - fuerza/1.5);

	}

	@Test
	public void testPicoDeMetalSeUsaContraMetalYSeRompeAlDecimoUso() {
		Metal metal = new Metal();
		Pico pico = new Pico(metal);
		int durabilidad = pico.getDurabilidad();
		

		for (int i = 0; i < 9; i++) {
			pico.usar(metal);
		}

		assert pico.getDurabilidad() == durabilidad;
		pico.usar(metal);
		assert pico.getDurabilidad() == 0;

	}
	
    //TESTS DE PICO FINO
	

	@Test
	public void testPicoFinoSeUsaContraDiamante(){
		Diamante diamante = new Diamante();
		PicoFino picoFino = new PicoFino();
		int durabilidad = picoFino.getDurabilidad();
		
		picoFino.usar(diamante);
		
		assert picoFino.getDurabilidad() == (int)(durabilidad - durabilidad * 0.1);
	}
	
	@Test
	public void testPicoFinoSeUsaContraMadera(){
		Madera madera = new Madera();
		PicoFino picoFino = new PicoFino();
		int durabilidad = picoFino.getDurabilidad();
		
		picoFino.usar(madera);
		
		assert picoFino.getDurabilidad() == (durabilidad - durabilidad * 0.1);
		
		// No pasa xq hay q ver como gasta
	}
	
	@Test
	public void testPicoFinoSeUsaContraMetal(){
		Metal metal = new Metal();
		PicoFino picoFino = new PicoFino();
		int durabilidad = picoFino.getDurabilidad();
		
		picoFino.usar(metal);		
		
		assert picoFino.getDurabilidad() == (durabilidad - durabilidad * 0.1);
		
		// No pasa xq hay q ver como gasta
	}
	
	@Test
	public void testPicoFinoSeUsaContraPiedra(){
		Piedra piedra = new Piedra();
		PicoFino picoFino = new PicoFino();
		int durabilidad = picoFino.getDurabilidad();
		
		picoFino.usar(piedra);
		
		assert picoFino.getDurabilidad() == (durabilidad - durabilidad * 0.1);
		
		// No pasa xq hay q ver como gasta
	}


}
