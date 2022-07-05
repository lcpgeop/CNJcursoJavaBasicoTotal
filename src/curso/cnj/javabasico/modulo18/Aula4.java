package curso.cnj.javabasico.modulo18;

interface AreaRetangulo {
	void getArea(int largura, int altura);
}

class Retangulo implements AreaRetangulo {

	@Override
	public void getArea(int largura, int altura) {
		// TODO Auto-generated method stub
		System.out.println("A área do Retangulo é: " + (largura * altura));
	}
	
}

public class Aula4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Retangulo areaRetangulo = new Retangulo();
		
		areaRetangulo.getArea(8, 9);

	}

}
