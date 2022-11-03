package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDao { //Simular banco de dados

    //precisamos do PLano de saúde 
    //classe dao precisa do objeto que vai manipular
    private PlanoDeSaude planoDeSaude;
    //lista onde vai guarda// "banco de dados"
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();

    private static final String ARQUIVO = "C:\\Users\\22282085\\java\\plano_saude.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282085\\java\\plano_saude_temp.txt";

    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);

    //construtor
    public PlanoDeSaudeDao(PlanoDeSaude planoDeSaude) {
        this.planos.add(planoDeSaude);
    }

    public PlanoDeSaudeDao() {

    }
    //deixar estâtico para não precisar criar instâncias

    public static void gravar(PlanoDeSaude planoDeSaude) {
        try {
            planos.add(planoDeSaude);

            BufferedWriter bw;
            bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            String novoPlanodeSaude = planoDeSaude.getPlanoDeSaudeSeparadoPorPontoEVirgula();

            bw.write(novoPlanodeSaude);
            bw.newLine();
            bw.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao tentar abrir arquivo",
                    "Erro ao gravar",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static boolean excluir(Integer codigo) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(codigo)) {
                planos.remove(p);
                break;

            }
        }

        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {
            arquivoTemp.createNewFile();
            
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            for(PlanoDeSaude p : planos){
                bwTemp.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
                bwTemp.newLine();
                
            }
            
            bwTemp.close();
            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao criar o arquivo",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }

        return false;

    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {

        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }

        return null;
    }

    public static void atualizar(PlanoDeSaude planoDeSaude) {
        for (PlanoDeSaude p : planos) {
            if (p.getCodigo().equals(planoDeSaude.getCodigo())) {
                planos.set(planos.indexOf(p), planoDeSaude);
            }
        }

    }

    public static ArrayList<PlanoDeSaude> listarTodos() {
        //retorna a arreyLIst
        return planos;
    }

    public static void getListaPlanoDeSaude() {
        try {
            BufferedReader bufferReader = Files.newBufferedReader(PATH);

            String linha = bufferReader.readLine();

            while (linha != null) {

                String[] linhaVetor = linha.split(";");

                planos.add(new PlanoDeSaude(Integer.valueOf(linhaVetor[0]), linhaVetor[1], linhaVetor[2]));

                linha = bufferReader.readLine();
            }

            bufferReader.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "O arquivo não existe");
        }

//        public static void criarPlanoDeSaudeTeste(){
//        PlanoDeSaude plano1 = new PlanoDeSaude("Amil","Basicc");
//	PlanoDeSaude plano2 = new PlanoDeSaude("Alians","Bronze");
//	PlanoDeSaude plano3 = new PlanoDeSaude("Unimed","Prata");
//	PlanoDeSaude plano4 = new PlanoDeSaude("Notedrame","Advacend");
//        planos.add(plano1);
//        planos.add(plano2);
//        planos.add(plano3);
//        planos.add(plano4);
//        
    }

    public static DefaultTableModel getTableModel() {

        // Matriz que receberá s planos de saúde
        // que serão utiizados na Tabela (Jtable)
        Object[][] dados = new Object[planos.size()][3];

        // For Each, para extrair cada objeto plano de saúde do 
        // arrayList planos e separar cada dado na matriz dados
        int i = 0;
        for (PlanoDeSaude p : planos) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getTipoDoPlano();
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
