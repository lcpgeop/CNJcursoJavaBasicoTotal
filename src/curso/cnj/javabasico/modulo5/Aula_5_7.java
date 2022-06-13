package curso.cnj.javabasico.modulo5;

public class Aula_5_7 {

	public static void main(String[] args) {
		
		int i;
		for(i = 1; i <= 10; i++) {
			
			System.out.println("Tabuada do " + i);
			
			for(int j = 1; j <= 10; j++) {
				System.out.println(i + " X " + j + " = " + ( i * j));
			}
		}

	}

}
