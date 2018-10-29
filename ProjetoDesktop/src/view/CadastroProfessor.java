package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

import controller.Controller;
import controller.Util;

import javax.swing.JComboBox;

public class CadastroProfessor {


	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtTel;
	private JTextField txtDataN;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProfessor window = new CadastroProfessor();
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
	public CadastroProfessor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 730, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Campo texto Nome
		txtNome = new JTextField();
		txtNome.setBounds(150, 28, 250, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		Border Nomborder = BorderFactory.createLineBorder(Color.BLACK);
	    txtNome.setBorder(BorderFactory.createCompoundBorder(Nomborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		
		JLabel lblName = new JLabel("Nome: ");
		lblName.setBounds(65, 31, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblNameEx = new JLabel("Ex: Maria");
		lblNameEx.setBounds(410, 31, 66, 14);
		frame.getContentPane().add(lblNameEx);
		
		//Campo texto CPF
		txtCpf = new JTextField();
		txtCpf.setBounds(150, 58, 250, 20);
		frame.getContentPane().add(txtCpf);
		txtCpf.setColumns(10);
		Border Cpfborder = BorderFactory.createLineBorder(Color.BLACK);
	    txtCpf.setBorder(BorderFactory.createCompoundBorder(Cpfborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		
		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setBounds(65, 61, 46, 14);
		frame.getContentPane().add(lblCpf);
		
		JLabel lblCpfEx = new JLabel("Ex: 00000000000");
		lblCpfEx.setBounds(410, 60, 106, 14);
		frame.getContentPane().add(lblCpfEx);
		
		//Campo texto Data Nascimento
		txtDataN = new JTextField();
		txtDataN.setBounds(195, 88, 90, 20);
		frame.getContentPane().add(txtDataN);
		txtDataN.setColumns(10);
		Border Datborder = BorderFactory.createLineBorder(Color.BLACK);
	    txtDataN.setBorder(BorderFactory.createCompoundBorder(Datborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		
		JLabel lblData = new JLabel("Data de Nascimento: ");
		lblData.setBounds(65, 91, 126, 14);
		frame.getContentPane().add(lblData);
		
		JLabel lblDataEx = new JLabel("Ex: DD/MM/YYYY");
		lblDataEx.setBounds(295, 91, 106, 14);
		frame.getContentPane().add(lblDataEx);
		
		//Campo texto Telefone
		txtTel = new JTextField();
		txtTel.setBounds(150, 118, 95, 20);
		frame.getContentPane().add(txtTel);
		txtTel.setColumns(10);
		Border Telborder = BorderFactory.createLineBorder(Color.BLACK);
	    txtTel.setBorder(BorderFactory.createCompoundBorder(Telborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		
		JLabel lblTel = new JLabel("Telefone: ");
		lblTel.setBounds(65, 121, 126, 14);
		frame.getContentPane().add(lblTel);
		
		JLabel lblTelEx = new JLabel("Ex: (43)99999999");
		lblTelEx.setBounds(255, 121, 106, 14);
		frame.getContentPane().add(lblTelEx);
		
		//Text area Endereço
		JLabel lblAddress = new JLabel("Endereço: ");
		lblAddress.setBounds(65, 162, 60, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblAddressEx = new JLabel("Ex: Rua Saci Pererê Furacão");
		lblAddressEx.setBounds(410, 162, 176, 14);
		frame.getContentPane().add(lblAddressEx);
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setBounds(150, 157, 250, 40);
		frame.getContentPane().add(textArea1);
		Border border = BorderFactory.createLineBorder(Color.BLACK);
	    textArea1.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		
		//Radio Button Sexo
		JLabel lblSex = new JLabel("Sexo: ");
		lblSex.setBounds(65, 228, 46, 14);
		frame.getContentPane().add(lblSex);
		
		JLabel lblMale = new JLabel("Masculino");
		lblMale.setBounds(150, 228, 60, 14);
		frame.getContentPane().add(lblMale);
		
		JLabel lblFemale = new JLabel("Feminino");
		lblFemale.setBounds(320, 228, 60, 14);
		frame.getContentPane().add(lblFemale);
		
		JRadioButton radioButtonMale = new JRadioButton("");
		radioButtonMale.setBounds(215, 224, 20, 23);
		frame.getContentPane().add(radioButtonMale);

		JRadioButton radioButtonFemale = new JRadioButton("");
		radioButtonFemale.setBounds(380, 224, 20, 23);
		frame.getContentPane().add(radioButtonFemale);
		
		//Combobox Disciplina
		JLabel lblOccupation = new JLabel("Disciplina: ");
		lblOccupation.setBounds(65, 288, 67, 14);
		frame.getContentPane().add(lblOccupation);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("Selecionar...");
		comboBox.addItem("Banco de Dados");
		comboBox.addItem("Front-end");
		comboBox.addItem("Java WEB");
		comboBox.addItem("Linguagem de Programação Java");
		comboBox.addItem("Outros");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		comboBox.setBounds(150, 285, 250, 20);
		frame.getContentPane().add(comboBox);
		Border Disborder = BorderFactory.createLineBorder(Color.BLACK);
	    comboBox.setBorder(BorderFactory.createCompoundBorder(Disborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		
		//Campo texto E-Mail
		txtEmail = new JTextField();
		txtEmail.setBounds(150, 328, 250, 20);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		Border Mailborder = BorderFactory.createLineBorder(Color.BLACK);
	    txtEmail.setBorder(BorderFactory.createCompoundBorder(Mailborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		
		JLabel lblEmail = new JLabel("E-Mail: ");
		lblEmail.setBounds(65, 331, 126, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblEmailEx = new JLabel("Ex: seuemail@dominio.com");
		lblEmailEx.setBounds(410, 331, 176, 14);
		frame.getContentPane().add(lblEmailEx);
		
		//Botoes
		JButton btnClear = new JButton("Limpar");
		btnClear.setBounds(312, 387, 89, 23);
		frame.getContentPane().add(btnClear);
		btnClear.setBackground(Color.BLACK);
		btnClear.setForeground(Color.RED);
		
		JButton btnSubmit = new JButton("Cadastrar");
		btnSubmit.setBackground(Color.BLACK);
		btnSubmit.setForeground(Color.RED);
		btnSubmit.setBounds(65, 387, 100, 23);
		frame.getContentPane().add(btnSubmit);
		btnSubmit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Util util = new Util();
				String errorMsg = "";
				boolean erro = false;
				
				if(txtNome.getText().isEmpty()) {
					errorMsg = errorMsg + "-Nome inválido ou não preenchido. \n";
					erro = true;
				}if ((textArea1.getText().isEmpty())) {
					errorMsg = errorMsg + "-Endereço inválido ou não preenchido. \n";
					erro = true;
				}if ((radioButtonMale.isSelected())&&(radioButtonFemale.isSelected())) {
					errorMsg = errorMsg + "-Selecione apenas um dos sexos. \n";
					erro = true;
				}if ((comboBox.getSelectedItem().equals("Selecionar..."))) {
					errorMsg = errorMsg + "-Selecione uma disciplina. \n";
					erro = true;
				}if (txtCpf.getText().isEmpty() || util.isCPF(txtCpf.getText()) == false) {
					errorMsg = errorMsg + "-CPF inválido ou não preenchido. \n";
					erro = true;
				}if (txtTel.getText().isEmpty()) {
					errorMsg = errorMsg + "-Telefone inválido ou não preenchido. \n";
					erro = true;
				}if (txtDataN.getText().isEmpty() || util.validaData(txtDataN.getText()) == false) {
					errorMsg = errorMsg + "-Data de nascimento inválida ou não preenchida. \n";
					erro = true;
				}if (txtEmail.getText().isEmpty()) {
					errorMsg = errorMsg + "-E-Mail inválido ou não preenchido. \n";
					erro = true;
				}
				
				if (erro) {
					JOptionPane.showMessageDialog(null, "**** Por favor corrija os seguintes erros: **** \n" + errorMsg, "ERRO", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
					Controller con = new Controller();
					con.cadastrarProfessor();
				}
			}
		});
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText(null);
				txtCpf.setText(null);
				txtTel.setText(null);
				txtEmail.setText(null);
				txtDataN.setText(null);
				textArea1.setText(null);
				radioButtonFemale.setSelected(false);
				radioButtonMale.setSelected(false);
				comboBox.setSelectedItem("Selecionar...");
			}
		}); 
	}
}
