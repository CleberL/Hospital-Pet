
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
	
	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}
	
	public void setDoente(boolean doente) {
		this.doente = doente;
	}

	public boolean isVacinado() {
		return this.vacinado;
	}

	public boolean isDoente() {
		return this.doente;
	}

}
