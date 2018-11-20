import java.util.ArrayList;

public class Hospital {

	private ArrayList<Animal> internados = new ArrayList<Animal>();

	public void vacinar(Animal a) {
		if (a.isVacinado() == true) {
			System.out.println("Seu animal j� est� vacinado");
		} else {
			a.setVacinado(true);
			System.out.println(a.getNome() + " foi vacinado");
		}
	}
	
	public void listarInternados() {
		for(int i=0; i <= internados.size(); i++) {
			internados.get(i).getNome();
		}
	}

	
	public void medicar(Animal a) {
		if (a.isDoente() == false) {
			System.out.println("Seu animal est� saud�vel");
		} else {
			a.setDoente(false);
			System.out.println(a.getNome() + " foi medicado e est� saud�vel");
		}
	}

	public void internar(Animal a) {
		int indice = internados.indexOf(a);
		if (indice != -1) {
			System.out.println("Este animal j� est� internado");
		}else {
			internados.add(a);
			System.out.println("O animal foi internado");
		}
	}

	public void darAlta(Animal a) {
		if (internados.isEmpty()) {
			System.out.println("N�o h� animais internados");
		} else {
			int indice = internados.indexOf(a);
			if (indice == -1) {
				System.out.println("Este animal n�o est� internado");
			}else {
				internados.remove(indice);
				System.out.println("O animal n�o est� no hospital");
			}
		}

	}

}
