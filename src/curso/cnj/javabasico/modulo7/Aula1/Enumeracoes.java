package curso.cnj.javabasico.modulo7.Aula1;

public class Enumeracoes {
	
	public static void main(String[] args) {
		
		 Altura obj = Altura.MEDIO;
			
			switch  (obj) {
			
				case BAIXO:
					System.out.println("Valor Escolhido para o ENUM: Baixo");
					break;
				case ALTO:
					System.out.println("Valor Escolhido para o ENUM: Alto");
					break;
				case MEDIO:
					System.out.println("Valor Escolhido para o ENUM: Médio");
					break;
				default:
					System.out.println("Nenhum valor selecionado para o ENUM");
			}
			
			for(Altura a : Altura.values()) {
				System.out.println("Valor do Enum: " + a);
				System.out.println("Descrição do Enum: " + a.getDescricao());
			}

	}
	
}
