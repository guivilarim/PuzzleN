package puzzleN;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import puzzleN.MovimentoInvalido;

public class Tabuleiro {

	private Bloco[][] grid; // o tamnho eh definido a partir da dificuldade
	// private Dificuldade dificuldade;
	private int a;
	private int contMovimento;
	private Bloco[][] gridSolucao;// contador para a quantidade de movimentos

	public Tabuleiro(Dificuldade dificuldade) {

		this.contMovimento = 0;

		this.a = (dificuldade == Dificuldade.FACIL) ? 3 : (dificuldade == Dificuldade.NORMAL) ? 4 : 5;

		this.grid = new Bloco[this.a][this.a];
		for (int i = 0; i < this.a; i++) {
			for (int j = 0; j < this.a; j++) {
				this.grid[i][j] = new Bloco(0, false);
			}
		}

		this.setPosicaoValida(this.grid);
		
		this.gridSolucao = new Bloco[this.a][this.a];
		for (int i = 0; i < this.a; i++) {
			for (int j = 0; j < this.a; j++) {
				this.gridSolucao[i][j] = new Bloco(0, false);
			}
		}

		this.setPosicaoValida(this.gridSolucao);


	}

	public Tabuleiro(Dificuldade dificuldade, int tamanho) {// construtor tabuleiro quando a dificuldade for insano

		this.contMovimento = 0;
		if (dificuldade == Dificuldade.INSANO) {
			this.a = tamanho;
			this.grid = new Bloco[this.a][this.a];
			for (int i = 0; i < this.a; i++) {
				for (int j = 0; j < this.a; j++) {
					this.grid[i][j] = new Bloco(0, false);
				}
			}
			this.setPosicaoValida(this.grid);
		} else
			System.out.println("Este construtor só serve para o puzzle insano :(");
	}

	public void executaMovimento(int linha, int coluna, String sentido) { // mover o bloco para um lugar valido

		try {// ira checar o exception, se tiver um exception ira mandaar pra o catch
			isMovimentoValido(linha, coluna, sentido);
			this.setPosicaoValida(this.grid);

		} catch (MovimentoInvalido e) {// o catch ira tratar o exception informando q o movimento esta invalido
			JOptionPane.showMessageDialog(null, "Movimento Invalido", "ERRO :(", JOptionPane.ERROR_MESSAGE);
		}
		finally {
			this.imprimeTabuleiro();
		}
	}
	
	public void executaMovimentoResolve(int linha, int coluna, String sentido) { // mover o bloco para um lugar valido

		try {// ira checar o exception, se tiver um exception ira mandaar pra o catch
			this.isMovimentoValidoResove(linha, coluna, sentido);
			this.setPosicaoValidaResolve();

		} catch (MovimentoInvalido e) {// o catch ira tratar o exception informando q o movimento esta invalido
			JOptionPane.showMessageDialog(null, "Movimento Invalido", "ERRO :(", JOptionPane.ERROR_MESSAGE);
		}
		finally {
			this.imprimeTabuleiro();
		}
	}

