package curso.cnj.javabasico.modulo6;

public class Aula3 {

	private String marca;
	private String modelo;
	private String cor;
	private String placa;

	public static void main(String[] args) {
		
		Aula3 carro1 = new Aula3();
		carro1.marca = "Volks";
		carro1.modelo = "Fusca";
		carro1.cor = "Vermelho";
		carro1.placa = "NAS 1243";
		

		Aula3 carro2 = new Aula3();
		carro2.marca = "Ford";
		carro2.modelo = "Corcel";
		carro2.cor = "Amarelo";
		carro2.placa = "NPS 2146";
		
		System.out.print("Veiculo 1: "+carro1.marca);
		System.out.print("  -   "+carro1.modelo);
		System.out.print("  -  "+carro1.cor);
		System.out.println("  -  "+carro1.placa);
		
		
		System.out.print("Veiculo 2: "+carro2.marca);
		System.out.print("  -   "+carro2.modelo);
		System.out.print("  -  "+carro2.cor);
		System.out.println("  -  "+carro2.placa);
	}

}
