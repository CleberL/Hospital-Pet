
public class Cachorro extends Animal {

	private boolean adestrado;

	public Cachorro(String nome) {
		super(nome);
		adestrado = false;
	}

	public void latir() {
		System.out.println("au au!!");
	}
	
	public boolean isAdestrado() {
		return adestrado;
	}
	
	public void setAdestrado(boolean adestrado) {
		this.adestrado = adestrado;
	}
	
	
	public void adestrar() {
		if(this.adestrado == false) {
			this.adestrado = true;
			System.out.println("Agora ele está comportado!");
		}else {
			System.out.println("Seu cachorro já foi adestrado antes.");
		}
	}

}
