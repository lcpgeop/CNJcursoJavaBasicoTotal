package curso.cnj.javabasico.modulo17;

public class Aula6 {
	
	static void modificadoresAcesso() {
		int r = 0, a = 10, b = 5;
		r = a + b;
		System.out.println("Total: " + r);
	}

	public void modificadoresAcesso2() {
		int r = 0, a = 50, b = 25;
		r = a + b;
		System.out.println("Total: " + r);
	}
	public static void main(String[] args) {
		// Modificadores de acesso
		modificadoresAcesso();
		Aula6 acesso = new Aula6();
		acesso.modificadoresAcesso2();
		

	}

}
