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
import java.util.Date;
import model.Kid;

import javax.swing.JComboBox;
import javax.swing.AbstractAction;
import javax.swing.Action;
import model.Funcionario;

public class CadastroFuncionario{


	private static JFrame frame;
	private static JTextField txtNome;
	private static JTextField txtCod;
	private static JTextField txtCpf;
	private static JTextField txtTel;
	private static JTextField txtDataN;
	private static JTextField txtEmail;
	private static JTextField txtSal;
	private static JTextField txtVA;
	private static JTextField txtVR;
	private static JTextField txtVT;
	private static JTextField txtKids;
	private static JTextArea textArea1;
	private static JRadioButton radioButtonMale;
	private static JRadioButton radioButtonFemale;
	private static JComboBox<String> comboBoxD;
	private static JComboBox<String> comboBox;
	private boolean isNew = MainMenu.isNew;

	public static JFrame getFrame() {
		return frame;
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

	public static JComboBox<String> getComboBoxD() {
		return comboBoxD;
	}

	public static JComboBox<String> getComboBox() {
		return comboBox;
	}

	public static JTextField getTxtNome() {
		return txtNome;
	}

	public static JTextField getTxtCod() {
		return txtCod;
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

	public static JTextField getTxtSal() {
		return txtSal;
	}

	public static JTextField getTxtVA() {
		return txtVA;
	}

	public static JTextField getTxtVR() {
		return txtVR;
	}

	public static JTextField getTxtVT() {
		return txtVT;
	}

	public static JTextField getTxtKids() {
		return txtKids;
	}

	@SuppressWarnings("unused")
	private final Action action = new SwingAction();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("static-access")
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
		initialize(null);
	}
	
	public CadastroFuncionario(Funcionario funcionario) {
		initialize(funcionario);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Funcionario funcionario) {		
		frame = new JFrame();
		frame.setBounds(100, 50, 850, 649);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("                                                                                                   CADASTRO DE FUNCIONÁRIOS");
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		//Campo texto Nome
		txtNome = new JTextField();
		txtNome.setBounds(175, 28, 250, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		Border Nomborder = BorderFactory.createLineBorder(Color.BLACK);
        txtNome.setBorder(BorderFactory.createCompoundBorder(Nomborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        if (!isNew && funcionario != null) {        	
        	txtNome.setText(funcionario.getNome());
        }
		
		JLabel lblName = new JLabel("Nome:* ");
		lblName.setBounds(52, 31, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblNameEx = new JLabel("Ex: Maria");
		lblNameEx.setBounds(435, 31, 66, 14);
		frame.getContentPane().add(lblNameEx);
		
		//Campo texto CPF
		txtCpf = new JTextField();
		txtCpf.setBounds(175, 58, 250, 20);
		frame.getContentPane().add(txtCpf);
		txtCpf.setColumns(10);
		Border Cpfborder = BorderFactory.createLineBorder(Color.BLACK);
        txtCpf.setBorder(BorderFactory.createCompoundBorder(Cpfborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		if (!isNew && funcionario != null) {
			txtCpf.setText(funcionario.getCpf());
			txtCpf.setEnabled(false);
		}
		
		JLabel lblCpf = new JLabel("CPF:* ");
		lblCpf.setBounds(52, 61, 46, 14);
		frame.getContentPane().add(lblCpf);
		
		JLabel lblCpfEx = new JLabel("Ex: 00000000000");
		lblCpfEx.setBounds(435, 61, 106, 14);
		frame.getContentPane().add(lblCpfEx);
		
		//Campo texto Data Nascimento
		txtDataN = new JTextField();
		txtDataN.setBounds(175, 88, 90, 20);
		frame.getContentPane().add(txtDataN);
		txtDataN.setColumns(10);
		Border Datborder = BorderFactory.createLineBorder(Color.BLACK);
        txtDataN.setBorder(BorderFactory.createCompoundBorder(Datborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        if (!isNew && funcionario != null) {
        	Util util = new Util();
        	txtDataN.setText(util.dateToString(funcionario.getDataNascimento()));
        }
		
		JLabel lblData = new JLabel("Data de Nascimento:* ");
		lblData.setBounds(52, 91, 126, 14);
		frame.getContentPane().add(lblData);
		
		JLabel lblDataEx = new JLabel("Ex: DD/MM/YYYY");
		lblDataEx.setBounds(295, 91, 106, 14);
		frame.getContentPane().add(lblDataEx);
		
		//Campo texto Código de Cadastro
		JLabel lblCod = new JLabel("Código de Cadastro:* ");
		lblCod.setBounds(52, 121, 136, 14);
		frame.getContentPane().add(lblCod);
		lblCod.setVisible(false);
		
		JLabel lblMatEx = new JLabel("Ex: 123456789");
		lblMatEx.setBounds(435, 121, 106, 14);
		frame.getContentPane().add(lblMatEx);
		lblMatEx.setVisible(false);
		
		txtCod = new JTextField();
		txtCod.setBounds(175, 118, 250, 20);
		frame.getContentPane().add(txtCod);
		txtCod.setColumns(10);
		Border Codborder = BorderFactory.createLineBorder(Color.BLACK);
        txtCod.setBorder(BorderFactory.createCompoundBorder(Codborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        txtCod.setVisible(false);
		if (!isNew && funcionario != null) {
			txtCod.setVisible(true);
			lblCod.setVisible(true);
			lblMatEx.setVisible(true);
			txtCod.setText(funcionario.getCodCadastro() + "");
			txtCod.setEnabled(false);
		}
		
		//Text area Endereço
		JLabel lblAddress = new JLabel("Endereço:* ");
		lblAddress.setBounds(52, 162, 90, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblAddressEx = new JLabel("Ex: Rua Saci Pererê Furacão");
		lblAddressEx.setBounds(435, 162, 176, 14);
		frame.getContentPane().add(lblAddressEx);
		
		textArea1 = new JTextArea();
		textArea1.setBounds(175, 157, 250, 40);
		frame.getContentPane().add(textArea1);
		Border Endborder = BorderFactory.createLineBorder(Color.BLACK);
        textArea1.setBorder(BorderFactory.createCompoundBorder(Endborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        if (!isNew && funcionario != null) {
			textArea1.setText(funcionario.getEndereco());
		}
		
		//Radio Button Sexo
		JLabel lblSex = new JLabel("Sexo:* ");
		lblSex.setBounds(52, 208, 46, 14);
		frame.getContentPane().add(lblSex);
		
		JLabel lblMale = new JLabel("Masculino");
		lblMale.setBounds(175, 208, 60, 14);
		frame.getContentPane().add(lblMale);
		
		JLabel lblFemale = new JLabel("Feminino");
		lblFemale.setBounds(345, 208, 60, 14);
		frame.getContentPane().add(lblFemale);
		
		radioButtonMale = new JRadioButton("M");
		radioButtonMale.setBounds(240, 204, 20, 23);
		frame.getContentPane().add(radioButtonMale);

		radioButtonFemale = new JRadioButton("F");
		radioButtonFemale.setBounds(405, 204, 20, 23);
		frame.getContentPane().add(radioButtonFemale);
		if (!isNew && funcionario != null) {
			if (funcionario.getSexo().equals("M")) {
				radioButtonMale.setSelected(true);
			} else {
				radioButtonFemale.setSelected(true);
			}
		}
		
		//Campo texto Telefone
		txtTel = new JTextField();
		txtTel.setBounds(175, 248, 95, 20);
		frame.getContentPane().add(txtTel);
		txtTel.setColumns(10);
		Border Telborder = BorderFactory.createLineBorder(Color.BLACK);
        txtTel.setBorder(BorderFactory.createCompoundBorder(Telborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        if (!isNew && funcionario != null) {
        	txtTel.setText(funcionario.getTelefone());
        }
				
		JLabel lblTel = new JLabel("Telefone:* ");
		lblTel.setBounds(52, 251, 126, 14);
		frame.getContentPane().add(lblTel);
		
		JLabel lblTelEx = new JLabel("Ex: (43)99999999");
		lblTelEx.setBounds(280, 250, 126, 14);
		frame.getContentPane().add(lblTelEx);
		
		//Combobox Disciplina
        JLabel lblOccupation = new JLabel("Disciplina: ");
	  	lblOccupation.setBounds(450, 288, 67, 14);
	  	frame.getContentPane().add(lblOccupation);
	  	lblOccupation.setVisible(false);
	  		
	  	comboBoxD = new JComboBox<String>();
	  	comboBoxD.addItem("Selecionar...");
	  	comboBoxD.addItem("Banco de Dados");
	  	comboBoxD.addItem("Front-end");
	  	comboBoxD.addItem("Java WEB");
	  	comboBoxD.addItem("Linguagem de Programaçãoo Java");
	  	comboBoxD.addItem("Outros");
	  	comboBoxD.addActionListener(new ActionListener() {
	  		public void actionPerformed(ActionEvent arg0) {
	  		}
	  	});
	  	comboBoxD.setBounds(520, 285, 250, 20);
	  	frame.getContentPane().add(comboBoxD);
	  	comboBoxD.setVisible(false);
		
		//Combobox Cargo
		JLabel lblJob = new JLabel("Cargo:* ");
		lblJob.setBounds(52, 288, 67, 14);
		frame.getContentPane().add(lblJob);
		
		comboBox = new JComboBox<String>();
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
					if (!isNew && funcionario != null) {
						comboBoxD.setSelectedItem(funcionario.getDisciplina());
					}
				} else {
					lblOccupation.setVisible(false);
					comboBoxD.setVisible(false);
				}
			}
		});
		comboBox.setBounds(175, 285, 250, 20);
		frame.getContentPane().add(comboBox);
		if (!isNew && funcionario != null) {
			comboBox.setSelectedItem(funcionario.getCargo());
			if (comboBox.getSelectedItem().equals("Professor")) {
				comboBoxD.setSelectedItem(funcionario.getDisciplina());
			}
		}
	    
		//Campo texto E-Mail
		txtEmail = new JTextField();
		txtEmail.setBounds(175, 328, 250, 20);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		Border Mailborder = BorderFactory.createLineBorder(Color.BLACK);
	    txtEmail.setBorder(BorderFactory.createCompoundBorder(Mailborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
	    if (!isNew && funcionario != null) {
	    	txtEmail.setText(funcionario.getEmail());
	    }
		
		JLabel lblEmail = new JLabel("E-Mail:* ");
		lblEmail.setBounds(52, 331, 126, 14);
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
		if (!isNew && funcionario != null) {
			txtSal.setText(funcionario.getSalario() + "");
		}
				
		JLabel lblSal = new JLabel("Salário:* ");
		lblSal.setBounds(52, 361, 126, 14);
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
		if (!isNew && funcionario != null) {
			txtVA.setText(funcionario.getVA() + "");
		}
						
		JLabel lblVA = new JLabel("Vale Alimentação: ");
		lblVA.setBounds(52, 391, 126, 14);
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
		if (!isNew && funcionario != null) {
			txtVR.setText(funcionario.getVR() + "");
		}
								
		JLabel lblVR = new JLabel("Vale Refeição: ");
		lblVR.setBounds(52, 421, 126, 14);
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
		if (!isNew && funcionario != null) {
			txtVT.setText(funcionario.getVT() + "");
		}
										
		JLabel lblVT = new JLabel("Vale Transporte: ");
		lblVT.setBounds(52, 451, 126, 14);
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
		txtKids.setDisabledTextColor(Color.BLACK);
		Border Kidsborder = BorderFactory.createLineBorder(Color.BLACK);
		txtKids.setBorder(BorderFactory.createCompoundBorder(Kidsborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
		txtKids.setEnabled(false);
		if (!isNew && funcionario != null) {
			txtKids.setText(funcionario.getKids() + "");
		}
												
		JLabel lblKids = new JLabel("Filhos: ");
		lblKids.setBounds(52, 481, 126, 14);
		frame.getContentPane().add(lblKids);
		
		//Botoes
		JButton btnKid = new JButton("Dependentes");
		btnKid.setBackground(Color.WHITE);
		btnKid.setForeground(Color.BLACK);
		btnKid.setBounds(235, 509, 130, 23);
		frame.getContentPane().add(btnKid);
		
		JButton btnClear = new JButton("Limpar");
		btnClear.setBackground(Color.BLACK);
		btnClear.setForeground(Color.RED);
		btnClear.setBounds(435, 567, 89, 23);
		frame.getContentPane().add(btnClear);
		
		JButton btnSubmit = new JButton("Cadastrar");
		if (!isNew) {
			btnSubmit.setText("Salvar");
		}
		btnSubmit.setBackground(Color.BLACK);
		btnSubmit.setForeground(Color.RED);
		btnSubmit.setBounds(65, 567, 100, 23);
		frame.getContentPane().add(btnSubmit);
		
		
		//Botão de adicionar dependentes
		btnKid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Util util = new Util();
				if (util.isInteger(txtKids.getText())) {
						if (!isNew) {
							@SuppressWarnings("unused")
							CadastroKid cadKids = new CadastroKid(Integer.parseInt(txtKids.getText()), funcionario);
						} else {
							@SuppressWarnings("unused")
							CadastroKid cadKids = new CadastroKid(Integer.parseInt(txtKids.getText()), null);
						}
				}
			}
		});
			
			
		btnSubmit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				Controller con = new Controller();
				
				if (temErro() != "") {
					JOptionPane.showMessageDialog(null, "**** Por favor corrija os seguintes erros: **** \n" + temErro(), "ERRO", JOptionPane.ERROR_MESSAGE);
					
				} else if (isNew && comboBox.getSelectedItem().equals("Professor")) {
					con.cadastrarProfessor(buildFunc());
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
					MainMenu.loadTableFunc();
					frame.dispose();

				} else if (isNew) {
	                con.cadastrarFuncionario(buildFunc());
    				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
    				MainMenu.loadTableFunc();
    				frame.dispose();
    				
				} else if (!isNew) {
    				editarFunc(funcionario);
    				if (MainMenu.loadTableFunc()) {
        				JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso!");
        				isNew = true;
        				frame.dispose();
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
				txtSal.setText(null);
				txtVA.setText(null);
				txtVR.setText(null);
				txtVT.setText(null);
				textArea1.setText(null);
				radioButtonFemale.setSelected(false);
				radioButtonMale.setSelected(false);
				comboBox.setSelectedItem("Selecionar...");
			}
		});
		frame.setVisible(true);
	}
	
	public static boolean recebeKids(ArrayList<Kid> arrayKids) {
		int tk = Integer.parseInt(txtKids.getText());
		if (tk > 0 && arrayKids.size() != tk) {
			return false;
		} else {
			return true;
		}
	}
        
	public static void updateKids(int qtdKids) {
		txtKids.setText(qtdKids + "");
	}
	
	public static void updateKids() {
		int qtdKids = CadastroKid.getArrayKids().size();
		txtKids.setText(qtdKids + "");
	}
	
	@SuppressWarnings("static-access")
	public static boolean checkCodeFunc(String txtCod) {
		Controller con = new Controller();
		boolean aux = false;
		for (int i = 0; i < con.arrayFunc.size(); i++) {
			if (Integer.parseInt(txtCod) == (con.arrayFunc.get(i).getCodCadastro())) {
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
		
		if(CadastroFuncionario.getTxtNome().getText().isEmpty()) {
			errorMsg = errorMsg + "-Nome inválido ou não preenchido. \n";
		} if ((CadastroFuncionario.getTextArea1().getText().isEmpty())) {
			errorMsg = errorMsg + "-Endereço inválido ou não preenchido. \n";
		} if ((CadastroFuncionario.getRadioButtonMale().isSelected())&&(CadastroFuncionario.getRadioButtonFemale().isSelected())) {
			errorMsg = errorMsg + "-Selecione apenas um dos sexos. \n";
		} if ((CadastroFuncionario.getComboBox().getSelectedItem().equals("Selecionar..."))) {
			errorMsg = errorMsg + "-Selecione um cargo. \n";
		} else if (CadastroFuncionario.getComboBox().getSelectedItem().equals("Professor") && CadastroFuncionario.getComboBoxD().getSelectedItem().equals("Selecionar...")) {
			errorMsg = errorMsg + "-Selecione uma disciplina. \n";
		} if (CadastroFuncionario.getTxtCpf().getText().isEmpty() || util.isCPF(CadastroFuncionario.getTxtCpf().getText()) == false) {
			errorMsg = errorMsg + "-CPF inválido ou não preenchido. \n";
		} if (CadastroFuncionario.getTxtTel().getText().isEmpty()) {
			errorMsg = errorMsg + "-Telefone inválido ou não preenchido. \n";
		} if (CadastroFuncionario.getTxtDataN().getText().isEmpty() || util.validaData(CadastroFuncionario.getTxtDataN().getText()) == false) {
			errorMsg = errorMsg + "-Data de nascimento inválida ou não preenchida. \n";
		} if (CadastroFuncionario.getTxtEmail().getText().isEmpty()) {
			errorMsg = errorMsg + "-E-Mail inválido ou não preenchido. \n";
		} if (CadastroFuncionario.getTxtVA().getText().isEmpty()) {
			errorMsg = errorMsg + "-Vale Alimentação inválido ou não preenchido. \n";
		} if (CadastroFuncionario.getTxtVR().getText().isEmpty()) {
			errorMsg = errorMsg + "-Vale Refeição inválido ou não preenchido. \n";
		} if (CadastroFuncionario.getTxtVT().getText().isEmpty()) {
			errorMsg = errorMsg + "-Vale Transporte inválido ou não preenchido. \n";
		} if (CadastroFuncionario.getTxtSal().getText().isEmpty()) {
			errorMsg = errorMsg + "-Salário inválido ou não preenchido. \n";
		} if (CadastroFuncionario.getTxtKids().getText().isEmpty()) {
			errorMsg = errorMsg + "-Námero de filhos inválido ou não preenchido. \n";
		} if (util.isInteger(CadastroFuncionario.getTxtKids().getText())) {
			if (CadastroFuncionario.recebeKids(CadastroKid.getArrayKids()) == false) {
				errorMsg = errorMsg + "-Dependentes não adicionados.";
			}						
		}
		return errorMsg;
    }
        
	public static Funcionario buildFunc() {
		if (CadastroFuncionario.getComboBox().getSelectedItem().equals("Professor")) {
			String sex = "";
			if (CadastroFuncionario.getRadioButtonMale().isSelected()) {
				sex = "M";
			} else if (CadastroFuncionario.getRadioButtonFemale().isSelected()) {
				sex = "F";
			}
			
			Util util = new Util();
			Date dataN = new Date();
	        dataN = util.transformaData(CadastroFuncionario.getTxtDataN().getText());
			
	        Funcionario func = new Funcionario(CadastroFuncionario.getTxtCpf().getText(), CadastroFuncionario.getTxtTel().getText(), CadastroFuncionario.getTxtNome().getText(),
	                                           dataN, sex, CadastroFuncionario.getTextArea1().getText(), CadastroFuncionario.getTxtEmail().getText(),
	                                           Double.parseDouble(CadastroFuncionario.getTxtSal().getText().replace(".", "").replace(",", ".")), Double.parseDouble(CadastroFuncionario.getTxtVA().getText().replace(".", "").replace(",", ".")),
	                                           Double.parseDouble(CadastroFuncionario.getTxtVR().getText().replace(".", "").replace(",", ".")), Double.parseDouble(CadastroFuncionario.getTxtVT().getText().replace(".", "").replace(",", ".")),
	                                           Integer.parseInt(CadastroFuncionario.getTxtKids().getText()), CadastroFuncionario.getComboBox().getSelectedItem().toString(),
	                                           CadastroFuncionario.getComboBoxD().getSelectedItem().toString());
	        
	        func.setArrayKids(CadastroKid.getArrayKids());
	        
	        return func;
		} else {
			String sex = "";
			if (CadastroFuncionario.getRadioButtonMale().isSelected()) {
				sex = "M";
			} else if (CadastroFuncionario.getRadioButtonFemale().isSelected()) {
				sex = "F";
			}
			
			Util util = new Util();
			Date dataN = new Date();
            dataN = util.transformaData(CadastroFuncionario.getTxtDataN().getText());
			
            Funcionario func = new Funcionario(CadastroFuncionario.getTxtCpf().getText(), CadastroFuncionario.getTxtTel().getText(), CadastroFuncionario.getTxtNome().getText(),
                    							dataN, sex, CadastroFuncionario.getTextArea1().getText(), CadastroFuncionario.getTxtEmail().getText(),
                    							Double.parseDouble(CadastroFuncionario.getTxtSal().getText().replace(".", "").replace(",", ".")), Double.parseDouble(CadastroFuncionario.getTxtVA().getText().replace(".", "").replace(",", ".")),
                    							Double.parseDouble(CadastroFuncionario.getTxtVR().getText().replace(".", "").replace(",", ".")), Double.parseDouble(CadastroFuncionario.getTxtVT().getText().replace(".", "").replace(",", ".")),
                    							Integer.parseInt(CadastroFuncionario.getTxtKids().getText()), CadastroFuncionario.getComboBox().getSelectedItem().toString(),
                    							"");
            
            func.setArrayKids(CadastroKid.getArrayKids());
            
            return func;
		}
		
	}
	
	public static void editarFunc(Funcionario funcionario) {
		Util util = new Util();
		Date dataN = new Date();
		dataN = util.transformaData(txtDataN.getText());
		String sex = "";
		if (radioButtonMale.isSelected()) {
			sex = radioButtonMale.getText();
		} else if (radioButtonFemale.isSelected()) {
			sex = radioButtonFemale.getText();
		} 
		
		updateKids();
		
		if (comboBox.getSelectedItem().equals("Professor")) {			
			funcionario.setCargo(comboBox.getSelectedItem().toString());
			funcionario.setSexo(sex);
			funcionario.setDataNascimento(dataN);
			funcionario.setDisciplina(comboBoxD.getSelectedItem().toString());
			funcionario.setEmail(txtEmail.getText());
			funcionario.setEndereco(textArea1.getText());
			funcionario.setNome(txtNome.getText());
			funcionario.setSalario(Double.parseDouble(txtSal.getText().replace(".", "").replace(",", ".")));
			funcionario.setVA(Double.parseDouble(txtVA.getText().replace(".", "").replace(",", ".")));
			funcionario.setVR(Double.parseDouble(txtVR.getText().replace(".", "").replace(",", ".")));
			funcionario.setVT(Double.parseDouble(txtVT.getText().replace(".", "").replace(",", ".")));					
			
		} else {
			funcionario.setCargo(comboBox.getSelectedItem().toString());
			funcionario.setSexo(sex);
			funcionario.setDataNascimento(dataN);
			funcionario.setDisciplina("");
			funcionario.setEmail(txtEmail.getText());
			funcionario.setEndereco(textArea1.getText());
			funcionario.setNome(txtNome.getText());
			funcionario.setSalario(Double.parseDouble(txtSal.getText().replace(".", "").replace(",", ".")));
			funcionario.setVA(Double.parseDouble(txtVA.getText().replace(".", "").replace(",", ".")));
			funcionario.setVR(Double.parseDouble(txtVR.getText().replace(".", "").replace(",", ".")));
			funcionario.setVT(Double.parseDouble(txtVT.getText().replace(".", "").replace(",", ".")));					
			
		}
		Controller controlF = new Controller();
		controlF.editarFuncionario(funcionario);
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