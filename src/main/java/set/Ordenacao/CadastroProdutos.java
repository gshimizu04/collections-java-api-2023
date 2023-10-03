package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	Set<Produto> produtos;

	public CadastroProdutos() {
		this.produtos = new HashSet<>();
	}
	
	public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
		produtos.add(new Produto(codigo, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(produtos);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtos);
		return produtosPorPreco;
	}
	
	public static void main(String[] args) {
		CadastroProdutos prod = new CadastroProdutos();
		
		prod.adicionarProduto(1L, "Produto 5", 15, 5);
		prod.adicionarProduto(2L, "Produto 0", 20, 10);
		prod.adicionarProduto(1L, "Produto 3", 10, 2);
		prod.adicionarProduto(9L, "Produto 9", 2, 2);
		
		System.out.println(prod.produtos);
		
		System.out.println(prod.exibirProdutosPorNome());
		
		System.out.println(prod.exibirProdutosPorPreco());
	}
}
