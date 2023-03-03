package one.digitalinnovation.gof.decorator;

public class FormatadorCaixaAlta extends FormatadorDecorator {
	
	public FormatadorCaixaAlta(Formatador formatador) {
		super(formatador);
	}

	@Override
	public String formataDados(Aluno aluno) {
		return formatador.formataDados(aluno).toUpperCase();
	}
}
