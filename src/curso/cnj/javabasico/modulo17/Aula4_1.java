package curso.cnj.javabasico.modulo17;

public class Aula4_1 {
	
	public void mostrar() {
		System.out.println("Texto do método");
	}
	
}

class Modelo extends Aula4_1 {
		
	//com a anotação @Override será necessãrio que os dois métodos tenha a mesma assinatura
	//sem ela podemos reescrever o método, mas será outro tipo de "reaproveitamento de método"
		@Override
		public void mostrar() {
			System.out.println("Texto do outro método");
		}
		
		//deu um exemplo de anotação @Target... mas não vale a pena reproduzir...:((

	public static void main(String[] args) {
		
		Modelo obj = new Modelo();
		obj.mostrar();

	}
}

