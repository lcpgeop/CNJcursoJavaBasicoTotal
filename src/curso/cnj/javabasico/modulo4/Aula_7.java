package curso.cnj.javabasico.modulo4;

public class Aula_7 {
	
	static String nome = "Meu Nome";
	static String nomeMae = "Minha M�e";
	static String disciplina = "Java B�sico";
	static String cidade = "CUIAB�";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nome);
		System.out.println("Meu nome tem "+nome.length()+" letras");
		System.out.println("O aluno " + nome.toUpperCase()+" est� estudando "+disciplina);
		System.out.println(cidade.toLowerCase());
		System.out.println(disciplina.indexOf("B�"));
		System.out.println(nome.concat(" ").concat(cidade));

	}

}
