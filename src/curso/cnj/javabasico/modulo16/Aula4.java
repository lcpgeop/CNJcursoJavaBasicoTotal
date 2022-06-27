package curso.cnj.javabasico.modulo16;

public class Aula4 {
	
	public static void main(String[] args) {
		
		try {
			
			String teste ="123s";
			Double.parseDouble(teste);
			System.out.println("Convertido: " + teste);
			
		} catch(Exception e) {
			//System.out.println("Erro de conversão de tipos " + e);
			e.printStackTrace();
		}
	}
	

}
