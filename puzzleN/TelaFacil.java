package puzzleN;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import puzzleN.Puzzle;

import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaFacil extends JFrame {

	private JPanel contentPane;
	private String nome = null;
	private Puzzle puzzle = null;

	public TelaFacil(String nome, Puzzle puzzle) {

		this.nome = nome;
		this.puzzle = new PuzzleFacil(nome);
		puzzle.iniciaPartida();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		panel.setForeground(new Color(32, 178, 170));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome: " + nome);
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblNewLabel.setBounds(32, 406, 334, 14);
		panel.add(lblNewLabel);

		// cada botao vai pegar cada valor de cada posicao da grid
		// como o botao9 eh o ultimo na minha grid ele vai ser onde o meu 0 esta
		// localizado, ou sela, o meu botao invisivel
		JButton btnBloco9 = new JButton("" + puzzle.getGridPuzzle().getGrid()[2][2].getValor());
		btnBloco9.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBloco9.setBounds(328, 223, 89, 74);
		btnBloco9.setVisible(false);
		panel.add(btnBloco9);

		// os outros botoes vao receber o metodo mudaPosicao para poder trocar de lugar
		// com o botao em que o 0 esta localizado

		JButton btnBloco1 = new JButton("" + puzzle.getGridPuzzle().getGrid()[0][0].getValor());
		btnBloco1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mudaPosicao(puzzle, btnBloco1, btnBloco9);
			}
		});
		btnBloco1.setBounds(142, 65, 89, 74);
		panel.add(btnBloco1);

		JButton btnBloco2 = new JButton("" + puzzle.getGridPuzzle().getGrid()[0][1].getValor());
		btnBloco2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco2, btnBloco9);
			}
		});
		btnBloco2.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco2.setBounds(235, 65, 89, 74);
		panel.add(btnBloco2);

		JButton btnBloco3 = new JButton("" + puzzle.getGridPuzzle().getGrid()[0][2].getValor());
		btnBloco3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco3, btnBloco9);
			}
		});
		btnBloco3.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco3.setBounds(328, 65, 89, 74);
		panel.add(btnBloco3);

		JButton btnBloco4 = new JButton("" + puzzle.getGridPuzzle().getGrid()[1][0].getValor());
		btnBloco4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco4, btnBloco9);
			}
		});
		btnBloco4.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco4.setBounds(142, 144, 89, 74);
		panel.add(btnBloco4);

		JButton btnBloco5 = new JButton("" + puzzle.getGridPuzzle().getGrid()[1][1].getValor());
		btnBloco5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco5, btnBloco9);
			}
		});
		btnBloco5.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco5.setBounds(235, 144, 89, 74);
		panel.add(btnBloco5);

		JButton btnBloco6 = new JButton("" + puzzle.getGridPuzzle().getGrid()[1][2].getValor());
		btnBloco6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco6, btnBloco9);
			}

		});
		btnBloco6.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco6.setBounds(328, 144, 89, 74);
		panel.add(btnBloco6);

		JButton btnBloco7 = new JButton("" + puzzle.getGridPuzzle().getGrid()[2][0].getValor());
		btnBloco7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mudaPosicao(puzzle, btnBloco7, btnBloco9);
			}
		});
		btnBloco7.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco7.setBounds(142, 223, 89, 74);
		panel.add(btnBloco7);

		JButton btnBloco8 = new JButton("" + puzzle.getGridPuzzle().getGrid()[2][1].getValor());
		btnBloco8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mudaPosicao(puzzle, btnBloco8, btnBloco9);

			}
		});
		btnBloco8.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco8.setBounds(235, 223, 89, 74);
		panel.add(btnBloco8);

		JButton btnDesistir = new JButton("DESISTIR");
		btnDesistir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				TelaDesistir td = new TelaDesistir(puzzle);
