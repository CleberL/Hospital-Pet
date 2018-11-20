
public class Gato extends Animal {

	private int tamanhoUnha;
	
	public Gato(String nome, int tamanhoUnha) {
		super(nome);
		this.tamanhoUnha = tamanhoUnha;
	}
	
	public void miar() {
		System.out.println("miau!!");
	}
	
	public void cortarUnha() {
		if(tamanhoUnha>10) {
			this.tamanhoUnha = 5;
			System.out.println("A unha foi aparada");
		}else {
			System.out.println("A unha está curta");
		}
	}
	
}
