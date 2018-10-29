/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import javax.swing.GroupLayout.Alignment;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import controller.Controller;
import controller.Util;
import model.Funcionario;
import model.Kid;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

/**
 *
 * @author LUCAS-UTF8
 */
@SuppressWarnings("serial")
public class CadastroKid extends javax.swing.JFrame {
    
	static String[] colunas = {"Nome", "Data de Nascimento"};
	static DefaultTableModel modelo = new DefaultTableModel(colunas, 0) {
		@Override
        public boolean isCellEditable(int row, int column) {
           //all cells false
           return false;
        }
	};
    private javax.swing.JButton editarKid = new javax.swing.JButton();
    private javax.swing.JButton excluirKid = new javax.swing.JButton();
    private javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
    private javax.swing.JButton novaKid = new javax.swing.JButton();
    private static javax.swing.JTable tableKids = new javax.swing.JTable(modelo);
    private javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
    private static javax.swing.JTextField jTextField1 = new javax.swing.JTextField();
    private static javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    private javax.swing.JLabel txtNome = new javax.swing.JLabel();
    private JButton btnSalvar = new JButton("Salvar");
    private static boolean isNew = true;
	private static ArrayList<Kid> arrayKids = new ArrayList<Kid>();
	private int editar;
	private Funcionario funcionario;
	
    public static ArrayList<Kid> getArrayKids() {
		return arrayKids;
	}

	/**
     * Creates new form CadastroKid
     */
    
    public static void adicionaKid() {
		Util util = new Util();
		Date dataK = util.transformaData(jTextField2.getText());
		Kid kid = new Kid(jTextField1.getText(), dataK);
		
		arrayKids.add(kid);
	}
    
    public void loadTableKids() {
    	SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
    	int tamanhoLista = funcionario.getArrayKids().size();
    	Kid kid = funcionario.getArrayKids().get(tamanhoLista - 1);
    	Object[] data = {kid.getNome(), dt.format(kid.getDataNascimento())};
    	if (!isNew) {
    		modelo.setRowCount(0);
        	iniciaListaKid();
    	} else {
        	modelo.addRow(data);
    	}    	
    }
    
    public void iniciaListaKid() {
    	SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
    	modelo.setRowCount(0);
    	
    	if (funcionario != null) {
    		Controller controllerFunc = new Controller();
        	funcionario.setArrayKids(controllerFunc.listarKids(funcionario));
        	
        	if (funcionario.getArrayKids().size() > 0) {
        		editarKid.setEnabled(true);
        		excluirKid.setEnabled(true);
        	} else {
        		editarKid.setEnabled(false);
        		excluirKid.setEnabled(false);
        	}
        	
        	for (Kid kid : funcionario.getArrayKids()) {
        		Object[] data = {kid.getNome(), dt.format(kid.getDataNascimento())};
        		
        		modelo.addRow(data);
        	}
    		
    	} else {
        	for (Kid kid : arrayKids) {
        		Object[] data = {kid.getNome(), dt.format(kid.getDataNascimento())};
        		
        		modelo.addRow(data);
        	}
    	}
    }
    
    public CadastroKid() {
        initComponents(-1, null);
    }
    
    public CadastroKid(int qtdKids, Funcionario funcionario) {
        initComponents(qtdKids, funcionario);
    }

