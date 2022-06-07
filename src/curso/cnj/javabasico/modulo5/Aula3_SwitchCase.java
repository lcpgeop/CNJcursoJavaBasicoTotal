package curso.cnj.javabasico.modulo5;

public class Aula3_SwitchCase {

	public static void main(String[] args) {
		
		int diaSemana = 1;
		String pergunta = "simb";
		
		switch(diaSemana) {
		
			case 1: 
				System.out.println("DOMINGO");
				break;
			case 2: 
				System.out.println("SEGUNDA");
				break;
			case 3:
				System.out.println("TERÇA");
				break;
			case 4:
				System.out.println("QUARTA");
				break;
			case 5:
				System.out.println("QUINTA");
				break;
			case 6:
				System.out.println("SEXTA");
				break;
			case 7:
				System.out.println("SÁBADO");
				break;
			default:
				System.out.println("Escolha inválida");
		}

		switch(pergunta) {
		
		case "sim": 
			System.out.println("Responsta Verdadeira!!");
			break;
		case "nao": 
			System.out.println("Resposta Falsa!!");
			break;
		default:
			System.out.println("Resposta inválida");
	}
	
	}

}
