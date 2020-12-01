package puzzleN;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import puzzleN.Puzzle;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDificil extends JFrame {

	private JPanel contentPane;
	private String nome = null;
	private Puzzle puzzle = null;

	public TelaDificil(String nome, Puzzle puzzle) {
		this.nome = nome;
		this.puzzle = puzzle;
		puzzle.iniciaPartida();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 499);
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
		lblNome.setBounds(37, 406, 217, 14);
		panel.add(lblNome);
		
		// cada botao vai pegar cada valor de cada posicao da grid
		// como o botao25 eh o ultimo na minha grid ele vai ser onde o meu 0 esta localizado, ou sela, o meu botao invisivel
		
		JButton btnBloco25 = new JButton(""+puzzle.getGridPuzzle().getGrid()[4][4].getValor());
		btnBloco25.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBloco25.setBounds(392, 298, 70, 60);
		btnBloco25.setVisible(false);
		panel.add(btnBloco25);
		
		//os outros botoes vao receber o metodo mudaPosicao para poder trocar de lugar com o botao em que o 0 esta localizado
		
		JButton btnBloco1 = new JButton(""+puzzle.getGridPuzzle().getGrid()[0][0].getValor());
		btnBloco1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mudaPosicao(puzzle, btnBloco1, btnBloco25);
			}
		});
		btnBloco1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco1.setBounds(96, 46, 70, 60);
		panel.add(btnBloco1);
		
		JButton btnBloco2 = new JButton(""+puzzle.getGridPuzzle().getGrid()[0][1].getValor());
		btnBloco2.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco2, btnBloco25);
			}
		});
		btnBloco2.setBounds(170, 46, 70, 60);
		panel.add(btnBloco2);
		
		JButton btnBloco3 = new JButton(""+puzzle.getGridPuzzle().getGrid()[0][2].getValor());
		btnBloco3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco3, btnBloco25);
			}
		});
		btnBloco3.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco3.setBounds(244, 46, 70, 60);
		panel.add(btnBloco3);
		
		JButton btnBloco4 = new JButton(""+puzzle.getGridPuzzle().getGrid()[0][3].getValor());
		btnBloco4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco4, btnBloco25);
			}
		});
		btnBloco4.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco4.setBounds(318, 46, 70, 60);
		panel.add(btnBloco4);
		
		JButton btnBloco5 = new JButton(""+puzzle.getGridPuzzle().getGrid()[0][4].getValor());
		btnBloco5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco5, btnBloco25);
			}
		});
		btnBloco5.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco5.setBounds(392, 46, 70, 60);
		panel.add(btnBloco5);
		
		JButton btnBloco6 = new JButton(""+puzzle.getGridPuzzle().getGrid()[1][0].getValor());
		btnBloco6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco6, btnBloco25);
			}
		});
		btnBloco6.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco6.setBounds(96, 109, 70, 60);
		panel.add(btnBloco6);
		
		JButton btnBloco7 = new JButton(""+puzzle.getGridPuzzle().getGrid()[1][1].getValor());
		btnBloco7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco7, btnBloco25);
			}
		});
		btnBloco7.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco7.setBounds(170, 109, 70, 60);
		panel.add(btnBloco7);
		
		JButton btnBloco8 = new JButton(""+puzzle.getGridPuzzle().getGrid()[1][2].getValor());
		btnBloco8.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco8, btnBloco25);
			}
		});
		btnBloco8.setBounds(244, 109, 70, 60);
		panel.add(btnBloco8);
		
		JButton btnBloco9 = new JButton(""+puzzle.getGridPuzzle().getGrid()[1][3].getValor());
		btnBloco9.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco9, btnBloco25);
			}
		});
		btnBloco9.setBounds(318, 109, 70, 60);
		panel.add(btnBloco9);
		
		JButton btnBloco10 = new JButton(""+puzzle.getGridPuzzle().getGrid()[1][4].getValor());
		btnBloco10.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco10, btnBloco25);
			}
		});
		btnBloco10.setBounds(392, 109, 70, 60);
		panel.add(btnBloco10);
		
		JButton btnBloco11 = new JButton(""+puzzle.getGridPuzzle().getGrid()[2][0].getValor());
		btnBloco11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco11, btnBloco25);
			}
		});
		btnBloco11.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco11.setBounds(96, 172, 70, 60);
		panel.add(btnBloco11);
		
		JButton btnBloco12 = new JButton(""+puzzle.getGridPuzzle().getGrid()[2][1].getValor());
		btnBloco12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco12, btnBloco25);
			}
		});
		btnBloco12.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco12.setBounds(170, 172, 70, 60);
		panel.add(btnBloco12);
		
		JButton btnBloco13 = new JButton(""+puzzle.getGridPuzzle().getGrid()[2][2].getValor());
		btnBloco13.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco13, btnBloco25);
			}
		});
		btnBloco13.setBounds(244, 172, 70, 60);
		panel.add(btnBloco13);
		
		JButton btnBloco14 = new JButton(""+puzzle.getGridPuzzle().getGrid()[2][3].getValor());
		btnBloco14.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco14, btnBloco25);
			}
		});
		btnBloco14.setBounds(318, 172, 70, 60);
		panel.add(btnBloco14);
		
		JButton btnBloco15 = new JButton(""+puzzle.getGridPuzzle().getGrid()[2][4].getValor());
		btnBloco15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco15, btnBloco25);
			}
		});
		btnBloco15.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco15.setBounds(392, 172, 70, 60);
		panel.add(btnBloco15);
		
		JButton btnBloco16 = new JButton(""+puzzle.getGridPuzzle().getGrid()[3][0].getValor());
		btnBloco16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco16, btnBloco25);
			}
		});
		btnBloco16.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco16.setBounds(96, 235, 70, 60);
		panel.add(btnBloco16);
		
		JButton btnBloco17 = new JButton(""+puzzle.getGridPuzzle().getGrid()[3][1].getValor());
		btnBloco17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco17, btnBloco25);
			}
		});
		btnBloco17.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco17.setBounds(170, 235, 70, 60);
		panel.add(btnBloco17);
		
		JButton btnBloco18 = new JButton(""+puzzle.getGridPuzzle().getGrid()[3][2].getValor());
		btnBloco18.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco18, btnBloco25);
			}
		});
		btnBloco18.setBounds(244, 235, 70, 60);
		panel.add(btnBloco18);
		
		JButton btnBloco19 = new JButton(""+puzzle.getGridPuzzle().getGrid()[3][3].getValor());
		btnBloco19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco19, btnBloco25);
			}
		});
		btnBloco19.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco19.setBounds(318, 235, 70, 60);
		panel.add(btnBloco19);
		
		JButton btnBloco20 = new JButton(""+puzzle.getGridPuzzle().getGrid()[3][4].getValor());
		btnBloco20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco20, btnBloco25);
			}
		});
		btnBloco20.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco20.setBounds(392, 235, 70, 60);
		panel.add(btnBloco20);

		JButton btnBloco21 = new JButton(""+puzzle.getGridPuzzle().getGrid()[4][0].getValor());
		btnBloco21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco21, btnBloco25);
			}
		});
		btnBloco21.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco21.setBounds(96, 298, 70, 60);
		panel.add(btnBloco21);
				
		JButton btnBloco22 = new JButton(""+puzzle.getGridPuzzle().getGrid()[4][1].getValor());
		btnBloco22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco22, btnBloco25);
			}
		});
		btnBloco22.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco22.setBounds(170, 298, 70, 60);
		panel.add(btnBloco22);
				
		JButton btnBloco23 = new JButton(""+puzzle.getGridPuzzle().getGrid()[4][2].getValor());
		btnBloco23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco23, btnBloco25);
			}
		});
		btnBloco23.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco23.setBounds(244, 298, 70, 60);
		panel.add(btnBloco23);
				
		JButton btnBloco24 = new JButton(""+puzzle.getGridPuzzle().getGrid()[4][3].getValor());
		btnBloco24.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnBloco24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mudaPosicao(puzzle, btnBloco24, btnBloco25);
			}
		});
		btnBloco24.setBounds(318, 298, 70, 60);
		panel.add(btnBloco24);
						
		JButton btnDesistir = new JButton("DESISTIR");
		btnDesistir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				TelaDesistir td = new TelaDesistir(puzzle);
