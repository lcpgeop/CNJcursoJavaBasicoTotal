package curso.cnj.javabasico.modulo13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> colecaoHashSet = new HashSet<>();
		ArrayList<String> colecaoArrayList = new ArrayList<>();
		HashMap<String, String> colecaoHashMap = new HashMap<>();

		System.out.println("");
		System.out.println("+---------------Estrutura HashSet------------------+");
		System.out.println("");
		
		colecaoHashSet.add("Nome 1");
		colecaoHashSet.add("Nome 2");
		colecaoHashSet.add("Nome 3");
		System.out.println("itens: " + colecaoHashSet);

		if(colecaoHashSet.contains("Nome 1")) {
			System.out.println("Nome 1, Continua na lista");
		}
		
		System.out.println("itens: " + colecaoHashSet);
		
		colecaoHashSet.remove("Nome 1");
		System.out.println("itens: " + colecaoHashSet);

		if(colecaoHashSet.contains("Nome 1")) {
			System.out.println("Nome 1, Continua na lista");
			
		} else {
			System.out.println("Nome 1, Sumiu da lista");
			
		}
		
		System.out.println("");
		System.out.println("+-------------------Estrutura ArrayList--------------------------+");
		System.out.println("");
		//arraylist
		
		
		colecaoArrayList.add("Nome para ArrayList 1");
		colecaoArrayList.add("Nome para ArrayList 2");
		colecaoArrayList.add("Nome para ArrayList 3");
		
		System.out.println("Mostrar o itens: " + colecaoArrayList);

		System.out.println("Mostrar o item 2: " + colecaoArrayList.get(1));
		
		colecaoArrayList.set(2,"NovoNome para ArrayList 2");
		System.out.println("Mostrar o itens: " + colecaoArrayList);
		
		
		System.out.println("");
		System.out.println("+-----------------------Estrutura HashMap----------------------+");
		System.out.println("");
		
		colecaoHashMap.put("FORD","KA");
		colecaoHashMap.put("FIAT","UNO");
		colecaoHashMap.put("VOLKS","UP");
		
		System.out.println(colecaoHashMap);
		
		colecaoHashMap.clear();
		System.out.println(colecaoHashMap);
		
		
		colecaoHashMap.put("FORD","RANGER");
		System.out.println(colecaoHashMap);
		
		
		
	}

}
