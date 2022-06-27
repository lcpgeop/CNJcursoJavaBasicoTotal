package curso.cnj.javabasico.modulo16;


public class Aula3 {
	static void verificarIdade(int idade) {
		
		if(idade < 18) {
			throw new ArithmeticException("Acesso Negado!!!");
		} else {
			System.out.println("Acesso Permitido!!");
		}
		
	}
	
	
public static void main(String[] args) {
	verificarIdade(20);
}
}
