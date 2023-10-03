package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	private List<Pessoa> pessoas;

	public OrdenacaoPessoa() {
		this.pessoas = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pPI = new ArrayList<>(pessoas);
		Collections.sort(pPI);
		return pPI;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pPA = new ArrayList<>(pessoas);
		Collections.sort(pPA, new ComparatorPorAltura());
		return pPA;
	}
	
	public static void main(String[] args) {
		OrdenacaoPessoa ordPes = new OrdenacaoPessoa();
		
		ordPes.adicionarPessoa("Nome 1", 20, 1.56);
		ordPes.adicionarPessoa("Nome 2", 30, 1.80);
		ordPes.adicionarPessoa("Nome 3", 25, 1.70);
		ordPes.adicionarPessoa("Nome 4", 17, 1.56);
		
		System.out.println(ordPes.ordenarPorIdade());
		System.out.println(ordPes.ordenarPorAltura());
	}
}
