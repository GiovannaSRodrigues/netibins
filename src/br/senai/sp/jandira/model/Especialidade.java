package br.senai.sp.jandira.model;

public class Especialidade {

    // privado
    // não deixamos
    private String nome;
    private String descricao;
    //private static int quantidade;
    public Object getDescricao;
    private static int contador = 100;
    private Integer codigo;
    private String operadora;
    private String tipoDaEspecalidade;

    public Especialidade() {
        atualizarCodigo();
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        atualizarCodigo();
    }

    public Especialidade(Integer codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.contador = this.codigo;
        atualizarCodigo();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    private void atualizarCodigo() {
        this.codigo = contador;
        contador++;
    }

    public String getEspecialidadeSeparadoPorPontoEVirgula() {
        String especialidadeStr = this.codigo + ";" + this.operadora + ";" + this.tipoDaEspecalidade;
        return especialidadeStr;
    }
    
    public static int getContador(){
        return contador;
    }

}
