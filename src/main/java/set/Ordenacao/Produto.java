package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;


public class Produto implements Comparable<Produto> {
	private String nome;
	private long codigo;
	private double preco;
	private int quantidade;
	
	public Produto(long codigo, String nome, double preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public long getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getCodigo());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Produto p)) return false;
		return Objects.equals(getCodigo(), p.getCodigo());
	}
	
	@Override
	public String toString() {
		return "Produto{" +
				"codigo=" + codigo +
				", nome='" + nome + '\'' +
				", preco=" + preco +
				", quantidade=" + quantidade +
				'}';
	}

	@Override
	public int compareTo(Produto p) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(p.getNome());
	}
}

class ComparatorPorPreco implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
	
}
