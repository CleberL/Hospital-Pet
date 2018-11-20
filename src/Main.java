
public class Main {

	public static void main(String[] args) {
		
		Hospital upe = new Hospital();
		
		Animal a1 = new Cachorro("toto");
		Animal a2 = new Gato("nik", 12);
		Animal a3 = new Gato("pingo", 6);
		
		Veterinario v = new Veterinario("adriano");
		
		
		if (a1 instanceof Cachorro) {
			((Cachorro) a1).adestrar();
		}
		
		if (a2 instanceof Gato) {
			((Gato) a2).miar();
		}

		v.consultar(a3);		
		
		v.medicar(a3);
		v.vacinar(a3);
		
		v.consultar(a3);
		
		
		upe.pagarComissaoVeterinario(v);
	}

}
