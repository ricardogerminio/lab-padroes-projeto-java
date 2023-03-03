package one.digitalinnovation.gof.decorator;

public class FormatadorSimples implements Formatador{

	@Override
	public String formataDados(Aluno aluno) {
		StringBuilder sb = new StringBuilder();
		sb.append("Aluno: " + aluno.nome);
		sb.append("\n");
		sb.append("Matrícula: " + aluno.matricula);
		sb.append("\n");
		sb.append("Curso: " + aluno.curso);
		sb.append("\n");
		sb.append("Periodo: " + aluno.periodo + "° periodo");
		return sb.toString();
	}

}
