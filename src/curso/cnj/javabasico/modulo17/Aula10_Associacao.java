package curso.cnj.javabasico.modulo17;

import java.util.ArrayList;
import java.util.List;

class Livro{
	private String titulo;
	private String autor;
	
	Livro(String titulo, String autor){
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
}

class Livraria{
	private final List<Livro> livro;
	
	
	Livraria(List<Livro> livro){
		this.livro = livro;
	}
	
	public List<Livro> getTotalLivroLivraria() {
		return livro;
	}
	
}

public class Aula10_Associacao {

	public static void main(String[] args) {
		
		//em tese se trata de prática referente ao conceito de ASSOCIAÇÂO

		Livro l1 = new Livro("Introdução ao JAVA", "Pedro");
		Livro l2 = new Livro("Java", "Paulo");
		
		List<Livro> livros = new ArrayList<>();
		
		livros.add(l1);
		livros.add(l2);
		
		Livraria livraria = new Livraria(livros);
		List<Livro> listaDeLivros = livraria.getTotalLivroLivraria();
		
		for(Livro livro : listaDeLivros) {
			System.out.print("Título do livro: " + livro.getTitulo() +"  ");
			System.out.println("Autor: " + livro.getAutor());
		}

	}

}
