package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Medico extends Pessoa {

    private String Crm;
    private ArrayList<Especialidade> especialidade;
    private static int contador = 100;
    private Integer codigo;

    public Medico() {
        atualizarCodigo();
    }

    public Medico(Integer codigo, String crm, String nome) {
        this.codigo = codigo;
        this.Crm = crm;
        setNome(nome);
        this.codigo = codigo;
        atualizarCodigo();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getCrm() {
        return Crm;
    }

    public void setCrm(String crm) {
        Crm = crm;
    }

    public ArrayList<Especialidade> getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(ArrayList<Especialidade> especialidade) {
        this.especialidade = especialidade;
    }

    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;

    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        String medicoStr = this.codigo + ";" + this.Crm + ";" + this.getNome();
        return medicoStr;

    }

}
