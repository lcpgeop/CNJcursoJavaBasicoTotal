package curso.cnj.javabasico.modulo17;

class Banco{
	private String nome;
	
	Banco(String nome){
		this.nome = nome;
	}
	
	public String getNomeBanco() {
		return this.nome;
	}
}

class Empregado{
	private String nome;
	
	Empregado(String nome){
		this.nome = nome;
	}
	
	public String getNomeEmpregado() {
		return this.nome;
	}
}

public class Aula10_Composicao {

	public static void main(String[] args) {
		
		//em tese se trata de prática referente ao conceito de ASSOCIAÇÂO

		Banco banco = new Banco("Caixa");
		Empregado empregado = new Empregado("Nome do Empregado Caixa");
		System.out.println(empregado.getNomeEmpregado() + " empregado do banco " + banco.getNomeBanco());

	}

}
