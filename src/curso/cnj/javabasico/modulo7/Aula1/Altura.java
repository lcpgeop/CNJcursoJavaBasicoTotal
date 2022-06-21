package curso.cnj.javabasico.modulo7.Aula1;

public enum Altura {
	
	ALTO ("Opção para pessoas Altas"),
	MEDIO("Opção para pessoas de estatura mediana"),
	BAIXO("Opção para pessoas Baixas");
	
	private String descricao;
	
	Altura(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	

}
