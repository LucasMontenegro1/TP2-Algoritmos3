import org.junit.jupiter.api.Test;

class HerramientasTest{

	@Test
	void testSeCreaUnHachaDeMadera() {
		Madera madera= new Madera();
		Herramienta hacha=new Hacha(madera);
		
		
		assert hacha.getDurabilidad()==100;
		assert hacha.getFuerza()==2;		
	}
	
	@Test
	void testSeCreaPicoDeMadera() {
		Madera madera= new Madera();
		Herramienta pico=new Pico(madera);
		
		
		assert pico.getDurabilidad()==100;
		assert pico.getFuerza()==2;
	}
	
	@Test
	void testSeCreaHachaDeMetal() {
		Metal metal= new Metal();
		Herramienta hacha=new Hacha(metal);
		
		
		assert hacha.getDurabilidad()==400;
		assert hacha.getFuerza()==10;
	}
	
	@Test
	void testSeCreaPicoDeMetal() {
		Metal metal= new Metal();
		Herramienta pico=new Pico(metal);
		
		
		assert pico.getDurabilidad()==400;
		assert pico.getFuerza()==12;
	}
	
	
	@Test
	void testSeCreaPicoFino() {
		Herramienta picoFino= new picoFino();
		
		assert picoFino.getDurabilidad()==1000;
		assert picoFino.getFuerza()==20;
		
		}

	@Test 
	void testHachaDeMaderaSeUsaContraMadera() {
		Madera madera = new Madera();
		Hacha hacha = new Hacha(madera);
		int durabilidad = hacha.getDurabilidad();
		int fuerza=hacha.getFuerza();
		
		hacha.usar(madera);
		assert hacha.getDurabilidad() == (durabilidad - fuerza);

		}
		
	
}
