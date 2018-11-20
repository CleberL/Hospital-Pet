import java.util.ArrayList;

public class Hospital {

	public ArrayList<Animal> internados = new ArrayList<Animal>();
	public ArrayList<Veterinario> veterinarios = new ArrayList<Veterinario>();
	

	public void listarInternados() {
		for (int i = 0; i <= internados.size(); i++) {
			internados.get(i).getNome();
		}
	}
	
	public void inserirVeterinario(Veterinario v) {
		veterinarios.add(v);
	}
	
	public void pagarComissaoVeterinarios(){
		
		for(int i = 0; i<veterinarios.size(); i++) {
		Veterinario v = veterinarios.get(i);
		v.creditarComissao((float)(v.getAtendimentos() * 5f));
		v.zerarAtendimentos();
		System.out.println("Comissão paga para " + v.getNome());
		}
	}

}
