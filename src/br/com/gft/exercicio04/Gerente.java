package br.com.gft.exercicio04;

public class Gerente extends Funcionario{

	public Gerente(String nome, int idade, int salario) {
		super(nome, idade, salario);
	}
	public int bonificacao() {
		int salarioAntigo = getSalario();
		int resultado = salarioAntigo + 10000;
		setSalario(resultado);
		System.out.println("Salario do gerente "+ getNome()+" com bonificações é de R$ "+getSalario());
		return resultado;
		
	}
}
