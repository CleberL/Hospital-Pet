import java.util.ArrayList;

public class Hospital {
	
	private ArrayList<Animal> internados = new ArrayList<Animal>();
	
	public void tosar(Animal a) {

	}

	public void darBanho(Animal a) {

	}

	public void vacinar(Animal a) {
		if (a.isVacinado() == true) {
			System.out.println("Seu animal já está vacinado");
		} else {
			a.setVacinado(true);
			System.out.println(a.getNome() + "foi vacinado");
		}
	}

	public void medicar(Animal a) {
		if (a.isDoente() == false) {
			System.out.println("Seu animal está saudável");
		} else {
			a.setDoente(false);
			System.out.println(a.getNome() + "foi medicado e está saudável");
		}
	}	

	private void internar(Animal a) {
		//TODO implementar internação
	}

	private void darAlta() {
		//TODO implementar alta
	}

}
