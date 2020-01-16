package br.com.gdt.exercicios01Ao03;

import java.util.ArrayList;
import java.util.List;

public class ListaDePessoas {	

	private List<Pessoa> pessoas = new ArrayList<Pessoa>();


	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	public ListaDePessoas(List<Pessoa> pessoas) {
		setPessoas(pessoas);
	}
	
	public void listarPessoas() {
		for (Pessoa pessoa: getPessoas()) {
			System.out.println(pessoa);
		}
	}
	public ListaDePessoas() {
		
	}
	public void quantidadeLista() {
		int qtd = pessoas.size();
		System.out.println("\nQuantidade de pessoas na lista "+qtd);
	}
	public int maisVelho() {
		int maior = 0;
		String nome = "";
		for(int i =0;i< pessoas.size();i++) {
			Pessoa pessoa = (Pessoa) pessoas.get(i);
			if(pessoa.getIdade()>maior) {
				maior = pessoa.getIdade();
				nome  = pessoa.getNome();
				System.out.println(pessoa);
			}
		}
		System.out.println("\nA pessoa mais velha tem " + maior +" de idade");
		System.out.println("\nO seu nome é "+ nome);
		return maior;
	}
	public void pessoasVelhas() {
		for(int i = 0; i < pessoas.size(); i++){
		    {
		        Pessoa p = (Pessoa)pessoas.get(i);
		        do{
		            pessoas.remove(p);
		            break;
		        }while(p.getIdade()<18);
		    }
		}
	}
	public String existe() {
		String nome = "";
		int idade = 0; 
		for(int i = 0; i < pessoas.size(); i++)
	    {
			Pessoa p = (Pessoa) pessoas.get(i);
			if(p.getNome().equals("Jessica")) {
				nome = p.getNome();
				idade = p.getIdade();
			}
	    }
		System.out.println(nome+" existe");
		System.out.println("E sua idade é de " + idade);
		return nome;
	}
}