//				td.setVisible(true);
//				dispose();
			}
		});
		btnDesistir.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
		btnDesistir.setBounds(417, 403, 101, 23);
		panel.add(btnDesistir);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 205, 170));
		panel_1.setBounds(91, 41, 376, 322);
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
		btnNewButton.setBounds(417, 374, 101, 23);
		panel.add(btnNewButton);
		
		JButton btnResolver = new JButton("RESOLVER");
		btnResolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				((PuzzleDificil) puzzle).resolveTabuleiro();

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
		// se eu pegar as posicoes na interface 170 e 172, eles vao ser equivalentes as
		// posicoes 1 e 2 na minha grid
		// esse metodo eh mais para poder converter as coordenadas
		switch (coord) {
		case 96:
			return 0;
		case 46:
			return 0;
		case 170:
			return 1;
		case 109:
			return 1;
		case 244:
			return 2;
		case 172:
			return 2;
		case 318:
			return 3;
		case 235:
			return 3;
		case 392:
			return 4;
		case 298:
			return 4;
		default:
			return -1;
		}
	}
	// o metodo mudaPosicao vai ser equivalente ao meu metodo executaMovimento na
	// minha classe Tabuleiro

	public void mudaPosicao(Puzzle puzzle, JButton botao, JButton btnInvisi) {
		// recebe um puzzle um botao que eu quero
		// mexer e o botao invisivel, que no caso vai
		// ser o botao em que o 0 esta localizado
		if (botao.getLocation().x + 74 ==btnInvisi.getLocation().x && botao.getLocation().y ==btnInvisi.getLocation().y) {
			puzzle.getGridPuzzle().executaMovimento(trocaCoordenada(botao.getLocation().y), trocaCoordenada(botao.getLocation().x), "direita");
			btnInvisi.setLocation(botao.getLocation().x, botao.getLocation().y);
			botao.setLocation(botao.getLocation().x + 74, botao.getLocation().y);
			
		} else if (botao.getLocation().x - 74 ==btnInvisi.getLocation().x && botao.getLocation().y ==btnInvisi.getLocation().y) {
			puzzle.getGridPuzzle().executaMovimento(trocaCoordenada(botao.getLocation().y), trocaCoordenada(botao.getLocation().x), "esquerda");
			btnInvisi.setLocation(botao.getLocation().x, botao.getLocation().y);
			botao.setLocation(botao.getLocation().x - 74, botao.getLocation().y);
			
		} else if (botao.getLocation().x ==btnInvisi.getLocation().x && botao.getLocation().y + 63 ==btnInvisi.getLocation().y) {
			puzzle.getGridPuzzle().executaMovimento(trocaCoordenada(botao.getLocation().y), trocaCoordenada(botao.getLocation().x), "baixo");
			btnInvisi.setLocation(botao.getLocation().x, botao.getLocation().y);
			botao.setLocation(botao.getLocation().x, botao.getLocation().y + 63);
			
		} else if (botao.getLocation().x ==btnInvisi.getLocation().x && botao.getLocation().y - 63 ==btnInvisi.getLocation().y) {
			puzzle.getGridPuzzle().executaMovimento(trocaCoordenada(botao.getLocation().y), trocaCoordenada(botao.getLocation().x), "cima");
			btnInvisi.setLocation(botao.getLocation().x, botao.getLocation().y);
			botao.setLocation(botao.getLocation().x, botao.getLocation().y - 63);
		}
//		else JOptionPane.showMessageDialog(null, "Movimento Invalido", "ERRO :(", JOptionPane.ERROR_MESSAGE);
//		
//		this.checaPuzzleOrdenado();
	}
	
	//quando a grid estiver ordenada o usuario venceu e troca pra tela que mostra a sua pontuacao e o tempo decorrido 
	public void checaPuzzleOrdenado() {
		if(puzzle.getGridPuzzle().isTabuleiroOrdenado()) {
//			//JOptionPane.showMessageDialog(null, "VC VENCEU");
//			TelaPontuacao tp = new TelaPontuacao(puzzle);
//			tp.setVisible(true);
//			dispose();
		}
	}
}