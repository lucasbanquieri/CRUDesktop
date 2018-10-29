package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

import controller.Util;
import model.Kid;

public class CadastroKids extends CadastroFuncionario{
	
	
	private static JTextField txtNomeK;
	private static JTextField txtDataNK;

	private JFrame frame;
	
	static ArrayList<Kid> arrayKids = new ArrayList<>();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroKids window = new CadastroKids();
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
	public CadastroKids() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {		
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 180);
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
				Util u = new Util();
				Date dataNK = new Date();
				dataNK = u.transformaData(txtDataNK.getText());
				String errorMsg = "";
				boolean erro = false;
				
				if(txtNomeK.getText().isEmpty()) {
					errorMsg = errorMsg + "-Nome inválido ou não preenchido. \n";
					erro = true;
				} if (txtDataNK.getText().isEmpty() || u.validaData(txtDataNK.getText()) == false) {
					errorMsg = errorMsg + "-Data de nascimento inválida ou não preenchida. \n";
					erro = true;
				} if (erro) {
					JOptionPane.showMessageDialog(null, "**** Por favor corrija os seguintes erros: **** \n" + errorMsg, "ERRO", JOptionPane.ERROR_MESSAGE);
				} else {
					cadastraKid();
					JOptionPane.showMessageDialog(null, "Dependente cadastrado!");
				}
				
			}
		});
		
		//Botão Visualizar
		JButton btnKidV = new JButton("Visualizar");
		btnKidV.setBackground(Color.WHITE);
		btnKidV.setForeground(Color.BLACK);
		btnKidV.setBounds(340, 107, 100, 23);
		frame.getContentPane().add(btnKidV);
		
		btnKidV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
				String printKids = "";
				
				for (Kid kid : arrayKids) {
					printKids = printKids + kid.getNome() + "  - ";
					printKids = printKids + dt.format(kid.getDataNascimento()) + "\n";
				}
				JOptionPane.showMessageDialog(null, printKids);
			}
		});
	}
	public static ArrayList<Kid> cadastraKid() {
		Util u = new Util();
		Date dataNK = new Date();
		dataNK = u.transformaData(txtDataNK.getText());
		Kid dep = new Kid(txtNomeK.getText(), dataNK);
		
		arrayKids.add(dep);
		return arrayKids;
		
	}
}
