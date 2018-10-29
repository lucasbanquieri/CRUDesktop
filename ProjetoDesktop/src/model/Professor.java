package model;

import java.util.Date;

public class Professor extends Pessoa {
	private String disciplina;

	public Professor(String nome, int cpf, Date dataNascimento, String sexo, String endereco, String email,
			String telefone, String disciplina) {
		super(nome, cpf, dataNascimento, sexo, endereco, email, telefone);
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}	
}
