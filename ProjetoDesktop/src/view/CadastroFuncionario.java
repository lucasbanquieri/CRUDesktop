package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

import controller.Controller;
import controller.Util;
import model.Kid;

import javax.swing.JComboBox;

public class CadastroFuncionario{


	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtCod;
	private JTextField txtCpf;
	private JTextField txtTel;
	private JTextField txtDataN;
	private JTextField txtEmail;
	private JTextField txtSal;
	private JTextField txtVA;
	private JTextField txtVR;
	private JTextField txtVT;
	private JTextField txtKids;
	
	private static ArrayList<Kid> arrayKids = new ArrayList<Kid>();

	public CadastroFuncionario(ArrayList<Kid> arrayKids) {
		super();
		this.arrayKids = arrayKids;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionario window = new CadastroFuncionario();
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
	public CadastroFuncionario() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {		
		frame = new JFrame();
		frame.setBounds(100, 50, 850, 649);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Campo texto Nome
		txtNome = new JTextField();
		txtNome.setBounds(150, 28, 250, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		Border Nomborder = BorderFactory.createLineBorder(Color.BLACK);
	    txtNome.setBorder(BorderFactory.createCompoundBorder(Nomborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		
		JLabel lblName = new JLabel("Nome:* ");
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
		
		JLabel lblCpf = new JLabel("CPF:* ");
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
		
		JLabel lblData = new JLabel("Data de Nascimento:* ");
		lblData.setBounds(65, 91, 126, 14);
		frame.getContentPane().add(lblData);
		
		JLabel lblDataEx = new JLabel("Ex: DD/MM/YYYY");
		lblDataEx.setBounds(295, 91, 106, 14);
		frame.getContentPane().add(lblDataEx);
		
		//Campo texto Código de Cadastro    
		txtCod = new JTextField();
		txtCod.setBounds(195, 118, 250, 20);
		frame.getContentPane().add(txtCod);
		txtCod.setColumns(10);
		Border Codborder = BorderFactory.createLineBorder(Color.BLACK);
	    txtCod.setBorder(BorderFactory.createCompoundBorder(Codborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		
		JLabel lblCod = new JLabel("Código de Cadastro:* ");
		lblCod.setBounds(65, 121, 136, 14);
		frame.getContentPane().add(lblCod);
		
		JLabel lblMatEx = new JLabel("Ex: 123456789");
		lblMatEx.setBounds(455, 121, 106, 14);
		frame.getContentPane().add(lblMatEx);
		
		//Text area Endereço
		JLabel lblAddress = new JLabel("Endereço:* ");
		lblAddress.setBounds(65, 162, 90, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblAddressEx = new JLabel("Ex: Rua Saci Pererê Furacão");
		lblAddressEx.setBounds(435, 162, 176, 14);
		frame.getContentPane().add(lblAddressEx);
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setBounds(175, 157, 250, 40);
		frame.getContentPane().add(textArea1);
		Border Endborder = BorderFactory.createLineBorder(Color.BLACK);
	    textArea1.setBorder(BorderFactory.createCompoundBorder(Endborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		
		//Radio Button Sexo
		JLabel lblSex = new JLabel("Sexo:* ");
		lblSex.setBounds(65, 208, 46, 14);
		frame.getContentPane().add(lblSex);
		
		JLabel lblMale = new JLabel("Masculino");
		lblMale.setBounds(175, 208, 60, 14);
		frame.getContentPane().add(lblMale);
		
		JLabel lblFemale = new JLabel("Feminino");
		lblFemale.setBounds(345, 208, 60, 14);
		frame.getContentPane().add(lblFemale);
		
		JRadioButton radioButtonMale = new JRadioButton("");
		radioButtonMale.setBounds(240, 204, 20, 23);
		frame.getContentPane().add(radioButtonMale);

		JRadioButton radioButtonFemale = new JRadioButton("");
		radioButtonFemale.setBounds(405, 204, 20, 23);
		frame.getContentPane().add(radioButtonFemale);
		
		//Campo texto Telefone
		txtTel = new JTextField();
		txtTel.setBounds(175, 248, 95, 20);
		frame.getContentPane().add(txtTel);
		txtTel.setColumns(10);
		Border Telborder = BorderFactory.createLineBorder(Color.BLACK);
	    txtTel.setBorder(BorderFactory.createCompoundBorder(Telborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
				
		JLabel lblTel = new JLabel("Telefone:* ");
		lblTel.setBounds(65, 248, 126, 14);
		frame.getContentPane().add(lblTel);
		
		JLabel lblTelEx = new JLabel("Ex: (43)99999999");
		lblTelEx.setBounds(280, 250, 126, 14);
		frame.getContentPane().add(lblTelEx);
		
		//Combobox Disciplina
	    JLabel lblOccupation = new JLabel("Disciplina: ");
	  	lblOccupation.setBounds(450, 288, 67, 14);
	  	frame.getContentPane().add(lblOccupation);
	  	lblOccupation.setVisible(false);
	  		
	  	JComboBox<String> comboBoxD = new JComboBox<String>();
	  	comboBoxD.addItem("Selecionar...");
	  	comboBoxD.addItem("Banco de Dados");
	  	comboBoxD.addItem("Front-end");
	  	comboBoxD.addItem("Java WEB");
	  	comboBoxD.addItem("Linguagem de Programação Java");
	  	comboBoxD.addItem("Outros");
	  	comboBoxD.addActionListener(new ActionListener() {
	  		public void actionPerformed(ActionEvent arg0) {
	  		}
	  	});
	  	comboBoxD.setBounds(520, 285, 250, 20);
	  	frame.getContentPane().add(comboBoxD);
	  	comboBoxD.setVisible(false);
	  	Border Disborder = BorderFactory.createLineBorder(Color.BLACK);
	  	comboBoxD.setBorder(BorderFactory.createCompoundBorder(Disborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		
		//Combobox Cargo
		JLabel lblJob = new JLabel("Cargo:* ");
		lblJob.setBounds(65, 288, 67, 14);
		frame.getContentPane().add(lblJob);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("Selecionar...");
		comboBox.addItem("Professor");
		comboBox.addItem("Analista Mainframe");
		comboBox.addItem("Analista Baixa Plataforma");
		comboBox.addItem("Programador Mainframe");
		comboBox.addItem("Programador Baixa Plataforma");
		comboBox.addItem("Lider de Projetos");
		comboBox.addItem("Gerente");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox.getSelectedItem().equals("Professor")) {
					lblOccupation.setVisible(true);
					comboBoxD.setVisible(true);
				} else {
					lblOccupation.setVisible(false);
					comboBoxD.setVisible(false);
				}
			}
		});
		comboBox.setBounds(175, 285, 250, 20);
		frame.getContentPane().add(comboBox);
		Border Curborder = BorderFactory.createLineBorder(Color.BLACK);
	    comboBox.setBorder(BorderFactory.createCompoundBorder(Curborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
	    
		//Campo texto E-Mail
		txtEmail = new JTextField();
		txtEmail.setBounds(175, 328, 250, 20);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		Border Mailborder = BorderFactory.createLineBorder(Color.BLACK);
	    txtEmail.setBorder(BorderFactory.createCompoundBorder(Mailborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		
		JLabel lblEmail = new JLabel("E-Mail:* ");
		lblEmail.setBounds(65, 331, 126, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblEmailEx = new JLabel("Ex: seuemail@dominio.com");
		lblEmailEx.setBounds(435, 331, 176, 14);
		frame.getContentPane().add(lblEmailEx);
		
		//Campo texto Salário
		txtSal = new JTextField();
		txtSal.setBounds(175, 358, 250, 20);
		frame.getContentPane().add(txtSal);
		txtSal.setColumns(10);
		Border Salborder = BorderFactory.createLineBorder(Color.BLACK);
		txtSal.setBorder(BorderFactory.createCompoundBorder(Salborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
				
		JLabel lblSal = new JLabel("Salário:* ");
		lblSal.setBounds(65, 361, 126, 14);
		frame.getContentPane().add(lblSal);
				
		JLabel lblSalEx = new JLabel("Ex: 956,00");
		lblSalEx.setBounds(435, 361, 176, 14);
		frame.getContentPane().add(lblSalEx);
		
		//Campo texto Vale Alimentação
		txtVA = new JTextField();
		txtVA.setBounds(175, 388, 250, 20);
		frame.getContentPane().add(txtVA);
		txtVA.setColumns(10);
		Border VAborder = BorderFactory.createLineBorder(Color.BLACK);
		txtVA.setBorder(BorderFactory.createCompoundBorder(VAborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
						
		JLabel lblVA = new JLabel("Vale Alimentação: ");
		lblVA.setBounds(65, 391, 126, 14);
		frame.getContentPane().add(lblVA);
						
		JLabel lblVAEx = new JLabel("Ex: 400,00");
		lblVAEx.setBounds(435, 391, 176, 14);
		frame.getContentPane().add(lblVAEx);
		
		//Campo texto Vale Refeição
		txtVR = new JTextField();
		txtVR.setBounds(175, 418, 250, 20);
		frame.getContentPane().add(txtVR);
		txtVR.setColumns(10);
		Border VRborder = BorderFactory.createLineBorder(Color.BLACK);
		txtVR.setBorder(BorderFactory.createCompoundBorder(VRborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
								
		JLabel lblVR = new JLabel("Vale Refeição: ");
		lblVR.setBounds(65, 421, 126, 14);
		frame.getContentPane().add(lblVR);
								
		JLabel lblVREx = new JLabel("Ex: 400,00");
		lblVREx.setBounds(435, 421, 176, 14);
		frame.getContentPane().add(lblVREx);
		
		//Campo texto Vale Transporte
		txtVT = new JTextField();
		txtVT.setBounds(175, 448, 250, 20);
		frame.getContentPane().add(txtVT);
		txtVT.setColumns(10);
		Border VTborder = BorderFactory.createLineBorder(Color.BLACK);
		txtVT.setBorder(BorderFactory.createCompoundBorder(VTborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
										
		JLabel lblVT = new JLabel("Vale Transporte: ");
		lblVT.setBounds(65, 451, 126, 14);
		frame.getContentPane().add(lblVT);
										
		JLabel lblVTEx = new JLabel("Ex: 250,00");
		lblVTEx.setBounds(435, 451, 176, 14);
		frame.getContentPane().add(lblVTEx);
		
		//Campo texto Filhos		
		txtKids = new JTextField();
		txtKids.setBounds(175, 478, 250, 20);
		frame.getContentPane().add(txtKids);
		txtKids.setColumns(10);
		txtKids.setText("0");
		Border Kidsborder = BorderFactory.createLineBorder(Color.BLACK);
		txtKids.setBorder(BorderFactory.createCompoundBorder(Kidsborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
												
		JLabel lblKids = new JLabel("Qtd. Filhos: ");
		lblKids.setBounds(65, 481, 126, 14);
		frame.getContentPane().add(lblKids);
												
		JLabel lblKidsEx = new JLabel("Ex: 2");
		lblKidsEx.setBounds(435, 481, 176, 14);
		frame.getContentPane().add(lblKidsEx);
		
		//Botoes
		JButton btnKid = new JButton("Add. Dependente");
		btnKid.setBackground(Color.WHITE);
		btnKid.setForeground(Color.BLACK);
		btnKid.setBounds(240, 507, 130, 23);
		frame.getContentPane().add(btnKid);
		
		JButton btnClear = new JButton("Limpar");
		btnClear.setBackground(Color.BLACK);
		btnClear.setForeground(Color.RED);
		btnClear.setBounds(435, 567, 89, 23);
		frame.getContentPane().add(btnClear);
		
		JButton btnSubmit = new JButton("Cadastrar");
		btnSubmit.setBackground(Color.BLACK);
		btnSubmit.setForeground(Color.RED);
		btnSubmit.setBounds(65, 567, 100, 23);
		frame.getContentPane().add(btnSubmit);
		
		//Botão de adicionar dependentes
		btnKid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				Util util = new Util();
				if (util.isInteger(txtKids.getText())) {
					int tk = Integer.parseInt(txtKids.getText());
					if (tk > 0) {
						CadastroKids.main(null);
					} else {
						JOptionPane.showMessageDialog(null, "Número de dependentes não pode ser zero.");
					}
				}
			}
		});
			
			
		btnSubmit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Util util = new Util();
				String errorMsg = "";
				boolean erro = false;
				
				if(txtNome.getText().isEmpty()) {
					errorMsg = errorMsg + "-Nome inválido ou não preenchido. \n";
					erro = true;
				}
				if (txtCod.getText().isEmpty() 
						|| txtCod.getText().length() > 9) {
					errorMsg = errorMsg + "-Código de cadastro inválido ou não preenchido. \n";
					erro = true;
				} if ((textArea1.getText().isEmpty())) {
					errorMsg = errorMsg + "-Endereço inválido ou não preenchido. \n";
					erro = true;
				} if ((radioButtonMale.isSelected())&&(radioButtonFemale.isSelected())) {
					errorMsg = errorMsg + "-Selecione apenas um dos sexos. \n";
					erro = true;
				} if ((comboBox.getSelectedItem().equals("Selecionar..."))) {
					errorMsg = errorMsg + "-Selecione um curso. \n";
					erro = true;
				} else if (comboBox.getSelectedItem().equals("Professor") && comboBoxD.getSelectedItem().equals("Selecionar...")) {
					errorMsg = errorMsg + "-Selecione uma disciplina. \n";
					erro = true;
				} if (txtCpf.getText().isEmpty() || util.isCPF(txtCpf.getText()) == false) {
					errorMsg = errorMsg + "-CPF inválido ou não preenchido. \n";
					erro = true;
				} if (txtTel.getText().isEmpty()) {
					errorMsg = errorMsg + "-Telefone inválido ou não preenchido. \n";
					erro = true;
				} if (txtDataN.getText().isEmpty() || util.validaData(txtDataN.getText()) == false) {
					errorMsg = errorMsg + "-Data de nascimento inválida ou não preenchida. \n";
					erro = true;
				} if (txtEmail.getText().isEmpty()) {
					errorMsg = errorMsg + "-E-Mail inválido ou não preenchido. \n";
					erro = true;
				} if (txtVA.getText().isEmpty()) {
					errorMsg = errorMsg + "-Vale Alimentação inválido ou não preenchido. \n";
					erro = true;
				} if (txtVR.getText().isEmpty()) {
					errorMsg = errorMsg + "-Vale Refeição inválido ou não preenchido. \n";
					erro = true;
				} if (txtVT.getText().isEmpty()) {
					errorMsg = errorMsg + "-Vale Transporte inválido ou não preenchido. \n";
					erro = true;
				} if (txtSal.getText().isEmpty()) {
					errorMsg = errorMsg + "-Salário inválido ou não preenchido. \n";
					erro = true;
				} if (txtKids.getText().isEmpty() || !util.isInteger(txtKids.getText())) {
					errorMsg = errorMsg + "-Número de filhos inválido ou não preenchido. \n";
					erro = true;
				} else if (recebeKids(Integer.parseInt(txtKids.getText())) == false) {
						errorMsg = errorMsg + "-Dependentes não adicionados.";
						erro = true;
				}
				
				if (erro) {
					JOptionPane.showMessageDialog(null, "**** Por favor corrija os seguintes erros: **** \n" + errorMsg, "ERRO", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
					Controller con = new Controller();
					con.cadastrarFuncionario();
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
				txtSal.setText(null);
				txtVA.setText(null);
				txtVR.setText(null);
				txtVT.setText(null);
				txtKids.setText(null);
				textArea1.setText(null);
				radioButtonFemale.setSelected(false);
				radioButtonMale.setSelected(false);
				comboBox.setSelectedItem("Selecionar...");
			}
		}); 
	}
	public static boolean recebeKids(int tk) {
		
		arrayKids = CadastroKids.arrayKids;
		if (tk > 0 && arrayKids.size() != tk) {
			return false;
		} else {
			return true;
		}
	}
}