package curso.cnj.javabasico.modulo17;

class AnimalZ {
	public void somDoAnimal() {
		System.out.println("Qual o som que o Animal faz?");
	}
	
}

//Classe filho, no processo de herança
class CaoZ extends AnimalZ {
	public void somDoAnimal() {
		System.out.println("Cachorro");
		System.out.println("Au, Au, Au!!!");
	}
}
	
	class PorcoZ extends AnimalZ {
		public void somDoAnimal() {
			System.out.println("Porco!!!");
			System.out.println("Oinc, Oinc, Oinc!!!");
		}
	}
	
	class Gato extends AnimalZ {
		public void somDoAnimal() {
			System.out.println("Miau, Miau, Miau!!!");
		}
	}
	
	
	class Leao extends AnimalZ {
		public void somDoAnimal() {
			System.out.println("RRROOOOOAAAAAARRRRRRRR!!!");
		}
	}
public class Aula9 {

	public static void main(String[] args) {
		
		//Polimorfismo.... mesmo método varios deferentes resultados...
		AnimalZ animal = new AnimalZ();
		AnimalZ cao = new CaoZ();
		AnimalZ porco = new PorcoZ();
		AnimalZ gato = new Gato();
		AnimalZ leao = new Leao();
		
		animal.somDoAnimal();
		cao.somDoAnimal();
		porco.somDoAnimal();
		gato.somDoAnimal();
		leao.somDoAnimal();
				
	}

}
