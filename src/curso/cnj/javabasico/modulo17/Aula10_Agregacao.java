package curso.cnj.javabasico.modulo17;

import java.util.ArrayList;
import java.util.List;

class Estudante{
	private int id;
	private String nome;
	private String dept;
	
	Estudante(int id, String nome, String dept){
		this.id = id;
		this.nome = nome;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}

class Departamento{
	private String nome;
	private List<Estudante> estudantes;
	
	Departamento(String nome,  List<Estudante> estudantes){
		this.nome = nome;
		this.estudantes = estudantes;
	}
	
	public List<Estudante> getEstudantes() {
		return estudantes;
	}
	
}

class Instituto{
	String nomeInstituto;
	private List<Departamento> departamentos;
	
	Instituto(String nomeInstituto,  List<Departamento> departamentos){
		this.nomeInstituto = nomeInstituto;
		this.departamentos = departamentos;
	}
	
	public int getTotalEstudantesInstituto() {
		int numeroDeEstudantes = 0;
		List<Estudante> estudantes;
		for(Departamento dept : departamentos) {
			estudantes = dept.getEstudantes();
			for(Estudante s : estudantes) {
				numeroDeEstudantes++;
			}
		}
		return numeroDeEstudantes;
	}
	
}

public class Aula10_Agregacao {

	public static void main(String[] args) {
		
		//em tese se trata de prática referente ao conceito de ASSOCIAÇÂO

		Estudante E1 = new Estudante(1, "Primeiro Aluno", "CFT");
		Estudante E2 = new Estudante(2, "Seguno Aluno", "CSF");
		Estudante E3 = new Estudante(3, "Terceiro Aluno", "CSF");
		Estudante E4 = new Estudante(4, "Quarto Aluno", "CSF");
		Estudante E5 = new Estudante(5, "Quinto Aluno", "CSF");
		
		List<Estudante> fisicaEstudante = new ArrayList<>();
		
		fisicaEstudante.add(E1);
		fisicaEstudante.add(E2);
		fisicaEstudante.add(E3);
		fisicaEstudante.add(E4);
		fisicaEstudante.add(E5);
		
		Departamento fisica = new Departamento("CSF", fisicaEstudante);
		
		List<Departamento> departamento = new ArrayList<>();
		departamento.add(fisica);
		
		Instituto instituto = new Instituto("Saber Informação", departamento);
		
		System.out.println(instituto.nomeInstituto);
		System.out.println(instituto.getTotalEstudantesInstituto());
	}

}