	public boolean isTabuleiroOrdenado() { // deve percorrer todos os valores da grid e retornar true se estiver
											// ordenardo e false caso contrario
		// contador p verificar valor da grid
		if (this.grid[this.a - 1][this.a - 1].getValor() != 0)
			return false;// quando na ultima posicao da grid n for 0 retornar false
		for (int i = 0; i < this.a; i++) {
			for (int j = 0; j < this.a; j++) {
				if ((this.grid[i][j].getValor() != ((i * this.a) + 1 + j))
						&& (i != (this.a - 1) && j != (this.a - 1))) {
					// quando a posicao da grid n estiver ordenada de acordo com a formula retornar
					// false
					// essa regra n se aplica a ultima posicao da grid
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isLinhaOrdenada(int linha) {
		for (int i = 0; i < linha + 1; i++) {
			for (int j = 0; j < this.a; j++) {
				if ((this.grid[i][j].getValor() != ((i * this.a) + 1 + j))) {
					
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isColunaOrdenada(int coluna) {
		for (int i = 0; i < this.a; i++) {
			for (int j = 0; j < coluna + 1; j++) {
				if ((this.grid[i][j].getValor() != ((i * this.a) + 1 + j))) {
					
					return false;
				}
			}
		}
		return true;
	}
	
	public String geraStringMovimento() {
		Random rand = new Random();
		String[] direcoes = {"cima", "baixo", "esquerda", "direita"};
		
		return direcoes[rand.nextInt(4)];
	}
	
	public void setPosicaoValidaResolve() {
		for (int i = 0; i < this.a; i++) {
			for (int j = 0; j < this.a; j++) {
				if (this.grid[i][j].getValor() == 0) {// quando o bloco da grid for == 0 o valor vai ser valido, se n eh
														// false
					this.grid[i][j].setValido(false);
				} else
					this.grid[i][j].setValido(true);
			}
		}
	}
	

	public void isMovimentoValido(int linha, int coluna, String sentido) throws MovimentoInvalido {
		if ((linha >= 0 && linha < this.a) && (coluna >= 0 && coluna < this.a)) {// limita o tabuleiro
			if (sentido.equalsIgnoreCase("cima") && this.grid[linha - 1][coluna].getValido()) {

				this.grid[linha - 1][coluna].setValor(this.grid[linha][coluna].getValor());
				this.grid[linha][coluna].setValor(0);
				setContMovimento(getContMovimento() + 1);// toda vez q um mov seja executado ira somar mais uma
															// quantidade de mov

			} else if (sentido.equalsIgnoreCase("baixo") && this.grid[linha + 1][coluna].getValido()) {

				this.grid[linha + 1][coluna].setValor(this.grid[linha][coluna].getValor());
				this.grid[linha][coluna].setValor(0);
				setContMovimento(getContMovimento() + 1);

			} else if (sentido.equalsIgnoreCase("direita") && this.grid[linha][coluna + 1].getValido()) {

				this.grid[linha][coluna + 1].setValor(this.grid[linha][coluna].getValor());
				this.grid[linha][coluna].setValor(0);
				setContMovimento(getContMovimento() + 1);

			} else if (sentido.equalsIgnoreCase("esquerda") && this.grid[linha][coluna - 1].getValido()) {

				this.grid[linha][coluna - 1].setValor(this.grid[linha][coluna].getValor());
				this.grid[linha][coluna].setValor(0);
				setContMovimento(getContMovimento() + 1);

			} else
				throw new MovimentoInvalido();// mov invalido quando o mov executado for pra uma posicao q n seja o zero

		} else
			throw new MovimentoInvalido();// mov invalido quando o mov executado ultrapaasar o tamanho da grid
	}
	
	public void isMovimentoValidoResove(int linha, int coluna, String sentido) throws MovimentoInvalido {
		if ((linha >= 0 && linha < this.a) && (coluna >= 0 && coluna < this.a)) {// limita o tabuleiro
			if (sentido.equalsIgnoreCase("cima") && this.grid[linha - 1][coluna].getValido() && linha > 0) {
				
                this.grid[linha][coluna].setValor(this.grid[linha-1][coluna].getValor());
				this.grid[linha - 1][coluna].setValor(0);
				
				setContMovimento(getContMovimento() + 1);// toda vez q um mov seja executado ira somar mais uma
															// quantidade de mov

			} else if (sentido.equalsIgnoreCase("baixo") && this.grid[linha + 1][coluna].getValido() && linha < this.a-1) {

				this.grid[linha][coluna].setValor(this.grid[linha+1][coluna].getValor());
				this.grid[linha + 1][coluna].setValor(0);
				
				setContMovimento(getContMovimento() + 1);

			} else if (sentido.equalsIgnoreCase("direita") && this.grid[linha][coluna + 1].getValido() && coluna < this.a -1) {

				this.grid[linha][coluna].setValor(this.grid[linha][coluna+1].getValor());
				this.grid[linha][coluna + 1].setValor(0);
				
				setContMovimento(getContMovimento() + 1);

			} else if (sentido.equalsIgnoreCase("esquerda") && this.grid[linha][coluna - 1].getValido() && coluna > 0) {

				this.grid[linha][coluna].setValor(this.grid[linha][coluna-1].getValor());
				this.grid[linha][coluna - 1].setValor(0);
				
				setContMovimento(getContMovimento() + 1);

			} else
				throw new MovimentoInvalido();// mov invalido quando o mov executado for pra uma posicao q n seja o zero

		} else
			throw new MovimentoInvalido();// mov invalido quando o mov executado ultrapaasar o tamanho da grid
	}

	public void geraTabuleiro(Dificuldade dificuldade) {
		// arraylist pra checar se n tem numeros repetidos dentro da grid
		Random rand = new Random();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int valor = (this.a * this.a);//diminuir um valor e colocar o 0 no arrayList
		Integer numAlet = rand.nextInt(valor);

		for (int i = 0; i < this.a; i++) {
			for (int j = 0; j < this.a; j++) {
				while (lista.contains(numAlet)) {//quando chegar na ultima posição sair e colocar o 0 nela
					numAlet = rand.nextInt(valor);
				}
				this.grid[i][j].setValor(numAlet);
				lista.add(numAlet);
			}
		}
		this.acharZero();
		this.setPosicaoValida(this.grid);
		//this.imprimeTabuleiro();// quando gerar o tabuleiro ele tambem sera impresso
	}
	
	public void geraTabuleiroCerto() {
		for (int i = 0; i < this.a; i++) {
			for (int j = 0; j < this.a; j++) {
				this.gridSolucao[i][j].setValor((i * this.a) + 1 + j);
					
				}
			}
		}
		
	
	
	public void acharZero() {
		for(int i = 0; i < this.a; i++) {
			for(int j = 0; j < this.a; j++) {
				if(this.grid[i][j].getValor() == 0) {
					this.grid[i][j].setValor(this.grid[this.a-1][this.a-1].getValor());
					this.grid[this.a-1][this.a-1].setValor(0);
				}
			}
		}
	}

	public void imprimeTabuleiro() {
		System.out.println("   0 1 2"); // mostra as colunas do tabuleiro
		System.out.println("   -----");
		for (int i = 0; i < this.a; i++) {
			for (int j = 0; j < this.a; j++) {
				if (j == 0)
					System.out.print(i + "| ");// mostra as linhas do tabuleiro
				System.out.print(this.grid[i][j].getValor() + "  ");
			}
			System.out.println();
		}
	}

	public void imprimeTabuleiroValido() {// imprime o tabuleiro mostrando a validacao de cada posicao para se mover
											// somente a posicao true (0) esta disponivel para movimentacao
		System.out.println("      0    1    2 "); // mostra as colunas do tabuleiro
		System.out.println("   ---------------");
		for (int i = 0; i < this.a; i++) {
			for (int j = 0; j < this.a; j++) {
				if (j == 0)
					System.out.print(i + "| ");// mostra as linhas do tabuleiro
				System.out.print(this.grid[i][j].getValido() + " ");
			}
			System.out.println();
		}
	}

//	public void ordenaParaTestar() {// tabuleiro com todas as posicoes corretas para testar se esta valido
//		this.grid[0][0].setValor(1);
//		this.grid[0][1].setValor(2);
//		this.grid[0][2].setValor(3);
//		this.grid[1][0].setValor(4);
//		this.grid[1][1].setValor(5);
//		this.grid[1][2].setValor(6);
//		this.grid[2][0].setValor(7);
//		this.grid[2][1].setValor(8);
//		this.grid[2][2].setValor(0);
//
//		this.setPosicaoValida();
//
//	}
	
	public int[] achaZeroGrid(){
		
		int[] getCoord= new int[2];
		
		for(int i =0; i< this.a; i++) {
			for(int j =0; j <this.a; j++) {
				if(this.grid[i][j].getValor() == 0) {
					getCoord[0]= i;
					getCoord[1]= j;
					return getCoord;
				}
			}
		}
		
		return getCoord;
	}
	
  public int[] achaNumGrid(){
		
		int[] getCoord= new int[2];
		
		for(int i =0; i< this.a; i++) {
			for(int j =0; j <this.a; j++) {
				if(this.grid[i][j].getValor() != this.gridSolucao[i][j].getValor()) {
					for(int k = 0; k<this.a;k++) {
						for(int l = 0; l<this.a ; l++) {
							if(this.grid[k][l].getValor() == this.gridSolucao[i][j].getValor()) {
						getCoord[0]= k+i;
						getCoord[1]= l+j;
					return getCoord;
						}
						}
				}
				}
			}
		}
		
		return getCoord;
		
	}
  
  public void juntarZero() {
	  
	  System.out.println(this.achaZeroGrid()[0]);
	  System.out.println(this.achaZeroGrid()[1]);
	  
	  this.setPosicaoValidaResolve();
	  while(this.grid[this.achaNumGrid()[0]-1][this.achaNumGrid()[1]].getValor() != 0) {
		if(this.achaZeroGrid()[0]> this.achaNumGrid()[0]) {
			if(this.achaZeroGrid()[1]> this.achaNumGrid()[1]) {
				this.executaMovimentoResolve(this.achaZeroGrid()[0], this.achaZeroGrid()[1], "cima");
				this.executaMovimentoResolve(this.achaZeroGrid()[0], this.achaZeroGrid()[1], "esquerda");
			}
			
			else if(this.achaZeroGrid()[1]< this.achaNumGrid()[1]) {
				this.executaMovimentoResolve(this.achaZeroGrid()[0], this.achaZeroGrid()[1], "cima");
				this.executaMovimentoResolve(this.achaZeroGrid()[0], this.achaZeroGrid()[1], "direita");
			}
			
			else
				this.executaMovimentoResolve(this.achaZeroGrid()[0], this.achaZeroGrid()[1], "cima");
			
		}
		
		else if(this.achaZeroGrid()[0]< this.achaNumGrid()[0]) {
			if(this.achaZeroGrid()[1]> this.achaNumGrid()[1]) {
				this.executaMovimentoResolve(this.achaZeroGrid()[0], this.achaZeroGrid()[1], "baixo");
				this.executaMovimentoResolve(this.achaZeroGrid()[0], this.achaZeroGrid()[1], "esquerda");
			}
			
			else if(this.achaZeroGrid()[1]< this.achaNumGrid()[1]) {
				this.executaMovimentoResolve(this.achaZeroGrid()[0], this.achaZeroGrid()[1], "baixo");
				this.executaMovimentoResolve(this.achaZeroGrid()[0], this.achaZeroGrid()[1], "direita");
			}
			
			else
				this.executaMovimentoResolve(this.achaZeroGrid()[0], this.achaZeroGrid()[1], "baixo");
			
		}
		
		else
			if(this.achaZeroGrid()[1]> this.achaNumGrid()[1]) {
				
				this.executaMovimentoResolve(this.achaZeroGrid()[0], this.achaZeroGrid()[1], "esquerda");
			}
			
			else  {
				this.executaMovimentoResolve(this.achaZeroGrid()[0], this.achaZeroGrid()[1], "direita");
			}
	  }
			
	}
	
	


	public void setPosicaoValida(Bloco[][] grid) {
		for (int i = 0; i < this.a; i++) {
			for (int j = 0; j < this.a; j++) {
				if (this.grid[i][j].getValor() == 0) {// quando o bloco da grid for == 0 o valor vai ser valido, se n eh
														// false
					this.grid[i][j].setValido(true);
				} else
					this.grid[i][j].setValido(false);
			}
		}
	}

	public void setContMovimento(int contMovimento) {
		this.contMovimento = contMovimento;
	}

	public int getContMovimento() {
		return this.contMovimento;
	}
	
	public Bloco[][] getGrid() {
		return grid;
	}

	public void setGrid(Bloco[][] grid) {
		this.grid = grid;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}