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

import controller.ControllerAluno;
import controller.Util;

import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.AbstractAction;
import javax.swing.Action;

import model.Aluno;

public class CadastroAluno {


	private static JFrame frmCadastroDeAlunos;
	private static JTextField txtNome;
	private static JTextField txtMat;
	private static JTextField txtCpf;
	private static JTextField txtTel;
	private static JTextField txtDataN;
	private static JTextField txtEmail;
	private static JTextArea textArea1;
	private static JRadioButton radioButtonMale;
	private static JRadioButton radioButtonFemale;
	private static JComboBox<String> comboBox;
	private boolean isNew = MainMenu.isNew;
	@SuppressWarnings("unused")
	private final Action action = new SwingAction();

	public static JFrame getFrmCadastroDeAlunos() {
		return frmCadastroDeAlunos;
	}

	public static JTextField getTxtNome() {
		return txtNome;
	}

	public static JTextField getTxtMat() {
		return txtMat;
	}

	public static JTextField getTxtCpf() {
		return txtCpf;
	}

	public static JTextField getTxtTel() {
		return txtTel;
	}

	public static JTextField getTxtDataN() {
		return txtDataN;
	}

	public static JTextField getTxtEmail() {
		return txtEmail;
	}

	public static JTextArea getTextArea1() {
		return textArea1;
	}

	public static JRadioButton getRadioButtonMale() {
		return radioButtonMale;
	}

	public static JRadioButton getRadioButtonFemale() {
		return radioButtonFemale;
	}

