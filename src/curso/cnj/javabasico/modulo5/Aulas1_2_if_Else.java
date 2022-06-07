package curso.cnj.javabasico.modulo5;

public class Aulas1_2_if_Else {

	public static void main(String[] args) {
		
		String aluno = "Luiz Carlos Pereira";
		double nota1 = 0;
		double nota2 = 5;
		double nota3 = 8;
		double nota4 = 2;
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		//aprovado e reprovado
		
		System.out.println("Estrutura com apenas duas possibilidades: Aprovado ou Reprovado");
		
		if(media >= 7) {
			System.out.println("O Aluno: "+aluno+", com m�dia "+media+", foi Aprovado");
			
		} else {
			System.out.println("O Aluno: "+aluno+", com m�dia "+media+", foi Reprovado");
		}
		
		//aprovado Recupera��o ou reprovado
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Estrutura com apenas tr�s possibilidades: Aprovado, em Recupera��o ou Reprovado");
		
		if(media >= 7) {
			System.out.println("O Aluno: "+aluno+", com m�dia "+media+", foi Aprovado");
			
		} else if(media < 4){
			System.out.println("O Aluno: "+aluno+", com m�dia "+media+", foi Reprovado");
		}else {
			System.out.println("O Aluno: "+aluno+", com m�dia "+media+", Esta em Recupera��o");
		}
		

		//aprovado Recupera��o ou reprovado
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Estrutura de teste com EqualsIgnoreCase");
		
		if(aluno.equalsIgnoreCase("lui Carlos Pereira")) {
			System.out.println("O Aluno "+aluno+", Est� regular");
			
		}else {
			System.out.println("N�o � o aluno titular do curso");
		}
		
	
	}
	
}
