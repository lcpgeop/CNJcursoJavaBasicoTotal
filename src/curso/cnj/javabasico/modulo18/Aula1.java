package curso.cnj.javabasico.modulo18;

interface Empresa {
	public void funcao();
	public void salario();
}

class Gerente implements Empresa {

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
	
}
public class Aula1 {

	public static void main(String[] args) {
		
		Gerente gerenteDeLoja = new Gerente();
		
		gerenteDeLoja.funcao();
		gerenteDeLoja.salario();
		

	}

}
