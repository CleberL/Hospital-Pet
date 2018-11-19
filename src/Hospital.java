import java.util.ArrayList;

public class Hospital {
	
	private ArrayList<Animal> internados = new ArrayList<Animal>();
	
	public void tosar(Animal a) {

	}

	public void darBanho(Animal a) {

	}

	public void vacinar(Animal a) {
		if (a.isVacinado() == true) {
			System.out.println("Seu animal j� est� vacinado");
		} else {
			a.setVacinado(true);
			System.out.println(a.getNome() + "foi vacinado");
		}
	}

	public void medicar(Animal a) {
		if (a.isDoente() == false) {
			System.out.println("Seu animal est� saud�vel");
		} else {
			a.setDoente(false);
			System.out.println(a.getNome() + "foi medicado e est� saud�vel");
		}
	}	

	private void internar(Animal a) {
		//TODO implementar interna��o
	}

	private void darAlta() {
		//TODO implementar alta
	}

}
