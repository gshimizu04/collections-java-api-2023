package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	private String nome;
	private long matricula;
	private double nota;
	
	public Aluno(String nome, long matricula, double nota) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public double getNota() {
		return nota;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getMatricula());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Aluno a)) return false;
		return Objects.equals(getMatricula(), a.getMatricula());
	}
	
	@Override
	public String toString() {
		return "Aluno{" +
				"matricula=" + matricula +
				", nome='" + nome + '\'' +
				", nota=" + nota +
				'}';
	}

	@Override
	public int compareTo(Aluno a) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(a.getNome());
	}
}

class ComparatorPorNota implements Comparator<Aluno> {

	@Override
	public int compare(Aluno a1, Aluno a2) {
		// TODO Auto-generated method stub
		return Double.compare(a1.getNota(), a2.getNota());
	}
	
}