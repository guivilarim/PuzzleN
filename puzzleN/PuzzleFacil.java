package puzzleN;

public class PuzzleFacil extends Puzzle {

	public PuzzleFacil(String nome) {
		super(nome, Dificuldade.FACIL);
	}

	public void resolveTabuleiro() throws TempoExcedido {
		
		int linha = 0;
		int coluna = 0;
		
		while (!this.getGridPuzzle().isTabuleiroOrdenado()) {
		while (!this.getGridPuzzle().isLinhaOrdenada(linha) || !this.getGridPuzzle().isColunaOrdenada(coluna)) {
			this.getGridPuzzle().setPosicaoValidaResolve();
			for (int i = 0; i < this.getGridPuzzle().getA(); i++) {
				for (int j = 0; j < this.getGridPuzzle().getA(); j++) {
					if (this.getGridPuzzle().getGrid()[i][j].getValido() && (i - 1) >= 0
							&& !this.getGridPuzzle().getGrid()[i - 1][j].getValido()
							&& this.getGridPuzzle().geraStringMovimento().equals("baixo")) {
						this.getGridPuzzle().executaMovimentoResolve(i - 1, j, "baixo");

					} else if (this.getGridPuzzle().getGrid()[i][j].getValido() && (i + 1) < this.getGridPuzzle().getA()
							&& !this.getGridPuzzle().getGrid()[i + 1][j].getValido()
							&& this.getGridPuzzle().geraStringMovimento().equals("cima")) {
						this.getGridPuzzle().executaMovimentoResolve(i + 1, j, "cima");

					} else if (this.getGridPuzzle().getGrid()[i][j].getValido() && (j - 1) >= 0
							&& !this.getGridPuzzle().getGrid()[i][j - 1].getValido()
							&& this.getGridPuzzle().geraStringMovimento().equals("direita")) {
						this.getGridPuzzle().executaMovimentoResolve(i, j - 1, "direita");

					} else if (this.getGridPuzzle().getGrid()[i][j].getValido() && (j + 1) < this.getGridPuzzle().getA()
							&& !this.getGridPuzzle().getGrid()[i][j + 1].getValido()
							&& this.getGridPuzzle().geraStringMovimento().equals("esquerda")) {
						this.getGridPuzzle().executaMovimentoResolve(i, j + 1, "esquerda");

					}

				}
			}
		}
		linha++;
		coluna++;


		}

	}
}