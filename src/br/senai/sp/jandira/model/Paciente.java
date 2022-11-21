package br.senai.sp.jandira.model;

public class Paciente extends Pessoa {

    private PlanoDeSaude planoDeSaude;

 

    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

}
