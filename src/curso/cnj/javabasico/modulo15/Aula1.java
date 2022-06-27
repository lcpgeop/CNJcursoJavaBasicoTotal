package curso.cnj.javabasico.modulo15;

public class Aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int somaPares = 0;
		
		System.out.println("Começo do programa");;
		Aula1 imprimir = new Aula1();
		imprimir.mostrar(1000);
		
//		for(int i = 0; i<= 100; i++) {
//			if(i % 2 == 0) {
//				somaPares += i;
//			}
//		}

	}
	
	private void mostrar(int x) {
		int soma = 0;
		
		for(int i = 0; i< x; i++) {
			if(i % 2 == 0) {
				soma += i;
			}
		}
		System.out.println("Soma: " + soma);

	}

}
