package curso.cnj.javabasico.modulo16;

public class Aula1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] numero = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		
//		System.out.println("Mostrar a posição 10 do vetor: " + numero[10]);
//		
		try {
			int[] numero = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			
			System.out.println("Mostrar a posição 10 do vetor: " + numero[10]);
			
		} catch(Exception e) {
			System.out.println("Erro ao executar!!" + e);
		}

	}

}
