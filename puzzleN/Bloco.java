package puzzleN;

public class Bloco { // contem os dados referente as posicoes do tabuleiro

	private int valor; // valor entre 1 e N (numeros a serem preenchidos pelos blocos)
	private boolean valido; // indicar se bloco eh valido para alteracao de valor ou n

	public Bloco(int valor, boolean valido) {
		this.valor = valor;
		this.valido = valido;
	}

	public int getValor() {
		return this.valor;
	}

	public boolean getValido() {
		return this.valido;
	}

	public void setValor(int valor) { // altera o valor do atributo valor
		this.valor = valor;
	}

	public void setValido(boolean valido) { // altera o valor de valido
		this.valido = valido;
	}
}