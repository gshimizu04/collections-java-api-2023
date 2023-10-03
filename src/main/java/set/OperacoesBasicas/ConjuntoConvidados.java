package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidados;

	public ConjuntoConvidados() {
		this.convidados = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codConvite) {
		convidados.add(new Convidado(nome, codConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codConvite) {
		Convidado convidadoParaRemover = null;
		for (Convidado c : convidados) {
			if (c.getCodConvite() == codConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidados.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidados.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidados);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados convidados = new ConjuntoConvidados();
		System.out.println("Existem " + convidados.contarConvidados() + " dentro do conjunto de convidados.");
		
		convidados.adicionarConvidado("Jubiscreison", 1);
		convidados.adicionarConvidado("Thomas Turbando", 2);
		convidados.adicionarConvidado("Paula Tejano", 3);
		convidados.adicionarConvidado("Jacinto Leite", 4);
		
		System.out.println("Existem " + convidados.contarConvidados() + " dentro do conjunto de convidados.");
		
		convidados.removerConvidadoPorCodigoConvite(1);
		System.out.println("Existem " + convidados.contarConvidados() + " dentro do conjunto de convidados.");
		
		convidados.exibirConvidados();
	}
}
