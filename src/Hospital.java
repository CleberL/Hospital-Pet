import java.util.ArrayList;

public class Hospital {

	public ArrayList<Animal> internados = new ArrayList<Animal>();

	public void listarInternados() {
		for (int i = 0; i <= internados.size(); i++) {
			internados.get(i).getNome();
		}
	}
	
	public void pagarComissaoVeterinario(Veterinario v){
		v.setComissao((float)(v.getAtendimentos() * 5f));
	}

}
