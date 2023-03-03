package one.digitalinnovation.gof.decorator;

public class Aluno {
	final String nome;
	final String matricula;
	final String curso;
	final String periodo;
	
	public Aluno(String nome, String matricula, String curso, String periodo) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.periodo = periodo;
	}
}
