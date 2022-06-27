package curso.cnj.javabasico.modulo11;

import java.util.Date;

public class Aula1 {

	public static void main(String[] args) {
		
		Runtime obj = Runtime.getRuntime();
		
		System.out.println("Memória Total: " + obj.totalMemory());
		System.out.println("Memória Antes da Instância: " + obj.freeMemory());
		
		Date teste = null;
		
		for(int i = 0; i < 100000; i++) {
			teste = new Date();
			teste = null;
		}

		System.out.println("Memória Após a Instância: " + obj.freeMemory());
		
		obj.gc();
		
		System.out.println("Memória Após a Garbage Collector: " + obj.freeMemory());
		
	}

}
