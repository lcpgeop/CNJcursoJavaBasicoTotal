package curso.cnj.javabasico.modulo9;

import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
			System.out.print("Digite seu nome: ");
			String nome = obj.nextLine();
			System.out.println();
			System.out.print("Digete a sua idade: ");
			int idade = obj.nextInt();
			System.out.println();
			System.out.println("Prezado usuário, você digitou o nome: " + nome);
			System.out.println("A idade digitada foi: " + idade);
		
		obj.close();

	}

}
