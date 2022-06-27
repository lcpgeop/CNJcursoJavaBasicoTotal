package curso.cnj.javabasico.modulo11;

import java.util.Date;

public class Aula1 {

	public static void main(String[] args) {
		
		Runtime obj = Runtime.getRuntime();
		
		System.out.println("Mem�ria Total: " + obj.totalMemory());
		System.out.println("Mem�ria Antes da Inst�ncia: " + obj.freeMemory());
		
		Date teste = null;
		
		for(int i = 0; i < 100000; i++) {
			teste = new Date();
			teste = null;
		}

		System.out.println("Mem�ria Ap�s a Inst�ncia: " + obj.freeMemory());
		
		obj.gc();
		
		System.out.println("Mem�ria Ap�s a Garbage Collector: " + obj.freeMemory());
		
	}

}
