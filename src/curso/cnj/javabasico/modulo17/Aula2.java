package curso.cnj.javabasico.modulo17;

//Classe Pai
class Pai{
	String nome;
	
	void mostrarPai() {
		System.out.println("Exibindo Pai");
	}
}

//Classe Filho
class Filho extends Pai{
	String filho;
	
	void mostraFilho() {
		System.out.println("Exibindo Filho");
	}
}

public class Aula2 {
	
	public static void main(String[] args) {
		
		//UpCasting
		Pai obj = new Filho();
		obj.nome = "Nome do Pai";
		obj.mostrarPai();
		
		
		Filho obj2 = (Filho) obj;
		//DownCasting
		obj2.filho = "Nome do Filho";
		System.out.println(obj2.nome);
		obj2.mostraFilho();
		System.out.println(obj2.filho);
	}

}
