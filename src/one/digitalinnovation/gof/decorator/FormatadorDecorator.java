package one.digitalinnovation.gof.decorator;

public abstract class FormatadorDecorator implements Formatador {
	Formatador formatador;
	
	public FormatadorDecorator(Formatador formatador) {
		super();
		this.formatador = formatador;
	}
}
