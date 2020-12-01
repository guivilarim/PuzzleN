package puzzleN;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ranking extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ranking frame = new Ranking();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ranking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(32, 178, 170));
		panel.setBackground(new Color(32, 178, 170));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblNome.setBounds(78, 37, 63, 14);
		panel.add(lblNome);
		
		JLabel lblPontuao = new JLabel("Pontuacao");
		lblPontuao.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblPontuao.setBounds(251, 37, 108, 14);
		panel.add(lblPontuao);
		
		JLabel lblTempo = new JLabel("Tempo");
		lblTempo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblTempo.setBounds(405, 37, 88, 14);
		panel.add(lblTempo);
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenu tm = new TelaMenu();
				tm.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 11));
		btnVoltar.setBounds(431, 390, 89, 23);
		panel.add(btnVoltar);
	}
}