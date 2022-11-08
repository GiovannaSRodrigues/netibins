package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataDeNascimento() {
        return dataNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataNascimento = dataDeNascimento;
    }

}