//				td.setVisible(true);
//				dispose();
			}
		});
		btnDesistir.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
		btnDesistir.setBounds(416, 403, 106, 23);
		panel.add(btnDesistir);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 205, 170));
		panel_1.setBounds(135, 58, 288, 245);
		panel.add(panel_1);

		JButton btnNewButton = new JButton("MENU");
		btnNewButton.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaMenu tm = new TelaMenu();
				tm.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(416, 371, 106, 23);
		panel.add(btnNewButton);

		JButton btnResolver = new JButton("RESOLVER");
		btnResolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				((PuzzleFacil) puzzle).resolveTabuleiro();

			}
		});
		btnResolver.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		btnResolver.setBounds(428, 11, 106, 23);
		panel.add(btnResolver);

		JButton btnNext = new JButton("NEXT");
		btnNext.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
		btnNext.setBounds(21, 11, 106, 23);
		panel.add(btnNext);
	}

	public int trocaCoordenada(int coord) {// troca a posicao das coord x e y da interface grafica com as coord x e y do
											// tabuleiro
		// por exemplo, quando a posicao na interface for 142 ira retornar 0
		// se eu pegar as posicoes na interface 235 e 223, eles vao ser equivalentes as
		// posicoes 1 e 2 na minha grid
		// esse metodo eh mais para poder converter as coordenadas
		switch (coord) {
		case 142:
			return 0;
		case 65:
			return 0;
		case 235:
			return 1;
		case 144:
			return 1;
		case 328:
			return 2;
		case 223:
			return 2;
		default:
			return -1;
		}
	}

	

	public void mudaPosicao(Puzzle puzzle, JButton botao, JButton binvisi) {// recebe um puzzle um botao que eu quero
																			// mexer e o botao invisivel, que no caso
																			// vai
																			// ser o botao em que o 0 esta localizado
		if (botao.getLocation().x + 93 == binvisi.getLocation().x && botao.getLocation().y == binvisi.getLocation().y) {
			puzzle.getGridPuzzle().executaMovimento(trocaCoordenada(botao.getLocation().y),
					trocaCoordenada(botao.getLocation().x), "direita");
			binvisi.setLocation(botao.getLocation().x, botao.getLocation().y);
			botao.setLocation(botao.getLocation().x + 93, botao.getLocation().y);
		} else if (botao.getLocation().x - 93 == binvisi.getLocation().x
				&& botao.getLocation().y == binvisi.getLocation().y) {
			puzzle.getGridPuzzle().executaMovimento(trocaCoordenada(botao.getLocation().y),
					trocaCoordenada(botao.getLocation().x), "esquerda");
			binvisi.setLocation(botao.getLocation().x, botao.getLocation().y);
			botao.setLocation(botao.getLocation().x - 93, botao.getLocation().y);
		} else if (botao.getLocation().x == binvisi.getLocation().x
				&& botao.getLocation().y + 79 == binvisi.getLocation().y) {
			puzzle.getGridPuzzle().executaMovimento(trocaCoordenada(botao.getLocation().y),
					trocaCoordenada(botao.getLocation().x), "baixo");
			binvisi.setLocation(botao.getLocation().x, botao.getLocation().y);
			botao.setLocation(botao.getLocation().x, botao.getLocation().y + 79);
		} else if (botao.getLocation().x == binvisi.getLocation().x
				&& botao.getLocation().y - 79 == binvisi.getLocation().y) {
			puzzle.getGridPuzzle().executaMovimento(trocaCoordenada(botao.getLocation().y),
					trocaCoordenada(botao.getLocation().x), "cima");
			binvisi.setLocation(botao.getLocation().x, botao.getLocation().y);
			botao.setLocation(botao.getLocation().x, botao.getLocation().y - 79);
		} else
			JOptionPane.showMessageDialog(null, "Movimento Invalido", "ERRO :(", JOptionPane.ERROR_MESSAGE);

		this.checaPuzzleOrdenado();
	}

//	public void mudaPosicaoResolve(Puzzle puzzle, JButton binvisi) {// recebe um puzzle um botao que eu quero
//		// mexer e o botao invisivel, que no caso
//		// vai
//		// ser o botao em que o 0 esta localizado
//		if (trocaCoordenadaResolve() + 93 == binvisi.getLocation().x && trocaCoordenadaResolve() == binvisi.getLocation().y) {
//			
//			binvisi.setLocation(botao.getLocation().x, botao.getLocation().y);
//			botao.setLocation(botao.getLocation().x + 93, botao.getLocation().y);
//		} else if (trocaCoordenadaResolve() - 93 == binvisi.getLocation().x
//				&& trocaCoordenadaResolve() == binvisi.getLocation().y) {
//			
//			binvisi.setLocation(botao.getLocation().x, botao.getLocation().y);
//			botao.setLocation(botao.getLocation().x - 93, botao.getLocation().y);
//		} else if (trocaCoordenadaResolve() == binvisi.getLocation().x
//				&& trocaCoordenadaResolve() + 79 == binvisi.getLocation().y) {
//			
//			binvisi.setLocation(botao.getLocation().x, botao.getLocation().y);
//			botao.setLocation(botao.getLocation().x, botao.getLocation().y + 79);
//		} else if (trocaCoordenadaResolve() == binvisi.getLocation().x
//				&& trocaCoordenadaResolve() - 79 == binvisi.getLocation().y) {
//			
//			binvisi.setLocation(botao.getLocation().x, botao.getLocation().y);
//			botao.setLocation(botao.getLocation().x, botao.getLocation().y - 79);
//		} else
//			JOptionPane.showMessageDialog(null, "Movimento Invalido", "ERRO :(", JOptionPane.ERROR_MESSAGE);
//
//		this.checaPuzzleOrdenado();
//	}
	
	
		
		
		
		

	// quando a grid estiver ordenada o usuario venceu e troca pra tela que mostra a
	// sua pontuacao e o tempo decorrido
	public void checaPuzzleOrdenado() {
		if (puzzle.getGridPuzzle().isTabuleiroOrdenado()) {
			// JOptionPane.showMessageDialog(null, "VC VENCEU");
//			TelaPontuacao tp = new TelaPontuacao(puzzle);
//			tp.setVisible(true);
//			dispose();
		}
	}
}