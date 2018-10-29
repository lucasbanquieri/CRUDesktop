package model;

import java.util.Date;

public class Kid {
	private String nome;
	private Date dataNascimento;
	
	public Kid(String nome, Date dataNascimento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Kid [nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
	}
}
