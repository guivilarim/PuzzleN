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

public class TelaFimPartida extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFimPartida frame = new TelaFimPartida();
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
	public TelaFimPartida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPontuao = new JLabel("Pontua\u00E7\u00E3o");
		lblPontuao.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblPontuao.setBounds(224, 115, 118, 19);
		panel.add(lblPontuao);
		
		JLabel lblTempo = new JLabel("Tempo");
		lblTempo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 16));
		lblTempo.setBounds(248, 211, 80, 14);
		panel.add(lblTempo);
	}
}