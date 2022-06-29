package curso.cnj.javabasico.modulo17;

//Classe PAI, no processo de herança
class AnimalX {
	public void somDoAnimal() {
		System.out.println("Qual o som que o Animal faz?");
	}
	
}

//Classe filho, no processo de herança
class CaoX extends AnimalX {
	public void somDoAnimal() {
		System.out.println("Cachorro");
		System.out.println("Au, Au, Au!!!");
	}
}
	
	class PorcoX extends AnimalX {
		public void somDoAnimal() {
			System.out.println("Porco!!!");
			System.out.println("Oinc, Oinc, Oinc!!!");
		}
	}
	
	class AnimalGenerico extends AnimalX {
		public void somDoAnimal() {
			super.somDoAnimal();
		}
	}
	
public class Aula5 {

	public static void main(String[] args) {
		
		AnimalX animal = new AnimalX();
		AnimalX cao = new CaoX();
		AnimalX porco = new PorcoX();
		AnimalX generico = new AnimalGenerico();
		
		animal.somDoAnimal();
		cao.somDoAnimal();
		porco.somDoAnimal();
		generico.somDoAnimal();
		

	}

}
