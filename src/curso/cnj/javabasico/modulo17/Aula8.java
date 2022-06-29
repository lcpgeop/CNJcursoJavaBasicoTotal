package curso.cnj.javabasico.modulo17;
abstract class OutroAnimal{
	public abstract void comer();
}

class Lobo extends OutroAnimal {

	@Override
	public void comer() {
		System.out.println("Comida de Lobo!!");
		
	}
	
}

class Peixe  extends OutroAnimal {

	@Override
	public void comer() {

		System.out.println("Comida de Peixe!!");
		
	}
	
}

public class Aula8 {

	public static void main(String[] args) {
		OutroAnimal lobo = new Lobo();
		OutroAnimal peixe = new Peixe();
		
		lobo.comer();
		peixe.comer();

	}

}