	public static JComboBox<String> getComboBox() {
		return comboBox;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("static-access")
			public void run() {
				try {
					CadastroAluno window = new CadastroAluno();
					window.frmCadastroDeAlunos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroAluno() {
		initialize(null);
	}
	
	public CadastroAluno(Aluno aluno) {
		initialize(aluno);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Aluno aluno) {		
		frmCadastroDeAlunos = new JFrame();
		frmCadastroDeAlunos.setBounds(100, 50, 631, 487);
		frmCadastroDeAlunos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCadastroDeAlunos.setTitle("                                                                         CADASTRO DE ALUNOS");
		frmCadastroDeAlunos.getContentPane().setLayout(null);
		frmCadastroDeAlunos.setResizable(false);
		
		//Campo texto Nome
		txtNome = new JTextField();
		txtNome.setBounds(175, 28, 250, 20);
		frmCadastroDeAlunos.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		Border Nomborder = BorderFactory.createLineBorder(Color.BLACK);
        txtNome.setBorder(BorderFactory.createCompoundBorder(Nomborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        if (!isNew && aluno != null) {        	
        	txtNome.setText(aluno.getNome());
        }
		
		JLabel lblName = new JLabel("Nome:* ");
		lblName.setBounds(54, 31, 46, 14);
		frmCadastroDeAlunos.getContentPane().add(lblName);
		
		JLabel lblNameEx = new JLabel("Ex: Maria");
		lblNameEx.setBounds(435, 31, 66, 14);
		frmCadastroDeAlunos.getContentPane().add(lblNameEx);
		
		//Campo texto CPF
		txtCpf = new JTextField();
		txtCpf.setBounds(175, 59, 250, 20);
		frmCadastroDeAlunos.getContentPane().add(txtCpf);
		txtCpf.setColumns(10);
		Border Cpfborder = BorderFactory.createLineBorder(Color.BLACK);
        txtCpf.setBorder(BorderFactory.createCompoundBorder(Cpfborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		if (!isNew && aluno != null) {
			txtCpf.setText(aluno.getCpf());
			txtCpf.setEnabled(false);
		}
		
		JLabel lblCpf = new JLabel("CPF:* ");
		lblCpf.setBounds(54, 62, 46, 14);
		frmCadastroDeAlunos.getContentPane().add(lblCpf);
		
		JLabel lblCpfEx = new JLabel("Ex: 00000000000");
		lblCpfEx.setBounds(435, 62, 106, 14);
		frmCadastroDeAlunos.getContentPane().add(lblCpfEx);
		
		//Campo texto Data Nascimento
		txtDataN = new JTextField();
		txtDataN.setBounds(175, 88, 90, 20);
		frmCadastroDeAlunos.getContentPane().add(txtDataN);
		txtDataN.setColumns(10);
		Border Datborder = BorderFactory.createLineBorder(Color.BLACK);
        txtDataN.setBorder(BorderFactory.createCompoundBorder(Datborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        if (!isNew && aluno != null) {
        	Util util = new Util();
        	txtDataN.setText(util.convertStringToDate(aluno.getDataNascimento()));
        }
		
		JLabel lblData = new JLabel("Data de Nascimento:* ");
		lblData.setBounds(54, 91, 126, 14);
		frmCadastroDeAlunos.getContentPane().add(lblData);
		
		JLabel lblDataEx = new JLabel("Ex: DD/MM/YYYY");
		lblDataEx.setBounds(295, 91, 106, 14);
		frmCadastroDeAlunos.getContentPane().add(lblDataEx);
		
		//Campo texto Matrícula    
		txtMat = new JTextField();
		txtMat.setBounds(175, 118, 250, 20);
		frmCadastroDeAlunos.getContentPane().add(txtMat);
		txtMat.setColumns(10);
		Border Matborder = BorderFactory.createLineBorder(Color.BLACK);
        txtMat.setBorder(BorderFactory.createCompoundBorder(Matborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		if (!isNew && aluno != null) {
			txtMat.setText(aluno.getMatricula() + "");
			txtMat.setEnabled(false);
		}
		
		JLabel lblMat = new JLabel("Matrícula:* ");
		lblMat.setBounds(54, 121, 136, 14);
		frmCadastroDeAlunos.getContentPane().add(lblMat);
		
		JLabel lblCodEx = new JLabel("Ex: 123456789");
		lblCodEx.setBounds(435, 121, 106, 14);
		frmCadastroDeAlunos.getContentPane().add(lblCodEx);
		
		//Text area Endereço
		JLabel lblAddress = new JLabel("Endereço:* ");
		lblAddress.setBounds(54, 162, 90, 14);
		frmCadastroDeAlunos.getContentPane().add(lblAddress);
		
		JLabel lblAddressEx = new JLabel("Ex: Rua Saci Pererê Furacão");
		lblAddressEx.setBounds(435, 162, 176, 14);
		frmCadastroDeAlunos.getContentPane().add(lblAddressEx);
		
		textArea1 = new JTextArea();
		textArea1.setBounds(175, 157, 250, 40);
		frmCadastroDeAlunos.getContentPane().add(textArea1);
		Border Endborder = BorderFactory.createLineBorder(Color.BLACK);
        textArea1.setBorder(BorderFactory.createCompoundBorder(Endborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        if (!isNew && aluno != null) {
			textArea1.setText(aluno.getEndereco());
		}
		
		//Radio Button Sexo
		JLabel lblSex = new JLabel("Sexo:* ");
		lblSex.setBounds(54, 208, 46, 14);
		frmCadastroDeAlunos.getContentPane().add(lblSex);
		
		JLabel lblMale = new JLabel("Masculino");
		lblMale.setBounds(175, 208, 60, 14);
		frmCadastroDeAlunos.getContentPane().add(lblMale);
		
		JLabel lblFemale = new JLabel("Feminino");
		lblFemale.setBounds(345, 208, 60, 14);
		frmCadastroDeAlunos.getContentPane().add(lblFemale);
		
		radioButtonMale = new JRadioButton("M");
		radioButtonMale.setBounds(240, 204, 20, 23);
		frmCadastroDeAlunos.getContentPane().add(radioButtonMale);

		radioButtonFemale = new JRadioButton("F");
		radioButtonFemale.setBounds(405, 204, 20, 23);
		frmCadastroDeAlunos.getContentPane().add(radioButtonFemale);
		if (!isNew && aluno != null) {
			if (aluno.getSexo().equals("M")) {
				radioButtonMale.setSelected(true);
			} else {
				radioButtonFemale.setSelected(true);
			}
		}
		
		//Campo texto Telefone
		txtTel = new JTextField();
		txtTel.setBounds(175, 248, 95, 20);
		frmCadastroDeAlunos.getContentPane().add(txtTel);
		txtTel.setColumns(10);
		Border Telborder = BorderFactory.createLineBorder(Color.BLACK);
        txtTel.setBorder(BorderFactory.createCompoundBorder(Telborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        if (!isNew && aluno != null) {
        	txtTel.setText(aluno.getTelefone());
        }
				
		JLabel lblTel = new JLabel("Telefone:* ");
		lblTel.setBounds(54, 251, 126, 14);
		frmCadastroDeAlunos.getContentPane().add(lblTel);
		
		JLabel lblTelEx = new JLabel("Ex: (43)99999999");
		lblTelEx.setBounds(280, 250, 126, 14);
		frmCadastroDeAlunos.getContentPane().add(lblTelEx);
		
		//Combobox Curso
		JLabel lblJob = new JLabel("Curso:* ");
		lblJob.setBounds(54, 288, 67, 14);
		frmCadastroDeAlunos.getContentPane().add(lblJob);
		
		comboBox = new JComboBox<String>();
		comboBox.addItem("Selecionar...");
		comboBox.addItem("Banco de Dados");
		comboBox.addItem("Front-end");
		comboBox.addItem("Java WEB");
		comboBox.addItem("Linguagem de Programaçãoo Java");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		comboBox.setBounds(175, 285, 250, 20);
		frmCadastroDeAlunos.getContentPane().add(comboBox);
		if (!isNew && aluno != null) {
			comboBox.setSelectedItem(aluno.getCurso());
		}
	    
		//Campo texto E-Mail
		txtEmail = new JTextField();
		txtEmail.setBounds(175, 328, 250, 20);
		frmCadastroDeAlunos.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		Border Mailborder = BorderFactory.createLineBorder(Color.BLACK);
	    txtEmail.setBorder(BorderFactory.createCompoundBorder(Mailborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
	    if (!isNew && aluno != null) {
	    	txtEmail.setText(aluno.getEmail());
	    }
		
		JLabel lblEmail = new JLabel("E-Mail:* ");
		lblEmail.setBounds(54, 331, 126, 14);
		frmCadastroDeAlunos.getContentPane().add(lblEmail);
		
		JLabel lblEmailEx = new JLabel("Ex: seuemail@dominio.com");
		lblEmailEx.setBounds(435, 331, 176, 14);
		frmCadastroDeAlunos.getContentPane().add(lblEmailEx);
		
		
		//Botoes		
		JButton btnClear = new JButton("Limpar");
		btnClear.setBackground(Color.BLACK);
		btnClear.setForeground(Color.RED);
		btnClear.setBounds(427, 394, 89, 23);
		frmCadastroDeAlunos.getContentPane().add(btnClear);
		
		JButton btnSubmit = new JButton("Cadastrar");
		if (!isNew) {
			btnSubmit.setText("Salvar");
		}
		btnSubmit.setBackground(Color.BLACK);
		btnSubmit.setForeground(Color.RED);
		btnSubmit.setBounds(65, 394, 100, 23);
		frmCadastroDeAlunos.getContentPane().add(btnSubmit);			
		btnSubmit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				ControllerAluno con = new ControllerAluno();
				
				if (temErro() != "") {
					JOptionPane.showMessageDialog(null, "**** Por favor corrija os seguintes erros: **** \n" + temErro(), "ERRO", JOptionPane.ERROR_MESSAGE);
					
				} else if (isNew) {
	                con.cadastrarAluno(buildAluno());
    				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
    				MainMenu.loadTableAlu();
    				
    				frmCadastroDeAlunos.dispose();
    				
    				
				} else {				
					editaAluno(aluno);
					if (MainMenu.loadTableAlu()) {
						JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso!");
						isNew = true;
						frmCadastroDeAlunos.dispose();
					}
				}
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText(null);
				txtTel.setText(null);
				txtEmail.setText(null);
				txtDataN.setText(null);
				textArea1.setText(null);
				radioButtonFemale.setSelected(false);
				radioButtonMale.setSelected(false);
				comboBox.setSelectedItem("Selecionar...");
			}
		});
		frmCadastroDeAlunos.setVisible(true);
	}
	
	@SuppressWarnings("static-access")
	public static boolean checkMatAlu(String txtMat) {
		ControllerAluno con = new ControllerAluno();
		boolean aux = false;
		for (int i = 0; i < con.arrayAluno.size(); i++) {
			if (Integer.parseInt(txtMat) == (con.arrayAluno.get(i).getMatricula())) {
				aux = true;
			} else {
				aux = false;
			}
		}
		return aux;
	}
	
	public String temErro() {
		Util util = new Util();
		String errorMsg = "";
		
		if(CadastroAluno.getTxtNome().getText().isEmpty()) {
			errorMsg = errorMsg + "-Nome inválido ou não preenchido. \n";
		}
		if (CadastroAluno.getTxtMat().getText().isEmpty()
				|| CadastroAluno.getTxtMat().getText().length() > 9
				|| util.isInteger(CadastroAluno.getTxtMat().getText()) == false) {
			errorMsg = errorMsg + "-Matrícula inválida ou não preenchida. \n";
		} if (checkMatAlu(txtMat.getText()) == true && isNew) {
			errorMsg = errorMsg + "-Número de matrícula já existe. \n";
		} if ((CadastroAluno.getTextArea1().getText().isEmpty())) {
			errorMsg = errorMsg + "-Endereço inválido ou não preenchido. \n";
		} if ((CadastroAluno.getRadioButtonMale().isSelected())&&(CadastroAluno.getRadioButtonFemale().isSelected())) {
			errorMsg = errorMsg + "-Selecione apenas um dos sexos. \n";
		} if ((CadastroAluno.getComboBox().getSelectedItem().equals("Selecionar..."))) {
			errorMsg = errorMsg + "-Selecione um cargo. \n";
		} if (CadastroAluno.getTxtCpf().getText().isEmpty() || util.isCPF(CadastroAluno.getTxtCpf().getText()) == false) {
			errorMsg = errorMsg + "-CPF inválido ou não preenchido. \n";
		} if (CadastroAluno.getTxtTel().getText().isEmpty()) {
			errorMsg = errorMsg + "-Telefone inválido ou não preenchido. \n";
		} if (CadastroAluno.getTxtDataN().getText().isEmpty() || util.validaData(CadastroAluno.getTxtDataN().getText()) == false) {
			errorMsg = errorMsg + "-Data de nascimento inválida ou não preenchida. \n";
		} if (CadastroAluno.getTxtEmail().getText().isEmpty()) {
			errorMsg = errorMsg + "-E-Mail inválido ou não preenchido. \n";
		}
		return errorMsg;
	}	
        
	public static Aluno buildAluno() {
		String sex = "";
		if (CadastroAluno.radioButtonMale.isSelected()) {
			sex = "M";
		} else if (CadastroAluno.radioButtonFemale.isSelected()) {
			sex = "F";
		}
		Util util = new Util();
		Date dataN = new Date();
        dataN = util.transformaData(txtDataN.getText());
		
        Aluno alu = new Aluno(txtCpf.getText(), txtTel.getText(), txtNome.getText(),
                                           dataN, sex, textArea1.getText(), txtEmail.getText(),
                                           Integer.parseInt(txtMat.getText()), (String) comboBox.getSelectedItem());
        
        return alu;
	}
	
	public static void editaAluno(Aluno aluno) {
		Util util = new Util();
		Date dataN = new Date();
		dataN = util.transformaData(txtDataN.getText());
		String sex = "";
		if (radioButtonMale.isSelected()) {
			sex = radioButtonMale.getText();
		} else if (radioButtonFemale.isSelected()) {
			sex = radioButtonFemale.getText();
		}
		
		aluno.setCurso(comboBox.getSelectedItem().toString());
		aluno.setSexo(sex);
		aluno.setDataNascimento(dataN);
		aluno.setEmail(txtEmail.getText());
		aluno.setEndereco(textArea1.getText());
		aluno.setNome(txtNome.getText());
		
		ControllerAluno controlA = new ControllerAluno();
		controlA.editarAluno(aluno);
	}
	
	@SuppressWarnings("serial")
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}