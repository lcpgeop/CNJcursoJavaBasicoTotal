package curso.cnj.javabasico.modulo4;

public class Aula9 {
	
	static boolean pAberta = false;
	static boolean lampada = true;
	static int  temperatura = 21;

	public static void main(String[] args) {
		
		if(pAberta == true) {
			
			System.out.println("Feche a Porta!!!");
			
		} else {
			System.out.println("Abra a Porta");
		}
		
		if(pAberta == true) {
			
			System.out.println("L�mpada est� acesa!!!");
			
		} else {
			System.out.println("L�mpada est� apagada");
		}
		
		if(temperatura < 30 && temperatura > 20) {
			System.out.println("Temperatura Agrad�vel");
		} else if(temperatura > 30) {
			System.out.println("So Hot!!!!!");
		} else {
			System.out.println("Est� frio hoje!!!");
		}

	}

}
