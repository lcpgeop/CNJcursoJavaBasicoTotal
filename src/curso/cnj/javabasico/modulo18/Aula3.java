package curso.cnj.javabasico.modulo18;

interface Tela {
	default void tela() {
		System.out.println("Programação JAVA");
	}
	
	abstract void telaMSG(String msg);
}

public class Aula3 implements Tela{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aula3 teste = new Aula3();
		teste.tela();
		teste.telaMSG("+--------------- Fim do Teste ------------------+");

	}

	@Override
	public void telaMSG(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

}
