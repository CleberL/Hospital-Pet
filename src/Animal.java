
public class Animal {

	private String nome;
	private String ra�a;
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

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}

}
