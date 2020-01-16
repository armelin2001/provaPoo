package br.com.gft.exercicio04;

public class Vendedor extends Funcionario{

	public Vendedor(String nome, int idade, int salario) {
		super(nome, idade, salario);
	}
	public int bonificacao() {
		int salarioAntigo = getSalario();
		int resultado = salarioAntigo + 3000;
		setSalario(resultado);
		System.out.println("Salario do vendedor "+ getNome()+" com bonificações é de R$  "+getSalario());
		return resultado;
	}
}