    @SuppressWarnings({ })
    private void initComponents(int qtdKids, Funcionario funcionario) {
    	editar = -1;
    	this.funcionario = funcionario;
    	
    	setResizable(false);
    	
    	iniciaListaKid();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tableKids.setColumnSelectionAllowed(false);
        tableKids.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableKids);
        //tableKids.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        novaKid.setText("Novo");
        novaKid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	btnSalvar.setEnabled(true);
                jTextField1.setEnabled(true);
                jTextField2.setEnabled(true);
            	isNew = true;
            	novaKid.setEnabled(false);
            }
        });

        excluirKid.setText("Excluir");
        excluirKid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	Controller con = new Controller();
                if (tableKids.getSelectedRowCount() == 0) {
                	JOptionPane.showMessageDialog(null, "Nenhum item selecionado.", "ERRO", JOptionPane.ERROR_MESSAGE);               	
                } else {
                	if (JOptionPane.showConfirmDialog(null, "O dependente com o nome " + "'" + arrayKids.get(tableKids.getSelectedRow()).getNome() + "'" + " será excluido. Tem certeza?", "AVISO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                		editar = tableKids.getSelectedRow();
                		Kid kid = con.listarKids(funcionario).get(editar);
                		con.excluirKid(kid);
                		modelo.removeRow(editar);
                		CadastroFuncionario.updateKids();
                	} if (tableKids.getRowCount() == 0) {
                		excluirKid.setEnabled(false);
                		editarKid.setEnabled(false);
                	}
                }
            }
        });

        editarKid.setText("Editar");
        editarKid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	excluirKid.setEnabled(false);
            	int editar = tableKids.getSelectedRow();
        		Util util = new Util();
            	if (tableKids.getSelectedRow() != -1) {
                    btnSalvar.setEnabled(true);
                    jTextField1.setEnabled(true);
                    jTextField2.setEnabled(true);
                    
                    jTextField1.setText(funcionario.getArrayKids().get(editar).getNome());
                    jTextField2.setText(util.dateToString(funcionario.getArrayKids().get(editar).getDataNascimento()));
                    isNew = false;
            	} else {
            		JOptionPane.showMessageDialog(null, "Nenhum item selecionado.", "ERRO", JOptionPane.ERROR_MESSAGE);
            	}
            }
        });

        txtNome.setText("Nome:");
        jTextField1.setEnabled(false);
        Border Nomeborder = BorderFactory.createLineBorder(Color.BLACK);
	    jTextField1.setBorder(BorderFactory.createCompoundBorder(Nomeborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));

        jLabel1.setText("Data de Nascimento:");
        jTextField2 = new javax.swing.JTextField();
        jTextField2.setEnabled(false);
        Border Datborder = BorderFactory.createLineBorder(Color.BLACK);
	    jTextField2.setBorder(BorderFactory.createCompoundBorder(Datborder, BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Controller con = new Controller();
        		if (!isNew) {
        			Util util = new Util();
        			Date dataK = util.transformaData(jTextField2.getText());
        			editar = tableKids.getSelectedRow();
        			
        			if (editar != -1) {
        				funcionario.getArrayKids().get(editar).setNome(jTextField1.getText());
        				funcionario.getArrayKids().get(editar).setDataNascimento(dataK);
            			con.editarKid(con.listarKids(funcionario).get(editar));
        			} else {
        				JOptionPane.showMessageDialog(null, "Selecione novamente o item que deseja editar.", "ERRO", JOptionPane.ERROR_MESSAGE);
        			}
        			loadTableKids();
        		} else {
        			Util u = new Util();
        			String errorMsg = "";
        			boolean erro = false;
        		
        			if(jTextField1.getText().isEmpty()) {
        				errorMsg = errorMsg + "-Nome inválido ou não preenchido. \n";
        				erro = true;
        			} if (jTextField2.getText().isEmpty() || u.validaData(jTextField2.getText()) == false) {
        				errorMsg = errorMsg + "-Data de nascimento inválida ou não preenchida. \n";
        				erro = true;
        			} if (erro) {
        				JOptionPane.showMessageDialog(null, "**** Por favor corrija os seguintes erros: **** \n" + errorMsg, "ERRO", JOptionPane.ERROR_MESSAGE);
        			} else {
        				adicionaKid();
        				loadTableKids();
        				JOptionPane.showMessageDialog(null, "Dependente cadastrado!");
        				int qtdKids = arrayKids.size();
        				CadastroFuncionario.updateKids(qtdKids);
        			
        				editarKid.setEnabled(true);
        				excluirKid.setEnabled(true);
        				jTextField1.setText("");
        				jTextField1.setEnabled(false);
        				jTextField2.setText("");
        				jTextField2.setEnabled(false);
        				btnSalvar.setEnabled(false);
        				novaKid.setEnabled(true);
        			}
        		}
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jScrollPane1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(29)
        			.addComponent(novaKid, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
        			.addComponent(editarKid)
        			.addGap(18)
        			.addComponent(excluirKid)
        			.addGap(19))
        		.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(txtNome)
        				.addComponent(jLabel1))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(123, Short.MAX_VALUE))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(183, Short.MAX_VALUE)
        			.addComponent(btnSalvar, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
        			.addGap(178))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(novaKid)
        				.addComponent(excluirKid)
        				.addComponent(editarKid))
        			.addGap(18)
        			.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtNome)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(btnSalvar)
        			.addContainerGap(48, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
        setVisible(true);
    } //FIM INITIALIZE

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroKid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroKid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroKid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroKid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroKid().setVisible(true);
            }
        });
    }
}
