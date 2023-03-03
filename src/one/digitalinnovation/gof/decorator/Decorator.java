package one.digitalinnovation.gof.decorator;

public class Decorator {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Ricardo", "123456789", "Ciência da Computação", "4");
		
		Formatador formatador = new FormatadorSimples();
		formatador = new FormatadorPagamentoAtraso(formatador);
		formatador = new FormatadorCaixaAlta(formatador);
		
		
		String alunoFormatado = formatador.formataDados(aluno);
		System.out.println(alunoFormatado);
	}
}
