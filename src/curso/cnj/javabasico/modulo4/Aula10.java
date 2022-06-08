package curso.cnj.javabasico.modulo4;

public class Aula10 {
	static int nInteiro =150;
	static float nReal = nInteiro;
	static double nReal_Double = nReal;
	static float nFloat = 50.0f;
	static int float_to_Int = (int) nFloat;

	public static void main(String[] args) {
		
		System.out.println("Valor inteiro: "+nInteiro);
		System.out.println("Valor inteiro convertido para float: "+nReal);
		System.out.println("Valor float convertido para Double : "+nReal_Double);
		System.out.println("+---------------------------------------------------------------------------+ ");
		System.out.println("Valor float convertido para Int : "+float_to_Int);
		

	}

}
