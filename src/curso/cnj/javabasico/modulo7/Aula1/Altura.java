package curso.cnj.javabasico.modulo7.Aula1;

public enum Altura {
	
	ALTO ("Op��o para pessoas Altas"),
	MEDIO("Op��o para pessoas de estatura mediana"),
	BAIXO("Op��o para pessoas Baixas");
	
	private String descricao;
	
	Altura(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	

}
