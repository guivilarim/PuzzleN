package puzzleN;

public class CalculaInsano implements CalculaScore{
	
	public int pontos(Puzzle partida) {
		if(partida.getDificuldade()== Dificuldade.INSANO) {
		return (1000000 / partida.getQuantidadeMovimentos());	}
		return 0;
	}
	

}