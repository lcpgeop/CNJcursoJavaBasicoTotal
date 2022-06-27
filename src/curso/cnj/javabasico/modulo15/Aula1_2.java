package curso.cnj.javabasico.modulo15;

public class Aula1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Começo do programa");
		Aula1_2 imprimir = new Aula1_2();
		System.out.println(imprimir.mostrar(100));
		
	}
	
	private int mostrar(int x) {

		if(x == 0) {
			return 0;
		}
		
			if(x % 2 == 0) {
				return x + mostrar(x - 1);
			}
			return  mostrar(x - 1);
	}

}
