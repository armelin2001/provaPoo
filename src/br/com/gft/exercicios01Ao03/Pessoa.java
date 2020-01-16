package br.com.gdt.exercicios01Ao03;

public class Pessoa {
	private String nome;
	private int idade;
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
	public Pessoa(String nome,int idade) {
		setNome(nome);
		setIdade(idade);
	}
	public Pessoa() {
		
	}
	public String toString() {
		String retorno="";
		retorno = "\nNome: "+getNome()+" Idade: "+getIdade();
		return retorno;
	}
	
}
