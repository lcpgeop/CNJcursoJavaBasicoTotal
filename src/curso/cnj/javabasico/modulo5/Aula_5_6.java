package curso.cnj.javabasico.modulo5;

public class Aula_5_6 {
	
	public static void main(String[] args) {
		// Comando While
		int a = 1, resultado = 0, b = 1 ;
		
		while (a <= 10 ) {
			System.out.println(a);
			a++;
		}

		 a = 1;
		 resultado = 0;
		 b = 1 ;
		
		while (a <= 10 ) {
			System.out.println("TABUADA DO "+a);
			while(b <= 10) {
				resultado = a * b;
				System.out.println(a + " X " + b + " = " + resultado);
				b++;
			}
			b=1;
			a++;
		}
	
	}

}
