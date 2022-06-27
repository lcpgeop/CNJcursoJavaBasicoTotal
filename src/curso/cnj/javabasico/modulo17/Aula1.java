package curso.cnj.javabasico.modulo17;
//Classe PAI, no processo de herança
class Animal {
	public void somDoAnimal() {
		System.out.println("Qual o som que o Animal faz?");
	}
	
}

//Classe filho, no processo de herança
class Cao extends Animal {
	public void somDoAnimal() {
		System.out.println("Cachorro");
		System.out.println("Au, Au, Au!!!");
	}
}
	
	class Porco extends Animal {
		public void somDoAnimal() {
			System.out.println("Porco!!!");
			System.out.println("Oinc, Oinc, Oinc!!!");
		}
	}
	


public class Aula1 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal cao = new Cao();
		Animal porco = new Porco();
		
		animal.somDoAnimal();
		cao.somDoAnimal();
		porco.somDoAnimal();
		
	}
	

}
