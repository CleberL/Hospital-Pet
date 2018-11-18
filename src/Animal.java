
public class Animal {

	private String nome;
	private boolean doente;
	private boolean vacinado;

	public Animal(String nome) {
		this.nome = nome;
		this.doente = true;
		this.vacinado = false;
	}

	public String getNome() {
		return nome;
	}

	public boolean isVacinado() {
		return this.vacinado;
	}

	public boolean isDoente() {
		return this.doente;
	}

	public void tosar() {

	}

	public void darBanho() {

	}

	public void vacinar() {
		if (this.isVacinado() == true) {
			System.out.println("Seu animal já está vacinado");
		} else {
			this.vacinado = true;
			System.out.println(this.getNome() + "foi vacinado");
		}
	}

	public void medicar() {
		if (this.isDoente() == false) {
			System.out.println("Seu animal está saudável");
		} else {
			this.doente = false;
			System.out.println(this.getNome() + "foi medicado e está saudável");
		}
	}

}
