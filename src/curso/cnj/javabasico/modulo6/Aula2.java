package curso.cnj.javabasico.modulo6;

public class Aula2 {

	//Exemplo de Objetos.. conf o prof. mas t� esquisito
	//Ele t� chamando de Objetos mas na verdade se trata de Atributos do Objeto
	
	String raca = "PitBull";
	int idade = 3;
	double peso = 8.5;
	boolean status = true;

	public static void main(String[] args) {
		
		//Instancia��o
		
		Aula2 classesEhObjetos = new Aula2();
		
		System.out.println("A ra�a do cachorro �: " + classesEhObjetos.raca);
		System.out.println("O Peso do cachorro �: " + classesEhObjetos.peso);
		System.out.println("A Idade do cachorro �: " + classesEhObjetos.idade);
		

	}

}
