package curso.cnj.javabasico.modulo17;

public class Aula3 {
	
	static int metodo(int a, int b) {
		
		return a+b;
		
	}
	
	static double metodo(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = metodo(8, 5);
		double num2 = metodo(4.5, 5.4);
		
		System.out.println("Resultados:\n M�todo inteiros--> " + num1 + "\n M�todo Double--> " + num2 );

	}

}
