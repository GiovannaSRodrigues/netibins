package br.senai.sp.jandira.model;

import java.io.ObjectInputStream.GetField;

//fora do métodos e deentro diretamente da classe PlanoDeSaude
public class PlanoDeSaude {
	// atributos
	//o código tem que ser uníco para cada objeto
	//contar objeto quantos planos de saúde, ser estático
	private static int contador = 100;
	private Integer codigo;
	private String operadora;
	private String tipoDoplano;
	
	//construtores
	
	//sempre será público
	//não há retorno (void)
	//o nome do metodo é o nome da classe
	
	
	
	public PlanoDeSaude(String operadora) {
		// contrutor que não faz nada padrão/defalt 
		//vamos sobreescrever
		this.operadora = operadora;
		
		//codigo e contador
		atualizarCodigo();
	}
	//podemos ter mesma asssinaturas se or argumentos forem diferentes
	public PlanoDeSaude(String operadora, String tipoDoPlano) {
		this.operadora = operadora;
		this.tipoDoplano = tipoDoPlano;
		//codigo e contador
		atualizarCodigo();	
	}
        
        public PlanoDeSaude(Integer codigo, String operadora, String tipoDoPlano) {
            this.contador = this.codigo;
            this.operadora = operadora;
            this.tipoDoplano = tipoDoPlano;
            this.codigo = codigo;
            atualizarCodigo();	
	}
	
	public PlanoDeSaude() {
		//codigo e contador
		atualizarCodigo();
	}
	
	//pega o atributo codigo e recebe o contador
	private void atualizarCodigo() {
		this.codigo = contador;
		contador++;
	}
	// craiando metodo de acesso

	// método de acesso

	// vamos falar o que é | nome da variavel que vai ser colocada no atributo |
	// então:
	// método setOperadora vai ser guardada no aributo operadora
	public void setOperadora(String operadora) {
		// dentro do meodo vamos colocar o atributo recebendo o método
		// causamos uma ambiguidade
		// operadora = operadora;
		// para eliminar a ambiguidade
		// "this" => "esse"; faz referência ao atributo da classe; sempre aponta para o
		// atributo
		// variavel só é visivel para esse método
		// OBS cor azul: variavel
		// OBS cor marrom: variável
		this.operadora = operadora;
	}
	
	// get código para toda vez que quizer saber o numero de um determinado objeto
	public Integer getCodigo() {
		return codigo;
	}
	public String getOperadora() {
		// por boa prática colocamos this, não precisa
		return this.operadora;
	}

	public void setTipoDoPlano(String tipoDoPlano) {
		this.tipoDoplano = tipoDoPlano;

	}

	public String getTipoDoPlano() {
		return this.tipoDoplano;
	}

	public String getDadoDoPlano() {
		return "Plano:" + this.operadora + "," + this.tipoDoplano;
	}
	//é static para qualque objeto
	public static int getContador() {
		return contador;
	}
        
        public String  getPlanoDeSaudeSeparadoPorPontoEVirgula(){
            String planoDeSaudeStr = this.codigo + ";" + this.operadora + ";" + this.tipoDoplano;
            return planoDeSaudeStr;
        }
}
