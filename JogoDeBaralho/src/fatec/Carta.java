package fatec;
public class Carta {

	private Naipe naipe; 
	private Valor valor;

	public Carta(Valor valor, Naipe naipe) {
		this.naipe = naipe;
		this.valor = valor;
	}

	public String toString () {
		return valor + " de " + naipe;
	}

	public Naipe getNaipe() {
		return this.naipe;
	}
	public Valor getValor() {
		return this.valor;
	}
	public void setValor(Valor valor) {
		this.valor = valor;
	}
	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	

	
	
}
