package curso.cnj.javabasico.modulo16;

public class Aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int[] numero = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			
			System.out.println("Mostrar a posição 5 do vetor: " + numero[5]);
			
		} catch(Exception e) {
			System.out.println("Algo de errado aconteceu!!!" + e);
		} finally {
			System.out.println("Mensagem final!!!");
		}

	}

}
