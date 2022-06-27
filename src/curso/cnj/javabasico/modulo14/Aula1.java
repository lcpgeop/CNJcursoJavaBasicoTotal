package curso.cnj.javabasico.modulo14;

import java.io.File;
import java.io.IOException;

public class Aula1 {

	public static void main(String[] args) {
		//Operações com Arquivos
		
		File obj = new File("D:\\LuizCarlosPereira\\Informatica\\TRE-MT\\CNC-Cursos(Material)\\JavaBasico\\Arquivos\\nomeDoArquivo.txt");
		File obj2 = new File("D:\\LuizCarlosPereira\\Informatica\\TRE-MT\\CNC-Cursos(Material)\\JavaBasico\\Arquivos\\nomeDoArquivo2.txt");
		
		try {
				if(obj.createNewFile()) {
					System.out.println("Arquivo Criado com sucesso!!" + obj.getName());
				} else {
					System.out.println("Arquivo já existe!!");
				}
				if(obj2.createNewFile()) {
					System.out.println("Arquivo Criado com sucesso!!" + obj2.getName());
				} else {
					System.out.println("Arquivo já existe!!");
				}
				if(obj2.delete()) {
					System.out.println("Arquivo Apagado com sucesso!!" + obj2.getName());
				} else {
					System.out.println("Falha ao deletar arquivo!!");
				}
				
		} catch(IOException e) {
			System.out.println("Erro ao Executar!" + e.getMessage());
		}
	}

}
;
