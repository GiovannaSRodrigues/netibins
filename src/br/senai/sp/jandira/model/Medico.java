package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Medico extends Pessoa {

    private String Crm;
    private ArrayList<Especialidade> especialidade;

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

}
