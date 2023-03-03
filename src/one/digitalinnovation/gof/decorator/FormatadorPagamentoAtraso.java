package one.digitalinnovation.gof.decorator;

public class FormatadorPagamentoAtraso extends FormatadorDecorator {

	public FormatadorPagamentoAtraso(Formatador formatador) {
		super(formatador);
	}

	@Override
	public String formataDados(Aluno aluno) {
		String formataDados = formatador.formataDados(aluno);
		StringBuilder sb = new StringBuilder();
		sb.append("PAGAMENTO EM ATRASO");
		sb.append("\n");
		sb.append("\n");
		sb.append(formataDados);
		return sb.toString();
	}

}
