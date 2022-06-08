package curso.cnj.javabasico.modulo4;

/*�rea do trap�zio: (basemaior+basemenor).h
 *                                                   2
 *Volume do cilindro: V = PI * r� * h
 */

public class Aula_6 {
	static int n1 = 5;
	static int n2 = 7;
	static int n3 = 9;
	static int soma;
	
	static int baseMaior = 7, baseMenor = 5, h = 5;
	static float area;
	
	static double v;
	static int r = 3;
	static final double PI = 3.14;
	
	static int idade = 30, peso = 60;

	public static void main(String[] args) {
		//exemplos de precedencia de operadoress
		soma = n1 + n2 + n3;
		System.out.println(soma);
		soma = n1 * n2 + n3;
		System.out.println(soma);
		soma = n1 *( n2 + n3);
		System.out.println(soma);
		
		//exemplos de calculo de arae de figuras geom�tricas
		area =( (baseMaior + baseMenor)*h)/2;
		System.out.println(area);
		
		v = PI *(r*r)*h;
		System.out.println(v);
		
		//verifica��o da possibilidade de um usu�rio doar sangue
		
		if(idade >= 18 && peso >= 50) {
			System.out.println("Doa��o liberada!!");
		} else {
			System.out.println("Doa��o n�o permitida!!!");
		}
		
		

	}

}
