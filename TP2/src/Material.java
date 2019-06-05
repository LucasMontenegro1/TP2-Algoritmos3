
public class Material implements Equipable  {
	int durabilidad;
	
	public int getDurabilidad() {
		return this.durabilidad;
	}
	
	public void recibirDanio(int danio) {
		durabilidad -= danio;
	}
	
	//FIJARSE QUE HACER CON ESTE METODO, SE AGREGO 
	//PARA VER SI ANDA TRAVIS
	public void usar(){
		
	}
	
}
