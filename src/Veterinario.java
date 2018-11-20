
public class Veterinario {

	private String nome;
	private int atendimentos;
	private float salario;

	public Veterinario(String nome) {
		this.nome = nome;
		this.salario = 5000;
	}

	public void internar(Animal a, Hospital b) {
		int indice = b.internados.indexOf(a);
		if (indice != -1) {
			System.out.println("Este animal já está internado");
		} else {
			b.internados.add(a);
			System.out.println("O animal foi internado");
		}
	}

	public void darAlta(Animal a, Hospital b) {
		if (b.internados.isEmpty()) {
			System.out.println("Não há animais internados");
		} else {
			int indice = b.internados.indexOf(a);
			if (indice == -1) {
				System.out.println("Este animal não está internado");
			} else {
				b.internados.remove(indice);
				System.out.println("O animal não está no hospital");
			}
		}
	}

	public void vacinar(Animal a) {
		if (a.isVacinado() == true) {
			System.out.println("Seu animal já está vacinado");
		} else {
			a.setVacinado(true);
			System.out.println(a.getNome() + " foi vacinado");
		}

		atendimentos++;
	}

	public void consultar(Animal a) {
		if (a.isDoente() == true) {
			System.out.println("Seu animal está doente");
		} else {
			System.out.println("O animal está saudável");
		}

		if (a.isVacinado() == false) {
			System.out.println("Seu animal precisa ser vacinado");
		} else {
			System.out.println("O animal está vacinado");
		}

		atendimentos++;
	}

	public void medicar(Animal a) {
		if (a.isDoente() == false) {
			System.out.println("Seu animal está saudável");
		} else {
			a.setDoente(false);
			System.out.println(a.getNome() + " foi medicado e está saudável");
		}

		atendimentos++;
	}

	public String getNome() {
		return nome;
	}

	public int getAtendimentos() {
		return this.atendimentos;
	}

	public void zerarAtendimentos() {
		this.atendimentos = 0;
	}

	public float getSalario() {
		return salario;
	}

	public void restaurarSalario() {
			this.salario = 5000;
	}

	public void creditarComissao(float comissao) {
		this.salario += comissao;
	}

}
