package curso.cnj.javabasico.modulo19;

class Verificando<Parametro>{
	
	private Parametro item;
	
	public void verificando  (Parametro i) {
		this.item = i;
	}
	
	public Parametro getItem() {
		return item;
	}
	
	public void setItem(Parametro i) {
		this.item = i;
	}
	
	public void detalhes() {
		System.out.println("Valor do item: " + this.item);
		System.out.println("Valor do item: " + this.item.getClass().getName());
		
	}
	
}

public class Aula1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Verificando<String> verificandoObj = new Verificando<>();
		Verificando<Integer> verificandoObj1 = new Verificando<>();
		
		
		
		verificandoObj.setItem("nome para testar");
		verificandoObj.getItem();
		verificandoObj.detalhes();
		verificandoObj1.setItem(1234);
		verificandoObj1.getItem();
		verificandoObj1.detalhes();
		

	}

}
