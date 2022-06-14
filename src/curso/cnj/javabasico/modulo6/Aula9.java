package curso.cnj.javabasico.modulo6;

public class Aula9 {
	
	public void exibirClasseUm() {
		System.out.println("Minha Classe um");
	}
	
	public class ClasseDois {
		public void exibirClasse2() {
			System.out.println("Minha Classe 2");
			Aula9.this.exibirClasseUm();
		}
		
		public void exibir() {
			this.exibirClasse2();
			Aula9.this.exibirClasseUm();
		}
	}

	public static void main(String[] args) {
		
		Aula9 obj = new Aula9();
		Aula9.ClasseDois obj1 =  obj.new ClasseDois();
		
		obj.exibirClasseUm();
		obj1.exibirClasse2();
		obj1.exibir();
		
		
		

	}

}
