package curso.cnj.javabasico.modulo16;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Aula4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			String teste ="123s";
			Double.parseDouble(teste);
			System.out.println("Convertido: " + teste);
			
		} catch(Exception e) {
			
			StringWriter vai = new StringWriter();
			PrintWriter printVai = new PrintWriter(vai);
			e.printStackTrace(printVai);
			
			System.out.println(vai.toString());
		}
		
	}
	
}
