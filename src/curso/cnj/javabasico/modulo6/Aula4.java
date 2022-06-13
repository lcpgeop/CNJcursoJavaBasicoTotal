package curso.cnj.javabasico.modulo6;

public class Aula4 {
	
	//Declaração de Métodos
	
	static void meuMetodo() {
		System.out.println("Resultado do método!");
	}
	
	static void somar() {
		int resultado = 25 + 10;
		System.out.println("Resposta é: " + resultado);
	}
	
	public void juntaMetodos() {
		
		System.out.print("Vamos mostrar o ");
		meuMetodo();
		System.out.print("Somando 25 + 10 a ");
		somar();
	}

	public static void main(String[] args) {
		
		meuMetodo();
		somar();
		Aula4 obj = new Aula4();
		obj.juntaMetodos();
		

	}

}
