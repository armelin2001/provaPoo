package br.com.gft.exercicio04;

public class Supervisor extends Funcionario{

	public Supervisor(String nome, int idade, int salario) {
		super(nome, idade, salario);
	}
	public int bonificacao() {
		int salarioAntigo = getSalario();
		int resultado = salarioAntigo + 5000;
		setSalario(resultado);
		System.out.println("Salario do supervisor "+ getNome()+" com bonificações é de R$ "+getSalario());
		return resultado;
	}
}
