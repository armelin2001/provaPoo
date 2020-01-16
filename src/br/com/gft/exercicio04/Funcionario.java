package br.com.gft.exercicio04;

public class Funcionario {
	private String nome;
	private int idade;
	private int salario;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public Funcionario(String nome, int idade, int salario) {
		setNome(nome);
		setIdade(idade);
		setSalario(salario);
	}
	public String toString() {
		String retorno="";
		retorno = "\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSalario: "+getSalario();
		return retorno;
	}
	public int bonificacao() {
		System.out.println(getSalario());
		return getSalario();
	}
}
