package curso.cnj.javabasico.modulo17;

public class Aula4_1 {
	
	public void mostrar() {
		System.out.println("Texto do m�todo");
	}
	
}

class Modelo extends Aula4_1 {
		
	//com a anota��o @Override ser� necess�rio que os dois m�todos tenha a mesma assinatura
	//sem ela podemos reescrever o m�todo, mas ser� outro tipo de "reaproveitamento de m�todo"
		@Override
		public void mostrar() {
			System.out.println("Texto do outro m�todo");
		}
		
		//deu um exemplo de anota��o @Target... mas n�o vale a pena reproduzir...:((

	public static void main(String[] args) {
		
		Modelo obj = new Modelo();
		obj.mostrar();

	}
}

