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
			System.out.println("O Aluno: "+aluno+", com média "+media+", foi Aprovado");
			
		} else {
			System.out.println("O Aluno: "+aluno+", com média "+media+", foi Reprovado");
		}
		
		//aprovado Recuperação ou reprovado
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Estrutura com apenas três possibilidades: Aprovado, em Recuperação ou Reprovado");
		
		if(media >= 7) {
			System.out.println("O Aluno: "+aluno+", com média "+media+", foi Aprovado");
			
		} else if(media < 4){
			System.out.println("O Aluno: "+aluno+", com média "+media+", foi Reprovado");
		}else {
			System.out.println("O Aluno: "+aluno+", com média "+media+", Esta em Recuperação");
		}
		

		//aprovado Recuperação ou reprovado
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Estrutura de teste com EqualsIgnoreCase");
		
		if(aluno.equalsIgnoreCase("lui Carlos Pereira")) {
			System.out.println("O Aluno "+aluno+", Está regular");
			
		}else {
			System.out.println("Não é o aluno titular do curso");
		}
		
	
	}
	
}
