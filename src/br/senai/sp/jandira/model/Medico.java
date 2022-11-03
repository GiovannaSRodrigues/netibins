package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {

	private String nome;
	// LocalDate é para data caso tenha que fazer uma conta
	private LocalDate dataDeNascimento;
	private String Sexo;
	// tipo Especialidade(classe criada com vetores)
	private Especialidade[] especialidade;

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Especialidade[] getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade[] especialidade) {
		this.especialidade = especialidade;
	}

	private String Crm;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public String getCrm() {
		return Crm;
	}

	public void setCrm(String crm) {
		Crm = crm;
	}

}
