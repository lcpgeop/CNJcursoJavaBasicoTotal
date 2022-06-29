package curso.cnj.javabasico.modulo17;

abstract class AnimalAbstrato{
	
	public abstract void metodoAnimal(String acao);
	
	public void acao() {
		System.out.println("Dormindo!!");
	}
}

class Bicho extends AnimalAbstrato {
	public void metodoAnimal() {
		System.out.println("Acordando!!");
	}

	@Override
	public void metodoAnimal(String acao) {
		// TODO Auto-generated method stub
		System.out.println("Agora vou " + acao + "!!!");
	}
	
}

public class Aula7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicho objAnimal = new Bicho();
		objAnimal.acao();
		objAnimal.metodoAnimal();
		objAnimal.metodoAnimal("Gritar");
		objAnimal.metodoAnimal("Correr");

	}

}
