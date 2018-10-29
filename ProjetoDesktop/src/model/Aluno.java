/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author LUCAS-UTF8
 */
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno(String cpf, String telefone, String nome, Date dataNascimento, String sexo, String endereco,
				 String email, int matricula, String curso) {
		super(cpf, telefone, nome, dataNascimento, sexo, endereco, email);
		this.matricula = matricula;
		this.curso = curso;
	}
    
    public Aluno() {
    	super();
    }

	public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
