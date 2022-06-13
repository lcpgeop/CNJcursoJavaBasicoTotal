package curso.cnj.javabasico.modulo6;

public class Aula2 {

	//Exemplo de Objetos.. conf o prof. mas tá esquisito
	//Ele tá chamando de Objetos mas na verdade se trata de Atributos do Objeto
	
	String raca = "PitBull";
	int idade = 3;
	double peso = 8.5;
	boolean status = true;

	public static void main(String[] args) {
		
		//Instanciação
		
		Aula2 classesEhObjetos = new Aula2();
		
		System.out.println("A raça do cachorro é: " + classesEhObjetos.raca);
		System.out.println("O Peso do cachorro é: " + classesEhObjetos.peso);
		System.out.println("A Idade do cachorro é: " + classesEhObjetos.idade);
		

	}

}
