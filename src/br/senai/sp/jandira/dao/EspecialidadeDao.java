package br.senai.sp.jandira.dao;

import java.util.ArrayList;
import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EspecialidadeDao {


    private Especialidade especialidade;

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    
    private static final String ARQUIVO = "C:\\Users\\22282085\\java\\especialidade.txt";
    private static final String ARQUIVO_TEMP = "C:\\Users\\22282085\\java\\especialidade_temp.txt";
    
    private static final Path PATH = Paths.get(ARQUIVO);
    private static final Path PATH_TEMP = Paths.get(ARQUIVO_TEMP);
    

    public EspecialidadeDao(Especialidade especialidade) {
        this.especialidades.add(especialidade);
    }

    public EspecialidadeDao() {

    }
    //deixar estâtico para não precisar criar instâncias

    public static void gravar(Especialidade especialidade) {
        try{
        //grava o plano de saude no planos
        especialidades.add(especialidade);
        
        BufferedWriter bw;
            bw = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            String novoEspecialidade = especialidade.getEspecialidadeSeparadoPorPontoEVirgula();

            bw.write(novoEspecialidade);
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
        for (Especialidade p : especialidades) {
            if (p.getCodigo().equals(codigo)) {
                especialidades.remove(p);
                break;
            }
        }
                
        
        atualizarArquivo();
        return false;

}
    
    public static void atualizarArquivo(){
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO_TEMP);

        try {
            arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (Especialidade p : especialidades) {
                bwTemp.write(p.getEspecialidadeSeparadoPorPontoEVirgula());
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

 public static void getListaEspecialidade() {
        try {
            BufferedReader bufferReader = Files.newBufferedReader(PATH);

            String linha = bufferReader.readLine();

            while (linha != null) {

                String[] linhaVetor = linha.split(";");
                
                especialidades.add(new Especialidade(Integer.valueOf(linhaVetor[0]), linhaVetor[1],linhaVetor[2]));
                
                linha = bufferReader.readLine();
            }

            bufferReader.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "O arquivo não existe");
        }


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
        String[] titulos = {"Código", "Nome da Especialidade", "Descrição"};

        // Criar o modelo que será utilizado pela JTable
        // para exibir os dados dos planos 
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;
    }
}
