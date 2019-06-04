
public class Material implements Equipable  {
	int durabilidad;
	
	public int getDurabilidad() {
		return this.durabilidad;
	}
	
	public void recibirDanio(int danio) {
		durabilidad-=danio;
	}
}
