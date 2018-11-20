
public class Veterinario {

	private String nome;
	private int atendimentos;
	private float comissao;


	public Veterinario(String nome) {
		this.nome = nome;
	}

	public void internar(Animal a, Hospital b) {
		int indice = b.internados.indexOf(a);
		if (indice != -1) {
			System.out.println("Este animal j� est� internado");
		} else {
			b.internados.add(a);
			System.out.println("O animal foi internado");
		}
	}

	public void darAlta(Animal a, Hospital b) {
		if (b.internados.isEmpty()) {
			System.out.println("N�o h� animais internados");
		} else {
			int indice = b.internados.indexOf(a);
			if (indice == -1) {
				System.out.println("Este animal n�o est� internado");
			} else {
				b.internados.remove(indice);
				System.out.println("O animal n�o est� no hospital");
			}
		}
	}

	public void vacinar(Animal a) {
		if (a.isVacinado() == true) {
			System.out.println("Seu animal j� est� vacinado");
		} else {
			a.setVacinado(true);
			System.out.println(a.getNome() + " foi vacinado");
		}
		
		atendimentos++;
	}

	public void consultar(Animal a) {
		if (a.isDoente() == true) {
			System.out.println("Seu animal est� doente");
		} else {
			System.out.println("O animal est� saud�vel");
		}

		if (a.isVacinado() == false) {
			System.out.println("Seu animal precisa ser vacinado");
		} else {
			System.out.println("O animal est� vacinado");
		}

		atendimentos++;
	}

	public void medicar(Animal a) {
		if (a.isDoente() == false) {
			System.out.println("Seu animal est� saud�vel");
		} else {
			a.setDoente(false);
			System.out.println(a.getNome() + " foi medicado e est� saud�vel");
		}

		atendimentos++;
	}

	public String getNome() {
		return nome;
	}

	public int getAtendimentos() {
		return this.atendimentos;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

}
