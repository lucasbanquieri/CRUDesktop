package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class MainMenu {
	
	
	private static JTextField txtNomeK;
	private static JTextField txtDataNK;

	private JFrame frame;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {		
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("                                                      CADASTRO DE DEPENDENTES");
		
		//Campo texto Nome
		txtNomeK = new JTextField();
		txtNomeK.setBounds(150, 28, 250, 20);
		frame.getContentPane().add(txtNomeK);
		txtNomeK.setColumns(10);
		Border Nomborder = BorderFactory.createLineBorder(Color.BLACK);
	    txtNomeK.setBorder(BorderFactory.createCompoundBorder(Nomborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
				
		JLabel lblNameK = new JLabel("Nome:* ");
		lblNameK.setBounds(65, 31, 46, 14);
		frame.getContentPane().add(lblNameK);
				
		JLabel lblNameKEx = new JLabel("Ex: Maria");
		lblNameKEx.setBounds(420, 31, 166, 14);
		frame.getContentPane().add(lblNameKEx);
		
		//Campo texto Data Nascimento
		txtDataNK = new JTextField();
		txtDataNK.setBounds(195, 58, 90, 20);
		frame.getContentPane().add(txtDataNK);
		txtDataNK.setColumns(10);
		Border Datborder = BorderFactory.createLineBorder(Color.BLACK);
	    txtDataNK.setBorder(BorderFactory.createCompoundBorder(Datborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
				
		JLabel lblDataK = new JLabel("Data de Nascimento:* ");
	    lblDataK.setBounds(65, 61, 126, 14);
		frame.getContentPane().add(lblDataK);
				
		JLabel lblDataKEx = new JLabel("Ex: DD/MM/YYYY");
		lblDataKEx.setBounds(295, 61, 106, 14);
		frame.getContentPane().add(lblDataKEx);
		
		//Botão cadastrar
		JButton btnKidC = new JButton("Adicionar");
		btnKidC.setBackground(Color.WHITE);
		btnKidC.setForeground(Color.BLACK);
		btnKidC.setBounds(90, 107, 100, 23);
		frame.getContentPane().add(btnKidC);
		
		btnKidC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		};
		});
	}
}
