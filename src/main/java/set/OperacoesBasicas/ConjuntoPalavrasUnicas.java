package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	private Set<String> palavras;

	public ConjuntoPalavrasUnicas() {
		this.palavras = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		palavras.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		if (!palavras.isEmpty()) {
			if (palavras.contains(palavra)) {
				palavras.remove(palavra);
			} else {
				System.out.println("Palavra não encontrada no conjunto.");
			}
		}	
	}
	
	public void verificarPalavra(String palavra) {
		if (!palavras.isEmpty()) {
			if (palavras.contains(palavra)) {
				System.out.println("A palavra " + palavra + " está presente no conjunto.");
			} else {
				System.out.println("Palavra não encontrada no conjunto.");
			}
		}
	}
	
	public void exibirPalavrasUnicas() {
		System.out.println(palavras);
	}
	
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();
		palavras.adicionarPalavra("Coelho");
		palavras.adicionarPalavra("Anzol");
		palavras.adicionarPalavra("Travesseiro");
		palavras.adicionarPalavra("Cabeleireiro");
		
		palavras.exibirPalavrasUnicas();
		
		palavras.removerPalavra("Coelho");
		palavras.exibirPalavrasUnicas();
		palavras.verificarPalavra("Anzol");
	}
}
