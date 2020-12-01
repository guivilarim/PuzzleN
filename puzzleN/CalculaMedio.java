package puzzleN;

public class CalculaMedio implements CalculaScore{
	
	public int pontos(Puzzle partida) {
		return (10000 / partida.getQuantidadeMovimentos());	}

}