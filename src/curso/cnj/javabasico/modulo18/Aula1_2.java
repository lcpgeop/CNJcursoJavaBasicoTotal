package curso.cnj.javabasico.modulo18;

interface Empresa2 {
	public void funcao();
	public void salario();
}

interface Dois {
	public void funcaoNova();
	public void salarioNovo();
	public void folga();
	
}

class Gerente2 implements Empresa2, Dois {

	@Override
	public void funcao() {
		// TODO Auto-generated method stub
		System.out.println("Função de Gerenciamento");
	}

	@Override
	public void salario() {
		// TODO Auto-generated method stub
		System.out.println("Salário do Gerente: " + "R$ 5.000,00");
		
	}

	@Override
	public void funcaoNova() {
		// TODO Auto-generated method stub
		System.out.println("Nova loja para gerenciar");
	}

	@Override
	public void salarioNovo() {
		// TODO Auto-generated method stub
		System.out.println("novo Salario desta nova loja: R$ 8.000,00");
	}

	@Override
	public void folga() {
		// TODO Auto-generated method stub
		System.out.println("Agora temos folgas");
	}
	
}
public class Aula1_2 {

	public static void main(String[] args) {
		
		Gerente2 gerenteDeLoja = new Gerente2();
		
		gerenteDeLoja.funcao();
		gerenteDeLoja.salario();
		System.out.println("+---------------------------------------+");
		gerenteDeLoja.funcaoNova();
		gerenteDeLoja.salarioNovo();
		gerenteDeLoja.folga();
		

	}

}
