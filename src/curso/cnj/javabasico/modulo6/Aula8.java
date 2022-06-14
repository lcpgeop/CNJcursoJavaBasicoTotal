package curso.cnj.javabasico.modulo6;

import javax.swing.JOptionPane;

public class Aula8 {
	
	private String nome;
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void exibir(String nome) {
		System.out.println("Nome digitado: " + nome);
	}


	public static void main(String[] args) {
		
		Aula8 obj = new Aula8();
		obj.setNome(JOptionPane.showInputDialog("Digite um Nome! "));
		obj.exibir(obj.getNome());

	}

}
