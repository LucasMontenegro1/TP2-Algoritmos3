import org.junit.jupiter.api.Test;

class HerramientasTest{

	@Test
	void testSeCreaUnHachaDeMadera() {
		Madera madera= new Madera();
		Herramienta hacha=new Hacha(madera);
		
		
		assert hacha.getDurabilidad()==100;
		
		
	}

}
