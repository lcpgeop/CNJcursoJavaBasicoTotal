package curso.cnj.javabasico.modulo13;

import java.util.ArrayList;
import java.util.Iterator;

public class Aula3 {

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

		Iterator <Integer> percorrer =  colecaoArrayListIterator.iterator();

		System.out.println(colecaoArrayListIterator);
		
		while(percorrer.hasNext()) {
			Integer i = percorrer.next();
			System.out.print(" - " + i);
			if(i < 10) {
				percorrer.remove();
			}
			
		}
		System.out.println("-------------------------------");
		System.out.println(colecaoArrayListIterator);
	}

}
