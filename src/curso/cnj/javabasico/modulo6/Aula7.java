package curso.cnj.javabasico.modulo6;

public class Aula7 {
	
	public String nome;
	final int idade = 18;
	private double altura;
	
	static void acao() {
		int numero = 10;
		System.out.println("Número: " + numero);
	}
	
	public void acao2() {
		int numero2 = 20;
		System.out.println("Número2: "+ numero2);
	}
	
	public Aula7(String nome,/* int idade, */double altura){
		this.nome = nome;
		//this.idade = idade; não é permitido mudar valores de Constantes
		this.altura = altura;
	}

	public static void main(String[] args) {
		
		acao();
		//acao2(); Acesso direto ao método não é permitido
		Aula7 obj = new Aula7("Nome de teste", 1.77);
		obj.acao2();
		
		System.out.println(obj.nome);
		System.out.println(obj.idade);
		System.out.println(obj.altura);
		



	}

}
