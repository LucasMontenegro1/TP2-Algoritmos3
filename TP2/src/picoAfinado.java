
public class picoAfinado extends Desgastable {
	
	
	picoAfinado(){
		this.durabilidad=1000;
		this.fuerza=20;
	}
	
	public void usar(){
		durabilidad-= durabilidad*0.1;
	}
}
