package puzzleN;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		System.out.println("Teste nível normal:\n");
		Puzzle p1 = new Puzzle("Joao",Dificuldade.NORMAL);
		p1.iniciaPartida();
		p1.getGridPuzzle().imprimeTabuleiro();
		System.out.println("Teste nível dificil:\n");
		Puzzle p2 = new Puzzle("Felipe",Dificuldade.DIFICIL);
		p2.iniciaPartida();
		p2.getGridPuzzle().imprimeTabuleiro();
		System.out.println("Teste nível insano:");
		Puzzle p3 = new Puzzle("klebson",Dificuldade.INSANO,6);
		p3.iniciaPartida();
		p3.getGridPuzzle().imprimeTabuleiro();
		String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
		
		PuzzleFacil p = new PuzzleFacil(nome);
		//String sair;
		p.iniciaPartida();
		p.getGridPuzzle().imprimeTabuleiro();
		p.resolveTabuleiro();
		
		//p.getGridPuzzle().juntarZero();
		p.getGridPuzzle().imprimeTabuleiro();
		System.out.println(p.getGridPuzzle().getContMovimento());
		
		// p.getGridPuzzle().geraTabuleiro(Dificuldade.FACIL);
		//p.getGridPuzzle().imprimeTabuleiro();
		//System.out.println("\nQuantidade de movimentos: " + p.getGridPuzzle().getContMovimento());

		// while pra poder repetir a grid e ficar pedindo a linha e a coluna
		//int linha, coluna;
		//String sentido;

		/*while (!p.getGridPuzzle().isTabuleiroOrdenado()) {
			//linha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a linha:"));
			//coluna = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a coluna:"));
			//sentido = JOptionPane.showInputDialog(null, "Digite o sentido:");
		
			//System.out.println("|Linha digitada: " + linha + "\n|Coluna digitada: " + coluna + " \n|Sentido digitado: "
					+ sentido + "\n");
			//p.getGridPuzzle().executaMovimento(linha, coluna, sentido);
			//p.getGridPuzzle().imprimeTabuleiro();
			
			//System.out.println("\nQuantidade de movimentos: " + p.getGridPuzzle().getContMovimento());
			//sair = JOptionPane.showInputDialog(null, "Vc quer sair do jogo");
			if (sair.equalsIgnoreCase("sim") || sair.equalsIgnoreCase("s")) {
				break;
			}
		
		}
		//p.isFimDeJogo();
		//JOptionPane.showMessageDialog(null, nome + " sua pontução: " + p.getScore());
	}*/
}
}