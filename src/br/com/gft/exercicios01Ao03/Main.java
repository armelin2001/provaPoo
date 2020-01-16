package br.com.gdt.exercicios01Ao03;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Pessoa p1  = new Pessoa("João",15);
		Pessoa p2  = new Pessoa("Leandro",21);
		Pessoa p3  = new Pessoa("Paulo",17);
		Pessoa p4  = new Pessoa("Jessica",18);
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		ListaDePessoas lista = new ListaDePessoas(pessoas);
		System.out.println("Exercicio 01: \n");
		System.out.println("----------------");
		System.out.println("Lista de pessoas");
		System.out.println("----------------");
		lista.listarPessoas();
		System.out.println("----------------");
		lista.quantidadeLista();
		System.out.println("----------------");
		lista.maisVelho();
		System.out.println("----------------");
		System.out.println("Exercicio 02:\n");
		System.out.println("----------------");
		lista.quantidadeLista();
		System.out.println("----------------");
		lista.listarPessoas();
		lista.pessoasVelhas();
		System.out.println("----------------");
		lista.quantidadeLista();
		System.out.println("----------------");
		lista.listarPessoas();
		System.out.println("----------------");
		System.out.println("Exercicio 03:\n");
		lista.existe();
	}
}
