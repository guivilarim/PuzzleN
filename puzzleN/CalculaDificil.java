package puzzleN;

public class CalculaDificil implements CalculaScore{
	
	public int pontos(Puzzle partida) {
		return (100000 / partida.getQuantidadeMovimentos());	}

}