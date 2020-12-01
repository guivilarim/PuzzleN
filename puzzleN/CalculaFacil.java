package puzzleN;

public class CalculaFacil implements CalculaScore{
	
	public int pontos(Puzzle partida) {
		
		return (1000 / partida.getQuantidadeMovimentos());
	}

}