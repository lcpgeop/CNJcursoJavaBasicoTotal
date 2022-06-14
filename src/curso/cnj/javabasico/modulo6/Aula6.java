package curso.cnj.javabasico.modulo6;

public class Aula6 {
	
	//Atributos
	private String nome;
	private String marca;
	private String modelo;
	private String cor;
	private String placa;
	
	//Construtores
	public Aula6() {
		nome = "Nome de Teste";
	}

	public Aula6(String nome, String marca, String modelo, String cor, String placa ) {
		
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
	}
	
	public static void main(String[] args) {
		
		//Instanciação de objetos
		Aula6 obj = new Aula6("ZaZa", "FIAT", "Panorama", "Amarelo", "ZA 0404");
		System.out.print(obj.nome + " - " +obj.marca+ " - " + obj.modelo+ " - " + obj.cor+ " - " + obj.placa);
		
		System.out.println();
		
		Aula6 obj1 = new Aula6("Kazinho", "FORD", "KA", "Prata", "JYS 1441");
		System.out.print(obj1.nome + " - " +obj1.marca+ " - " + obj1.modelo+ " - " + obj1.cor+ " - " + obj1.placa);
		
		//mètodos
		

	}

}
