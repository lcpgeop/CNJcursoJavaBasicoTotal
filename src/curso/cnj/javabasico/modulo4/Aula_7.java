package curso.cnj.javabasico.modulo4;

public class Aula_7 {
	
	static String nome = "Meu Nome";
	static String nomeMae = "Minha Mãe";
	static String disciplina = "Java Básico";
	static String cidade = "CUIABÁ";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nome);
		System.out.println("Meu nome tem "+nome.length()+" letras");
		System.out.println("O aluno " + nome.toUpperCase()+" está estudando "+disciplina);
		System.out.println(cidade.toLowerCase());
		System.out.println(disciplina.indexOf("Bá"));
		System.out.println(nome.concat(" ").concat(cidade));

	}

}
