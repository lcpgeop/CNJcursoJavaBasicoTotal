package curso.cnj.javabasico.modulo20;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

public class Aula1_lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random n = new Random();
		ArrayList<Integer> numeros = new ArrayList<>();
		ArrayList<Integer> numero = new ArrayList<>();
		
		for(int i = 0; i < 20; i++) {
			numeros.add(n.nextInt(100));
		}
		
		numeros.forEach((x) -> {
			System.out.println(x);
		});

		for(int i = 0; i < 20; i++) {
			numero.add(n.nextInt(526));
		}
		System.out.println("");
		System.out.println("+------------------------------------------------------------------------------------+");
		System.out.println("");
		Consumer<Integer> consumer = (y) -> {
			System.out.println(y);
		};
		
		numero.forEach(consumer);
		
		
		
		
	}

}
