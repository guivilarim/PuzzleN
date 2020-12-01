package puzzleN;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import puzzleN.Puzzle;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMedio extends JFrame {
	public TelaMedio() {
	}

	private JPanel contentPane;
	private String nome = null;
	private Puzzle puzzle = null;

	
		public TelaMedio(String nome, Puzzle puzzle) {

			this.nome = nome;
			this.puzzle = puzzle;
			puzzle.iniciaPartida();

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 582, 498);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(new GridLayout(1, 0, 0, 0));

			JPanel panel = new JPanel();
			panel.setForeground(new Color(32, 178, 170));
			panel.setBackground(new Color(32, 178, 170));
			contentPane.add(panel);
			panel.setLayout(null);

			JLabel lblNome = new JLabel("Nome: " + nome);
			lblNome.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			lblNome.setBounds(40, 404, 214, 14);
			panel.add(lblNome);


			// cada botao vai pegar cada valor de cada posicao da grid
			// como o botao16 eh o ultimo na minha grid ele vai ser onde o meu 0 esta localizado, ou sela, o meu botao invisivel
			JButton btnBloco16 = new JButton("" + puzzle.getGridPuzzle().getGrid()[3][3].getValor());
			btnBloco16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnBloco16.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			btnBloco16.setBounds(360, 265, 80, 70);
			btnBloco16.setVisible(false);
			panel.add(btnBloco16);
			
			//os outros botoes vao receber o metodo mudaPosicao para poder trocar de lugar com o botao em que o 0 esta localizado

			JButton btnBloco1 = new JButton("" + puzzle.getGridPuzzle().getGrid()[0][0].getValor());
			btnBloco1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mudaPosicao(puzzle, btnBloco1, btnBloco16);
				}
			});
			btnBloco1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			btnBloco1.setBounds(108, 40, 80, 70);
			panel.add(btnBloco1);

			JButton btnBloco2 = new JButton("" + puzzle.getGridPuzzle().getGrid()[0][1].getValor());
			btnBloco2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mudaPosicao(puzzle, btnBloco2, btnBloco16);
				}
			});
			btnBloco2.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			btnBloco2.setBounds(192, 40, 80, 70);
			panel.add(btnBloco2);

			JButton btnBloco3 = new JButton("" + puzzle.getGridPuzzle().getGrid()[0][2].getValor());
			btnBloco3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mudaPosicao(puzzle, btnBloco3, btnBloco16);
				}
			});
			btnBloco3.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			btnBloco3.setBounds(276, 40, 80, 70);
			panel.add(btnBloco3);

			JButton btnBloco4 = new JButton("" + puzzle.getGridPuzzle().getGrid()[0][3].getValor());
			btnBloco4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mudaPosicao(puzzle, btnBloco4, btnBloco16);
				}
			});
			btnBloco4.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			btnBloco4.setBounds(360, 40, 80, 70);
			panel.add(btnBloco4);

			JButton btnBloco5 = new JButton("" + puzzle.getGridPuzzle().getGrid()[1][0].getValor());
			btnBloco5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mudaPosicao(puzzle, btnBloco5, btnBloco16);
				}
			});
			btnBloco5.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			btnBloco5.setBounds(108, 115, 80, 70);
			panel.add(btnBloco5);

			JButton btnBloco6 = new JButton("" + puzzle.getGridPuzzle().getGrid()[1][1].getValor());
			btnBloco6.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			btnBloco6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mudaPosicao(puzzle, btnBloco6, btnBloco16);
				}
			});
			btnBloco6.setBounds(192, 115, 80, 70);
			panel.add(btnBloco6);

			JButton btnBloco7 = new JButton("" + puzzle.getGridPuzzle().getGrid()[1][2].getValor());
			btnBloco7.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			btnBloco7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mudaPosicao(puzzle, btnBloco7, btnBloco16);
				}
			});
			btnBloco7.setBounds(276, 115, 80, 70);
			panel.add(btnBloco7);

			JButton btnBloco8 = new JButton("" + puzzle.getGridPuzzle().getGrid()[1][3].getValor());
			btnBloco8.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			btnBloco8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mudaPosicao(puzzle, btnBloco8, btnBloco16);
				}
			});
			btnBloco8.setBounds(360, 115, 80, 70);
			panel.add(btnBloco8);

			JButton btnBloco9 = new JButton("" + puzzle.getGridPuzzle().getGrid()[2][0].getValor());
			btnBloco9.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			btnBloco9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mudaPosicao(puzzle, btnBloco9, btnBloco16);
				}
			});
			btnBloco9.setBounds(108, 190, 80, 70);
			panel.add(btnBloco9);

			JButton btnBloco10 = new JButton("" + puzzle.getGridPuzzle().getGrid()[2][1].getValor());
			btnBloco10.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			btnBloco10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mudaPosicao(puzzle, btnBloco10, btnBloco16);
				}
			});
			btnBloco10.setBounds(192, 190, 80, 70);
			panel.add(btnBloco10);

			JButton btnBloco11 = new JButton("" + puzzle.getGridPuzzle().getGrid()[2][2].getValor());
			btnBloco11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mudaPosicao(puzzle, btnBloco11, btnBloco16);
				}
			});
			btnBloco11.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			btnBloco11.setBounds(276, 190, 80, 70);
			panel.add(btnBloco11);

			JButton btnBloco12 = new JButton("" + puzzle.getGridPuzzle().getGrid()[2][3].getValor());
			btnBloco12.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			btnBloco12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mudaPosicao(puzzle, btnBloco12, btnBloco16);
				}
			});
			btnBloco12.setBounds(360, 190, 80, 70);
			panel.add(btnBloco12);

			JButton btnBloco13 = new JButton("" + puzzle.getGridPuzzle().getGrid()[3][0].getValor());
			btnBloco13.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			btnBloco13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					mudaPosicao(puzzle, btnBloco13, btnBloco16);
				}
			});
			btnBloco13.setBounds(108, 265, 80, 70);
			panel.add(btnBloco13);

			JButton btnBloco14 = new JButton("" + puzzle.getGridPuzzle().getGrid()[3][1].getValor());
			btnBloco14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mudaPosicao(puzzle, btnBloco14, btnBloco16);
				}
			});
			btnBloco14.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			btnBloco14.setBounds(192, 265, 80, 70);
			panel.add(btnBloco14);

			JButton btnBloco15 = new JButton("" + puzzle.getGridPuzzle().getGrid()[3][2].getValor());
			btnBloco15.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			btnBloco15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mudaPosicao(puzzle, btnBloco15, btnBloco16);
				}
			});
			btnBloco15.setBounds(276, 265, 80, 70);
			panel.add(btnBloco15);

			JButton btnDesistir = new JButton("DESISTIR");
			btnDesistir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				//	TelaDesistir td = new TelaDesistir(puzzle);
				//	td.setVisible(true);
				//	dispose();
				}
			});
			btnDesistir.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
			btnDesistir.setBounds(408, 401, 101, 23);
			panel.add(btnDesistir);

			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(102, 205, 170));
			panel_1.setBounds(103, 35, 342, 305);
			panel.add(panel_1);

			JButton btnNewButton = new JButton("MENU");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TelaMenu tm = new TelaMenu();
					tm.setVisible(true);
					dispose();
				}
			});
			btnNewButton.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
			btnNewButton.setBounds(408, 367, 101, 23);
			panel.add(btnNewButton);
			
			
			JButton btnResolver = new JButton("RESOLVER");
			btnResolver.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
			btnResolver.setBounds(428, 11, 106, 18);
			panel.add(btnResolver);
			
			JButton btnNext = new JButton("NEXT");
			btnNext.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
			btnNext.setBounds(21, 11, 106, 18);
			panel.add(btnNext);
		}

		public int trocaCoordenada(int coord) {// troca a posicao das coord x e y da interface grafica com as coord x e y do
	// tabuleiro
	// por exemplo, quando a posicao na interface for 142 ira retornar 0
	// se eu pegar as posicoes na interface 192 e 190, eles vao ser equivalentes as
	// posicoes 1 e 2 na minha grid
	// esse metodo eh mais para poder converter as coordenadas
			switch (coord) {
			case 108:
				return 0;
			case 40:
				return 0;
			case 192:
				return 1;
			case 115:
				return 1;
			case 276:
				return 2;
			case 190:
				return 2;
			case 360:
				return 3;
			case 265:
				return 3;
			default:
				return -1;
			}
		}
		// o metodo mudaPosicao vai ser equivalente ao meu metodo executaMovimento na
		// minha classe Tabuleiro

		public void mudaPosicao(Puzzle puzzle, JButton botao, JButton binvisi) {
			// recebe um puzzle um botao que eu quero
			// mexer e o botao invisivel, que no caso vai
			// ser o botao em que o 0 esta localizado
			if (botao.getLocation().x + 84 == binvisi.getLocation().x && botao.getLocation().y == binvisi.getLocation().y) {
				puzzle.getGridPuzzle().executaMovimento(trocaCoordenada(botao.getLocation().y),
						trocaCoordenada(botao.getLocation().x), "direita");
				binvisi.setLocation(botao.getLocation().x, botao.getLocation().y);
				botao.setLocation(botao.getLocation().x + 84, botao.getLocation().y);
			} else if (botao.getLocation().x - 84 == binvisi.getLocation().x
					&& botao.getLocation().y == binvisi.getLocation().y) {
				puzzle.getGridPuzzle().executaMovimento(trocaCoordenada(botao.getLocation().y),
						trocaCoordenada(botao.getLocation().x), "esquerda");
				binvisi.setLocation(botao.getLocation().x, botao.getLocation().y);
				botao.setLocation(botao.getLocation().x - 84, botao.getLocation().y);
			} else if (botao.getLocation().x == binvisi.getLocation().x
					&& botao.getLocation().y + 75 == binvisi.getLocation().y) {
				puzzle.getGridPuzzle().executaMovimento(trocaCoordenada(botao.getLocation().y),
						trocaCoordenada(botao.getLocation().x), "baixo");
				binvisi.setLocation(botao.getLocation().x, botao.getLocation().y);
				botao.setLocation(botao.getLocation().x, botao.getLocation().y + 75);
			} else if (botao.getLocation().x == binvisi.getLocation().x
					&& botao.getLocation().y - 75 == binvisi.getLocation().y) {
				puzzle.getGridPuzzle().executaMovimento(trocaCoordenada(botao.getLocation().y),
						trocaCoordenada(botao.getLocation().x), "cima");
				binvisi.setLocation(botao.getLocation().x, botao.getLocation().y);
				botao.setLocation(botao.getLocation().x, botao.getLocation().y - 75);
			} //else
				//JOptionPane.showMessageDialog(null, "Movimento Invalido", "ERRO :(", JOptionPane.ERROR_MESSAGE);

			//this.checaPuzzleOrdenado();
		}

		//quando a grid estiver ordenada o usuario venceu e troca pra tela que mostra a sua pontuacao e o tempo decorrido 
		public void checaPuzzleOrdenado() {
			if (puzzle.getGridPuzzle().isTabuleiroOrdenado()) {
				// JOptionPane.showMessageDialog(null, "VC VENCEU");
				//TelaPontuacao tp = new TelaPontuacao(puzzle);
				//tp.setVisible(true);
				//dispose();
			}
		}
	
	}