/*
 */
package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;
import java.io.File;
import javax.swing.table.DefaultTableModel;

/**
 */
public class EspecialidadeDao {

    private Especialidade especialidade;

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public EspecialidadeDao(Especialidade especialidade) {
        this.especialidades.add(especialidade);
    }

    public EspecialidadeDao() {

    }
    //deixar estâtico para não precisar criar instâncias

    public static void gravar(Especialidade especialidade) {

        //grava o plano de saude no planos
        especialidades.add(especialidade);
    }

    public static void excluir(Integer codigo) {
        for (Especialidade p : especialidades) {
            if (p.getCodigo().equals(codigo)) {
                especialidades.remove(p);
                break;
                
            }
        }
         
        
    }

    public static Especialidade getEspecialidade(Integer codigo) {

        for (Especialidade p : especialidades) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }

        return null;
    }

    public static void atualizar(Especialidade especialidade) {
        for (Especialidade p : especialidades) {
            if (p.getCodigo().equals(especialidade.getCodigo())) {
                especialidades.set(especialidades.indexOf(p), especialidade);
            }
        }

    }

    public static ArrayList<Especialidade> listarTodos() {
        //retorna a arreyLIst
        return especialidades;
    }

    public static void criarEspecialidadeTeste() {
        Especialidade especialidade1 = new Especialidade("Cardiologista", "Cuida do coração e sistema circulatório");
        Especialidade especialidade2 = new Especialidade("Fonoaudiologista", "Especialista em aspectos que envolvem comunicação e escrita");
        Especialidade especialidade3 = new Especialidade("Dermatologista", "Tratar doenças relacionadas a pele");
        Especialidade especialidade4 = new Especialidade("Endócrinologista", "Diagnosticar e tratar doenças relacionadas com hormônios e metabolismo ");
        especialidades.add(especialidade1);
        especialidades.add(especialidade2);
        especialidades.add(especialidade3);
        especialidades.add(especialidade4);
    }

    public static DefaultTableModel getTableModel() {

        // Matriz que receberá s planos de saúde
        // que serão utiizados na Tabela (Jtable)
        Object[][] dados = new Object[especialidades.size()][3];

        // For Each, para extrair cada objeto plano de saúde do 
        // arrayList planos e separar cada dado na matriz dados
        int i = 0;
        for (Especialidade p : especialidades) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getNome();
            dados[i][2] = p.getDescricao();
            i++;
        }
        // Defnir um vetor com os nomes das colunas da tabela 
        String[] titulos = {"Código", "Nome da operadora", "Tipo do Plano"};

        // Criar o modelo que será utilizado pela JTable
        // para exibir os dados dos planos 
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;
    }
}
