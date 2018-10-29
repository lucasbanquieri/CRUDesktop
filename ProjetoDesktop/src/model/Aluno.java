package model;

import java.util.Date;

public class Aluno extends Pessoa {
	private String curso;
	private int matricula;

	public Aluno(String nome, long cpf, Date dataNascimento, String sexo, String endereco, String email,
			String telefone, String curso, int matricula) {
		super(nome, cpf, dataNascimento, sexo, endereco, email, telefone);
		this.curso = curso;
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
