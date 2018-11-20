
public class Main {

	public static void main(String[] args) {
		Animal matheus = new Cachorro("matheus");

		Hospital upe = new Hospital();
		
		if (matheus instanceof Cachorro) {
			((Cachorro) matheus).adestrar();
		}
		
		if (matheus instanceof Gato) {
			((Gato) matheus).miar();
		}
		
		

	}

}
