package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
	private String nome;
	private int codConvite;
	
	public Convidado(String nome, int codConvite) {
		this.nome = nome;
		this.codConvite = codConvite;
	}

	public String getNome() {
		return nome;
	}

	public int getCodConvite() {
		return codConvite;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getCodConvite());
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) return true;
		if (!(obj instanceof Convidado convidado)) return false;
		return getCodConvite() == convidado.getCodConvite();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Convidado{" +
				"Nome='" + nome + '\'' +
				"Cód Convite='" + codConvite +
				'}';
	}
	
	
}
