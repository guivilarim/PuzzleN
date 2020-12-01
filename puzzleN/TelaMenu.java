package puzzleN;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import puzzleN.Dificuldade;
import puzzleN.Puzzle;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TelaMenu extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeJogador;
	private Puzzle puzzle;
	private JComboBox comboBoxDificuldade = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu frame = new TelaMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));

		JPanel telaMenu = new JPanel();
		telaMenu.setForeground(new Color(32, 178, 170));
		telaMenu.setBackground(new Color(32, 178, 170));
		contentPane.add(telaMenu);
		telaMenu.setLayout(null);

		JLabel lblPuzzleN = new JLabel("PUZZLE N");
		lblPuzzleN.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 24));
		lblPuzzleN.setBounds(223, 67, 136, 36);
		telaMenu.add(lblPuzzleN);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblNome.setBounds(197, 169, 87, 14);
		telaMenu.add(lblNome);

		txtNomeJogador = new JTextField();
		txtNomeJogador.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
		txtNomeJogador.setBounds(197, 195, 198, 20);
		telaMenu.add(txtNomeJogador);
		txtNomeJogador.setColumns(10);

		JLabel lblNvel = new JLabel("N\u00EDvel:");
		lblNvel.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblNvel.setBounds(197, 236, 75, 14);
		telaMenu.add(lblNvel);
		comboBoxDificuldade.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));

		comboBoxDificuldade.setModel(new DefaultComboBoxModel(new String[] {"Selecione o n\u00EDvel...", "F\u00E1cil", "M\u00E9dio", "Dif\u00EDcil", "Insano"}));
		comboBoxDificuldade.setBounds(197, 261, 198, 26);
		telaMenu.add(comboBoxDificuldade);

		JButton btnStart = new JButton(" START");
		btnStart.setForeground(new Color(255, 0, 0));
		btnStart.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (comboBoxDificuldade.getSelectedIndex() > 0 && checaNome(txtNomeJogador.getText())) {
					if (comboBoxDificuldade.getSelectedIndex() == 1) {
						puzzle = new PuzzleFacil(txtNomeJogador.getText());
						TelaFacil tf = new TelaFacil(txtNomeJogador.getText(), puzzle);
						tf.setVisible(true);
						dispose();
					} else if (comboBoxDificuldade.getSelectedIndex() == 2) {
						puzzle = new PuzzleMedio(txtNomeJogador.getText());
						TelaMedio tm = new TelaMedio(txtNomeJogador.getText(), puzzle);
						tm.setVisible(true);
						dispose();
					} else if (comboBoxDificuldade.getSelectedIndex() == 3) {
						puzzle = new PuzzleDificil(txtNomeJogador.getText());
						TelaDificil td = new TelaDificil(txtNomeJogador.getText(), puzzle);
						td.setVisible(true);
						dispose();
					}else if (comboBoxDificuldade.getSelectedIndex() == 4) {
						
						int tamanho =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do insano"));
						
						puzzle = new PuzzleInsano(txtNomeJogador.getText(),tamanho);
						TelaInsano td = new TelaInsano(txtNomeJogador.getText(), puzzle);
						td.setVisible(true);
						dispose();
									}
				}
				else
					JOptionPane.showMessageDialog(null, "Digite o seu nome!");
			}
		});
		btnStart.setBounds(233, 359, 110, 23);
		telaMenu.add(btnStart);
		
		JButton btnRanking = new JButton("RANKING");
		btnRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ranking r = new Ranking();
				r.setVisible(true);
				dispose();
			}
		});
		btnRanking.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		btnRanking.setBounds(218, 309, 141, 23);
		telaMenu.add(btnRanking);
	}
	
	public boolean checaNome(String nome) {
		if(nome.isEmpty())
			return false;
		else
			return true;
	}
}