package puzzleN;

import java.util.Calendar;

public class Puzzle { // dados referentes a partida como um todo

	private Jogador jogador;
	private Tabuleiro gridPuzzle;
	private int quantidadeMovimentos;
	private CalculaScore score;
	private boolean venceu;
	private Calendar tempo;
	private int pontuacao;
	private Dificuldade dificuldade;

	public Puzzle(String nome, Dificuldade dificuldade) {
		this.jogador = new Jogador(nome);
		this.dificuldade = dificuldade;
		this.gridPuzzle = new Tabuleiro(dificuldade);

	}

	public Puzzle(String nome, Dificuldade dificuldade, int tamanho) {
		this.jogador = new Jogador(nome);
		this.dificuldade = dificuldade;
		this.gridPuzzle = new Tabuleiro(dificuldade, tamanho);
	}

	public boolean isFimDeJogo() { // retorna true se estiver ordenado e false caso contrario
		setQuantidadeMovimentos(this.gridPuzzle.getContMovimento());
		this.pontuacao = this.score.pontos(this);
		
		return this.gridPuzzle.isTabuleiroOrdenado();
	}


	public void iniciaPartida() { // resetar o objeto para o estagio inicial
		this.quantidadeMovimentos = 0; // zerar a quantidade de movimentos
		Calendar tempo = Calendar.getInstance(); // nova instancia para tempo
		this.venceu = false;
		this.gridPuzzle.geraTabuleiro(this.dificuldade);// a gridPuzzle q eh do tipo Tabuleiro que chama o metodo
														// geraTabuleiro, que possui uma disposicao aleatoria dos
														// numeros
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Tabuleiro getGridPuzzle() {
		return gridPuzzle;
	}

	public void setGridPuzzle(Tabuleiro gridPuzzle) {
		this.gridPuzzle = gridPuzzle;
	}

	public int getQuantidadeMovimentos() {
		return this.quantidadeMovimentos;
	}

	public void setQuantidadeMovimentos(int quantidadeMovimentos) {
		this.quantidadeMovimentos = quantidadeMovimentos;
	}

	public void setVenceu(boolean venceu) {
		this.venceu = venceu;
	}

	public boolean getVenceu() {
		return venceu;
	}

	public CalculaScore getScore() {
		return score;
	}

	public void setScore(CalculaScore score) {
		this.score = score;
	}

	public Calendar getTempo() {
		return tempo;
	}

	public void setTempo(Calendar tempo) {
		this.tempo = tempo;
	}

	public Dificuldade getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(Dificuldade dificuldade) {
		this.dificuldade = dificuldade;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	

}