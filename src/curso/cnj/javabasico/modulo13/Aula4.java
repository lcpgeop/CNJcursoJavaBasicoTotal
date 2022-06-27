package curso.cnj.javabasico.modulo13;

import java.util.ArrayList;

public class Aula4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> colecaoArrayListIterator = new ArrayList<>();
		
		colecaoArrayListIterator.add(159);
		colecaoArrayListIterator.add(357);
		colecaoArrayListIterator.add(125);
		colecaoArrayListIterator.add(854);
		colecaoArrayListIterator.add(25);
		colecaoArrayListIterator.add(10);
		colecaoArrayListIterator.add(8);
		colecaoArrayListIterator.add(9);
		
		for(Integer mostra : colecaoArrayListIterator) {
			System.out.println(mostra);
		}

		System.out.println("");
		System.out.println("+---------------For Each------------------+");
		System.out.println("");
		
		String[] forEachArray = {"Carro 1", "Carro 2", "Carro 3", "Carro 4", "Carro 5" };
		
		for (String exibe : forEachArray) {
			System.out.println(exibe);
		}
		
	}

}
