package model;

import java.util.Date;

public class Funcionario extends Pessoa {
	private double salario;
	private double VA;
	private double VR;
	private double VT;
	private int Kids;
	private String cargo;
	private int codCadastro;
	
	public Funcionario(String nome, long cpf, Date dataNascimento, String sexo, String endereco, String email,
			String telefone, double salario, double vA, double vR, double vT, int kids, String cargo, int codCadastro) {
		super(nome, cpf, dataNascimento, sexo, endereco, email, telefone);
		this.salario = salario;
		VA = vA;
		VR = vR;
		VT = vT;
		Kids = kids;
		this.cargo = cargo;
		this.codCadastro = codCadastro;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getVA() {
		return VA;
	}

	public void setVA(double vA) {
		VA = vA;
	}

	public double getVR() {
		return VR;
	}

	public void setVR(double vR) {
		VR = vR;
	}

	public double getVT() {
		return VT;
	}

	public void setVT(double vT) {
		VT = vT;
	}

	public int getKids() {
		return Kids;
	}

	public void setKids(int kids) {
		Kids = kids;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getCodCadastro() {
		return codCadastro;
	}

	public void setCodCadastro(int codCadastro) {
		this.codCadastro = codCadastro;
	}	
}
