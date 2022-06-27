package curso.cnj.javabasico.modulo17;

import java.util.ArrayList;
import java.util.List;

class Informacoes {
	private String cidade;

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
}

public class Aula4 {

	public static void main(String[] args) {
		// SOBREPOSIÇÃO de métodos
		
		List<Informacoes>enderecos =  new ArrayList<>();
		Informacoes endereco = new Informacoes();
		endereco.setCidade("Rio de Janeiro");
		for (int i = 0; i < 10; i++) {
			endereco.setCidade("Cidade " + i);
			enderecos.add(endereco);
			endereco = new Informacoes();
		}
		
		System.out.println("Cidade 1: " + endereco.getCidade());
		
		for(Informacoes e : enderecos) {
			System.out.println(e.getCidade());
		}

	}

}
