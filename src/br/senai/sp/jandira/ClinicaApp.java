package br.senai.sp.jandira;

import br.senai.sp.jandira.ui.HomeFrame;

//import br.senai.sp.jandira.model.Agenda;
//import br.senai.sp.jandira.model.Endereco;
////fora do métodos e deentro diretamente da classe ClinicaApp
//import br.senai.sp.jandira.model.Especialidade;
//import br.senai.sp.jandira.model.Estados;
//import br.senai.sp.jandira.model.Genero;
//import br.senai.sp.jandira.model.Medico;

public class ClinicaApp {

	public static void main(String[] args) {
            HomeFrame telaFrame = new HomeFrame();
           telaFrame.setVisible(true);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
//		Especialidade especialidade1 = new Especialidade();
//		// o que será guardada no atributo nome é nada, porque não espera nada
//		// essse testo tem que ser recebido na classe
//		// cardiologia vai ser guardada no novoNome
//
//		// especialidades
//		especialidade1.setNome("Cardiologia");
//
//		Especialidade especialidade2 = new Especialidade();
//		especialidade2.setNome("Otorrinolarigologia");
//
//		Especialidade especialidade3 = new Especialidade();
//		especialidade3.setNome("Fisioterapia");
//		especialidade3.setDescricao(
//				"Ela estuda, diagnostica, previne e trata os distúrbios, entre outros, cinético-funcionais decorrentes de alterações de órgãos e sistemas humanos.");
//
//		Especialidade especialidade4 = new Especialidade();
//		especialidade4.setNome("Gastroenterologia");
//
//		Especialidade especialidade5 = new Especialidade();
//		especialidade5.setNome("Clínica geral");
//
//		// agora quero mostrar o nome da especialidade, testando
//		// quero pegar o nome
//		// usa-se get, então c
//		// System.out.println(especialidade.getNome());
//
//		// testando
//		// planos
//		
//		//fazendo sobrecarga do método construtor método construtor
//		PlanoDeSaude plano1 = new PlanoDeSaude();
//
//		plano1.setOperadora("Unimod");
//		plano1.setTipoDoPlano("bronze");
//
//		// exibição co o JOPTION pane
//		// JOptionPane.showMessageDialog(null, plano.getDadoDoPlano());
//
//		PlanoDeSaude plano2 = new PlanoDeSaude();
//		plano2.setOperadora("Bradesco");
//		plano2.setTipoDoPlano("Ouro");
//		
//		
//		PlanoDeSaude plano3 = new PlanoDeSaude("Amil");
//		// JOptionPane.showMessageDialog(null, planoBradesco.getOperadora());
//
//		// endereco
//		Endereco endereco1 = new Endereco();
//		endereco1.setLogradouro("Rua Elton Silva");
//		endereco1.setNumeros("905");
//		endereco1.setBairro("Centro");
//		endereco1.setCidade("Jandira");
//		// o campo seguinte pode ser digitado de várias formas diferentes, por erro do
//		// usuário, etc
//		// exemplo SP, Sao paulo sao Paulo etc
//		// inconsistência
//		// técnica de enumeração (Enum)
//		// quando se tem uma lista fixa que nunca muda; lista conhecida
//		//desvantagem o computador te sempre que estar conectado na internet
//		//criando um enumerador de classe ESTADO e mudamos o set e get do estado
//		
//		endereco1.setEstado(Estados.SAO_PAULO);
//
//		endereco1.setComplemento("Escoola");
//		endereco1.setPontoDeReferencia("Em frente a prefeitura");
//		endereco1.setCep("06600-025");
//
//		Endereco endereco2 = new Endereco();
//		endereco2.setLogradouro("Av. Barão Limeira");
//		endereco2.setNumeros("158");
//		endereco2.setBairro("Santa Cecília");
//		endereco2.setCidade("São Paulo");
//		
//		// o campo seguinte pode ser digitado de várias formas diferentes, por erro do
//				// usuário, etc
//				// exemplo SP, Sao paulo sao Paulo etc
//				// inconsistência
//				// técnica de enumeração (Enum)
//				// quando se tem uma lista fixa que nunca muda; lista conhecida
//				//desvantagem o computador te sempre que estar conectado na internet
//				//criando um enumerador de classe ESTADO e mudamos o set e get do estado
//		endereco2.setEstado(Estados.ACRE);
//		endereco2.setComplemento("Escoola");
//		// tem campos que não preciso digitar como o de a seguir
//		// endereco2.setPontoDeReferencia("Em frente a prefeitura");
//		endereco2.setCep("06658-006");
//
//		// Medico
//		Medico medico1 = new Medico();
//		medico1.setNome("Ana Paula");
//		medico1.setCrm("8956-98");
//		medico1.setSexo("Feminino");
//		// pede uma Localdate e é da seguinte maneuira
//		// LocalDate.of (dados da data)
//		medico1.setDataDeNascimento(LocalDate.of(1997, 5, 15));// 15/05/1997
//
//		// Dr. Ana é clínica geral e Fisioterapeuta, ou seja, duas especialidade (Vetor)
//		// como fazer VETEORES de números inteiros
//		// int[] valores = new [4]
//		// cpmo colocar valores dentro da variave:
//		// valore [0] = 8; na posição 0 recebe 8
//		// valore [1] = 58; na posição 1 recebe 58
//		// ou
//		// int [] notas = {5,9,7,9,10
//
//		// Dr. Ana é clínica geral e Fisioterapeuta, ou seja, duas especialidade (Vetor)
//		// criando vetor de especialidade
//		// criando vetor de objeto
//		Especialidade[] especialidas = { especialidade3, especialidade5 };// vetor de tamanho 2 (posição 0 é
//																			// fisioterapia; posição 1 Cliíca geral)
//
//		medico1.setEspecialidade(especialidas);
//
//		// Pedro Oliveira
//		Medico medico2 = new Medico();
//		medico2.setNome("Pedro Oliveira");
//		medico2.setCrm("9999-99");
//		medico2.setSexo("Masculino");
//		// 20/08/1984
//		medico2.setDataDeNascimento(LocalDate.of(1984, 8, 20));
//		// cardiologia, fisioterapia, clinica geral
//		medico2.setEspecialidade(especialidas);
//		Especialidade[] especialidades2 = { especialidade1, especialidade3, especialidade5 };
//
//		medico2.setEspecialidade(especialidades2);
//
//		// mostrando o nome da especialidade
//		// System.out.println(especialidade3.getNome());
//
//		// chamando especialidade pelo vetor na sua respectiva posição
//		// posição 0 nome
//		// System.out.println(especialidas[0].getNome());
//		// posição 0 descriçãp
//		// System.out.println(especialidas[0].getDescricao());
//
//		/// criar 2 pacientes, um que mpra no endereço 1
//		// outro mora no endereço 2
//
//		Paciente paciente1 = new Paciente();
//		paciente1.setNome("Guilherme Rufino");
//		paciente1.setEndereco(endereco1);
//		paciente1.setGenero(Genero.MASCULINO);
//		paciente1.setEmail("rufinoguilherme633@gmail.com");
//		paciente1.setTelefone("4646-4646");
//		paciente1.setTipoSanguineo("B");
//		paciente1.setCpf("56565656");
//		paciente1.setPlanoDeSaude(plano2);
//
//		Paciente paciente2 = new Paciente();
//		paciente2.setNome("Italo Reis");
//		paciente2.setEndereco(endereco2);
//		paciente2.setGenero(Genero.MASCULINO);
//		paciente2.setEmail("italosilava@gmail.com");
//		paciente2.setTelefone("4646-4646");
//		paciente2.setTipoSanguineo("a");
//		paciente2.setCpf("33333356");
//		paciente2.setPlanoDeSaude(plano1);
//
//		// exibir dados dos pacientes1:
//		// NOME
//		System.out.println("-------------------------");
//		System.out.println("-------------------------");
//		System.out.println("Paciente 01");
//		System.out.println(paciente1.getNome());
//		// cidade
//		// vai no paciente => no atributo/classe endereço => atributo cidade
//		System.out.println(paciente1.getEndereco().getCidade());
//		// estado
//		// vai no paciente => no atributo/classe endereço => atributo Estado
//		System.out.println(paciente1.getEndereco().getEstado());
//		// telefone
//		System.out.println(paciente1.getTelefone());
//		// operadora do plano de súde
//		System.out.println(paciente1.getPlanoDeSaude().getOperadora());
//
//		System.out.println("-------------------------");
//		System.out.println("-------------------------");
//
//		// exibir dadeos do paciente2
//		System.out.println("Paciente 02");
//
//		System.out.println(paciente2.getNome());
//		// cidade
//		// vai no paciente => no atributo/classe endereço => atributo cidade
//		System.out.println(paciente2.getEndereco().getCidade());
//		// estado
//		// vai no paciente => no atributo/classe endereço => atributo Estado
//		System.out.println(paciente2.getEndereco().getEstado());
//		// telefone
//		System.out.println(paciente2.getTelefone());
//		// operadora do plano de súde
//		System.out.println(paciente2.getPlanoDeSaude().getOperadora());
//
//		// fazer agendadmento de consulta para paciente 1
//		System.out.println("----------------");
//		Agenda agenda1 = new Agenda();
//		agenda1.setPaciente(paciente1);
//		agenda1.setMedico(medico2);
//		// passar no clínico Geral
//		agenda1.setEspecialidade(especialidade5);
//		// no dia 22/09/2022, às 15h25
//		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 22));
//		agenda1.setHoraDaConsulta(LocalTime.of(15, 25));
//		agenda1.setObservacao("O paciente esta com dor nas costa");
//
//		// exibição
//		// nome do paciente
//		System.out.println(agenda1.getPaciente().getNome());
//		// especialidade
//		System.out.println(agenda1.getEspecialidade().getNome());
//		// nome do médico
//		System.out.println(
//				"o Médico" + " " + agenda1.getMedico().getNome() + " - " + " Horário:" + agenda1.getHoraDaConsulta());
//		// data e hora do atendimento
//		System.out.println("A data da consulta" + " " + agenda1.getDataDaConsulta());
//		// System.out.println("o horário da consulta" + " " +
//		// agenda1.getHoraDaConsulta());
//		// observações
//		System.out.println("OBS" + " " + agenda1.getObservacao());
//		// plano de saúde
//		System.out.println("Plano de saúde :" + " " + agenda1.getPaciente().getPlanoDeSaude().getOperadora());
//
//		// fazer agendadmento de consulta para paciente 2
//		System.out.println("-----------");
//		Agenda agenda2 = new Agenda();
//		agenda2.setPaciente(paciente2);
//		agenda2.setMedico(medico2);
//		agenda2.setEspecialidade(especialidade1);
//		agenda2.setDataDaConsulta(LocalDate.of(2022, 9, 26));
//		agenda2.setHoraDaConsulta(LocalTime.of(9, 0));
//		agenda2.setObservacao("Paciente tossindo muito");
//
//		// exibição
//		// nome do paciente
//		System.out.println(agenda2.getPaciente().getNome());
//		// especialidade
//		System.out.println(agenda2.getEspecialidade().getNome());
//		// nome do médico
//		System.out.println(
//				"o Médico" + " " + agenda2.getMedico().getNome() + " - " + " Horário:" + agenda2.getHoraDaConsulta());
//		// data e hora do atendimento
//		System.out.println("A data da consulta" + " " + agenda2.getDataDaConsulta());
//		// System.out.println("o horário da consulta" + " " +
//		// agenda1.getHoraDaConsulta());
//		// observações
//		System.out.println("OBS" + " " + agenda2.getObservacao());
//		// plano de saúde
//		System.out.println("Plano de saúde :" + " " + agenda2.getPaciente().getPlanoDeSaude().getOperadora());
	}

}
