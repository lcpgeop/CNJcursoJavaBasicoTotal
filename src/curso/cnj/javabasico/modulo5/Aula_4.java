package curso.cnj.javabasico.modulo5;

public class Aula_4 {
	
	public static void main(String[] args) {
		//Teste de Estrutura de decisão do tipo Operador Ternário
		//sintax básica: (condicao)?FacaIsso_Se_Verdade:FacaIsso_Se_Falso
		int datas = 10;
		double media = 7.5;
		int faltas = 51;
		
		System.out.println( (datas > 15) ? "Segunda Quinzena" : "Primeira Quinzena");
		
		//Teste de Estrutura de decisão do tipo Operador Ternário Composto
		System.out.println( (media >= 7.0)  ?  "Aprovado"  :  (media < 4.0) ? "Reprovado" : "Em Recuperação");
		
		System.out.println( (media >= 7.0 && faltas < 25)  ?  "Aprovado"  :  (media < 4.0 || faltas > 50) ? "Reprovado" : "Em Recuperação");
		
	}

}
