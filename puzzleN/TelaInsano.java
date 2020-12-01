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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInsano extends JFrame {

	private JPanel contentPane;

	private String nome;
	private Puzzle puzzle;
	private JTextField textField;
	

		public TelaInsano(String nome, Puzzle puzzle) {

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
			panel.setBackground(new Color(32, 178, 170));
			panel.setForeground(new Color(32, 178, 170));
			contentPane.add(panel);
			panel.setLayout(null);

			JLabel lblNewLabel = new JLabel("Nome: " + nome);
			lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
			lblNewLabel.setBounds(32, 406, 334, 14);
			panel.add(lblNewLabel);

			JButton btnNewButton = new JButton("MENU");
			btnNewButton.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					TelaMenu tm = new TelaMenu();
					tm.setVisible(true);
					dispose();
				}
			});
			btnNewButton.setBounds(416, 403, 106, 23);
			panel.add(btnNewButton);
			
			JButton btnCima = new JButton("CIMA");
			btnCima.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					

					puzzle.getGridPuzzle().setPosicaoValidaResolve();
					puzzle.getGridPuzzle().executaMovimentoResolve(puzzle.getGridPuzzle().achaZeroGrid()[0], puzzle.getGridPuzzle().achaZeroGrid()[1], "baixo");
				}
			});
			btnCima.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
			btnCima.setBounds(218, 114, 118, 23);
			panel.add(btnCima);
			
			JButton btnBaixo = new JButton("BAIXO");
			btnBaixo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					puzzle.getGridPuzzle().setPosicaoValidaResolve();
					puzzle.getGridPuzzle().executaMovimentoResolve(puzzle.getGridPuzzle().achaZeroGrid()[0], puzzle.getGridPuzzle().achaZeroGrid()[1], "cima");
					
				}
			});
			btnBaixo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
			btnBaixo.setBounds(218, 190, 118, 23);
			panel.add(btnBaixo);
			
			JButton btnDireita = new JButton("DIREITA");
			btnDireita.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					puzzle.getGridPuzzle().setPosicaoValidaResolve();
					puzzle.getGridPuzzle().executaMovimentoResolve(puzzle.getGridPuzzle().achaZeroGrid()[0], puzzle.getGridPuzzle().achaZeroGrid()[1], "esquerda");
				}
			});
			btnDireita.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
			btnDireita.setBounds(365, 153, 118, 23);
			panel.add(btnDireita);
			
			JButton btnEsquerda = new JButton("ESQUERDA");
			btnEsquerda.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					puzzle.getGridPuzzle().setPosicaoValidaResolve();
					puzzle.getGridPuzzle().executaMovimentoResolve(puzzle.getGridPuzzle().achaZeroGrid()[0], puzzle.getGridPuzzle().achaZeroGrid()[1], "direita");
				}
			});
			btnEsquerda.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
			btnEsquerda.setBounds(67, 153, 126, 23);
			panel.add(btnEsquerda);
			
			JButton btnNext = new JButton("NEXT");
			btnNext.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
			btnNext.setBounds(416, 369, 106, 23);
			panel.add(btnNext);
			
			JButton btnResolver = new JButton("RESOLVER");
			btnResolver.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 12));
			btnResolver.setBounds(416, 335, 106, 23);
			panel.add(btnResolver);
		}
	}